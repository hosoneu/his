package edu.neu.hoso.model;

public class PrescriptionItems {
    private Integer prescriptionItemsId;

    private Integer prescriptionId;

    private Integer dragsId;

    private Integer expenseItemsId;

    private String drugsUsage;

    private Double dosage;

    private Integer times;

    private Integer days;

    private Integer quantity;

    private String drugsAdvice;

    private String drugsDispensingStatus;

    private Integer actualQuantity;

    /* 对应的药品对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.18*/
    private Drugs drugs;

    public PrescriptionItems(Integer prescriptionItemsId, Integer prescriptionId, Integer dragsId, Integer expenseItemsId, String drugsUsage, Double dosage, Integer times, Integer days, Integer quantity, String drugsAdvice, String drugsDispensingStatus, Integer actualQuantity) {
        this.prescriptionItemsId = prescriptionItemsId;
        this.prescriptionId = prescriptionId;
        this.dragsId = dragsId;
        this.expenseItemsId = expenseItemsId;
        this.drugsUsage = drugsUsage;
        this.dosage = dosage;
        this.times = times;
        this.days = days;
        this.quantity = quantity;
        this.drugsAdvice = drugsAdvice;
        this.drugsDispensingStatus = drugsDispensingStatus;
        this.actualQuantity = actualQuantity;
    }

    public PrescriptionItems(Integer prescriptionItemsId, Integer prescriptionId, Integer dragsId, Integer expenseItemsId, String drugsUsage, Double dosage, Integer times, Integer days, Integer quantity, String drugsAdvice, String drugsDispensingStatus, Integer actualQuantity, Drugs drugs) {
        this.prescriptionItemsId = prescriptionItemsId;
        this.prescriptionId = prescriptionId;
        this.dragsId = dragsId;
        this.expenseItemsId = expenseItemsId;
        this.drugsUsage = drugsUsage;
        this.dosage = dosage;
        this.times = times;
        this.days = days;
        this.quantity = quantity;
        this.drugsAdvice = drugsAdvice;
        this.drugsDispensingStatus = drugsDispensingStatus;
        this.actualQuantity = actualQuantity;
        this.drugs = drugs;
    }

    public Drugs getDrugs() {
        return drugs;
    }

    public void setDrugs(Drugs drugs) {
        this.drugs = drugs;
    }

    public PrescriptionItems() {
        super();
    }

    public Integer getPrescriptionItemsId() {
        return prescriptionItemsId;
    }

    public void setPrescriptionItemsId(Integer prescriptionItemsId) {
        this.prescriptionItemsId = prescriptionItemsId;
    }

    public Integer getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(Integer prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public Integer getDragsId() {
        return dragsId;
    }

    public void setDragsId(Integer dragsId) {
        this.dragsId = dragsId;
    }

    public Integer getExpenseItemsId() {
        return expenseItemsId;
    }

    public void setExpenseItemsId(Integer expenseItemsId) {
        this.expenseItemsId = expenseItemsId;
    }

    public String getDrugsUsage() {
        return drugsUsage;
    }

    public void setDrugsUsage(String drugsUsage) {
        this.drugsUsage = drugsUsage == null ? null : drugsUsage.trim();
    }

    public Double getDosage() {
        return dosage;
    }

    public void setDosage(Double dosage) {
        this.dosage = dosage;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDrugsAdvice() {
        return drugsAdvice;
    }

    public void setDrugsAdvice(String drugsAdvice) {
        this.drugsAdvice = drugsAdvice == null ? null : drugsAdvice.trim();
    }

    public String getDrugsDispensingStatus() {
        return drugsDispensingStatus;
    }

    public void setDrugsDispensingStatus(String drugsDispensingStatus) {
        this.drugsDispensingStatus = drugsDispensingStatus == null ? null : drugsDispensingStatus.trim();
    }

    public Integer getActualQuantity() {
        return actualQuantity;
    }

    public void setActualQuantity(Integer actualQuantity) {
        this.actualQuantity = actualQuantity;
    }



    @Override
    public String toString() {
        return "PrescriptionItems{" +
                "prescriptionItemsId=" + prescriptionItemsId +
                ", prescriptionId=" + prescriptionId +
                ", dragsId=" + dragsId +
                ", expenseItemsId=" + expenseItemsId +
                ", drugsUsage='" + drugsUsage + '\'' +
                ", dosage=" + dosage +
                ", times=" + times +
                ", days=" + days +
                ", quantity=" + quantity +
                ", drugsAdvice='" + drugsAdvice + '\'' +
                ", drugsDispensingStatus='" + drugsDispensingStatus + '\'' +
                ", actualQuantity=" + actualQuantity +
                ", drugs=" + drugs +
                '}';
    }
}