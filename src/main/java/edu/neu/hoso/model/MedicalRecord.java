package edu.neu.hoso.model;

import java.util.Date;
import java.util.List;

public class MedicalRecord {
    private Integer medicalRecordId;

    private Integer doctorId;

    private String isTreamentOver;

    private Integer firstDiagnosisDoctorId;

    private Integer finalDiagnosisDoctorId;

    private Date firstDiagnosisTime;

    private Date finalDiagnosisTime;

    private MedicalRecordHomePage medicalRecordHomePage;

    /* 对应的诊断对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.16*/
    private List<Diagnosis> diagnosisList;

    public MedicalRecord(Integer medicalRecordId, Integer doctorId, String isTreamentOver, Integer firstDiagnosisDoctorId, Integer finalDiagnosisDoctorId, Date firstDiagnosisTime, Date finalDiagnosisTime) {
        this.medicalRecordId = medicalRecordId;
        this.doctorId = doctorId;
        this.isTreamentOver = isTreamentOver;
        this.firstDiagnosisDoctorId = firstDiagnosisDoctorId;
        this.finalDiagnosisDoctorId = finalDiagnosisDoctorId;
        this.firstDiagnosisTime = firstDiagnosisTime;
        this.finalDiagnosisTime = finalDiagnosisTime;
    }

    public MedicalRecord(Integer medicalRecordId, Integer doctorId, String isTreamentOver, Integer firstDiagnosisDoctorId, Integer finalDiagnosisDoctorId, Date firstDiagnosisTime, Date finalDiagnosisTime, MedicalRecordHomePage medicalRecordHomePage, List<Diagnosis> diagnosisList) {
        this.medicalRecordId = medicalRecordId;
        this.doctorId = doctorId;
        this.isTreamentOver = isTreamentOver;
        this.firstDiagnosisDoctorId = firstDiagnosisDoctorId;
        this.finalDiagnosisDoctorId = finalDiagnosisDoctorId;
        this.firstDiagnosisTime = firstDiagnosisTime;
        this.finalDiagnosisTime = finalDiagnosisTime;
        this.medicalRecordHomePage = medicalRecordHomePage;
        this.diagnosisList = diagnosisList;
    }

    public MedicalRecordHomePage getMedicalRecordHomePage() {
        return medicalRecordHomePage;
    }

    public void setMedicalRecordHomePage(MedicalRecordHomePage medicalRecordHomePage) {
        this.medicalRecordHomePage = medicalRecordHomePage;
    }

    public List<Diagnosis> getDiagnosisList() {
        return diagnosisList;
    }

    public void setDiagnosisList(List<Diagnosis> diagnosisList) {
        this.diagnosisList = diagnosisList;
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