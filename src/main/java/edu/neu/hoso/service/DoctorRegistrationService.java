package edu.neu.hoso.service;

import edu.neu.hoso.model.MedicalRecord;
import edu.neu.hoso.model.Registration;

import java.util.List;

/**
 * @title: DoctorService
 * @package edu.neu.hoso.service
 * @description: 定义对门诊医生的挂号列表操作
 * @author: 29-y
 * @date: 2019-06-14 10:13
 * @version: V1.0
 */
public interface DoctorRegistrationService {
    // 得到该医生的个人挂号列表（挂号日期为当天） 包括：1.挂号到他自己的（除去当天下线后被别人操作的） 2.挂号到其他医生的（但是该医生已下线且未对患者进行确诊操作）被加入到自己挂号列表的
    List<Registration> listRegistrationFromUserByUserId(Integer userId);
    // 得到该医生所在科室的挂号列表（挂号日期为当天） 包括：1.挂号到科室的 2.挂号到其他医生但是该医生已下线且未对患者进行确诊操作的
    List<Registration> listRegistrationFromDepartmentByUserId(Integer userId);
    // 从个人的患者列表中切换病人
    void changePatientFromUserByMedicalRecordId(Integer medicalRecordId,Integer userId);
    // 从科室的患者列表中切换病人
    void changePatientFromDepartmentByMedicalRecordId(Integer medicalRecordId,Integer userId);
}
