package edu.neu.hoso.model;

import java.util.Date;

public class Treatment {
    private Integer treatmentId;

    private Integer medicalRecordId;

    private Integer doctorId;

    private Date submitTime;

    public Treatment(Integer treatmentId, Integer medicalRecordId, Integer doctorId, Date submitTime) {
        this.treatmentId = treatmentId;
        this.medicalRecordId = medicalRecordId;
        this.doctorId = doctorId;
        this.submitTime = submitTime;
    }

    public Treatment() {
        super();
    }

    public Integer getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(Integer treatmentId) {
        this.treatmentId = treatmentId;
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
}