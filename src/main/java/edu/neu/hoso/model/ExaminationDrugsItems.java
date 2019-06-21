package edu.neu.hoso.model;

public class ExaminationDrugsItems {
    private Integer examinationDrugsItemsId;

    private Integer examinationFmedicalItemsId;

    private Integer drugsId;

    private Integer doctorId;

    private String drugsUsage;

    private Integer quantity;

    private Integer actualQuantity;

    private String drugsDispensingStatus;

    private Integer expenseItemsId;

    private Integer times;

    private Integer days;

    private Double dosage;

    /* 对应的药品对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.18*/
    private Drugs drugs;

    public ExaminationDrugsItems(Integer examinationDrugsItemsId, Integer examinationFmedicalItemsId, Integer drugsId, Integer doctorId, String drugsUsage, Integer quantity, Integer actualQuantity, String drugsDispensingStatus, Integer expenseItemsId, Integer times, Integer days, Double dosage) {
        this.examinationDrugsItemsId = examinationDrugsItemsId;
        this.examinationFmedicalItemsId = examinationFmedicalItemsId;
        this.drugsId = drugsId;
        this.doctorId = doctorId;
        this.drugsUsage = drugsUsage;
        this.quantity = quantity;
        this.actualQuantity = actualQuantity;
        this.drugsDispensingStatus = drugsDispensingStatus;
        this.expenseItemsId = expenseItemsId;
        this.times = times;
        this.days = days;
        this.dosage = dosage;
    }

    public ExaminationDrugsItems(Integer examinationDrugsItemsId, Integer examinationFmedicalItemsId, Integer drugsId, Integer doctorId, String drugsUsage, Integer quantity, Integer actualQuantity, String drugsDispensingStatus, Integer expenseItemsId, Integer times, Integer days, Double dosage, Drugs drugs) {
        this.examinationDrugsItemsId = examinationDrugsItemsId;
        this.examinationFmedicalItemsId = examinationFmedicalItemsId;
        this.drugsId = drugsId;
        this.doctorId = doctorId;
        this.drugsUsage = drugsUsage;
        this.quantity = quantity;
        this.actualQuantity = actualQuantity;
        this.drugsDispensingStatus = drugsDispensingStatus;
        this.expenseItemsId = expenseItemsId;
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

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
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

    @Override
    public String toString() {
        return "ExaminationDrugsItems{" +
                "examinationDrugsItemsId=" + examinationDrugsItemsId +
                ", examinationFmedicalItemsId=" + examinationFmedicalItemsId +
                ", drugsId=" + drugsId +
                ", doctorId=" + doctorId +
                ", drugsUsage='" + drugsUsage + '\'' +
                ", quantity=" + quantity +
                ", actualQuantity=" + actualQuantity +
                ", drugsDispensingStatus='" + drugsDispensingStatus + '\'' +
                ", expenseItemsId=" + expenseItemsId +
                ", times=" + times +
                ", days=" + days +
                ", dosage=" + dosage +
                ", drugs=" + drugs +
                '}';
    }
}