package edu.neu.hoso.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

public class FmedicalItems {
    private Integer fmedicalItemsId;

    private String fmedicalItemsCode;

    private String fmedicalItemsName;

    private String fmedicalItemsFormat;

    private Double fmedicalItemsPrice;

    private Integer expenseTypeId;

    private Integer departmentId;

    private String fmedicalItemsMnemoniccode;

    private String fmedicalItemsType;

    private Date createTime;

    private String reverse1;

    private String reverse2;

    private String reverse3;

    @Getter
    @Setter
    private Department department;

    @Getter
    @Setter
    private ExpenseType expenseType;

  public FmedicalItems(Integer fmedicalItemsId, String fmedicalItemsCode, String fmedicalItemsName, String fmedicalItemsFormat, Double fmedicalItemsPrice, Integer expenseTypeId, Integer departmentId, String fmedicalItemsMnemoniccode, String fmedicalItemsType, Date createTime, String reverse1, String reverse2, String reverse3) {
        this.fmedicalItemsId = fmedicalItemsId;
        this.fmedicalItemsCode = fmedicalItemsCode;
        this.fmedicalItemsName = fmedicalItemsName;
        this.fmedicalItemsFormat = fmedicalItemsFormat;
        this.fmedicalItemsPrice = fmedicalItemsPrice;
        this.expenseTypeId = expenseTypeId;
        this.departmentId = departmentId;
        this.fmedicalItemsMnemoniccode = fmedicalItemsMnemoniccode;
        this.fmedicalItemsType = fmedicalItemsType;
        this.createTime = createTime;
        this.reverse1 = reverse1;
        this.reverse2 = reverse2;
        this.reverse3 = reverse3;
    }

    public FmedicalItems() {
        super();
    }

    public Integer getFmedicalItemsId() {
        return fmedicalItemsId;
    }

    public void setFmedicalItemsId(Integer fmedicalItemsId) {
        this.fmedicalItemsId = fmedicalItemsId;
    }

    public String getFmedicalItemsCode() {
        return fmedicalItemsCode;
    }

    public void setFmedicalItemsCode(String fmedicalItemsCode) {
        this.fmedicalItemsCode = fmedicalItemsCode == null ? null : fmedicalItemsCode.trim();
    }

    public String getFmedicalItemsName() {
        return fmedicalItemsName;
    }

    public void setFmedicalItemsName(String fmedicalItemsName) {
        this.fmedicalItemsName = fmedicalItemsName == null ? null : fmedicalItemsName.trim();
    }

    public String getFmedicalItemsFormat() {
        return fmedicalItemsFormat;
    }

    public void setFmedicalItemsFormat(String fmedicalItemsFormat) {
        this.fmedicalItemsFormat = fmedicalItemsFormat == null ? null : fmedicalItemsFormat.trim();
    }

    public Double getFmedicalItemsPrice() {
        return fmedicalItemsPrice;
    }

    public void setFmedicalItemsPrice(Double fmedicalItemsPrice) {
        this.fmedicalItemsPrice = fmedicalItemsPrice;
    }

    public Integer getExpenseTypeId() {
        return expenseTypeId;
    }

    public void setExpenseTypeId(Integer expenseTypeId) {
        this.expenseTypeId = expenseTypeId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getFmedicalItemsMnemoniccode() {
        return fmedicalItemsMnemoniccode;
    }

    public void setFmedicalItemsMnemoniccode(String fmedicalItemsMnemoniccode) {
        this.fmedicalItemsMnemoniccode = fmedicalItemsMnemoniccode == null ? null : fmedicalItemsMnemoniccode.trim();
    }

    public String getFmedicalItemsType() {
        return fmedicalItemsType;
    }

    public void setFmedicalItemsType(String fmedicalItemsType) {
        this.fmedicalItemsType = fmedicalItemsType == null ? null : fmedicalItemsType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getReverse1() {
        return reverse1;
    }

    public void setReverse1(String reverse1) {
        this.reverse1 = reverse1 == null ? null : reverse1.trim();
    }

    public String getReverse2() {
        return reverse2;
    }

    public void setReverse2(String reverse2) {
        this.reverse2 = reverse2 == null ? null : reverse2.trim();
    }

    public String getReverse3() {
        return reverse3;
    }

    public void setReverse3(String reverse3) {
        this.reverse3 = reverse3 == null ? null : reverse3.trim();
    }

    @Override
    public String toString() {
        return "FmedicalItems{" +
                "fmedicalItemsId=" + fmedicalItemsId +
                ", fmedicalItemsCode='" + fmedicalItemsCode + '\'' +
                ", fmedicalItemsName='" + fmedicalItemsName + '\'' +
                ", fmedicalItemsFormat='" + fmedicalItemsFormat + '\'' +
                ", fmedicalItemsPrice=" + fmedicalItemsPrice +
                ", expenseTypeId=" + expenseTypeId +
                ", departmentId=" + departmentId +
                ", fmedicalItemsMnemoniccode='" + fmedicalItemsMnemoniccode + '\'' +
                ", fmedicalItemsType='" + fmedicalItemsType + '\'' +
                ", createTime=" + createTime +
                ", reverse1='" + reverse1 + '\'' +
                ", reverse2='" + reverse2 + '\'' +
                ", reverse3='" + reverse3 + '\'' +
                '}';
    }
}