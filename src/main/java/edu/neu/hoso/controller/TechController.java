package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.TechService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@CrossOrigin
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
    public ResultDTO<Patient> getInfoByMedicalID(int Medical_record_ID){
        ResultDTO resultDTO = new ResultDTO();
        try {
            Patient patient = techService.getInfoByMedical_record_ID(Medical_record_ID);
            if(patient == null){
                resultDTO.setStatus("ERROR");
                resultDTO.setMsg("获取失败！");
            }
            else {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("获取成功！");
                resultDTO.setData(patient);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("获取失败！");
        }
        return resultDTO;
    }

    /**
     *@title: getInfoByPatientName
     *@description: 根据患者姓名得到患者的基本信息
     *@author: alan
     *@date: 2019/6/11 15:44
     *@param: [patient_name]
     *@return: java.util.List<edu.neu.hoso.model.Patient>
     *@throws:
     */
    @RequestMapping("/getInfoByName")
    public ResultDTO<List<Patient>> getInfoByPatientName(String patient_name){
        ResultDTO resultDTO = new ResultDTO();
        try {
            List<Patient> patients = techService.getInfoByPatient_Name(patient_name);
            if (patients == null){
                resultDTO.setStatus("ERROR");
                resultDTO.setMsg("获取失败！");
            }else {
                for (int i=0;i<patients.size();i++){
                    System.out.println(patients.get(i).toString());
                }
                resultDTO.setStatus("OK");
                resultDTO.setMsg("获取成功！");
                resultDTO.setData(patients);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("获取失败！");
        }
        return resultDTO;
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
    public ResultDTO<List<FmedicalItems>> getFmedical(int Medical_record_ID, int Department_ID){
        ResultDTO resultDTO = new ResultDTO();
        try {
            List<FmedicalItems> fmedicalItems = techService.getAllFmedicalByMedicalID(Medical_record_ID, Department_ID);
            if (fmedicalItems == null){
                resultDTO.setStatus("ERROR");
                resultDTO.setMsg("获取失败！");
            }
            else {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("获取成功！");
                resultDTO.setData(fmedicalItems);
                for (FmedicalItems f:fmedicalItems)
                    System.out.println(f.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("获取失败！");
        }
        return resultDTO;
    }

    /**
     *@title: updateRegistrationStatus
     *@description: 根据检查检验非药品明细id，该科室的Registration_Status 1->2
     *@author: alan
     *@date: 2019/6/12 11:55
     *@param: [examinationFmedicalItemdId]
     *@return: void
     *@throws:
     */
    @RequestMapping("/updateRegistrationStatus")
    public ResultDTO updateRegistrationStatus(int examinationFmedicalItemdId) {

        ResultDTO resultDTO = new ResultDTO();
        try {
            techService.updateRegistrationStatus(examinationFmedicalItemdId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新失败！");
        }
        return resultDTO;
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
    @RequestMapping("/getAllFmedical")
    public ResultDTO<List<ExaminationFmedicalItems>> getAllFmedical(int Medical_record_ID, int Department_ID){
//        int Medical_record_ID=1111;
//        int Department_ID =133;
        System.out.println("okok");
        ResultDTO resultDTO = new ResultDTO();
        try {
            List<ExaminationFmedicalItems> examinationFmedicalItems = techService.getAllFmedical(Medical_record_ID, Department_ID);
            if (examinationFmedicalItems == null){
                resultDTO.setStatus("ERROR");
                resultDTO.setMsg("获取失败！");
            }
            else {
                for (ExaminationFmedicalItems examinationFmedicalItems1:examinationFmedicalItems){
                    System.out.println(examinationFmedicalItems1.getFmedicalItems().toString());
                    for (ExaminationDrugsItems examinationDrugsItems: examinationFmedicalItems1.getExaminationDrugsItemsList()){
                        System.out.println(examinationDrugsItems.toString());
                        System.out.println(examinationDrugsItems.getDrugs().toString());
                    }
                }
                resultDTO.setStatus("OK");
                resultDTO.setMsg("获取成功！");
                resultDTO.setData(examinationFmedicalItems);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("获取失败！");
        }
        System.out.println(resultDTO.getMsg());
        return resultDTO;
    }

    /**
     *@title: insertExaminationDrugsAndExpense
     *@description: 医技医生开药，将数据插入Examination_Drugs_Items表中并加入Expense_Items中，并将其生成的expenseid加入Examination_Drugs_Items表中
     *@author: alan
     *@date: 2019/6/13 11:53
     *@param: [examinationDrugsItems, Medical_record_ID]
     *@return: void
     *@throws:
     */
    @RequestMapping("insertExaminationDrugsAndExpense")
    public ResultDTO insertExaminationDrugsAndExpense(List<ExaminationDrugsItems> examinationDrugsItems, int Medical_record_ID){
//        ExaminationDrugsItems ex1 = new ExaminationDrugsItems();
//        ex1.setDrugsId(5);
//        ex1.setQuantity(2);
//        ex1.setDoctorId(100);
//        ExaminationDrugsItems ex2 = new ExaminationDrugsItems();
//        ex2.setDrugsId(6);
//        ex2.setQuantity(3);
//        ex2.setDoctorId(100);
//        List<ExaminationDrugsItems> examinationDrugsItems = new ArrayList<ExaminationDrugsItems>();
//        examinationDrugsItems.add(ex1);
//        examinationDrugsItems.add(ex2);
//        int Medical_record_ID = 1111;
        ResultDTO resultDTO = new ResultDTO();
        try {
            techService.insertExaminationDrugsAndExpense(examinationDrugsItems, Medical_record_ID);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入失败！");
        }
        return resultDTO;
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
    public ResultDTO maintainCommonFmedical(List<CommonlyUsedFmedical> commonlyUsedFmedicals){
//        List<CommonlyUsedFmedical> commonlyUsedFmedicals = new ArrayList<CommonlyUsedFmedical>();
//        CommonlyUsedFmedical common1 = new CommonlyUsedFmedical(100, 1);
//        CommonlyUsedFmedical common2 = new CommonlyUsedFmedical(100, 3);
//        CommonlyUsedFmedical common3 = new CommonlyUsedFmedical(100, 6);
//        commonlyUsedFmedicals.add(common1);
//        commonlyUsedFmedicals.add(common2);
//        commonlyUsedFmedicals.add(common3);

        ResultDTO resultDTO = new ResultDTO();
        try {
            techService.maintainCommonFmedical(commonlyUsedFmedicals);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入失败！");
        }
        return resultDTO;
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
    public ResultDTO insertExaminationResult(ExaminationResult examinationResult){
//        ExaminationResult examinationResult = new ExaminationResult();
//        examinationResult.setDoctorId(100);
//        examinationResult.setFindings("goodfinding");
//        examinationResult.setDiagnosticSuggestion("no diagnostia");

        ResultDTO resultDTO = new ResultDTO();
        try {
            techService.insertExaminationResult(examinationResult);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入失败！");
        }
        return resultDTO;

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
    public ResultDTO insertExaminationResultImage(int examinationResultId, List<ExaminationResultImage> examinationResultImages){
//        List<ExaminationResultImage> examinationResultImages = new ArrayList<ExaminationResultImage>();
//        ExaminationResultImage examinationResultImage1 = new ExaminationResultImage();
//        examinationResultImage1.setImageName("img1");
//        examinationResultImage1.setImageUrl("img1_url");
//        examinationResultImages.add(examinationResultImage1);
//        ExaminationResultImage examinationResultImage2 = new ExaminationResultImage();
//        examinationResultImage2.setImageName("img2");
//        examinationResultImage2.setImageUrl("img1_ur2");
//        examinationResultImages.add(examinationResultImage2);
//        int examinationResultId = 16;

        ResultDTO resultDTO = new ResultDTO();
        try {
            techService.insertExaminationResultImage(examinationResultId, examinationResultImages);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除失败！");
        }
        return resultDTO;
    }

    /**
     *@title: getAllPatientByDepartmentId
     *@description: 根据科室号获取全部病人
     *@author: alan
     *@date: 2019/6/24 22:04
     *@param: [departmentId]
     *@return: edu.neu.hoso.dto.ResultDTO
     *@throws:
     */
    @RequestMapping("/getAllPatientByDepartmentId")
    public ResultDTO<List<Registration>> getAllPatientByDepartmentId(Integer departmentId){
        ResultDTO<List<Registration>> resultDTO = new ResultDTO<>();
        try{
            List<Registration> registrations = techService.getAllPatientByDepartmentId(departmentId);
            if (registrations==null){
                resultDTO.setStatus("ERROR");
                resultDTO.setMsg("查询失败！");
            }
            else {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("查询成功！");
                for (Registration registration:registrations){
                    System.out.println(registration.toString());
//                    System.out.println(registration.getPatient().toString());
                }
                resultDTO.setData(registrations);
            }
        }catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询失败！");
        }
        return resultDTO;
    }
}