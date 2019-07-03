package edu.neu.hoso.model;

import lombok.Getter;
import lombok.Setter;

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

    private Double registrationTotalCost;

    private Integer expenseTypeId;

    private Integer expenseItemsId;

    private String registrationStatus;

    @Getter
    @Setter
    private MedicalRecord medicalRecord;

    @Getter
    @Setter
    private RegistrationLevel registrationLevel;

    @Getter
    @Setter
    private Patient patient;

    @Getter
    @Setter
    private Department department;

    @Getter
    @Setter
    private CalculationType calculationType;

    @Getter
    @Setter
    private User doctor;

    @Getter
    @Setter
    private ExpenseType expenseType;

    @Getter
    @Setter
    private ExpenseItems expenseItems;

    public Registration(Integer registrationId, Integer medicalRecordId, Integer registrationLevelId, Integer patientId, Integer departmentId, Integer calculationTypeId, Integer doctorId, Date registrationDate, String buyMedicalRecord, Double registrationTotalCost, Integer expenseTypeId, Integer expenseItemsId, String registrationStatus) {
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

    public Registration(Integer registrationId, Integer medicalRecordId, Integer registrationLevelId, Integer patientId, Integer departmentId, Integer calculationTypeId, Integer doctorId, Date registrationDate, String buyMedicalRecord, Double registrationTotalCost, Integer expenseTypeId, Integer expenseItemsId, String registrationStatus, Patient patient) {
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
        this.patient = patient;
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

    public Double getRegistrationTotalCost() {
        return registrationTotalCost;
    }

    public void setRegistrationTotalCost(Double registrationTotalCost) {
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

    @Override
    public String toString() {
        return "Registration{" +
                "registrationId=" + registrationId +
                ", medicalRecordId=" + medicalRecordId +
                ", registrationLevelId=" + registrationLevelId +
                ", patientId=" + patientId +
                ", departmentId=" + departmentId +
                ", calculationTypeId=" + calculationTypeId +
                ", doctorId=" + doctorId +
                ", registrationDate=" + registrationDate +
                ", buyMedicalRecord='" + buyMedicalRecord + '\'' +
                ", registrationTotalCost=" + registrationTotalCost +
                ", expenseTypeId=" + expenseTypeId +
                ", expenseItemsId=" + expenseItemsId +
                ", registrationStatus='" + registrationStatus + '\'' +
                ", medicalRecord=" + medicalRecord +
                ", registrationLevel=" + registrationLevel +
                ", patient=" + patient +
                ", department=" + department +
                ", calculationType=" + calculationType +
                ", doctor=" + doctor +
                ", expenseType=" + expenseType +
                ", expenseItems=" + expenseItems +
                '}';
    }
}
