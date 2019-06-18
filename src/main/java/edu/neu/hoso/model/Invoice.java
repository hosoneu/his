package edu.neu.hoso.model;

import java.util.Date;

public class Invoice {
    private Integer invoiceId;

    private String invoiceNo;

    private Double totalCost;

    private String isDayCal;

    private Date payTime;

    private Integer userId;

    private Integer payModeId;

    public Invoice(Integer invoiceId, String invoiceNo, Double totalCost, String isDayCal, Date payTime, Integer userId, Integer payModeId) {
        this.invoiceId = invoiceId;
        this.invoiceNo = invoiceNo;
        this.totalCost = totalCost;
        this.isDayCal = isDayCal;
        this.payTime = payTime;
        this.userId = userId;
        this.payModeId = payModeId;
    }

    public Invoice() {
        super();
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPayModeId() {
        return payModeId;
    }

    public void setPayModeId(Integer payModeId) {
        this.payModeId = payModeId;
    }
}