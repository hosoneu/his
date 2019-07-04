package edu.neu.hoso.service;

import edu.neu.hoso.model.ExpenseItems;
import edu.neu.hoso.model.MedicalRecord;
import edu.neu.hoso.model.Registration;

import java.util.List;

/**
 * @title: MedicalRecordService
 * @package edu.neu.hoso.service
 * @description: 定义对病历的操作
 * @author: 29-y
 * @date: 2019-06-14 10:24
 * @version: V1.0
*/
public interface MedicalRecordService {
    // 历史病历查询：查找该患者对应的历史挂号信息（包括病历首页和诊断）并返回改挂号对应的病历
    List<MedicalRecord> listMedicalRecordHistoryByPatientId(Integer patientId);
    // 诊毕
    void treamentOver(Integer medicalRecordId);
    // 查询患者费用
    List<ExpenseItems> getPatientExpenseItems(Integer medicalRecordId);
}
