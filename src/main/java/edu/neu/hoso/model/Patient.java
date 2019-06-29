package edu.neu.hoso.model;

import java.util.Date;

public class Patient {
    private Integer patientId;

    private String patientName;

    private String patientGender;

    private Date patientBirth;

    private Integer patientAge;

    private String patientIdentity;

    private String patientAddress;

    public Patient(Integer patientId, String patientName, String patientGender, Date patientBirth, Integer patientAge, String patientIdentity, String patientAddress) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientGender = patientGender;
        this.patientBirth = patientBirth;
        this.patientAge = patientAge;
        this.patientIdentity = patientIdentity;
        this.patientAddress = patientAddress;
    }

    public Patient() {
        super();
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender == null ? null : patientGender.trim();
    }

    public Date getPatientBirth() {
        return patientBirth;
    }

    public void setPatientBirth(Date patientBirth) {
        this.patientBirth = patientBirth;
    }

    public Integer getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(Integer patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientIdentity() {
        return patientIdentity;
    }

    public void setPatientIdentity(String patientIdentity) {
        this.patientIdentity = patientIdentity == null ? null : patientIdentity.trim();
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress == null ? null : patientAddress.trim();
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", patientGender='" + patientGender + '\'' +
                ", patientBirth=" + patientBirth +
                ", patientAge=" + patientAge +
                ", patientIdentity='" + patientIdentity + '\'' +
                ", patientAddress='" + patientAddress + '\'' +
                '}';
    }
}