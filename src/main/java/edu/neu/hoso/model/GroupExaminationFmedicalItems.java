package edu.neu.hoso.model;

public class GroupExaminationFmedicalItems {
    private Integer groupExaminationFmedicalItemsId;

    private Integer groupExaminationId;

    private Integer fmedicalItemsId;

    private String purposeRequirements;

    private Integer quantity;

    public GroupExaminationFmedicalItems(Integer groupExaminationFmedicalItemsId, Integer groupExaminationId, Integer fmedicalItemsId, String purposeRequirements, Integer quantity) {
        this.groupExaminationFmedicalItemsId = groupExaminationFmedicalItemsId;
        this.groupExaminationId = groupExaminationId;
        this.fmedicalItemsId = fmedicalItemsId;
        this.purposeRequirements = purposeRequirements;
        this.quantity = quantity;
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