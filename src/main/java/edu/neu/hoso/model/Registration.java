package edu.neu.hoso.model;

import java.math.BigDecimal;
import java.util.Date;

public class Registration {
    private Integer registrationId;

    private Integer medicalRecordId;

    private Integer registrationLevelId;

    private Integer patientId;

    private Integer departmentId;

    private Integer calculationTypeId;

    private Integer doctorId;

    private Date registrationDate;

    private String buyMedicalRecord;

    private BigDecimal registrationTotalCost;

    private Integer expenseTypeId;

    private Integer expenseItemsId;

    private String registrationStatus;

    public Registration(Integer registrationId, Integer medicalRecordId, Integer registrationLevelId, Integer patientId, Integer departmentId, Integer calculationTypeId, Integer doctorId, Date registrationDate, String buyMedicalRecord, BigDecimal registrationTotalCost, Integer expenseTypeId, Integer expenseItemsId, String registrationStatus) {
        this.registrationId = registrationId;
        this.medicalRecordId = medicalRecordId;
        this.registrationLevelId = registrationLevelId;
        this.patientId = patientId;
        this.departmentId = departmentId;
        this.calculationTypeId = calculationTypeId;
        this.doctorId = doctorId;
        this.registrationDate = registrationDate;
        this.buyMedicalRecord = buyMedicalRecord;
        this.registrationTotalCost = registrationTotalCost;
        this.expenseTypeId = expenseTypeId;
        this.expenseItemsId = expenseItemsId;
        this.registrationStatus = registrationStatus;
    }

    public Registration() {
        super();
    }

    public Integer getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Integer registrationId) {
        this.registrationId = registrationId;
    }

    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    public Integer getRegistrationLevelId() {
        return registrationLevelId;
    }

    public void setRegistrationLevelId(Integer registrationLevelId) {
        this.registrationLevelId = registrationLevelId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getCalculationTypeId() {
        return calculationTypeId;
    }

    public void setCalculationTypeId(Integer calculationTypeId) {
        this.calculationTypeId = calculationTypeId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getBuyMedicalRecord() {
        return buyMedicalRecord;
    }

    public void setBuyMedicalRecord(String buyMedicalRecord) {
        this.buyMedicalRecord = buyMedicalRecord == null ? null : buyMedicalRecord.trim();
    }

    public BigDecimal getRegistrationTotalCost() {
        return registrationTotalCost;
    }

    public void setRegistrationTotalCost(BigDecimal registrationTotalCost) {
        this.registrationTotalCost = registrationTotalCost;
    }

    public Integer getExpenseTypeId() {
        return expenseTypeId;
    }

    public void setExpenseTypeId(Integer expenseTypeId) {
        this.expenseTypeId = expenseTypeId;
    }

    public Integer getExpenseItemsId() {
        return expenseItemsId;
    }

    public void setExpenseItemsId(Integer expenseItemsId) {
        this.expenseItemsId = expenseItemsId;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus == null ? null : registrationStatus.trim();
    }
}