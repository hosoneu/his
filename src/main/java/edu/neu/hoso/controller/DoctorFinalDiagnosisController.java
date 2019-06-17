package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.Diagnosis;
import edu.neu.hoso.service.MedicalRecordHomePageService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class DoctorFinalDiagnosisController {
    // 确诊  录入终诊信息
    @Autowired
    MedicalRecordHomePageService medicalRecordHomePageService;
    @RequestMapping("/insertFinalDiagnosis")
    public ResultDTO<Integer> insertFinalDiagnosis(List<Diagnosis> diagnosisList, Integer userId){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(medicalRecordHomePageService.insertFinalDiagnosis(diagnosisList,userId));
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
    public ResultDTO insertAssistantExamination(String assistantExamination,Integer medicalRecordHomePageId){
        ResultDTO resultDTO = new ResultDTO<>();
        try {
            medicalRecordHomePageService.insertAssistantExamination(assistantExamination,medicalRecordHomePageId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("辅助检查结果录入成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("辅助检查结果录入失败！");
        }
        return resultDTO;
    }
}
