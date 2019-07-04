package edu.neu.hoso.service;

import edu.neu.hoso.model.*;

import java.util.List;

/**
 * @title: DispensingService
 * @package edu.neu.hoso.service
 * @description:用于提供门诊发药退药服务
 * @author: alan
 * @date: 2019/6/17 11:13
 * @version: V1.0
 */
public interface DispensingService {

    //更改发药状态
    int dispensing(int Medical_record_ID, int DrugsId);

    //退检查检验药
    int returnExaminationDurgs(ExaminationDrugsItems examinationDrugsItems);

    //退处方药
    int returnPrescription(PrescriptionItems prescriptionItems);

    //获得所有药房检查检验药
    List<Examination> getAllExaminationMedical();

//    获得所有药房处方药
    List<Prescription> getAllPrescriptionMedical();

    //根据病历号获得Patient
    Patient getPatientById(int medicalRecordId);

    //根据非药品id获得该非药品的有效状态
    ExaminationFmedicalItems getFmedicalItem(int examinationFmedicalItemsId);

    //根据收费id获得ExpenseItems
    ExpenseItems getExpenseItems(int expenseItemsId);
//    //退检查检验药
//    int returExaminationDrugs(ExaminationDrugsItems examinationDrugsItems);
//
//    //退处方药
//    int returPrescriptionDrugs(PrescriptionItems prescriptionItems);
}
