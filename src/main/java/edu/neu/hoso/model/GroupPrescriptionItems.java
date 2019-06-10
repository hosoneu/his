package edu.neu.hoso.model;

import java.math.BigDecimal;

public class GroupPrescriptionItems {
    private Integer groupPrescriptionItemsId;

    private Integer groupPrescriptionId;

    private Integer dragsId;

    private String usage;

    private BigDecimal dosage;

    private Integer times;

    private Integer days;

    private Integer quantity;

    private String drugsAdvice;

    public GroupPrescriptionItems(Integer groupPrescriptionItemsId, Integer groupPrescriptionId, Integer dragsId, String usage, BigDecimal dosage, Integer times, Integer days, Integer quantity, String drugsAdvice) {
        this.groupPrescriptionItemsId = groupPrescriptionItemsId;
        this.groupPrescriptionId = groupPrescriptionId;
        this.dragsId = dragsId;
        this.usage = usage;
        this.dosage = dosage;
        this.times = times;
        this.days = days;
        this.quantity = quantity;
        this.drugsAdvice = drugsAdvice;
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

    public Integer getDragsId() {
        return dragsId;
    }

    public void setDragsId(Integer dragsId) {
        this.dragsId = dragsId;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage == null ? null : usage.trim();
    }

    public BigDecimal getDosage() {
        return dosage;
    }

    public void setDosage(BigDecimal dosage) {
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