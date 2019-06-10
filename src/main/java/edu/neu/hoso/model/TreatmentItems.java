package edu.neu.hoso.model;

public class TreatmentItems {
    private Integer treatmentItemsId;

    private Integer treatmentId;

    private Integer fmedicalItemsId;

    private Integer quantity;

    private Integer actualQuantity;

    private Integer expenseItemsId;

    public TreatmentItems(Integer treatmentItemsId, Integer treatmentId, Integer fmedicalItemsId, Integer quantity, Integer actualQuantity, Integer expenseItemsId) {
        this.treatmentItemsId = treatmentItemsId;
        this.treatmentId = treatmentId;
        this.fmedicalItemsId = fmedicalItemsId;
        this.quantity = quantity;
        this.actualQuantity = actualQuantity;
        this.expenseItemsId = expenseItemsId;
    }

    public TreatmentItems() {
        super();
    }

    public Integer getTreatmentItemsId() {
        return treatmentItemsId;
    }

    public void setTreatmentItemsId(Integer treatmentItemsId) {
        this.treatmentItemsId = treatmentItemsId;
    }

    public Integer getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(Integer treatmentId) {
        this.treatmentId = treatmentId;
    }

    public Integer getFmedicalItemsId() {
        return fmedicalItemsId;
    }

    public void setFmedicalItemsId(Integer fmedicalItemsId) {
        this.fmedicalItemsId = fmedicalItemsId;
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

    public Integer getExpenseItemsId() {
        return expenseItemsId;
    }

    public void setExpenseItemsId(Integer expenseItemsId) {
        this.expenseItemsId = expenseItemsId;
    }
}