package edu.neu.hoso.service;

import edu.neu.hoso.model.Workload;

import java.util.Date;
import java.util.List;

public interface PersonalWorkloadService {
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 医生ID
     返回值：该医生的挂号费工作量（元）
     涉及表：挂号表
     逻辑描述 ：该医生在某个时间段的所有挂号费
     */
    double FindSumRegistrationCostsByDateAndDoctorID(Date startdate, Date enddate, int doctorID);
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 医生ID
     返回值：病人数量
     涉及表：病例表，挂号表
     逻辑描述 ：查询医生在时间段内所有经手过的患者总数
     */
    int FindPatientsByDateAndDoctorID(Date startdate, Date enddate, int doctorID);
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 医生ID
     返回值：该医生的所有工作量（除了患者人数和挂号总费用）
     涉及表：处方 处方条目  检查 非药品检查 处置 处置条目 收费条目 收费类型
     逻辑描述 ：该医生在某个时间段的所有工作量
     */
    List<Workload> FindWorkloadByDateAndDoctorID(Date startdate, Date enddate, int doctorID);
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 技师医生ID
     返回值：该技师医生的所有工作量（除了患者人数和挂号总费用）
     涉及表：检查药品 非药品检查 收费条目 收费类型
     逻辑描述 ：该医生在某个时间段的所有工作量
     */
    List<Workload> FindWorkloadByDateAndTechID(Date startdate, Date enddate, int techID);
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 技师医生ID
     返回值：该技师医生经手的所有患者人数
     涉及表：检查药品 非药品检查 病例
     逻辑描述 ：技师医生在某个时间段的所有经手的患者个数
     */
    int FindPaitentsByDateAndTechID(Date startdate, Date enddate, int techID);
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 科室ID
     返回值：病人数量
     涉及表：病例表，挂号表
     逻辑描述 ：查询医生在时间段内所有经手过的患者总数
     */
    int FindPatientsByDateAnddepartmentID(Date startdate, Date enddate, int departmentID);
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 医生ID
     返回值：该医生的挂号费工作量（元）
     涉及表：挂号表
     逻辑描述 ：该医生在某个时间段的所有挂号费
     */
    double FindSumRegistrationCostsByDateAnddepartmentID(Date startdate, Date enddate, int departmentID);
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 科室ID
     返回值：该科室所有医生的所有工作量（除了患者人数和挂号总费用）
     涉及表：处方 处方条目  检查 非药品检查 处置 处置条目 收费条目 收费类型
     逻辑描述 ：该科室所有医生在某个时间段的所有工作量
     */
    List<Workload> FindWorkloadByDateAndDoctordepartmentID(Date startdate, Date enddate, int departmentID);
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 技师科室ID
     返回值：该技师科室所有医生的所有工作量（除了患者人数和挂号总费用）
     涉及表： 检查 非药品检查  收费条目 收费类型
     逻辑描述 ：该技师科室所有医生在某个时间段的所有工作量
     */
    List<Workload> FindWorkloadByDateAndTechdepartmentID(Date startdate, Date enddate, int departmentID);
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 技师科室ID
     返回值：该科室所有医生的所有工作量（除了患者人数和挂号总费用）
     涉及表：病例 检查 非药品检查
     逻辑描述 ：该科室所有医生在某个时间段的经手的病人数
     */
    int FindPaitentsByDateAndTechdepartmentID(Date startdate, Date enddate, int techDepartmentID);
    /**
     方法类型：功能方法
     参数: 科室ID
     返回值：科室类型
     涉及表：科室
     逻辑描述 ：通过科室ID查询科室类型
     */
    String FindDepartmentTypeByDeportmentID(int departmentID);
    /**
     方法类型：功能方法
     参数: 用户ID
     返回值：科室类型
     涉及表：科室 用户
     逻辑描述 ：通过UserID查询科室类型
     */
    String FindDepartmentTypeByDoctorID(int doctorID);
}
