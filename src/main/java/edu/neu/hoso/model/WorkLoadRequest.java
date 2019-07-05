package edu.neu.hoso.model;

import java.util.List;

public class WorkLoadRequest {
    private String sdate;
    private String edate;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getDrugCost() {
        return drugCost;
    }

    public void setDrugCost(double drugCost) {
        this.drugCost = drugCost;
    }

    public double getRegistrateCost() {
        return registrateCost;
    }

    public void setRegistrateCost(double registrateCost) {
        this.registrateCost = registrateCost;
    }

    public double getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(double materialCost) {
        this.materialCost = materialCost;
    }

    public double getExaminateCost() {
        return examinateCost;
    }

    public void setExaminateCost(double examinateCost) {
        this.examinateCost = examinateCost;
    }

    public double getTreatCost() {
        return treatCost;
    }

    public void setTreatCost(double treatCost) {
        this.treatCost = treatCost;
    }

    public double getQtCost() {
        return qtCost;
    }

    public void setQtCost(double qtCost) {
        this.qtCost = qtCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public int[] getInvoiceIDs() {
        return invoiceIDs;
    }

    public void setInvoiceIDs(int[] invoiceIDs) {
        this.invoiceIDs = invoiceIDs;
    }

    private int departmentID;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    private int userID;
    private String date;
    private double drugCost;
    private double registrateCost;
    private double materialCost;
    private double examinateCost;
    private double treatCost;
    private double qtCost;
    private double totalCost;
   private  int[] invoiceIDs;

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    private int doctorID;
    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getEdate() {
        return edate;
    }

    public void setEdate(String edate) {
        this.edate = edate;
    }
}
