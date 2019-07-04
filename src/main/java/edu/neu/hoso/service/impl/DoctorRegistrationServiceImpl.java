package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.SchedulingInfoExample;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.DoctorRegistrationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @title: DoctorRegistrationServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 实现对挂号的操作：展示患者挂号列表、切换患者等
 * @author: 29-y
 * @date: 2019-06-14 10:22
 * @version: V1.0
*/

@Service
public class DoctorRegistrationServiceImpl implements DoctorRegistrationService {
    @Resource
    RegistrationMapper registrationMapper;
    @Resource
    MedicalRecordMapper medicalRecordMapper;
    @Resource
    SchedulingInfoMapper schedulingInfoMapper;


    /**
     * @title: listRegistrationFromUserByUserId
     * @description: 列出个人患者挂号列表（自己正在处理的挂号即 medical record.doctorId = 自己、挂号到自己但别人在处理且别人已下线）
     * @author: 29-y
     * @date: 2019-06-17 9:59
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.Registration>
     * @throws:
     */
    @Override
    public List<Registration> listRegistrationFromUserByUserId(Integer userId) {
        return registrationMapper.listRegistrationFromUserByUserId(userId);
    }

    /**
     * @title: listRegistrationFromDepartmentByUserId
     * @description: 列出科室患者挂号列表（未挂号到具体医生的挂号、病历的处理人已经下线且挂号到的医生也已经下线）
     * @author: 29-y
     * @date: 2019-06-17 9:59
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.Registration>
     * @throws:
     */
    @Override
    public List<Registration> listRegistrationFromDepartmentByUserId(Integer userId) {
        return registrationMapper.listRegistrationFromDepartmentByUserId(userId);
    }

    /**
     * @title: changePatientFromUserByMedicalRecordId
     * @description: 在个人挂号列表中切换患者（自己正在处理的挂号即 medical record.doctorId = 自己、挂号到自己但别人在处理且别人已下线）
     * @author: 29-y
     * @date: 2019-06-17 9:59
     * @param: [registrationId, userId]
     * @return: void
     * @throws:
     */
    @Override
    public void changePatientFromUserByMedicalRecordId(Integer registrationId, Integer userId) {
        Registration registration = registrationMapper.selectByPrimaryKey(registrationId);
        Integer medicalRecordId = registration.getMedicalRecordId();
        MedicalRecord medicalRecord = medicalRecordMapper.selectByPrimaryKey(medicalRecordId);
        if(medicalRecord.getDoctorId()!=userId){//如果病历操作医生不是当前医生
            medicalRecord.setDoctorId(userId);//将病历操作医生设置为当前医生
            medicalRecordMapper.updateByPrimaryKeySelective(medicalRecord);//更新病历的操作医生ID字段
        }
    }

    /**
     * @title: changePatientFromDepartmentByMedicalRecordId
     * @description: 在科室挂号列表中切换患者 如果挂号列表中没有医生ID/有医生ID但没有初诊但该医生下班 需要将当前医生挂号限额-1 原医生挂号限额+1
     * @author: 29-y
     * @date: 2019-06-17 9:59
     * @param: [registrationId, userId]
     * @return: void
     * @throws:
     */
    @Override
    public void changePatientFromDepartmentByMedicalRecordId(Integer registrationId, Integer userId) {
        Registration registration = registrationMapper.selectByPrimaryKey(registrationId);
        Integer medicalRecordId = registration.getMedicalRecordId();
        MedicalRecord medicalRecord = medicalRecordMapper.selectByPrimaryKey(medicalRecordId);
        //挂号仅挂到科室 没有挂到医生 需要将当前医生挂号限额-1
        /*
         * 1.在个人列表中切换(病历操作医生为本医生)
         * 2.在科室列表中切换
         *      1)患者挂号到科室,并没有选择医生
         *          当前医生当前午别的剩余挂号数+1
         *      2)患者挂到某个医生,但该医生下班了
         *          a)该病历未初诊:当前医生当前午别的剩余挂号数+1 原医生对应挂号午别的剩余挂号数-1
         *          b)该病历已初诊:挂号数额不变
         *
         */
        //获取挂号表中的医生ID
        Integer registrationDoctorId = registrationMapper.selectByPrimaryKey(registrationId).getDoctorId();
        //填充当前病历的操作医生
        medicalRecord.setDoctorId(userId);
        medicalRecordMapper.updateByPrimaryKeySelective(medicalRecord);
        //下面需要考虑是否更改挂号表中的挂号医生ID和剩余挂号数
        if(registrationDoctorId==null){//如果只挂到科室 未挂到医生
            //减少当前医生的剩余挂号数
//            subtractSchedulingRestcount(userId);
            //填充当前挂号的医生
            registration.setDoctorId(userId);
            registrationMapper.updateByPrimaryKeySelective(registration);
        }else if(registrationDoctorId!=userId){//如果挂到某个医生 即证明该医生已下班
            //当该病历未初诊
            if(medicalRecord.getFirstDiagnosisDoctorId()==null){
                //减少当前医生的剩余挂号数
//                subtractSchedulingRestcount(userId);
                //增加原挂号医生的剩余挂号数
//                addSchedulingRestcount(registrationDoctorId,registrationId);
                //填充当前挂号的医生
                registration.setDoctorId(userId);
                registrationMapper.updateByPrimaryKeySelective(registration);
            }else if(medicalRecord.getFinalDiagnosisDoctorId()==null) {//当该病历已初诊但未终诊
                //do nothing
            }else{//当该病历已终诊(不会出现在科室列表中)
                //do nothing
            }
        }
    }

    /**
     * @title: addSchedulingRestcount
     * @description: 增加剩余挂号数
     * @author: 29-y
     * @date: 2019-06-20 10:48
     * @param: [userId, registrationId]
     * @return: void
     * @throws:
     */
//    private void addSchedulingRestcount(Integer userId,Integer registrationId){
//        //得到挂号时的午别
//        Date date = registrationMapper.selectByPrimaryKey(registrationId).getRegistrationDate();
//        SchedulingInfoExample schedulingInfoExample = new SchedulingInfoExample();
//        SchedulingInfoExample.Criteria criteria = schedulingInfoExample.createCriteria();
//        //找到医生在该午别的挂号数
//        criteria.andDoctorIdEqualTo(userId);
//        criteria.andSchedulingEndtimeGreaterThanOrEqualTo(date);
//        criteria.andSchedulingStarttimeLessThanOrEqualTo(date);
//        //找到对应的排班信息
//        SchedulingInfo schedulingInfo = schedulingInfoMapper.selectByExample(schedulingInfoExample).get(0);
//        schedulingInfo.setSchedulingRestcount(schedulingInfo.getSchedulingRestcount()+1);
//        //更新排班信息
//        schedulingInfoMapper.updateByPrimaryKeySelective(schedulingInfo);
//    }

    /**
     * @title: subtractSchedulingRestcount
     * @description: 减少剩余挂号数
     * @author: 29-y
     * @date: 2019-06-20 10:48
     * @param: [userId]
     * @return: void
     * @throws:
     */
    //减少剩余挂号数
//    private void subtractSchedulingRestcount(Integer userId){
//        SchedulingInfoExample schedulingInfoExample = new SchedulingInfoExample();
//        SchedulingInfoExample.Criteria criteria = schedulingInfoExample.createCriteria();
//        criteria.andDoctorIdEqualTo(userId);
//        Date date = new Date();
//        //找到医生在该午别的排班限额
//        criteria.andSchedulingEndtimeGreaterThanOrEqualTo(date);
//        criteria.andSchedulingStarttimeLessThanOrEqualTo(date);
//        //找到对应的排班信息
//        SchedulingInfo schedulingInfo = schedulingInfoMapper.selectByExample(schedulingInfoExample).get(0);
//        schedulingInfo.setSchedulingRestcount(schedulingInfo.getSchedulingRestcount()-1);
//        //更新排班信息
//        schedulingInfoMapper.updateByPrimaryKeySelective(schedulingInfo);
//    }

}
