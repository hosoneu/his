package edu.neu.hoso.model;

import java.util.List;

public class GroupExaminationFmedicalItems {
    private Integer groupExaminationFmedicalItemsId;

    private Integer groupExaminationId;

    private Integer fmedicalItemsId;

    private String purposeRequirements;

    private Integer quantity;

    /* 对应的非药品对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.18*/
    private FmedicalItems fmedicalItems;

    /* 对应的检查检组套药品条目对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.18*/
    private List<GroupExaminationDrugsItems> groupExaminationDrugsItemsList;

    public GroupExaminationFmedicalItems(Integer groupExaminationFmedicalItemsId, Integer groupExaminationId, Integer fmedicalItemsId, String purposeRequirements, Integer quantity) {
        this.groupExaminationFmedicalItemsId = groupExaminationFmedicalItemsId;
        this.groupExaminationId = groupExaminationId;
        this.fmedicalItemsId = fmedicalItemsId;
        this.purposeRequirements = purposeRequirements;
        this.quantity = quantity;
    }

    public GroupExaminationFmedicalItems(Integer groupExaminationFmedicalItemsId, Integer groupExaminationId, Integer fmedicalItemsId, String purposeRequirements, Integer quantity, FmedicalItems fmedicalItems, List<GroupExaminationDrugsItems> groupExaminationDrugsItemsList) {
        this.groupExaminationFmedicalItemsId = groupExaminationFmedicalItemsId;
        this.groupExaminationId = groupExaminationId;
        this.fmedicalItemsId = fmedicalItemsId;
        this.purposeRequirements = purposeRequirements;
        this.quantity = quantity;
        this.fmedicalItems = fmedicalItems;
        this.groupExaminationDrugsItemsList = groupExaminationDrugsItemsList;
    }

    public FmedicalItems getFmedicalItems() {
        return fmedicalItems;
    }

    public void setFmedicalItems(FmedicalItems fmedicalItems) {
        this.fmedicalItems = fmedicalItems;
    }

    public List<GroupExaminationDrugsItems> getGroupExaminationDrugsItemsList() {
        return groupExaminationDrugsItemsList;
    }

    public void setGroupExaminationDrugsItemsList(List<GroupExaminationDrugsItems> groupExaminationDrugsItemsList) {
        this.groupExaminationDrugsItemsList = groupExaminationDrugsItemsList;
    }

    public GroupExaminationFmedicalItems() {
        super();
    }

    public Integer getGroupExaminationFmedicalItemsId() {
        return groupExaminationFmedicalItemsId;
    }

    public void setGroupExaminationFmedicalItemsId(Integer groupExaminationFmedicalItemsId) {
        this.groupExaminationFmedicalItemsId = groupExaminationFmedicalItemsId;
    }

    public Integer getGroupExaminationId() {
        return groupExaminationId;
    }

    public void setGroupExaminationId(Integer groupExaminationId) {
        this.groupExaminationId = groupExaminationId;
    }

    public Integer getFmedicalItemsId() {
        return fmedicalItemsId;
    }

    public void setFmedicalItemsId(Integer fmedicalItemsId) {
        this.fmedicalItemsId = fmedicalItemsId;
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
}