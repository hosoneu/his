package edu.neu.hoso.service;

import edu.neu.hoso.model.*;

import java.util.List;

public interface TechService {

    // 根据病历号查到患者的信息
    Patient getInfoByMedical_record_ID(int Medical_record_ID);

    // 根据姓名查到患者的信息
    List<Patient> getInfoByPatient_Name(String name);

    //根据病历号获得该科室的非药品项目
    List<FmedicalItems> getAllFmedicalByMedicalID(int Medical_record_ID, int Department_ID);

    //更新患者在该科室的登记状态，该科室的1->2
    void updateRegistrationStatus(int examinationFmedicalItemdId);

    //输出该患者在该科室的全部项目
    List<ExaminationFmedicalItems> getAllFmedical(int Medical_record_ID, int Department_ID);

    //将数据插入Examination_Drugs_Items表中并加入Expense_Items中，并将其生成的expenseid加入Examination_Drugs_Items表中
    void insertExaminationDrugsAndExpense(List<ExaminationDrugsItems> examinationDrugsItems, int patientId);

    //医技医生维护常用项目，向Commonly_Used_Fmedical表里面插入数据
    void maintainCommonFmedical(List<CommonlyUsedFmedical> commonlyUsedFmedicals);

    //检查检验结果录入
    void insertExaminationResult(ExaminationResult examinationResult, int examinationFmedicalItemsId);

    //检查检验结果照片录入
    void insertExaminationResultImage(int examinationResultId, String imageURL, String imageName);

    //根据科室号获得所有病人
    List<Registration> getAllPatientByDepartmentId(int departmentId);

    //获得所有药
    List<Drugs> getAllDrugs();

    //根据医生id获得其常用项目
    List<CommonlyUsedDrugs> getCommonUsedDrugs(int doctorId);

    //删除常用项
    void deleteCommonUsedDrugs(CommonlyUsedDrugs commonlyUsedDrugsList);

}
