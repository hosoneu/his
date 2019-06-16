package edu.neu.hoso.controller;

import edu.neu.hoso.model.*;
import edu.neu.hoso.service.TechService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: TechController
 * @package edu.neu.hoso.controller
 * @description:医技工作站Controller
 * @author: alan
 * @date: 2019/6/11 15:50
 * @version: V1.0
 */
@Controller
@RequestMapping("tech")
public class TechController {

    @Autowired
    TechService techService;

    /**
     *@title: getInfoByMedicalID
     *@description: 根据病历号得到患者的基本信息
     *@author: alan
     *@date: 2019/6/11 15:45
     *@param: [Medical_record_ID:病历号]
     *@return: edu.neu.hoso.model.Patient
     *@throws:
     */
    @RequestMapping("/getInfoByID")
    public Patient getInfoByMedicalID(){ //(int Medical_record_ID){
        Patient patient = techService.getInfoByMedical_record_ID(1111);
        if(patient == null){
            System.out.println("为空");
            return null;
        }
        System.out.println(patient.toString());
        return patient;
    }

    /**
     *@title: getInfoByPatientName
     *@description: 根据患者姓名得到患者的基本信息
     *@author: alan
     *@date: 2019/6/11 15:44
     *@param: []
     *@return: java.util.List<edu.neu.hoso.model.Patient>
     *@throws:
     */
    @RequestMapping("/getInfoByName")
    public List<Patient> getInfoByPatientName(){//(int patient_name){
        List<Patient> patients = techService.getInfoByPatient_Name("alan");
        if (patients == null){
            return null;
        }
        for (int i=0;i<patients.size();i++){
            System.out.println(patients.get(i).toString());
        }
        return patients;
    }

    /**
     *@title: getFmedical
     *@description: 根据患者病历号得到该患者在该科室的所有非药品项目
     *@author: alan
     *@date: 2019/6/11 15:43
     *@param: [Medical_record_ID:病历号; Department_ID:科室号]
     *@return: java.util.List<edu.neu.hoso.model.FmedicalItems>
     *@throws:
     */
    @RequestMapping("/getFmedical")
    public List<FmedicalItems> getFmedical(){ //(int Medical_record_ID, int Department_ID)
        List<FmedicalItems> fmedicalItems = techService.getAllFmedicalByMedicalID(1111, 133);
        if (fmedicalItems == null)
            return null;
        for (FmedicalItems f:fmedicalItems)
            System.out.println(f.toString());
        return fmedicalItems;
    }

    /**
     *@title: updateRegistrationStatus
     *@description: 更新患者在该科室的登记状态，该科室的Registration_Status 1->2
     *@author: alan
     *@date: 2019/6/12 11:55
     *@param: [Medical_record_ID, Department_ID]
     *@return: void
     *@throws:
     */
    @RequestMapping("/updateRegistrationStatus")
    public void updateRegistrationStatus() { //(int Medical_record_ID, int Department_ID)
        techService.updateRegistrationStatus(1111, 133);
    }

    /**
     *@title: getAllFmedical
     *@description: 输出该患者在该科室的全部项目
     *@author: alan
     *@date: 2019/6/12 11:50
     *@param: [Medical_record_ID, Department_ID]
     *@return: java.util.List<edu.neu.hoso.model.ExaminationFmedicalItems>
     *@throws:
     */
    @RequestMapping("getAllFmedical")
    public List<ExaminationFmedicalItems> getAllFmedical(){ //(int Medical_record_ID, int Department_ID){
        List<ExaminationFmedicalItems> examinationFmedicalItems = techService.getAllFmedical(1111, 133);
        if (examinationFmedicalItems == null){
            return null;
        }
        for (ExaminationFmedicalItems examinationFmedicalItems1:examinationFmedicalItems){
            System.out.println(examinationFmedicalItems1.getFmedicalItems());
        }
        return examinationFmedicalItems;
    }

    /**
     *@title: insertExaminationDrugsAndExpense
     *@description: 将数据插入Examination_Drugs_Items表中并加入Expense_Items中，并将其生成的expenseid加入Examination_Drugs_Items表中
     *@author: alan
     *@date: 2019/6/13 11:53
     *@param: [examinationDrugsItems, patientId]
     *@return: void 
     *@throws:
     */
    @RequestMapping("insertExaminationDrugsAndExpense")
    public void insertExaminationDrugsAndExpense(){ //(List<ExaminationDrugsItems> examinationDrugsItems, int patientId){
        ExaminationDrugsItems ex1 = new ExaminationDrugsItems();
        ex1.setDrugsId(5);
        ex1.setQuantity(2);
        ex1.setDoctorId(100);
        ExaminationDrugsItems ex2 = new ExaminationDrugsItems();
        ex2.setDrugsId(6);
        ex2.setQuantity(3);
        ex2.setDoctorId(100);
        List<ExaminationDrugsItems> examinationDrugsItems = new ArrayList<ExaminationDrugsItems>();
        examinationDrugsItems.add(ex1);
        examinationDrugsItems.add(ex2);

        int patientId = 1111;

        techService.insertExaminationDrugsAndExpense(examinationDrugsItems, patientId);
    }

    /**
     *@title: maintainCommonFmedical
     *@description: 医技医生维护常用项目，向Commonly_Used_Fmedical表里面插入数据
     *@author: alan
     *@date: 2019/6/13 14:48
     *@param: [commonlyUsedFmedicals]
     *@return: void
     *@throws:
     */
    @RequestMapping("/maintainCommonFmedical")
    public void maintainCommonFmedical(){ //(List<CommonlyUsedFmedical> commonlyUsedFmedicals){
        List<CommonlyUsedFmedical> commonlyUsedFmedicals = new ArrayList<CommonlyUsedFmedical>();
        CommonlyUsedFmedical common1 = new CommonlyUsedFmedical(100, 1);
        CommonlyUsedFmedical common2 = new CommonlyUsedFmedical(100, 3);
        CommonlyUsedFmedical common3 = new CommonlyUsedFmedical(100, 6);
        commonlyUsedFmedicals.add(common1);
        commonlyUsedFmedicals.add(common2);
        commonlyUsedFmedicals.add(common3);

        techService.maintainCommonFmedical(commonlyUsedFmedicals);
    }

    /**
     *@title: insertExaminationResult
     *@description: 检查检验结果录入
     *@author: alan
     *@date: 2019/6/13 15:49
     *@param: [examinationResult]
     *@return: void
     *@throws:
     */
    @RequestMapping("/insertExaminationResult")
    public void insertExaminationResult(){ //(ExaminationResult examinationResult){
        ExaminationResult examinationResult = new ExaminationResult();
        examinationResult.setDoctorId(100);
        examinationResult.setFindings("goodfinding");
        examinationResult.setDiagnosticSuggestion("no diagnostia");
        techService.insertExaminationResult(examinationResult);
    }

    /**
     *@title: insertExaminationResultImage
     *@description: 检查检验照片录入
     *@author: alan
     *@date: 2019/6/13 16:35
     *@param: [examinationResultId, examinationResultImages]
     *@return: void
     *@throws:
     */
    @RequestMapping("/insertExaminationResultImage")
    public void insertExaminationResultImage(){ //(int examinationResultId, List<ExaminationResultImage> examinationResultImages){
        List<ExaminationResultImage> examinationResultImages = new ArrayList<ExaminationResultImage>();
        ExaminationResultImage examinationResultImage1 = new ExaminationResultImage();
        examinationResultImage1.setImageName("img1");
        examinationResultImage1.setImageUrl("img1_url");
        examinationResultImages.add(examinationResultImage1);
        ExaminationResultImage examinationResultImage2 = new ExaminationResultImage();
        examinationResultImage2.setImageName("img2");
        examinationResultImage2.setImageUrl("img1_ur2");
        examinationResultImages.add(examinationResultImage2);
        int examinationResultId = 16;

        techService.insertExaminationResultImage(examinationResultId, examinationResultImages);
    }

}