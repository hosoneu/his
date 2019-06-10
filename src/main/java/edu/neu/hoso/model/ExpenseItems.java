package edu.neu.hoso.model;

import java.math.BigDecimal;
import java.util.Date;

public class ExpenseItems {
    private Integer expenseItemsId;

    private Integer medicalRecordId;

    private BigDecimal totalCost;

    private String payStatus;

    private String isDayCal;

    private Date payTime;

    private Integer invoiceNo;

    private Integer payModeId;

    private Integer userId;

    public ExpenseItems(Integer expenseItemsId, Integer medicalRecordId, BigDecimal totalCost, String payStatus, String isDayCal, Date payTime, Integer invoiceNo, Integer payModeId, Integer userId) {
        this.expenseItemsId = expenseItemsId;
        this.medicalRecordId = medicalRecordId;
        this.totalCost = totalCost;
        this.payStatus = payStatus;
        this.isDayCal = isDayCal;
        this.payTime = payTime;
        this.invoiceNo = invoiceNo;
        this.payModeId = payModeId;
        this.userId = userId;
    }

    public ExpenseItems() {
        super();
    }

    public Integer getExpenseItemsId() {
        return expenseItemsId;
    }

    public void setExpenseItemsId(Integer expenseItemsId) {
        this.expenseItemsId = expenseItemsId;
    }

    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public String getIsDayCal() {
        return isDayCal;
    }

    public void setIsDayCal(String isDayCal) {
        this.isDayCal = isDayCal == null ? null : isDayCal.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Integer invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Integer getPayModeId() {
        return payModeId;
    }

    public void setPayModeId(Integer payModeId) {
        this.payModeId = payModeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}