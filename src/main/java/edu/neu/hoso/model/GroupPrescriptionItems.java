package edu.neu.hoso.model;

public class GroupPrescriptionItems {
    private Integer groupPrescriptionItemsId;

    private Integer groupPrescriptionId;

    private Integer drugsId;

    private String drugsUsage;

    private Double dosage;

    private Integer times;

    private Integer days;

    private Integer quantity;

    private String drugsAdvice;

    /* 对应的药品对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.18*/
    private Drugs drugs;

    public GroupPrescriptionItems(Integer groupPrescriptionItemsId, Integer groupPrescriptionId, Integer drugsId, String drugsUsage, Double dosage, Integer times, Integer days, Integer quantity, String drugsAdvice) {
        this.groupPrescriptionItemsId = groupPrescriptionItemsId;
        this.groupPrescriptionId = groupPrescriptionId;
        this.drugsId = drugsId;
        this.drugsUsage = drugsUsage;
        this.dosage = dosage;
        this.times = times;
        this.days = days;
        this.quantity = quantity;
        this.drugsAdvice = drugsAdvice;
    }

    public GroupPrescriptionItems(Integer groupPrescriptionItemsId, Integer groupPrescriptionId, Integer drugsId, String drugsUsage, Double dosage, Integer times, Integer days, Integer quantity, String drugsAdvice, Drugs drugs) {
        this.groupPrescriptionItemsId = groupPrescriptionItemsId;
        this.groupPrescriptionId = groupPrescriptionId;
        this.drugsId = drugsId;
        this.drugsUsage = drugsUsage;
        this.dosage = dosage;
        this.times = times;
        this.days = days;
        this.quantity = quantity;
        this.drugsAdvice = drugsAdvice;
        this.drugs = drugs;
    }

    public Drugs getDrugs() {
        return drugs;
    }

    public void setDrugs(Drugs drugs) {
        this.drugs = drugs;
    }

    public GroupPrescriptionItems() {
        super();
    }

    public Integer getGroupPrescriptionItemsId() {
        return groupPrescriptionItemsId;
    }

    public void setGroupPrescriptionItemsId(Integer groupPrescriptionItemsId) {
        this.groupPrescriptionItemsId = groupPrescriptionItemsId;
    }

    public Integer getGroupPrescriptionId() {
        return groupPrescriptionId;
    }

    public void setGroupPrescriptionId(Integer groupPrescriptionId) {
        this.groupPrescriptionId = groupPrescriptionId;
    }

    public Integer getDrugsId() {
        return drugsId;
    }

    public void setDrugsId(Integer drugsId) {
        this.drugsId = drugsId;
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
}