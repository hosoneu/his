package edu.neu.hoso.model;

public class ExaminationDrugsItems {
    private Integer examinationDrugsItemsId;

    private Integer examinationFmedicalItemsId;

    private Integer drugsId;

    private String usage;

    private Integer quantity;

    private Integer actualQuantity;

    private String drugsDispensingStatus;

    private Integer expenseItemsId;

    private Integer doctorId;

    public ExaminationDrugsItems(Integer examinationDrugsItemsId, Integer examinationFmedicalItemsId, Integer drugsId, String usage, Integer quantity, Integer actualQuantity, String drugsDispensingStatus, Integer expenseItemsId, Integer doctorId) {
        this.examinationDrugsItemsId = examinationDrugsItemsId;
        this.examinationFmedicalItemsId = examinationFmedicalItemsId;
        this.drugsId = drugsId;
        this.usage = usage;
        this.quantity = quantity;
        this.actualQuantity = actualQuantity;
        this.drugsDispensingStatus = drugsDispensingStatus;
        this.expenseItemsId = expenseItemsId;
        this.doctorId = doctorId;
    }

    public ExaminationDrugsItems() {
        super();
    }

    public Integer getExaminationDrugsItemsId() {
        return examinationDrugsItemsId;
    }

    public void setExaminationDrugsItemsId(Integer examinationDrugsItemsId) {
        this.examinationDrugsItemsId = examinationDrugsItemsId;
    }

    public Integer getExaminationFmedicalItemsId() {
        return examinationFmedicalItemsId;
    }

    public void setExaminationFmedicalItemsId(Integer examinationFmedicalItemsId) {
        this.examinationFmedicalItemsId = examinationFmedicalItemsId;
    }

    public Integer getDrugsId() {
        return drugsId;
    }

    public void setDrugsId(Integer drugsId) {
        this.drugsId = drugsId;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage == null ? null : usage.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getActualQuantity() {
        return actualQuantity;
    }

    public void setActualQuantity(Integer actualQuantity) {
        this.actualQuantity = actualQuantity;
    }

    public String getDrugsDispensingStatus() {
        return drugsDispensingStatus;
    }

    public void setDrugsDispensingStatus(String drugsDispensingStatus) {
        this.drugsDispensingStatus = drugsDispensingStatus == null ? null : drugsDispensingStatus.trim();
    }

    public Integer getExpenseItemsId() {
        return expenseItemsId;
    }

    public void setExpenseItemsId(Integer expenseItemsId) {
        this.expenseItemsId = expenseItemsId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }
}