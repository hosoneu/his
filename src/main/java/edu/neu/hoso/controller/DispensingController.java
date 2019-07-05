package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.DispensingService;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("dispensing")
public class DispensingController {

    @Autowired
    DispensingService dispensingService;

    /**
     *@title: Dispensing
     *@description: 发药
     *@author: zhangjunzhi
     *@date: 2019/6/17 11:32
     *@param: [List<Integer> Medical_record_IDs, List<Integer> DrugsIds]
     *@return: ResultDTO<List<Integer>>
     *@throws:
     */
    @RequestMapping("dispensing")
    public ResultDTO<List<Integer>> Dispensing(@RequestBody List<Integer> DrugsIds){
//        ArrayList<Integer> Medical_record_IDs = new ArrayList<Integer>();
//        ArrayList<Integer> DrugsIds = new ArrayList<Integer>();
//        Medical_record_IDs.add(1111);
//        Medical_record_IDs.add(1111);
//        DrugsIds.add(1);
//        DrugsIds.add(12);
        int medicalRecordId = DrugsIds.get(DrugsIds.size()-1);
        System.out.println("接收到的DrugsIds");
        System.out.println(DrugsIds);
        ResultDTO<List<Integer>> resultDTO = new ResultDTO<List<Integer>>();
        List<Integer> results = new ArrayList<Integer>();
        try {
            for (int i=0;i<DrugsIds.size()-1;i++){
                int status = dispensingService.dispensing(medicalRecordId, DrugsIds.get(i));
                if (status == 1){
                    results.add(status);
                    System.out.println("complete");
                    resultDTO.setStatus("OK");
                    resultDTO.setMsg("更改成功！");
                }
                else {
                    System.out.println("fail");
                    results.add(status);
                    System.out.println(status);
                    resultDTO.setStatus("ERROR");
                    resultDTO.setMsg("更改失败！");
                }
            }
            resultDTO.setData(results);
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更改失败！");
        }
        return resultDTO;
    }

    /**
     *@title: returnDurgs
     *@description: 退药
     *@author: alan
     *@date: 2019/6/17 15:54
     *@param: [List<Object> objects]
     *@return: void
     *@throws:
     */
    @RequestMapping("returnExaminationDurgs")
    public ResultDTO returnDurgs(@RequestBody ExaminationDrugsItems examinationDrugsItems){
        ResultDTO resultDTO = new ResultDTO();
//        List<Integer> results = new ArrayList<Integer>();
        try {
            int status = dispensingService.returnExaminationDurgs(examinationDrugsItems);
            if (status == -1 || status == 0) {
                resultDTO.setStatus("ERROR");
                resultDTO.setMsg("退药失败！");
            } else if (status == 1) {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("退药成功！");
            } else {
                resultDTO.setStatus("ERROR");
                resultDTO.setMsg("系统错误");
            }
//            }
//            resultDTO.setData(results);
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("退药失败！");
        }
        return resultDTO;
    }


    @RequestMapping("/returnPrescriptionDurgs")
    public ResultDTO returnPrescriptionDurgs(@RequestBody PrescriptionItems prescriptionItems){
//        Object object1 = new ExaminationDrugsItems();
//        ((ExaminationDrugsItems) object1).setExaminationDrugsItemsId(1);
//        ((ExaminationDrugsItems) object1).setActualQuantity(2);
//        ((ExaminationDrugsItems) object1).setQuantity(4);
//
//        Object object1 = new ExaminationDrugsItems();
//        ((ExaminationDrugsItems) object2).setExaminationDrugsItemsId(2);
//        ((ExaminationDrugsItems) object2).setActualQuantity(3);
//        ((ExaminationDrugsItems) object2).setQuantity(5);
//
//        List<Object> objects = new ArrayList<Object>();
//        objects.add(object1);
//        objects.add(object2);

        System.out.println("开始输出prescriptionItems");
        System.out.println(prescriptionItems.toString());
        ResultDTO resultDTO = new ResultDTO();
//        List<Integer> results = new ArrayList<Integer>();
        try {
//            for (Object object:objects) {
            int status = dispensingService.returnPrescription(prescriptionItems);
            if (status == -1 || status == 0) {
                resultDTO.setStatus("ERROR");
                resultDTO.setMsg("退药失败！");
            } else if (status == 1) {
                resultDTO.setStatus("OK");
                resultDTO.setMsg("退药成功！");
            } else {
                resultDTO.setStatus("ERROR");
                resultDTO.setMsg("系统错误");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("退药失败！");
        }
        return resultDTO;
    }

    @RequestMapping("getAllExaminationMedical")
    public ResultDTO<List<Examination>> getAllExaminationMedical(){
        ResultDTO<List<Examination>> resultDTO = new ResultDTO();
        try {
            List<Examination> examinationList= dispensingService.getAllExaminationMedical();
            resultDTO.setStatus("OK");
            resultDTO.setMsg("获得成功！");

            for(Examination examination:examinationList){
                System.out.println(examination.toString());
//                for(ExaminationDrugsItems examinationDrugsItems:examination.getExaminationDrugsItemsList()){
//                    ExaminationFmedicalItems examinationFmedicalItems = tech.getExaminationFmedicalItemById(examinationDrugsItems.getExaminationFmedicalItemsId());
//
//                }
//                for (Drugs drugs:examination.getDrugsList()){
//                    System.out.println(drugs.toString());
//                }
            }
            resultDTO.setData(examinationList);
        }
        catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("获得失败！");
        }
        return resultDTO;
    }

    @RequestMapping("getAllPrescriptionMedical")
    public ResultDTO<List<Prescription>> getAllPrescriptionMedical(){
        ResultDTO<List<Prescription>> resultDTO = new ResultDTO();
        try {
            List<Prescription> prescriptionList= dispensingService.getAllPrescriptionMedical();
            resultDTO.setStatus("OK");
            resultDTO.setMsg("获得成功！");
            resultDTO.setData(prescriptionList);
            for(Prescription prescription:prescriptionList){
                System.out.println(prescription.toString());
//                for (Drugs drugs:examination.getDrugsList()){
//                    System.out.println(drugs.toString());
//                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("获得失败！");
        }
        return resultDTO;
    }

    /**
     *@title: getPatientById
     *@description: 根据病历号获得Patient
     *@author: alan
     *@date: 2019/6/30 22:16
     *@param: [medicalRecordId]
     *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Patient>
     *@throws:
     */
    @RequestMapping("getPatientById")
    public ResultDTO<Patient> getPatientById(int medicalRecordId){
        ResultDTO<Patient> resultDTO = new ResultDTO();
        try {
            Patient patient = dispensingService.getPatientById(medicalRecordId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("获得成功！");
            resultDTO.setData(patient);
            System.out.println(patient.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("获得失败！");
        }
        return resultDTO;
    }

    /**
     *@title: getFmedicalValidStatus
     *@description: 根据非药品id获得Fmedical
     *@author: zhangjunzhi
     *@date: 2019/7/1 14:38
     *@param: [examinationFmedicalItemsId]
     *@return: int
     *@throws:
     */
    @RequestMapping("/getFmedical")
    public ResultDTO<ExaminationFmedicalItems> getFmedical(int examinationFmedicalItemsId){
        ResultDTO<ExaminationFmedicalItems> resultDTO = new ResultDTO<ExaminationFmedicalItems>();
        try {
            ExaminationFmedicalItems examinationFmedicalItems= dispensingService.getFmedicalItem(examinationFmedicalItemsId);
            System.out.println("开始输出getFmedical");
            System.out.println(examinationFmedicalItems.toString());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("获得成功！");
            resultDTO.setData(examinationFmedicalItems);
        }
        catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("获得失败！");
        }
        return resultDTO;
    }

    /**
     *@title: getExpenseItems
     *@description: 根据收费id获得ExpenseItems
     *@author: zhangjunzhi
     *@date: 2019/7/1 15:15
     *@param: [expenseItemsId]
     *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.ExpenseItems>
     *@throws:
     */
    @RequestMapping("/getExpenseItems")
    public ResultDTO<ExpenseItems> getExpenseItems(int expenseItemsId){
        System.out.println("进来了");
        System.out.println("开始输出" + expenseItemsId);
        ResultDTO<ExpenseItems> resultDTO = new ResultDTO<ExpenseItems>();
        try {
            ExpenseItems expenseItems= dispensingService.getExpenseItems(expenseItemsId);
            System.out.println("开始输出getExpenseItems");
            System.out.println(expenseItems.toString());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("获得成功！");
            resultDTO.setData(expenseItems);
        }
        catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("获得失败！");
        }
        return resultDTO;
    }
}
