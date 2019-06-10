package edu.neu.hoso.model;

import java.util.Date;

public class GroupPrescription {
    private Integer groupPrescriptionId;

    private Integer doctorId;

    private String groupPrescriptionCode;

    private String groupPrescriptionName;

    private String groupPrescriptionScope;

    private Date createTime;

    private String prescriptionType;

    public GroupPrescription(Integer groupPrescriptionId, Integer doctorId, String groupPrescriptionCode, String groupPrescriptionName, String groupPrescriptionScope, Date createTime, String prescriptionType) {
        this.groupPrescriptionId = groupPrescriptionId;
        this.doctorId = doctorId;
        this.groupPrescriptionCode = groupPrescriptionCode;
        this.groupPrescriptionName = groupPrescriptionName;
        this.groupPrescriptionScope = groupPrescriptionScope;
        this.createTime = createTime;
        this.prescriptionType = prescriptionType;
    }

    public GroupPrescription() {
        super();
    }

    public Integer getGroupPrescriptionId() {
        return groupPrescriptionId;
    }

    public void setGroupPrescriptionId(Integer groupPrescriptionId) {
        this.groupPrescriptionId = groupPrescriptionId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getGroupPrescriptionCode() {
        return groupPrescriptionCode;
    }

    public void setGroupPrescriptionCode(String groupPrescriptionCode) {
        this.groupPrescriptionCode = groupPrescriptionCode == null ? null : groupPrescriptionCode.trim();
    }

    public String getGroupPrescriptionName() {
        return groupPrescriptionName;
    }

    public void setGroupPrescriptionName(String groupPrescriptionName) {
        this.groupPrescriptionName = groupPrescriptionName == null ? null : groupPrescriptionName.trim();
    }

    public String getGroupPrescriptionScope() {
        return groupPrescriptionScope;
    }

    public void setGroupPrescriptionScope(String groupPrescriptionScope) {
        this.groupPrescriptionScope = groupPrescriptionScope == null ? null : groupPrescriptionScope.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPrescriptionType() {
        return prescriptionType;
    }

    public void setPrescriptionType(String prescriptionType) {
        this.prescriptionType = prescriptionType == null ? null : prescriptionType.trim();
    }
}