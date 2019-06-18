package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.RegistrationExample;
import edu.neu.hoso.example.SchedulingInfoExample;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.MedicalRecordHomePageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @title: MedicalRecordHomePageServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 实现对病历首页的操作：插入病历首页的文字部分、插入病历首页的初诊信息、插入病历首页的初诊信息、确诊时插入终诊信息等
 * @author: 29-y
 * @date: 2019-06-14 10:05
 * @version: V1.0
 */

@Service
public class MedicalRecordHomePageServiceImpl implements MedicalRecordHomePageService {

    @Resource
    DiagnosisMapper diagnosisMapper;
    @Resource
    MedicalRecordHomePageMapper medicalRecordHomePageMapper;
    @Resource
    MedicalRecordHomePageTemplateMapper medicalRecordHomePageTemplateMapper;
    @Resource
    MedicalRecordMapper medicalRecordMapper;
    @Resource
    RegistrationMapper registrationMapper;
    @Resource
    DiagnosisTemplateMapper diagnosisTemplateMapper;
    @Resource
    SchedulingInfoMapper schedulingInfoMapper;

    /**
     * @title: insertMedicalRecordHomePage
     * @description: 插入病历首页的文字部分（除去初诊信息、辅助检查）
     * @author:  29-y
     * @date: 2019-06-17 10:12
     * @param: [medicalRecordHomePage]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertMedicalRecordHomePage(MedicalRecordHomePage medicalRecordHomePage) {
        medicalRecordHomePageMapper.insert(medicalRecordHomePage);
        return medicalRecordHomePage.getMedicalRecordHomePageId();
    }

    /**
     * @title: insertFirstDiagnosis
     * @description: 插入病历首页的初诊信息
     * @author:  29-y
     * @date: 2019-06-17 10:12
     * @param: [diagnosisList,userId]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertFirstDiagnosis(List<Diagnosis> diagnosisList,Integer userId) {
        Date date = new Date();
        Integer diagnosisId = -1;//记录最后一个初步诊断的ID 将他它作为结果返回
        for(Diagnosis diagnosis : diagnosisList){
            diagnosis.setDiagnosisMark("1");//设置初诊标志
            diagnosisMapper.insert(diagnosis);
            diagnosisId = diagnosis.getDiagnosisId();
        }
        //得到诊断的病历号
        Integer medicalRecordId = diagnosisList.get(0).getMedicalRecordId();

        //得到挂号信息
        RegistrationExample registrationExample = new RegistrationExample();
        RegistrationExample.Criteria criteria = registrationExample.createCriteria();
        criteria.andMedicalRecordIdEqualTo(medicalRecordId);//查找挂号列表中病历号和当前相同的
        Registration registration = registrationMapper.selectByExample(registrationExample).get(0);

        //初诊时确定挂号的医生ID 当挂号医生和当前初诊医生不一致时需将挂号医生变更为初诊医生，同时需要更改剩余挂号数
        if(registration.getDoctorId()!=userId){
            // TODO: 2019/6/17 需要改数据库中的date类型为dateTime 首先更改当前医生的`当前`时间午别的剩余挂号数 然后更改挂号医生对应`挂号`时间午别的剩余挂号数 最后更改挂号医生ID为当前初诊医生的ID
            //更改剩余挂号数   包括当前医生和挂号医生的（根据挂号时间找到当时对应的午别 更改当时的剩余数量）
            //首先更改当前医生的`当前`时间午别的剩余挂号数
            SchedulingInfoExample schedulingInfoExample = new SchedulingInfoExample();
            SchedulingInfoExample.Criteria schedulingInfoExampleCriteria = schedulingInfoExample.createCriteria();
            criteria.andDoctorIdEqualTo(userId);
            //找到医生在当前午别的排班限额
            schedulingInfoExampleCriteria.andSchedulingEndtimeGreaterThanOrEqualTo(date);
            schedulingInfoExampleCriteria.andSchedulingStarttimeLessThanOrEqualTo(date);
            SchedulingInfo schedulingInfo = schedulingInfoMapper.selectByExample(schedulingInfoExample).get(0);
            schedulingInfo.setSchedulingRestcount(schedulingInfo.getSchedulingRestcount()-1);
            schedulingInfoMapper.updateByPrimaryKey(schedulingInfo);
            //然后更改挂号医生对应`挂号`时间午别的剩余挂号数

            //最后更改挂号医生ID为当前初诊医生的ID
            registration.setDoctorId(userId);
            registrationMapper.updateByPrimaryKey(registration);
        }
        //更新初诊信息
        MedicalRecord medicalRecord = new MedicalRecord();
        medicalRecord.setMedicalRecordId(medicalRecordId);//根据病历号的ID更新条目
        medicalRecord.setFirstDiagnosisDoctorId(userId);//设置初诊医生
        medicalRecord.setFirstDiagnosisTime(date);//设置初诊时间
        medicalRecordMapper.updateByPrimaryKey(medicalRecord);
        return diagnosisId;
    }

    /**
     * @title: insertFinalDiagnosis
     * @description: 确诊时插入终诊信息
     * @author:  29-y
     * @date: 2019-06-17 10:12
     * @param: [diagnosisList,userId]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertFinalDiagnosis(List<Diagnosis> diagnosisList,Integer userId) {
        Integer diagnosisId = -1;//记录最后一个最终诊断的ID 将他它作为结果返回
        for(Diagnosis diagnosis : diagnosisList){
            diagnosis.setDiagnosisMark("2");//设置终诊标志
            diagnosisMapper.insert(diagnosis);
            diagnosisId = diagnosis.getDiagnosisId();
        }
        //得到诊断的病历号
        Integer medicalRecordId = diagnosisList.get(0).getMedicalRecordId();
        //更新病历号中的终诊信息
        MedicalRecord medicalRecord = new MedicalRecord();
        medicalRecord.setMedicalRecordId(medicalRecordId);//根据病历号的ID更新条目
        medicalRecord.setFinalDiagnosisDoctorId(userId);//设置终诊医生
        medicalRecord.setFinalDiagnosisTime(new Date());//设置终诊时间
        medicalRecordMapper.updateByPrimaryKey(medicalRecord);

        return diagnosisId;
    }

    /**
     * @title: insertAssistantExamination
     * @description: 插入辅助检查
     * @author: 29-y
     * @date: 2019-06-17 10:15
     * @param: [assistantExamination, medicalRecordHomePageId]
     * @return: void
     * @throws:
     */
    @Override
    public void insertAssistantExamination(String assistantExamination,Integer medicalRecordHomePageId) {
        MedicalRecordHomePage medicalRecordHomePage = new MedicalRecordHomePage();
        medicalRecordHomePage.setMedicalRecordHomePageId(medicalRecordHomePageId);
        medicalRecordHomePage.setAssistantExamination(assistantExamination);
        medicalRecordHomePageMapper.updateByPrimaryKey(medicalRecordHomePage);//插入assistantExamination
    }

    /**
     * @title: listMedicalRecordHomePageTemplate
     * @description: 列出病历模板（1个人、2科室、3医院）
     * @author:
     * @date: 2019-06-17 10:16
     * @param: [userId, scope]
     * @return: java.util.List<edu.neu.hoso.model.MedicalRecordHomePageTemplate>
     * @throws:
     */
    @Override
    public List<MedicalRecordHomePageTemplate> listMedicalRecordHomePageTemplate(Integer userId, String scope) {
        if(scope.equals("1")){
            return medicalRecordHomePageTemplateMapper.listMedicalRecordHomePageTemplateFromUser(userId);
        }else if(scope.equals("2")){
            return medicalRecordHomePageTemplateMapper.listMedicalRecordHomePageTemplateFromDepartment(userId);
        }else if(scope.equals("3")){
            return medicalRecordHomePageTemplateMapper.listMedicalRecordHomePageTemplateFromHospital();
        }else{
            return null;
        }
    }

    /**
     * @title: selectMedicalRecordHomePageTemplateById
     * @description: 根据ID查找一个病历模板内容
     * @author: 29-y
     * @date: 2019-06-17 10:17
     * @param: [medicalRecordHomePageTemplateId]
     * @return: edu.neu.hoso.model.MedicalRecordHomePageTemplate
     * @throws:
     */
    @Override
    public MedicalRecordHomePageTemplate selectMedicalRecordHomePageTemplateById(Integer medicalRecordHomePageTemplateId) {
        return medicalRecordHomePageTemplateMapper.selectMedicalRecordHomePageTemplateById(medicalRecordHomePageTemplateId);
    }

    /**
     * @title: insertMedicalRecordHomePageTemplate
     * @description: 插入病历首页模板
     * @author: 29-y
     * @date: 2019-06-17 11:00
     * @param: [medicalRecordHomePageTemplate]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertMedicalRecordHomePageTemplate(MedicalRecordHomePageTemplate medicalRecordHomePageTemplate) {
        medicalRecordHomePageTemplateMapper.insert(medicalRecordHomePageTemplate);//插入首页非诊断部分（文字部分）
        Integer medicalRecordHomePageTemplateId = medicalRecordHomePageTemplate.getMedicalRecordHomePageTemplateId();
        List<DiagnosisTemplate> diagnosisTemplateList= medicalRecordHomePageTemplate.getDiagnosisTemplateList();
        //插入疾病模板
        for(DiagnosisTemplate diagnosisTemplate : diagnosisTemplateList){
            diagnosisTemplate.setMedicalRecordHomePageTemplateId(medicalRecordHomePageTemplateId);//设置病历模板ID
            diagnosisTemplateMapper.insert(diagnosisTemplate);
        }
        return medicalRecordHomePageTemplateId;
    }


}
