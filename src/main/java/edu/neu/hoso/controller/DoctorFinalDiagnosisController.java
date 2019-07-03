package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.Diagnosis;
import edu.neu.hoso.model.MedicalRecordMapper;
import edu.neu.hoso.service.MedicalRecordHomePageService;
import edu.neu.hoso.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @title: DoctorFinalDiagnosisController
 * @package edu.neu.hoso.controller
 * @description: 门诊医生用户确诊的控制类
 * @author: 29-y
 * @date: 2019-06-17 17:38
 * @version: V1.0
*/
@RequestMapping("doctor/diagnosis")
@RestController
@CrossOrigin
public class DoctorFinalDiagnosisController {
    // 确诊  录入终诊信息
    @Autowired
    MedicalRecordHomePageService medicalRecordHomePageService;
    @Autowired
    MedicalRecordService medicalRecordService;

    //列出终诊诊信息
    @RequestMapping("/listFinalDiagnosisByMedicalRecordId")
    public ResultDTO<List<Diagnosis>> listFinalDiagnosisByMedicalRecordId(Integer medicalRecordId){
        ResultDTO<List<Diagnosis>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(medicalRecordHomePageService.listFinalDiagnosisByMedicalRecordId(medicalRecordId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("终诊信息查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("终诊信息查询失败！");
        }
        return resultDTO;
    }


    @RequestMapping("/insertFinalDiagnosis")
    public ResultDTO<Integer> insertFinalDiagnosis(@RequestBody List<Diagnosis> diagnosisList){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(medicalRecordHomePageService.insertFinalDiagnosis(diagnosisList));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("终诊信息录入成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("终诊信息录入失败！");
        }
        return resultDTO;
    }

    // 确诊  录入辅助检查结果
    @RequestMapping("/insertAssistantExamination")
    public ResultDTO insertAssistantExamination(String assistantExamination,Integer medicalRecordId){
        ResultDTO resultDTO = new ResultDTO<>();
        try {
            medicalRecordHomePageService.insertAssistantExamination(assistantExamination,medicalRecordId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("辅助检查结果录入成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("辅助检查结果录入失败！");
        }
        return resultDTO;
    }
    // 诊毕
    @RequestMapping("/treatmentOver")
    public ResultDTO treatmentOver(Integer medicalRecordId){
        ResultDTO resultDTO = new ResultDTO<>();
        try {
            medicalRecordService.treamentOver(medicalRecordId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("诊毕成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("诊毕失败！");
        }
        return resultDTO;
    }

}
