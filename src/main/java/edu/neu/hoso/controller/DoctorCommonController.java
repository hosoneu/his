package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @title: DoctorCommonController
 * @package edu.neu.hoso.controller
 * @description: 门诊医生用户查看基础数据的控制类
 * @author: 29-y
 * @date: 2019-06-17 17:40
 * @version: V1.0
*/
@RequestMapping("doctor/common")
@RestController
public class DoctorCommonController {
    @Autowired
    DepartmentService departmentService;
    @Autowired
    UserService userService;
    @Autowired
    DoctorRegistrationService doctorRegistrationService;
    @Autowired
    CommonlyUsedService commonlyUsedService;
    @Autowired
    InfoListService infoListService;

    @RequestMapping("/selectDoctorById")
    public ResultDTO<User> selectDoctorByUserID(Integer userId){
        ResultDTO<User> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(userService.getUserById(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查找医生信息成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查找医生信息失败！");
        }
        return resultDTO;
    }

    //得到门诊医生的科室信息
    @RequestMapping("/selectDepartmentById")
    public ResultDTO<Department> selectDepartmentById(Integer departmentId){
        ResultDTO<Department> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(departmentService.getDepartmentById(departmentId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查找科室信息成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查找科室信息失败！");
        }
        return resultDTO;
    }

    //    得到挂到该医生的挂号列表（挂号日期为当天）
    @RequestMapping("/listRegistrationFromUserByUserId")
    public ResultDTO<List<Registration>> listRegistrationFromUserByUserId(Integer userId){
        ResultDTO<List<Registration>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorRegistrationService.listRegistrationFromUserByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("医生个人挂号列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("医生个人挂号列表获取失败！");
        }
        return resultDTO;
    }

    //得到该医生所在科室的挂号列表（挂号日期为当天）
    @RequestMapping("/listRegistrationFromDepartmentByUserId")
    public ResultDTO<List<Registration>> listRegistrationFromDepartmentByUserId(Integer userId){
        ResultDTO<List<Registration>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorRegistrationService.listRegistrationFromDepartmentByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("医生科室挂号列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("医生科室挂号列表获取失败！");
        }
        return resultDTO;
    }

    //    从个人的患者列表中切换病人
    @RequestMapping("/changePatientFromUser")
    public ResultDTO changePatientFromUser(Integer medicalRecordId,Integer userId){
        ResultDTO resultDTO = new ResultDTO<>();
        try {
            doctorRegistrationService.changePatientFromUserByMedicalRecordId(medicalRecordId,userId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("从医生个人患者列表中切换患者成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("从医生个人患者列表中切换患者失败！");
        }
        return resultDTO;
    }

    //    从科室的患者列表中切换病人 对Medical_Record进行赋值
    @RequestMapping("/changePatientFromDepartment")
    public ResultDTO changePatientFromDepartment(Integer medicalRecordId,Integer userId){
        ResultDTO resultDTO = new ResultDTO<>();
        try {
            doctorRegistrationService.changePatientFromDepartmentByMedicalRecordId(medicalRecordId,userId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("从医生科室患者列表中切换患者成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("从医生科室患者列表中切换患者失败！");
        }
        return resultDTO;
    }

    // 获取常用药品
    @RequestMapping("/listCommonlyUsedDrugsByUserId")
    public ResultDTO<List<CommonlyUsedDrugs>> listCommonlyUsedDrugsByUserId(Integer userId){
        ResultDTO<List<CommonlyUsedDrugs>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.listCommonlyUsedDrugsByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用药品获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用药品获取失败！");
        }
        return resultDTO;
    }
    // 获取常用诊断
    @RequestMapping("/listCommonlyUsedDiagnosisByUserId")
    public ResultDTO<List<CommonlyUsedDiagnosis>> listCommonlyUsedDiagnosisByUserId(Integer userId){
        ResultDTO<List<CommonlyUsedDiagnosis>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.listCommonlyUsedDiagnosisByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用诊断获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用诊断获取失败！");
        }
        return resultDTO;
    }

    // 获取常用检查
    @RequestMapping("/listCommonlyUsedExamination1ByUserId")
    public ResultDTO<List<CommonlyUsedFmedical>> listCommonlyUsedExamination1ByUserId(Integer userId){
        ResultDTO<List<CommonlyUsedFmedical>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.listCommonlyUsedExamination1ByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用检查获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用检查获取失败！");
        }
        return resultDTO;
    }
    // 获取常用检验
    @RequestMapping("/listCommonlyUsedExamination2ByUserId")
    public ResultDTO<List<CommonlyUsedFmedical>> listCommonlyUsedExamination2ByUserId(Integer userId){
        ResultDTO<List<CommonlyUsedFmedical>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.listCommonlyUsedExamination2ByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用检验获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用检验获取失败！");
        }
        return resultDTO;
    }
    // 获取常用处置
    @RequestMapping("/listCommonlyUsedTreatmentByUserId")
    public ResultDTO<List<CommonlyUsedFmedical>> listCommonlyUsedTreatmentByUserId(Integer userId){
        ResultDTO<List<CommonlyUsedFmedical>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.listCommonlyUsedTreatmentByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用处置获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用处置获取失败！");
        }
        return resultDTO;
    }
    //展示所有的成药
    @RequestMapping("/listPatentDrugs")
    public ResultDTO<List<Drugs>> listPatentDrugs(){
        ResultDTO<List<Drugs>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(infoListService.listPatentDrugs());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("成药列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("成药列表获取失败！");
        }
        return resultDTO;
    }
    //展示所有的草药
    @RequestMapping("/listHerbalDrugs")
    public ResultDTO<List<Drugs>> listHerbalDrugs(){
        ResultDTO<List<Drugs>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(infoListService.listHerbalDrugs());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("草药列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("草药列表获取失败！");
        }
        return resultDTO;
    }
    //展示所有的检查非药品
    @RequestMapping("/listExamination1")
    public ResultDTO<List<FmedicalItems>> listExamination1(){
        ResultDTO<List<FmedicalItems>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(infoListService.listExamination1());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("检查非药品列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("检查列表获取失败！");
        }
        return resultDTO;
    }
    //展示所有的检验非药品
    @RequestMapping("/listExamination2")
    public ResultDTO<List<FmedicalItems>> listExamination2(){
        ResultDTO<List<FmedicalItems>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(infoListService.listExamination2());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("检验非药品列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("检验非药品列表获取失败！");
        }
        return resultDTO;
    }
    //展示所有的处置非药品
    @RequestMapping("/listTreatment")
    public ResultDTO<List<FmedicalItems>> listTreatment(){
        ResultDTO<List<FmedicalItems>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(infoListService.listTreatment());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("处置非药品列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("处置非药品列表获取失败！");
        }
        return resultDTO;
    }
    //展示所有的中医疾病
    @RequestMapping("/listChineseDisease")
    public ResultDTO<List<Disease>> listChineseDisease(){
        ResultDTO<List<Disease>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(infoListService.listChineseDisease());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("中医疾病列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("中医疾病列表获取失败！");
        }
        return resultDTO;
    }
    //展示所有的西医疾病
    @RequestMapping("/listWesternDisease")
    public ResultDTO<List<Disease>> listWesternDisease(){
        ResultDTO<List<Disease>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(infoListService.listWesternDisease());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("西医疾病列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("西医疾病列表获取失败！");
        }
        return resultDTO;
    }
}
