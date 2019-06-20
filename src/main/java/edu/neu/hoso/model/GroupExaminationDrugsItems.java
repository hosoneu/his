package edu.neu.hoso.model;

public class GroupExaminationDrugsItems {
    private Integer groupExaminationDrugsItemsId;

    private Integer groupExaminationFmedicalItemsId;

    private Integer drugsId;

    private String drugsUsage;

    private Integer quantity;

    private Integer times;

    private Integer days;

    private Double dosage;

    /* 对应的药品对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.18*/
    private Drugs drugs;

    public GroupExaminationDrugsItems(Integer groupExaminationDrugsItemsId, Integer groupExaminationFmedicalItemsId, Integer drugsId, String drugsUsage, Integer quantity, Integer times, Integer days, Double dosage) {
        this.groupExaminationDrugsItemsId = groupExaminationDrugsItemsId;
        this.groupExaminationFmedicalItemsId = groupExaminationFmedicalItemsId;
        this.drugsId = drugsId;
        this.drugsUsage = drugsUsage;
        this.quantity = quantity;
        this.times = times;
        this.days = days;
        this.dosage = dosage;
    }

    public GroupExaminationDrugsItems(Integer groupExaminationDrugsItemsId, Integer groupExaminationFmedicalItemsId, Integer drugsId, String drugsUsage, Integer quantity, Integer times, Integer days, Double dosage, Drugs drugs) {
        this.groupExaminationDrugsItemsId = groupExaminationDrugsItemsId;
        this.groupExaminationFmedicalItemsId = groupExaminationFmedicalItemsId;
        this.drugsId = drugsId;
        this.drugsUsage = drugsUsage;
        this.quantity = quantity;
        this.times = times;
        this.days = days;
        this.dosage = dosage;
        this.drugs = drugs;
    }

    public Drugs getDrugs() {
        return drugs;
    }

    public void setDrugs(Drugs drugs) {
        this.drugs = drugs;
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

    public String getDrugsUsage() {
        return drugsUsage;
    }

    public void setDrugsUsage(String drugsUsage) {
        this.drugsUsage = drugsUsage == null ? null : drugsUsage.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Double getDosage() {
        return dosage;
    }

    public void setDosage(Double dosage) {
        this.dosage = dosage;
    }
}