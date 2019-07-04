package edu.neu.hoso.service;

import edu.neu.hoso.model.Diagnosis;
import edu.neu.hoso.model.MedicalRecordHomePage;
import edu.neu.hoso.model.MedicalRecordHomePageTemplate;

import java.util.List;

/**
 * @title: MedicalRecordHomePageService
 * @package edu.neu.hoso.service
 * @description: 定义对病历首页的操作
 * @author: 29-y
 * @date: 2019-06-14 10:04
 * @version: V1.0
 */
public interface MedicalRecordHomePageService {

    // 录入病历首页的文字部分（除初步诊断、辅助检查的部分 该部分由insertFirstDiagnosis实现）
    Integer insertMedicalRecordHomePage(MedicalRecordHomePage medicalRecordHomePage);
    // 录入初诊结果
    Integer insertFirstDiagnosis(List<Diagnosis> diagnosisList);
    // 录入终诊结果
    Integer insertFinalDiagnosis(List<Diagnosis> diagnosisList);
    // 录入辅助检查结果
    void insertAssistantExamination(String assistantExamination,Integer medicalRecordId);
    // 列出病历首页模板（1个人/2科室/3医院）
    List<MedicalRecordHomePageTemplate> listMedicalRecordHomePageTemplate(Integer userId,String scope);
    // 查询病历首页模板 包括诊断信息
    MedicalRecordHomePageTemplate selectMedicalRecordHomePageTemplateById(Integer medicalRecordHomePageTemplateId);
    // 存为病历首页模板
    Integer insertMedicalRecordHomePageTemplate(MedicalRecordHomePageTemplate medicalRecordHomePageTemplate);
    //删除病历首页模板
    void deleteMedicalRecordHomePageTemplate(Integer medicalRecordHomePageTemplateId);

    //  查询病历首页内容
    MedicalRecordHomePage selectMedicalRecordHomePageByMedicalRecordId(Integer medicalRecordId);
    //  查询初诊结果
    List<Diagnosis> listFirstDiagnosisByMedicalRecordId(Integer medicalRecordId);
    //  查询终诊结果
    List<Diagnosis> listFinalDiagnosisByMedicalRecordId(Integer medicalRecordId);
}
