package edu.neu.hoso.model;

public class GroupTreatmentItems {
    private Integer groupTreatmentItemsId;

    private Integer groupTreatmentId;

    private Integer fmedicalItemsId;

    private Integer quantity;

    private String groupTreatmentScope;

    /* 对应的处置非药品对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.17*/
    private FmedicalItems fmedicalItems;

    public GroupTreatmentItems(Integer groupTreatmentItemsId, Integer groupTreatmentId, Integer fmedicalItemsId, Integer quantity, String groupTreatmentScope) {
        this.groupTreatmentItemsId = groupTreatmentItemsId;
        this.groupTreatmentId = groupTreatmentId;
        this.fmedicalItemsId = fmedicalItemsId;
        this.quantity = quantity;
        this.groupTreatmentScope = groupTreatmentScope;
    }

    public GroupTreatmentItems(Integer groupTreatmentItemsId, Integer groupTreatmentId, Integer fmedicalItemsId, Integer quantity, String groupTreatmentScope, FmedicalItems fmedicalItems) {
        this.groupTreatmentItemsId = groupTreatmentItemsId;
        this.groupTreatmentId = groupTreatmentId;
        this.fmedicalItemsId = fmedicalItemsId;
        this.quantity = quantity;
        this.groupTreatmentScope = groupTreatmentScope;
        this.fmedicalItems = fmedicalItems;
    }

    public FmedicalItems getFmedicalItems() {
        return fmedicalItems;
    }

    public void setFmedicalItems(FmedicalItems fmedicalItems) {
        this.fmedicalItems = fmedicalItems;
    }

    public GroupTreatmentItems() {
        super();
    }

    public Integer getGroupTreatmentItemsId() {
        return groupTreatmentItemsId;
    }

    public void setGroupTreatmentItemsId(Integer groupTreatmentItemsId) {
        this.groupTreatmentItemsId = groupTreatmentItemsId;
    }

    public Integer getGroupTreatmentId() {
        return groupTreatmentId;
    }

    public void setGroupTreatmentId(Integer groupTreatmentId) {
        this.groupTreatmentId = groupTreatmentId;
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

    public String getGroupTreatmentScope() {
        return groupTreatmentScope;
    }

    public void setGroupTreatmentScope(String groupTreatmentScope) {
        this.groupTreatmentScope = groupTreatmentScope == null ? null : groupTreatmentScope.trim();
    }
}