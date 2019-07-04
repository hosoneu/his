package edu.neu.hoso.model;

import java.util.Date;
import java.util.List;

public class Prescription {
    private Integer prescriptionId;

    private Integer medicalRecordId;

    private Integer doctorId;

    private Date submitTime;

    private String prescriptionType;

    private String validStatus;

    private List<PrescriptionItems> prescriptionItems;

    /* 对应的处方条目列表 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.18*/
    private List<PrescriptionItems> prescriptionItemsList;

    public Prescription(Integer prescriptionId, Integer medicalRecordId, Integer doctorId, Date submitTime, String prescriptionType, String validStatus) {
        this.prescriptionId = prescriptionId;
        this.medicalRecordId = medicalRecordId;
        this.doctorId = doctorId;
        this.submitTime = submitTime;
        this.prescriptionType = prescriptionType;
        this.validStatus = validStatus;
    }

    public Prescription(Integer prescriptionId, Integer medicalRecordId, Integer doctorId, Date submitTime, String prescriptionType, String validStatus, List<PrescriptionItems> prescriptionItemsList) {
        this.prescriptionId = prescriptionId;
        this.medicalRecordId = medicalRecordId;
        this.doctorId = doctorId;
        this.submitTime = submitTime;
        this.prescriptionType = prescriptionType;
        this.validStatus = validStatus;
        this.prescriptionItemsList = prescriptionItemsList;
    }

    public List<PrescriptionItems> getPrescriptionItemsList() {
        return prescriptionItemsList;
    }

    public void setPrescriptionItemsList(List<PrescriptionItems> prescriptionItemsList) {
        this.prescriptionItemsList = prescriptionItemsList;
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

    public String getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus == null ? null : validStatus.trim();
    }

    public List<PrescriptionItems> getPrescriptionItems() {
        return prescriptionItems;
    }

    public void setPrescriptionItems(List<PrescriptionItems> prescriptionItems) {
        this.prescriptionItems = prescriptionItems;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionId=" + prescriptionId +
                ", medicalRecordId=" + medicalRecordId +
                ", doctorId=" + doctorId +
                ", submitTime=" + submitTime +
                ", prescriptionType='" + prescriptionType + '\'' +
                ", validStatus='" + validStatus + '\'' +
                ", prescriptionItems=" + prescriptionItems +
                ", prescriptionItemsList=" + prescriptionItemsList +
                '}';
    }
}