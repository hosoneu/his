package edu.neu.hoso.model;

import java.util.Date;

public class Prescription {
    private Integer prescriptionId;

    private Integer medicalRecordId;

    private Integer doctorId;

    private Date submitTime;

    private String prescriptionType;

    public Prescription(Integer prescriptionId, Integer medicalRecordId, Integer doctorId, Date submitTime, String prescriptionType) {
        this.prescriptionId = prescriptionId;
        this.medicalRecordId = medicalRecordId;
        this.doctorId = doctorId;
        this.submitTime = submitTime;
        this.prescriptionType = prescriptionType;
    }

    public Prescription() {
        super();
    }

    public Integer getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(Integer prescriptionId) {
        this.prescriptionId = prescriptionId;
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

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getPrescriptionType() {
        return prescriptionType;
    }

    public void setPrescriptionType(String prescriptionType) {
        this.prescriptionType = prescriptionType == null ? null : prescriptionType.trim();
    }
}