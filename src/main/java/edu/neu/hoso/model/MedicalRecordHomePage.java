package edu.neu.hoso.model;

public class MedicalRecordHomePage {
    private Integer medicalRecordHomePageId;

    private Integer medicalRedicalId;

    private Integer doctorId;

    private String chiefComplaint;

    private String presentHistory;

    private String presentTreatment;

    private String pastHistory;

    private String allergicHistory;

    private String physicalExamination;

    public MedicalRecordHomePage(Integer medicalRecordHomePageId, Integer medicalRedicalId, Integer doctorId, String chiefComplaint, String presentHistory, String presentTreatment, String pastHistory, String allergicHistory, String physicalExamination) {
        this.medicalRecordHomePageId = medicalRecordHomePageId;
        this.medicalRedicalId = medicalRedicalId;
        this.doctorId = doctorId;
        this.chiefComplaint = chiefComplaint;
        this.presentHistory = presentHistory;
        this.presentTreatment = presentTreatment;
        this.pastHistory = pastHistory;
        this.allergicHistory = allergicHistory;
        this.physicalExamination = physicalExamination;
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

    public Integer getMedicalRedicalId() {
        return medicalRedicalId;
    }

    public void setMedicalRedicalId(Integer medicalRedicalId) {
        this.medicalRedicalId = medicalRedicalId;
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
}