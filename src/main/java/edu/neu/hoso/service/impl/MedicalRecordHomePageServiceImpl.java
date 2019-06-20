package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.RegistrationExample;
import edu.neu.hoso.example.SchedulingInfoExample;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.MedicalRecordHomePageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @title: MedicalRecordHomePageServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 实现对病历首页的操作：插入病历首页的文字部分、插入病历首页的初诊信息、插入病历首页的初诊信息、确诊时插入终诊信息等
 * @author: 29-y
 * @date: 2019-06-14 10:05
 * @version: V1.0
 */

@Service
public class MedicalRecordHomePageServiceImpl implements MedicalRecordHomePageService {

    @Resource
    DiagnosisMapper diagnosisMapper;
    @Resource
    MedicalRecordHomePageMapper medicalRecordHomePageMapper;
    @Resource
    MedicalRecordHomePageTemplateMapper medicalRecordHomePageTemplateMapper;
    @Resource
    MedicalRecordMapper medicalRecordMapper;
    @Resource
    RegistrationMapper registrationMapper;
    @Resource
    DiagnosisTemplateMapper diagnosisTemplateMapper;
    @Resource
    SchedulingInfoMapper schedulingInfoMapper;

    /**
     * @title: insertMedicalRecordHomePage
     * @description: 插入病历首页的文字部分（除去初诊信息、辅助检查）
     * @author:  29-y
     * @date: 2019-06-17 10:12
     * @param: [medicalRecordHomePage]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertMedicalRecordHomePage(MedicalRecordHomePage medicalRecordHomePage) {
        medicalRecordHomePageMapper.insert(medicalRecordHomePage);
        return medicalRecordHomePage.getMedicalRecordHomePageId();
    }

    /**
     * @title: insertFirstDiagnosis
     * @description: 插入病历首页的初诊信息
     * @author:  29-y
     * @date: 2019-06-17 10:12
     * @param: [diagnosisList,userId]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertFirstDiagnosis(List<Diagnosis> diagnosisList,Integer userId,Integer medicalRecordId) {
        //插入初诊信息 不需要更改排班剩余挂号数
        Date date = new Date();
        Integer diagnosisId = -1;//记录最后一个初步诊断的ID 将他它作为结果返回
        for(Diagnosis diagnosis : diagnosisList){
            diagnosis.setDiagnosisMark("1");//设置初诊标志
            diagnosis.setMedicalRecordId(medicalRecordId);//设置病历号
            //todo 需要得到前端的日期 转换成发病日期对应的Date
            diagnosisMapper.insert(diagnosis);
            diagnosisId = diagnosis.getDiagnosisId();//用于返回最后一个插入的索引
        }
        //更新初诊信息
        MedicalRecord medicalRecord = new MedicalRecord();
        medicalRecord.setMedicalRecordId(medicalRecordId);//根据病历号的ID更新条目
        medicalRecord.setFirstDiagnosisDoctorId(userId);//设置初诊医生
        medicalRecord.setFirstDiagnosisTime(date);//设置初诊时间
        medicalRecordMapper.updateByPrimaryKeySelective(medicalRecord);
        return diagnosisId;
    }

    /**
     * @title: insertFinalDiagnosis
     * @description: 确诊时插入终诊信息
     * @author:  29-y
     * @date: 2019-06-17 10:12
     * @param: [diagnosisList,userId]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertFinalDiagnosis(List<Diagnosis> diagnosisList,Integer userId,Integer medicalRecordId) {
        Integer diagnosisId = -1;//记录最后一个最终诊断的ID 将他它作为结果返回
        for(Diagnosis diagnosis : diagnosisList){
            diagnosis.setDiagnosisMark("2");//设置终诊标志
            diagnosis.setMedicalRecordId(medicalRecordId);//设置病历号
            //todo 需要得到前端的日期 转换成发病日期对应的Date
            diagnosisMapper.insert(diagnosis);
            diagnosisId = diagnosis.getDiagnosisId();
        }
        //更新病历号中的终诊信息
        MedicalRecord medicalRecord = new MedicalRecord();
        medicalRecord.setMedicalRecordId(medicalRecordId);//根据病历号的ID更新条目
        medicalRecord.setFinalDiagnosisDoctorId(userId);//设置终诊医生
        medicalRecord.setFinalDiagnosisTime(new Date());//设置终诊时间
        medicalRecordMapper.updateByPrimaryKeySelective(medicalRecord);
        return diagnosisId;
    }

    /**
     * @title: insertAssistantExamination
     * @description: 插入辅助检查
     * @author: 29-y
     * @date: 2019-06-17 10:15
     * @param: [assistantExamination, medicalRecordHomePageId]
     * @return: void
     * @throws:
     */
    @Override
    public void insertAssistantExamination(String assistantExamination,Integer medicalRecordHomePageId) {
        MedicalRecordHomePage medicalRecordHomePage = new MedicalRecordHomePage();
        medicalRecordHomePage.setMedicalRecordHomePageId(medicalRecordHomePageId);
        medicalRecordHomePage.setAssistantExamination(assistantExamination);
        medicalRecordHomePageMapper.updateByPrimaryKeySelective(medicalRecordHomePage);//插入assistantExamination
    }

    /**
     * @title: listMedicalRecordHomePageTemplate
     * @description: 列出病历模板（1个人、2科室、3医院）
     * @author:
     * @date: 2019-06-17 10:16
     * @param: [userId, scope]
     * @return: java.util.List<edu.neu.hoso.model.MedicalRecordHomePageTemplate>
     * @throws:
     */
    @Override
    public List<MedicalRecordHomePageTemplate> listMedicalRecordHomePageTemplate(Integer userId, String scope) {
        if(scope.equals("1")){
            return medicalRecordHomePageTemplateMapper.listMedicalRecordHomePageTemplateFromUser(userId);
        }else if(scope.equals("2")){
            return medicalRecordHomePageTemplateMapper.listMedicalRecordHomePageTemplateFromDepartment(userId);
        }else if(scope.equals("3")){
            return medicalRecordHomePageTemplateMapper.listMedicalRecordHomePageTemplateFromHospital();
        }else{
            return null;
        }
    }

    /**
     * @title: selectMedicalRecordHomePageTemplateById
     * @description: 根据ID查找一个病历模板内容
     * @author: 29-y
     * @date: 2019-06-17 10:17
     * @param: [medicalRecordHomePageTemplateId]
     * @return: edu.neu.hoso.model.MedicalRecordHomePageTemplate
     * @throws:
     */
    @Override
    public MedicalRecordHomePageTemplate selectMedicalRecordHomePageTemplateById(Integer medicalRecordHomePageTemplateId) {
        return medicalRecordHomePageTemplateMapper.selectMedicalRecordHomePageTemplateById(medicalRecordHomePageTemplateId);
    }

    /**
     * @title: insertMedicalRecordHomePageTemplate
     * @description: 插入病历首页模板
     * @author: 29-y
     * @date: 2019-06-17 11:00
     * @param: [medicalRecordHomePageTemplate]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertMedicalRecordHomePageTemplate(MedicalRecordHomePageTemplate medicalRecordHomePageTemplate) {
        medicalRecordHomePageTemplateMapper.insert(medicalRecordHomePageTemplate);//插入首页非诊断部分（文字部分）
        Integer medicalRecordHomePageTemplateId = medicalRecordHomePageTemplate.getMedicalRecordHomePageTemplateId();
        List<DiagnosisTemplate> diagnosisTemplateList= medicalRecordHomePageTemplate.getDiagnosisTemplateList();
        //插入疾病模板
        for(DiagnosisTemplate diagnosisTemplate : diagnosisTemplateList){
            diagnosisTemplate.setMedicalRecordHomePageTemplateId(medicalRecordHomePageTemplateId);//设置病历模板ID
            diagnosisTemplateMapper.insert(diagnosisTemplate);
        }
        return medicalRecordHomePageTemplateId;
    }


}
