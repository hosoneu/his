package edu.neu.hoso.model;

public class MedicalRecord {
    private Integer medicalRecordId;

    private String isTreamentOver;

    public MedicalRecord(Integer medicalRecordId, String isTreamentOver) {
        this.medicalRecordId = medicalRecordId;
        this.isTreamentOver = isTreamentOver;
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

    public String getIsTreamentOver() {
        return isTreamentOver;
    }

    public void setIsTreamentOver(String isTreamentOver) {
        this.isTreamentOver = isTreamentOver == null ? null : isTreamentOver.trim();
    }
}