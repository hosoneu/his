package edu.neu.hoso.model;

public class DiagnosisTemplate {
    private Integer diagnosisTemplateId;

    private Integer medicalRecordHomePageTemplateId;

    private Integer diseaseId;

    private String mainDiagnosisMark;

    private String suspectMark;

    /* 对应的疾病对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.14*/
    private Disease disease;

    public DiagnosisTemplate(Integer diagnosisTemplateId, Integer medicalRecordHomePageTemplateId, Integer diseaseId, String mainDiagnosisMark, String suspectMark) {
        this.diagnosisTemplateId = diagnosisTemplateId;
        this.medicalRecordHomePageTemplateId = medicalRecordHomePageTemplateId;
        this.diseaseId = diseaseId;
        this.mainDiagnosisMark = mainDiagnosisMark;
        this.suspectMark = suspectMark;
    }

    public DiagnosisTemplate(Integer diagnosisTemplateId, Integer medicalRecordHomePageTemplateId, Integer diseaseId, String mainDiagnosisMark, String suspectMark, Disease disease) {
        this.diagnosisTemplateId = diagnosisTemplateId;
        this.medicalRecordHomePageTemplateId = medicalRecordHomePageTemplateId;
        this.diseaseId = diseaseId;
        this.mainDiagnosisMark = mainDiagnosisMark;
        this.suspectMark = suspectMark;
        this.disease = disease;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public DiagnosisTemplate() {
        super();
    }

    public Integer getDiagnosisTemplateId() {
        return diagnosisTemplateId;
    }

    public void setDiagnosisTemplateId(Integer diagnosisTemplateId) {
        this.diagnosisTemplateId = diagnosisTemplateId;
    }

    public Integer getMedicalRecordHomePageTemplateId() {
        return medicalRecordHomePageTemplateId;
    }

    public void setMedicalRecordHomePageTemplateId(Integer medicalRecordHomePageTemplateId) {
        this.medicalRecordHomePageTemplateId = medicalRecordHomePageTemplateId;
    }

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getMainDiagnosisMark() {
        return mainDiagnosisMark;
    }

    public void setMainDiagnosisMark(String mainDiagnosisMark) {
        this.mainDiagnosisMark = mainDiagnosisMark == null ? null : mainDiagnosisMark.trim();
    }

    public String getSuspectMark() {
        return suspectMark;
    }

    public void setSuspectMark(String suspectMark) {
        this.suspectMark = suspectMark == null ? null : suspectMark.trim();
    }
}