package edu.neu.hoso.model;

import java.util.List;

public class ExaminationFmedicalItems {
    private Integer examinationFmedicalItemsId;

    private Integer examinationId;

    private Integer fmedicalItemsId;

    private Integer doctorId;

    private String registrationStatus;

    private String purposeRequirements;

    private Integer quantity;

    private Integer actualQuantity;

    private Integer examinationResultId;

    private Integer expenseItemsId;

    private String validStatus;

    /* 对应的非药品对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.18*/
    private FmedicalItems fmedicalItems;


    /* 对应的检查检验药品项目列表对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.18*/
    private List<ExaminationDrugsItems> examinationDrugsItemsList;

    /* 对应的非药品对象登记科室 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.30*/
    private Department department;

    public ExaminationFmedicalItems(Integer examinationFmedicalItemsId, Integer examinationId, Integer fmedicalItemsId, Integer doctorId, String registrationStatus, String purposeRequirements, Integer quantity, Integer actualQuantity, Integer examinationResultId, Integer expenseItemsId, String validStatus) {
        this.examinationFmedicalItemsId = examinationFmedicalItemsId;
        this.examinationId = examinationId;
        this.fmedicalItemsId = fmedicalItemsId;
        this.doctorId = doctorId;
        this.registrationStatus = registrationStatus;
        this.purposeRequirements = purposeRequirements;
        this.quantity = quantity;
        this.actualQuantity = actualQuantity;
        this.examinationResultId = examinationResultId;
        this.expenseItemsId = expenseItemsId;
        this.validStatus = validStatus;
    }

    public ExaminationFmedicalItems(Integer examinationFmedicalItemsId, Integer examinationId, Integer fmedicalItemsId, Integer doctorId, String registrationStatus, String purposeRequirements, Integer quantity, Integer actualQuantity, Integer examinationResultId, Integer expenseItemsId, String validStatus, FmedicalItems fmedicalItems, List<ExaminationDrugsItems> examinationDrugsItemsList) {
        this.examinationFmedicalItemsId = examinationFmedicalItemsId;
        this.examinationId = examinationId;
        this.fmedicalItemsId = fmedicalItemsId;
        this.doctorId = doctorId;
        this.registrationStatus = registrationStatus;
        this.purposeRequirements = purposeRequirements;
        this.quantity = quantity;
        this.actualQuantity = actualQuantity;
        this.examinationResultId = examinationResultId;
        this.expenseItemsId = expenseItemsId;
        this.validStatus = validStatus;
        this.fmedicalItems = fmedicalItems;
        this.examinationDrugsItemsList = examinationDrugsItemsList;
    }

    public ExaminationFmedicalItems(Integer examinationFmedicalItemsId, Integer examinationId, Integer fmedicalItemsId, Integer doctorId, String registrationStatus, String purposeRequirements, Integer quantity, Integer actualQuantity, Integer examinationResultId, Integer expenseItemsId, String validStatus, FmedicalItems fmedicalItems, List<ExaminationDrugsItems> examinationDrugsItemsList, Department department) {
        this.examinationFmedicalItemsId = examinationFmedicalItemsId;
        this.examinationId = examinationId;
        this.fmedicalItemsId = fmedicalItemsId;
        this.doctorId = doctorId;
        this.registrationStatus = registrationStatus;
        this.purposeRequirements = purposeRequirements;
        this.quantity = quantity;
        this.actualQuantity = actualQuantity;
        this.examinationResultId = examinationResultId;
        this.expenseItemsId = expenseItemsId;
        this.validStatus = validStatus;
        this.fmedicalItems = fmedicalItems;
        this.examinationDrugsItemsList = examinationDrugsItemsList;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<ExaminationDrugsItems> getExaminationDrugsItemsList() {
        return examinationDrugsItemsList;
    }

    public void setExaminationDrugsItemsList(List<ExaminationDrugsItems> examinationDrugsItemsList) {
        this.examinationDrugsItemsList = examinationDrugsItemsList;
    }

    public FmedicalItems getFmedicalItems() {
        return fmedicalItems;
    }

    public void setFmedicalItems(FmedicalItems fmedicalItems) {
        this.fmedicalItems = fmedicalItems;
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

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
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

    public String getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus == null ? null : validStatus.trim();
    }

    @Override
    public String toString() {
        return "ExaminationFmedicalItems{" +
                "examinationFmedicalItemsId=" + examinationFmedicalItemsId +
                ", examinationId=" + examinationId +
                ", fmedicalItemsId=" + fmedicalItemsId +
                ", doctorId=" + doctorId +
                ", registrationStatus='" + registrationStatus + '\'' +
                ", purposeRequirements='" + purposeRequirements + '\'' +
                ", quantity=" + quantity +
                ", actualQuantity=" + actualQuantity +
                ", examinationResultId=" + examinationResultId +
                ", expenseItemsId=" + expenseItemsId +
                ", validStatus='" + validStatus + '\'' +
                ", fmedicalItems=" + fmedicalItems +
                ", examinationDrugsItemsList=" + examinationDrugsItemsList +
                '}';
    }
}