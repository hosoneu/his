package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.MedicalRecordExample;
import edu.neu.hoso.example.RegistrationExample;
import edu.neu.hoso.example.UserExample;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.PersonalWorkloadService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PersonalWorkloadServiceImpl implements PersonalWorkloadService {
    @Resource
    WorkLoadMapper workloadMapper;
    @Resource
    DepartmentMapper departmentMapper;
    @Resource
    UserMapper userMapper;
    @Resource
    RegistrationMapper registrationMapper;
    @Resource
    MedicalRecordMapper medicalRecordMapper;
    /**
     方法类型：
     参数：
     返回值：
     涉及表：
     逻辑描述 ：
     */

    /**
     方法类型：子方法
     参数：科室ID
     返回值：所属科室的所有医生的ID
     涉及表：用户表
     逻辑描述 ：通过科室ID检索所有该科室的医生ID用于科室工作量统计
     */
    public List<Integer> FindDoctorsBydepartmentID(int departmentID){
        List<Integer> results = new ArrayList<Integer>();
        UserExample userExample = new UserExample();
        UserExample.Criteria userExampleCriteria= userExample.createCriteria();
        userExampleCriteria.andDepartmentIdEqualTo(departmentID);
        for(User user : userMapper.selectByExample(userExample)){
            results.add(user.getUserId());
        }
        return results;
    }

    /**
    方法类型：子方法
    参数：开始时间 结束时间
    返回值：所有状态为就诊的挂号单中的病人病历号
    涉及表：挂号表
    逻辑描述 ：通过两个时间获取时间区间的就诊的病人病例号用于计算医生或者科室在该时间区间内的工作量
     */
    public List<Integer> FindMedicalRecordIDByDate(Date startdate, Date enddate){
        RegistrationExample registrationExample = new RegistrationExample();
        RegistrationExample.Criteria  registrationExampleCriteria= registrationExample.createCriteria();
        registrationExampleCriteria.andRegistrationDateBetween(startdate,enddate);
//        List<String> UseableStatus =new ArrayList<>();
//        UseableStatus.add("2");
//        UseableStatus.add("3");
//        registrationExampleCriteria.andRegistrationStatusIn(UseableStatus);
        List<Registration> registrations = registrationMapper.selectByExample(registrationExample);
        List<Integer> results = new ArrayList<>();
        for (Registration registration : registrations){
            results.add(registration.getMedicalRecordId());
        }
        return results;
    }
    /**
     方法类型：子方法
     参数：所有某时间区间内病人的病历号 门诊医生的医生ID
     返回值：该医生在时间区间内经手的所有病人的个数
     涉及表：病例表
     逻辑描述 ：从病历号列表通过医生ID为该病例的初诊或者确诊医生来判断该医生的经手的所有病历号的总个数
     */
    public int FindPatitentsByDoctorID(List<Integer> medicalRecordID, Integer doctorID){
        if(medicalRecordID.size()==0){
            return 0;
        }else{
        MedicalRecordExample medicalRecordExample = new MedicalRecordExample();
        MedicalRecordExample.Criteria medicalRecordExampleCriteria= medicalRecordExample.createCriteria();
        medicalRecordExampleCriteria.andMedicalRecordIdIn(medicalRecordID);
        medicalRecordExampleCriteria.andFirstDiagnosisDoctorIdEqualTo(doctorID);
        MedicalRecordExample.Criteria medicalRecordExampleCriteria2= medicalRecordExample.createCriteria();
        medicalRecordExampleCriteria2.andFinalDiagnosisDoctorIdEqualTo(doctorID);
        medicalRecordExampleCriteria2.andMedicalRecordIdIn(medicalRecordID);
        medicalRecordExample.or(medicalRecordExampleCriteria2);
        return medicalRecordMapper.countByExample(medicalRecordExample);}
    }
    /**
     方法类型：子方法
     参数：所有某时间区间内病人的病历号 由科室编号检测到的所有的医生ID的list
     返回值：该科室所有医生在时间区间内经手的所有病人的个数
     涉及表：病例表
     逻辑描述 ：找出在时间区间内，某个科室所有医生经手过的病人个数（由于初诊和确诊必为一个科室，逻辑中只涉及初诊医生的判断）
     */
    public int FindPatitentsByDoctorIDs(List<Integer> medicalRecordID, List<Integer> doctorIDs){
        if (medicalRecordID.size()==0||doctorIDs.size()==0){
            return 0;
        }
        MedicalRecordExample medicalRecordExample = new MedicalRecordExample();
        MedicalRecordExample.Criteria medicalRecordExampleCriteria= medicalRecordExample.createCriteria();
        medicalRecordExampleCriteria.andMedicalRecordIdIn(medicalRecordID);
        medicalRecordExampleCriteria.andFirstDiagnosisDoctorIdIn(doctorIDs);
        return medicalRecordMapper.countByExample(medicalRecordExample);
    }
    /**
     方法类型：子方法
     参数：开始时间 结束时间 医生ID列表
     返回值：一个科室所有医生的挂号费工作量（元）
     涉及表：挂号表
     逻辑描述 ：一个科室的所有医生在某个时间段的所有挂号费
     */
    public double FindSumRegistrationCostsByDateAndDoctorsIDs(Date startdate, Date enddate, List<Integer>doctorIDs){
        double result = 0 ;
        if (doctorIDs.size()==0){
            return 0;
        }
        RegistrationExample registrationExample = new RegistrationExample();
        RegistrationExample.Criteria  registrationExampleCriteria= registrationExample.createCriteria();
        registrationExampleCriteria.andRegistrationDateBetween(startdate,enddate);
        registrationExampleCriteria.andDoctorIdIn(doctorIDs);
        List<Registration> registrations = registrationMapper.selectByExample(registrationExample);
        for (Registration registration : registrations){
            result= result + registration.getRegistrationTotalCost();
        }
        return  result;
    }
//##############################################功能方法分界线############################################################################
//######################个人工作量##############################
    /**
     方法类型：功能方法
     参数: 医生ID
     返回值：科室类型
     涉及表：科室
     逻辑描述 ：通过医生ID查询科室类型
     */
    public String FindDepartmentTypeByDoctorID(int doctorID){
        return userMapper.FindDepartmentTypeByUserID(doctorID);
    }

    /**
     方法类型：功能方法
     参数：开始时间 结束时间 医生ID
     返回值：该医生的挂号费工作量（元）
     涉及表：挂号表
     逻辑描述 ：该医生在某个时间段的所有挂号费
     */
    public double FindSumRegistrationCostsByDateAndDoctorID(Date startdate, Date enddate, int doctorID){
    double result = 0 ;
        RegistrationExample registrationExample = new RegistrationExample();
        RegistrationExample.Criteria  registrationExampleCriteria= registrationExample.createCriteria();
        registrationExampleCriteria.andRegistrationDateBetween(startdate,enddate);
        registrationExampleCriteria.andDoctorIdEqualTo(doctorID);
        List<Registration> registrations = registrationMapper.selectByExample(registrationExample);
        for (Registration registration : registrations){
            result= result + registration.getRegistrationTotalCost();
        }
    return  result;
    }
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 医生ID
     返回值：病人数量
     涉及表：病例表，挂号表
     逻辑描述 ：查询医生在时间段内所有经手过的患者总数
     */
    public int FindPatientsByDateAndDoctorID(Date startdate, Date enddate, int doctorID) {

        return FindPatitentsByDoctorID(FindMedicalRecordIDByDate(startdate,enddate),doctorID);
    }
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 医生ID
     返回值：该医生的所有工作量（除了患者人数和挂号总费用）
     涉及表：处方 处方条目  检查 非药品检查 处置 处置条目 收费条目 收费类型
     逻辑描述 ：该医生在某个时间段的所有工作量
     */
    public List<Workload> FindWorkloadByDateAndDoctorID(Date startdate, Date enddate, int doctorID){
        return workloadMapper.FindWorkLoadByDateAndDoctorID(startdate,enddate,doctorID);
    }
//#############################技师工作量#####################################
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 技师医生ID
     返回值：该技师医生的所有工作量（除了患者人数和挂号总费用）
     涉及表：检查药品 非药品检查 收费条目 收费类型
     逻辑描述 ：该医生在某个时间段的所有工作量
     */
    public List<Workload> FindWorkloadByDateAndTechID(Date startdate, Date enddate, int techID){
        return workloadMapper.FindWorkLoadByDateAndTechID(startdate,enddate,techID);
    }

    /**
     方法类型：功能方法
     参数：开始时间 结束时间 技师医生ID
     返回值：该技师医生经手的所有患者人数
     涉及表：检查药品 非药品检查 病例
     逻辑描述 ：技师医生在某个时间段的所有经手的患者个数
     */
    public int FindPaitentsByDateAndTechID(Date startdate, Date enddate, int techID){
        return workloadMapper.FindPaitentsByDateAndTechID(startdate,enddate,techID);
    };


//######################科室工作量##############################
    /**
     方法类型：功能方法
     参数: 科室ID
     返回值：科室类型
     涉及表：科室
     逻辑描述 ：通过科室ID查询科室类型
     */
    public String FindDepartmentTypeByDeportmentID(int departmentID){
        return departmentMapper.selectByPrimaryKey(departmentID).getDepartmentType();
    }
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 科室ID
     返回值：病人数量
     涉及表：病例表，挂号表
     逻辑描述 ：查询医生在时间段内所有经手过的患者总数
     */
    public int FindPatientsByDateAnddepartmentID(Date startdate, Date enddate, int departmentID) {

        return FindPatitentsByDoctorIDs(FindMedicalRecordIDByDate(startdate,enddate),FindDoctorsBydepartmentID(departmentID));
    }
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 医生ID
     返回值：该医生的挂号费工作量（元）
     涉及表：挂号表
     逻辑描述 ：该医生在某个时间段的所有挂号费
     */
    public double FindSumRegistrationCostsByDateAnddepartmentID(Date startdate, Date enddate, int departmentID){
        return  FindSumRegistrationCostsByDateAndDoctorsIDs(startdate,enddate,FindDoctorsBydepartmentID(departmentID));
    }
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 科室ID
     返回值：该科室所有医生的所有工作量（除了患者人数和挂号总费用）
     涉及表：处方 处方条目  检查 非药品检查 处置 处置条目 收费条目 收费类型
     逻辑描述 ：该科室所有医生在某个时间段的所有工作量
     */
    public List<Workload> FindWorkloadByDateAndDoctordepartmentID(Date startdate, Date enddate, int departmentID){
        return workloadMapper.FindWorkLoadByDateAndDoctordepartmentID(startdate,enddate,departmentID);
    }
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 技师科室ID
     返回值：该技师科室所有医生的所有工作量（除了患者人数和挂号总费用）
     涉及表： 检查 非药品检查  收费条目 收费类型
     逻辑描述 ：该技师科室所有医生在某个时间段的所有工作量
     */
    public List<Workload> FindWorkloadByDateAndTechdepartmentID(Date startdate, Date enddate, int departmentID){
        return workloadMapper.FindWorkLoadByDateAndTechdepartmentID(startdate,enddate,departmentID);
    }

    /**
     方法类型：功能方法
     参数：开始时间 结束时间 技师科室ID
     返回值：该科室所有医生的所有工作量（除了患者人数和挂号总费用）
     涉及表：病例 检查 非药品检查
     逻辑描述 ：该科室所有医生在某个时间段的经手的病人数
     */
    public int FindPaitentsByDateAndTechdepartmentID(Date startdate, Date enddate, int techDepartmentID){
        return workloadMapper.FindPaitentsByDateAndTechdepartmentID(startdate, enddate, techDepartmentID);
    }

}
