package edu.neu.hoso.model;

public class TreatmentItems {
    private Integer treatmentItemsId;

    private Integer treatmentId;

    private Integer fmedicalItemsId;

    private Integer quantity;

    private Integer actualQuantity;

    private Integer expenseItemsId;

    private String validStatus;

    /* 对应的处置非药品对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.17*/
    private FmedicalItems fmedicalItems;

    /* 对应的科室对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.07.02*/
    private Department department;

    public TreatmentItems(Integer treatmentItemsId, Integer treatmentId, Integer fmedicalItemsId, Integer quantity, Integer actualQuantity, Integer expenseItemsId, String validStatus) {
        this.treatmentItemsId = treatmentItemsId;
        this.treatmentId = treatmentId;
        this.fmedicalItemsId = fmedicalItemsId;
        this.quantity = quantity;
        this.actualQuantity = actualQuantity;
        this.expenseItemsId = expenseItemsId;
        this.validStatus = validStatus;
    }

    public TreatmentItems(Integer treatmentItemsId, Integer treatmentId, Integer fmedicalItemsId, Integer quantity, Integer actualQuantity, Integer expenseItemsId, String validStatus, FmedicalItems fmedicalItems) {
        this.treatmentItemsId = treatmentItemsId;
        this.treatmentId = treatmentId;
        this.fmedicalItemsId = fmedicalItemsId;
        this.quantity = quantity;
        this.actualQuantity = actualQuantity;
        this.expenseItemsId = expenseItemsId;
        this.validStatus = validStatus;
        this.fmedicalItems = fmedicalItems;
    }

    public TreatmentItems(Integer treatmentItemsId, Integer treatmentId, Integer fmedicalItemsId, Integer quantity, Integer actualQuantity, Integer expenseItemsId, String validStatus, FmedicalItems fmedicalItems, Department department) {
        this.treatmentItemsId = treatmentItemsId;
        this.treatmentId = treatmentId;
        this.fmedicalItemsId = fmedicalItemsId;
        this.quantity = quantity;
        this.actualQuantity = actualQuantity;
        this.expenseItemsId = expenseItemsId;
        this.validStatus = validStatus;
        this.fmedicalItems = fmedicalItems;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public FmedicalItems getFmedicalItems() {
        return fmedicalItems;
    }

    public void setFmedicalItems(FmedicalItems fmedicalItems) {
        this.fmedicalItems = fmedicalItems;
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

    public String getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus == null ? null : validStatus.trim();
    }
}