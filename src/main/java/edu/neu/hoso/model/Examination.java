package edu.neu.hoso.model;

import java.util.Date;

public class Examination {
    private Integer examinationId;

    private Integer medicalRecordId;

    private Integer doctorId;

    private String examinationMark;

    private String doctorAdvice;

    private Date submitTime;

    public Examination(Integer examinationId, Integer medicalRecordId, Integer doctorId, String examinationMark, String doctorAdvice, Date submitTime) {
        this.examinationId = examinationId;
        this.medicalRecordId = medicalRecordId;
        this.doctorId = doctorId;
        this.examinationMark = examinationMark;
        this.doctorAdvice = doctorAdvice;
        this.submitTime = submitTime;
    }

    public Examination() {
        super();
    }

    public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
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

    public String getExaminationMark() {
        return examinationMark;
    }

    public void setExaminationMark(String examinationMark) {
        this.examinationMark = examinationMark == null ? null : examinationMark.trim();
    }

    public String getDoctorAdvice() {
        return doctorAdvice;
    }

    public void setDoctorAdvice(String doctorAdvice) {
        this.doctorAdvice = doctorAdvice == null ? null : doctorAdvice.trim();
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }
}