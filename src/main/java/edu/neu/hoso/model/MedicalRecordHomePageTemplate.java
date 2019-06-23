package edu.neu.hoso.model;

import java.util.List;

public class MedicalRecordHomePageTemplate {
    private Integer medicalRecordHomePageTemplateId;

    private Integer doctorId;

    private String name;

    private String scope;

    private String chiefComplaint;

    private String presentHistory;

    private String physicalExamination;

    /* 对应的诊断模板对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.16*/
    private List<DiagnosisTemplate> diagnosisTemplateList;

    public MedicalRecordHomePageTemplate(Integer medicalRecordHomePageTemplateId, Integer doctorId, String name, String scope, String chiefComplaint, String presentHistory, String physicalExamination) {
        this.medicalRecordHomePageTemplateId = medicalRecordHomePageTemplateId;
        this.doctorId = doctorId;
        this.name = name;
        this.scope = scope;
        this.chiefComplaint = chiefComplaint;
        this.presentHistory = presentHistory;
        this.physicalExamination = physicalExamination;
    }

    public MedicalRecordHomePageTemplate(Integer medicalRecordHomePageTemplateId, Integer doctorId, String name, String scope, String chiefComplaint, String presentHistory, String physicalExamination, List<DiagnosisTemplate> diagnosisTemplateList) {
        this.medicalRecordHomePageTemplateId = medicalRecordHomePageTemplateId;
        this.doctorId = doctorId;
        this.name = name;
        this.scope = scope;
        this.chiefComplaint = chiefComplaint;
        this.presentHistory = presentHistory;
        this.physicalExamination = physicalExamination;
        this.diagnosisTemplateList = diagnosisTemplateList;
    }

    public List<DiagnosisTemplate> getDiagnosisTemplateList() {
        return diagnosisTemplateList;
    }

    public void setDiagnosisTemplateList(List<DiagnosisTemplate> diagnosisTemplateList) {
        this.diagnosisTemplateList = diagnosisTemplateList;
    }

    public MedicalRecordHomePageTemplate() {
        super();
    }

    public Integer getMedicalRecordHomePageTemplateId() {
        return medicalRecordHomePageTemplateId;
    }

    public void setMedicalRecordHomePageTemplateId(Integer medicalRecordHomePageTemplateId) {
        this.medicalRecordHomePageTemplateId = medicalRecordHomePageTemplateId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint == null ? null : chiefComplaint.trim();
    }

    public String getPresentHistory() {
        return presentHistory;
    }

    public void setPresentHistory(String presentHistory) {
        this.presentHistory = presentHistory == null ? null : presentHistory.trim();
    }

    public String getPhysicalExamination() {
        return physicalExamination;
    }

    public void setPhysicalExamination(String physicalExamination) {
        this.physicalExamination = physicalExamination == null ? null : physicalExamination.trim();
    }
}