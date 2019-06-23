package edu.neu.hoso.model;

import java.util.Date;
import java.util.List;

public class Treatment {
    private Integer treatmentId;

    private Integer medicalRecordId;

    private Integer doctorId;

    private Date submitTime;

    /* 对应的处置条目对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.17*/
    private List<TreatmentItems> treatmentItemsList;

    public Treatment(Integer treatmentId, Integer medicalRecordId, Integer doctorId, Date submitTime) {
        this.treatmentId = treatmentId;
        this.medicalRecordId = medicalRecordId;
        this.doctorId = doctorId;
        this.submitTime = submitTime;
    }

    public Treatment(Integer treatmentId, Integer medicalRecordId, Integer doctorId, Date submitTime, List<TreatmentItems> treatmentItemsList) {
        this.treatmentId = treatmentId;
        this.medicalRecordId = medicalRecordId;
        this.doctorId = doctorId;
        this.submitTime = submitTime;
        this.treatmentItemsList = treatmentItemsList;
    }

    public List<TreatmentItems> getTreatmentItemsList() {
        return treatmentItemsList;
    }

    public void setTreatmentItemsList(List<TreatmentItems> treatmentItemsList) {
        this.treatmentItemsList = treatmentItemsList;
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