package edu.neu.hoso.model;

import java.util.Date;

public class MedicalRecord {
    private Integer medicalRecordId;

    private Integer doctorId;

    private String isTreamentOver;

    private Integer firstDiagnosisDoctorId;

    private Integer finalDiagnosisDoctorId;

    private Date firstDiagnosisTime;

    private Date finalDiagnosisTime;

    public MedicalRecord(Integer medicalRecordId, Integer doctorId, String isTreamentOver, Integer firstDiagnosisDoctorId, Integer finalDiagnosisDoctorId, Date firstDiagnosisTime, Date finalDiagnosisTime) {
        this.medicalRecordId = medicalRecordId;
        this.doctorId = doctorId;
        this.isTreamentOver = isTreamentOver;
        this.firstDiagnosisDoctorId = firstDiagnosisDoctorId;
        this.finalDiagnosisDoctorId = finalDiagnosisDoctorId;
        this.firstDiagnosisTime = firstDiagnosisTime;
        this.finalDiagnosisTime = finalDiagnosisTime;
    }

    public MedicalRecord() {
        super();
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

    public String getIsTreamentOver() {
        return isTreamentOver;
    }

    public void setIsTreamentOver(String isTreamentOver) {
        this.isTreamentOver = isTreamentOver == null ? null : isTreamentOver.trim();
    }

    public Integer getFirstDiagnosisDoctorId() {
        return firstDiagnosisDoctorId;
    }

    public void setFirstDiagnosisDoctorId(Integer firstDiagnosisDoctorId) {
        this.firstDiagnosisDoctorId = firstDiagnosisDoctorId;
    }

    public Integer getFinalDiagnosisDoctorId() {
        return finalDiagnosisDoctorId;
    }

    public void setFinalDiagnosisDoctorId(Integer finalDiagnosisDoctorId) {
        this.finalDiagnosisDoctorId = finalDiagnosisDoctorId;
    }

    public Date getFirstDiagnosisTime() {
        return firstDiagnosisTime;
    }

    public void setFirstDiagnosisTime(Date firstDiagnosisTime) {
        this.firstDiagnosisTime = firstDiagnosisTime;
    }

    public Date getFinalDiagnosisTime() {
        return finalDiagnosisTime;
    }

    public void setFinalDiagnosisTime(Date finalDiagnosisTime) {
        this.finalDiagnosisTime = finalDiagnosisTime;
    }
}