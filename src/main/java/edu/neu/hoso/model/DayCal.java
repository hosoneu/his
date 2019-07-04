package edu.neu.hoso.model;

import java.util.Date;

public class DayCal {
    private Integer dayCalId;

    private Integer userId;

    private Date dayCalDate;

    private Double yfTotal;

    private Double ghTotal;

    private Double dayCalTotal;

    private Double clTotal;

    private Double jcTotal;

    private Double czTotal;

    private Double qtTotal;

    public DayCal(Integer dayCalId, Integer userId, Date dayCalDate, Double yfTotal, Double ghTotal, Double dayCalTotal, Double clTotal, Double jcTotal, Double czTotal, Double qtTotal) {
        this.dayCalId = dayCalId;
        this.userId = userId;
        this.dayCalDate = dayCalDate;
        this.yfTotal = yfTotal;
        this.ghTotal = ghTotal;
        this.dayCalTotal = dayCalTotal;
        this.clTotal = clTotal;
        this.jcTotal = jcTotal;
        this.czTotal = czTotal;
        this.qtTotal = qtTotal;
    }

    public DayCal() {
        super();
    }

    public Integer getDayCalId() {
        return dayCalId;
    }

    public void setDayCalId(Integer dayCalId) {
        this.dayCalId = dayCalId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDayCalDate() {
        return dayCalDate;
    }

    public void setDayCalDate(Date dayCalDate) {
        this.dayCalDate = dayCalDate;
    }

    public Double getYfTotal() {
        return yfTotal;
    }

    public void setYfTotal(Double yfTotal) {
        this.yfTotal = yfTotal;
    }

    public Double getGhTotal() {
        return ghTotal;
    }

    public void setGhTotal(Double ghTotal) {
        this.ghTotal = ghTotal;
    }

    public Double getDayCalTotal() {
        return dayCalTotal;
    }

    public void setDayCalTotal(Double dayCalTotal) {
        this.dayCalTotal = dayCalTotal;
    }

    public Double getClTotal() {
        return clTotal;
    }

    public void setClTotal(Double clTotal) {
        this.clTotal = clTotal;
    }

    public Double getJcTotal() {
        return jcTotal;
    }

    public void setJcTotal(Double jcTotal) {
        this.jcTotal = jcTotal;
    }

    public Double getCzTotal() {
        return czTotal;
    }

    public void setCzTotal(Double czTotal) {
        this.czTotal = czTotal;
    }

    public Double getQtTotal() {
        return qtTotal;
    }

    public void setQtTotal(Double qtTotal) {
        this.qtTotal = qtTotal;
    }
}