package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.RegistrationService;
import edu.neu.hoso.utils.JsonUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @title: RegistrationController
 * @package edu.neu.hoso.controller
 * @description: 挂号控制类
 * @author: Mike
 * @date: 2019-06-13 14:22
 * @version: V1.0
*/
@RestController
@CrossOrigin
@RequestMapping("registration")
public class RegistrationController {
    @Resource
    RegistrationService registrationService;

    @RequestMapping("/register")
    public ResultDTO register(@RequestBody Map<String ,Object> map){
        /**
         *@title: register
         *@description: 挂号操作
         *@author: Mike
         *@date: 2019-06-19 11:13
         *@param: [map]
         *@return: edu.neu.hoso.dto.ResultDTO
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            Registration registration = JsonUtils.mapToObj((Map<String, Object>)map.get("registration"), Registration.class);
            Patient patient = JsonUtils.mapToObj((Map<String, Object>)map.get("patient"), Patient.class);
            MedicalRecord medicalRecord = JsonUtils.mapToObj((Map<String, Object>)map.get("medicalRecord"), MedicalRecord.class);
            ExpenseItems expenseItems = JsonUtils.mapToObj((Map<String, Object>)map.get("expenseItems"), ExpenseItems.class);
            Integer userId = (Integer)map.get("userId");
            Integer payModeId = (Integer)map.get("payModeId");
            System.out.println(registration);
            System.out.println(patient);
            System.out.println(medicalRecord);
            System.out.println(expenseItems);
            System.out.println(userId);
            System.out.println(payModeId);
            registrationService.register(registration, patient, medicalRecord, expenseItems, userId, payModeId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("挂号成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("挂号失败！");
        }
        return resultDTO;
    }
    @RequestMapping("/withdraw")
    public ResultDTO withdraw(Integer expenseItemsId, Integer userId){
        /**
         *@title: withdraw
         *@description: 退号操作
         *@author: Mike
         *@date: 2019-06-19 11:18
         *@param: [expenseItemsId, userId]
         *@return: edu.neu.hoso.dto.ResultDTO
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            registrationService.withdraw(expenseItemsId, userId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("退号成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("退号失败！");
        }
        return resultDTO;
    }
    @RequestMapping("/showRegistration")
    public ResultDTO showRegistration(){
        /**
         *@title: showRegistration
         *@description: 展示挂号列表
         *@author: Mike
         *@date: 2019-06-13 14:45
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(registrationService.getRegistration());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示挂号列表成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示挂号列表失败！");
        }
        return resultDTO;
    }
    @RequestMapping("/charge")
    public ResultDTO charge(@RequestBody Map<String ,Object> map){
        /**
         *@title: charge
         *@description: 收费操作
         *@author: Mike
         *@date: 2019-06-19 11:16
         *@param: [map]
         *@return: edu.neu.hoso.dto.ResultDTO
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            List<Integer> expenseItemsIdList = (List<Integer>) map.get("expenseItemsIdList");
            Integer userId = (Integer)map.get("userId");
            Integer payModeId = (Integer)map.get("payModeId");
            System.out.println(expenseItemsIdList);
            System.out.println(userId);
            System.out.println(payModeId);
            registrationService.charge(expenseItemsIdList, userId, payModeId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("收费成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("收费失败！");
        }
        return resultDTO;
    }
    @RequestMapping("/refund")
    public ResultDTO refund(@RequestBody ExpenseItemsListWithUserId expenseItemsListWithUserId){
        /**
         *@title: refund
         *@description: 退费操作
         *@author: Mike
         *@date: 2019-06-19 11:21
         *@param: [map]
         *@return: edu.neu.hoso.dto.ResultDTO
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
//            List<ExpenseItems> expenseItemsList = JsonUtils.mapToObj((Map<String, Object>)map.get("expenseItemsList"), List.class);
//            List<ExpenseItems> expenseItemsList = (List)map.get("expenseItemsList");
//            Integer userId = (Integer)map.get("userId");
            List<ExpenseItems> expenseItemsList = expenseItemsListWithUserId.getExpenseItemsList();
            Integer userId = expenseItemsListWithUserId.getUserId();
            System.out.println(expenseItemsList.get(0).getInvoiceId());
            System.out.println(userId);
            registrationService.refund(expenseItemsList, userId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("退费成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("退费失败！");
        }
        return resultDTO;
    }
    @RequestMapping("/getRegistrationByMedicalRecordId")
    public ResultDTO getRegistrationByMedicalRecordId(Integer id){
        /**
         *@title: getRegistrationByMedicalRecordId
         *@description: 查询挂号信息 经id
         *@author: Mike
         *@date: 2019-06-19 11:16
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            registrationService.getRegistrationByMedicalRecordId(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询挂号信息成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询挂号信息失败！");
        }
        return resultDTO;
    }
    @RequestMapping("/getPatientPayExpenseItems")
    public ResultDTO getPatientPayExpenseItems(@RequestParam Integer id, @RequestParam Date startDate, @RequestParam Date endDate){
        /**
         *@title: getPatientPayExpenseItems
         *@description: 查询患者已收费项目 经id,startDate,endDate
         *@author: Mike
         *@date: 2019-06-19 11:22
         *@param: [id, startDate, endDate]
         *@return: edu.neu.hoso.dto.ResultDTO
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            registrationService.getPatientPayExpenseItems(id, startDate, endDate);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询患者已收费项目成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询患者已收费项目失败！");
        }
        return resultDTO;
    }
    @RequestMapping("/getPatientUnPayExpenseItems")
    public ResultDTO getPatientUnPayExpenseItems(Integer id){
        /**
         *@title: getPatientUnPayExpenseItems
         *@description: 查询患者未收费项目
         *@author: Mike
         *@date: 2019-06-19 11:24
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            registrationService.getPatientUnPayExpenseItems(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询患者未收费项目成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询患者未收费项目失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllPatient")
    public ResultDTO getAllPatient(){
        /**
         *@title: getAllPatient
         *@description: 查询所有患者
         *@author: Mike
         *@date: 2019-06-30 2:45
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(registrationService.getAllPatient());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询患者未收费项目成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询患者未收费项目失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllExpenseItems")
    public ResultDTO getAllExpenseItems(){
        /**
         *@title: getAllExpenseItems
         *@description: 查询所有费用项目 包含全部信息
         *@author: Mike
         *@date: 2019-06-30 2:45
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(registrationService.getAllExpenseItems());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询全部费用项目成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询全部费用项目失败！");
        }
        return resultDTO;
    }
}
