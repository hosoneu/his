package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @title: DoctorMedicalRecordHomePageController
 * @package edu.neu.hoso.controller
 * @description: 门诊医生用户病历首页的控制类
 * @author: 29-y
 * @date: 2019-06-10 14:45
 * @version: V1.0
*/
@RestController
@RequestMapping("doctor/homepage")
@CrossOrigin
public class DoctorMedicalRecordHomePageController {
    @Autowired
    MedicalRecordHomePageService medicalRecordHomePageService;
    @Autowired
    DoctorRegistrationService doctorRegistrationService;
    @Autowired
    MedicalRecordService medicalRecordService;

    //   历史病历查询：查找该患者对应的历史挂号信息（包括病历首页和诊断） 将最终诊断的结果放入MedicalRecord属性中
    @RequestMapping("/listMedicalRecordHistoryByPatientId")
    public ResultDTO<List<MedicalRecord>> listMedicalRecordHistoryByPatientId(Integer patientId){
        ResultDTO<List<MedicalRecord>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(medicalRecordService.listMedicalRecordHistoryByPatientId(patientId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("患者历史病历查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("患者历史病历查询失败！");
        }
        return resultDTO;
    }

    //    录入病历首页的文字部分（除初步诊断、辅助检查的部分 该部分由insertFirstDiagnosis实现）
    @RequestMapping("/insertMedicalRecordHomePage")
    public ResultDTO<Integer> insertMedicalRecordHomePage(@RequestBody MedicalRecordHomePage medicalRecordHomePage ){
//        MedicalRecordHomePage medicalRecordHomePage = new MedicalRecordHomePage();
//        medicalRecordHomePage.setAllergicHistory("无");
//        medicalRecordHomePage.setChiefComplaint("头昏 有点发烧");
//        medicalRecordHomePage.setPastHistory("无");
//        medicalRecordHomePage.setPresentHistory("头昏脑涨");
//        medicalRecordHomePage.setPhysicalExamination("眼睛瞳孔无浑浊，四肢发育正常");
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(medicalRecordHomePageService.insertMedicalRecordHomePage(medicalRecordHomePage));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("患者历史病历查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("患者历史病历查询失败！");
        }
        return resultDTO;
    }

    //    录入初诊结果 点击保存即可插入 在病历首页部分进行提交 然后需要在medical中填充终诊的姓名
    @RequestMapping("/insertFirstDiagnosis")
    public ResultDTO<Integer> insertFirstDiagnosis(@RequestBody List<Diagnosis> diagnosisList){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(medicalRecordHomePageService.insertFirstDiagnosis(diagnosisList));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("初诊结果录入成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("初诊结果录入失败！");
        }
        return resultDTO;
    }

    //    列出病历首页模板（个人、科室、全院）
    @RequestMapping("/listMedicalRecordHomePageTemplate")
    public ResultDTO<List<MedicalRecordHomePageTemplate>> listMedicalRecordHomePageTemplate(Integer userId,String scope){
        ResultDTO<List<MedicalRecordHomePageTemplate>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(medicalRecordHomePageService.listMedicalRecordHomePageTemplate(userId,scope));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("病历首页模板展示成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("病历首页模板展示失败！");
        }
        return resultDTO;
    }

    //    查询病历首页模板 需要将初诊的内容放置到属性中
    @RequestMapping("/selectMedicalRecordHomePageTemplateById")
    public ResultDTO<MedicalRecordHomePageTemplate> selectMedicalRecordHomePageTemplateById(Integer medicalRecordHomePageTemplateId){
        ResultDTO<MedicalRecordHomePageTemplate> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(medicalRecordHomePageService.selectMedicalRecordHomePageTemplateById(medicalRecordHomePageTemplateId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("病历首页模板查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("病历首页模板查询失败！");
        }
        return resultDTO;
    }

    //   插入病历首页模板
    @RequestMapping("/insertMedicalRecordHomePageTemplate")
    public ResultDTO<Integer> insertMedicalRecordHomePageTemplate(MedicalRecordHomePageTemplate medicalRecordHomePageTemplate){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(medicalRecordHomePageService.insertMedicalRecordHomePageTemplate(medicalRecordHomePageTemplate));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("病历首页模板插入成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("病历首页模板插入失败！");
        }
        return resultDTO;
    }

    //根据ID查询病历首页的内容
    @RequestMapping("/selectMedicalRecordHomePageByMedicalRecordId")
    public ResultDTO<MedicalRecordHomePage> selectMedicalRecordHomePageByMedicalRecordId(Integer medicalRecordId){
        ResultDTO<MedicalRecordHomePage> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(medicalRecordHomePageService.selectMedicalRecordHomePageByMedicalRecordId(medicalRecordId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("病历首页文字部分查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("病历首页文字部分查询失败！");
        }
        return resultDTO;
    }

    //列出初诊信息
        @RequestMapping("/listFirstDiagnosisByMedicalRecordId")
    public ResultDTO<List<Diagnosis>> listFirstDiagnosisByMedicalRecordId(Integer medicalRecordId){
        ResultDTO<List<Diagnosis>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(medicalRecordHomePageService.listFirstDiagnosisByMedicalRecordId(medicalRecordId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("初诊信息查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("初诊信息查询失败！");
        }
        return resultDTO;
    }
}
