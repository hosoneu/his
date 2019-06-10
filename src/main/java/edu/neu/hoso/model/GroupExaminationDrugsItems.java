package edu.neu.hoso.model;

public class GroupExaminationDrugsItems {
    private Integer groupExaminationDrugsItemsId;

    private Integer groupExaminationFmedicalItemsId;

    private Integer drugsId;

    private String usage;

    private Integer quantity;

    public GroupExaminationDrugsItems(Integer groupExaminationDrugsItemsId, Integer groupExaminationFmedicalItemsId, Integer drugsId, String usage, Integer quantity) {
        this.groupExaminationDrugsItemsId = groupExaminationDrugsItemsId;
        this.groupExaminationFmedicalItemsId = groupExaminationFmedicalItemsId;
        this.drugsId = drugsId;
        this.usage = usage;
        this.quantity = quantity;
    }

    public GroupExaminationDrugsItems() {
        super();
    }

    public Integer getGroupExaminationDrugsItemsId() {
        return groupExaminationDrugsItemsId;
    }

    public void setGroupExaminationDrugsItemsId(Integer groupExaminationDrugsItemsId) {
        this.groupExaminationDrugsItemsId = groupExaminationDrugsItemsId;
    }

    public Integer getGroupExaminationFmedicalItemsId() {
        return groupExaminationFmedicalItemsId;
    }

    public void setGroupExaminationFmedicalItemsId(Integer groupExaminationFmedicalItemsId) {
        this.groupExaminationFmedicalItemsId = groupExaminationFmedicalItemsId;
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
}