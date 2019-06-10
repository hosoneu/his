package edu.neu.hoso.model;

public class ExaminationFmedicalItems {
    private Integer examinationFmedicalItemsId;

    private Integer examinationId;

    private Integer fmedicalItemsId;

    private String registrationStatus;

    private String purposeRequirements;

    private Integer quantity;

    private Integer actualQuantity;

    private Integer examinationResultId;

    private Integer expenseItemsId;

    public ExaminationFmedicalItems(Integer examinationFmedicalItemsId, Integer examinationId, Integer fmedicalItemsId, String registrationStatus, String purposeRequirements, Integer quantity, Integer actualQuantity, Integer examinationResultId, Integer expenseItemsId) {
        this.examinationFmedicalItemsId = examinationFmedicalItemsId;
        this.examinationId = examinationId;
        this.fmedicalItemsId = fmedicalItemsId;
        this.registrationStatus = registrationStatus;
        this.purposeRequirements = purposeRequirements;
        this.quantity = quantity;
        this.actualQuantity = actualQuantity;
        this.examinationResultId = examinationResultId;
        this.expenseItemsId = expenseItemsId;
    }

    public ExaminationFmedicalItems() {
        super();
    }

    public Integer getExaminationFmedicalItemsId() {
        return examinationFmedicalItemsId;
    }

    public void setExaminationFmedicalItemsId(Integer examinationFmedicalItemsId) {
        this.examinationFmedicalItemsId = examinationFmedicalItemsId;
    }

    public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
    }

    public Integer getFmedicalItemsId() {
        return fmedicalItemsId;
    }

    public void setFmedicalItemsId(Integer fmedicalItemsId) {
        this.fmedicalItemsId = fmedicalItemsId;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus == null ? null : registrationStatus.trim();
    }

    public String getPurposeRequirements() {
        return purposeRequirements;
    }

    public void setPurposeRequirements(String purposeRequirements) {
        this.purposeRequirements = purposeRequirements == null ? null : purposeRequirements.trim();
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

    public Integer getExaminationResultId() {
        return examinationResultId;
    }

    public void setExaminationResultId(Integer examinationResultId) {
        this.examinationResultId = examinationResultId;
    }

    public Integer getExpenseItemsId() {
        return expenseItemsId;
    }

    public void setExpenseItemsId(Integer expenseItemsId) {
        this.expenseItemsId = expenseItemsId;
    }
}