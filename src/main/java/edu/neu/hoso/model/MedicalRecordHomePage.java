package edu.neu.hoso.model;

public class MedicalRecordHomePage {
    private Integer medicalRecordHomePageId;

    private Integer medicalRecordId;

    private Integer doctorId;

    private String chiefComplaint;

    private String presentHistory;

    private String presentTreatment;

    private String pastHistory;

    private String allergicHistory;

    private String physicalExamination;

    private String assistantExamination;

    public MedicalRecordHomePage(Integer medicalRecordHomePageId, Integer medicalRecordId, Integer doctorId, String chiefComplaint, String presentHistory, String presentTreatment, String pastHistory, String allergicHistory, String physicalExamination, String assistantExamination) {
        this.medicalRecordHomePageId = medicalRecordHomePageId;
        this.medicalRecordId = medicalRecordId;
        this.doctorId = doctorId;
        this.chiefComplaint = chiefComplaint;
        this.presentHistory = presentHistory;
        this.presentTreatment = presentTreatment;
        this.pastHistory = pastHistory;
        this.allergicHistory = allergicHistory;
        this.physicalExamination = physicalExamination;
        this.assistantExamination = assistantExamination;
    }

    public MedicalRecordHomePage() {
        super();
    }

    public Integer getMedicalRecordHomePageId() {
        return medicalRecordHomePageId;
    }

    public void setMedicalRecordHomePageId(Integer medicalRecordHomePageId) {
        this.medicalRecordHomePageId = medicalRecordHomePageId;
    }

    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
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

    public String getPresentTreatment() {
        return presentTreatment;
    }

    public void setPresentTreatment(String presentTreatment) {
        this.presentTreatment = presentTreatment == null ? null : presentTreatment.trim();
    }

    public String getPastHistory() {
        return pastHistory;
    }

    public void setPastHistory(String pastHistory) {
        this.pastHistory = pastHistory == null ? null : pastHistory.trim();
    }

    public String getAllergicHistory() {
        return allergicHistory;
    }

    public void setAllergicHistory(String allergicHistory) {
        this.allergicHistory = allergicHistory == null ? null : allergicHistory.trim();
    }

    public String getPhysicalExamination() {
        return physicalExamination;
    }

    public void setPhysicalExamination(String physicalExamination) {
        this.physicalExamination = physicalExamination == null ? null : physicalExamination.trim();
    }

    public String getAssistantExamination() {
        return assistantExamination;
    }

    public void setAssistantExamination(String assistantExamination) {
        this.assistantExamination = assistantExamination == null ? null : assistantExamination.trim();
    }
}