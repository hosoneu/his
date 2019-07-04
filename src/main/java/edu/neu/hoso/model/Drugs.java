package edu.neu.hoso.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Drugs {
    private Integer drugsId;

    private String drugsCode;

    private String drugsName;

    private String drugsFormat;

    private String drugsUnit;

    private String drugsManufacturer;

    private Integer drugsDosageId;

    private Integer drugsTypeId;

    private Double drugsPrice;

    private String drugsMnemoniccode;

    private Date createTime;

    private String reverse1;

    private String reverse2;

    private String reverse3;

    @Getter
    @Setter
    private ConstantItems drugsDosage;

    @Getter
    @Setter
    private ConstantItems drugsType;

    public Drugs(Integer drugsId, String drugsCode, String drugsName, String drugsFormat, String drugsUnit, String drugsManufacturer, Integer drugsDosageId, Integer drugsTypeId, Double drugsPrice, String drugsMnemoniccode, Date createTime, String reverse1, String reverse2, String reverse3) {
        this.drugsId = drugsId;
        this.drugsCode = drugsCode;
        this.drugsName = drugsName;
        this.drugsFormat = drugsFormat;
        this.drugsUnit = drugsUnit;
        this.drugsManufacturer = drugsManufacturer;
        this.drugsDosageId = drugsDosageId;
        this.drugsTypeId = drugsTypeId;
        this.drugsPrice = drugsPrice;
        this.drugsMnemoniccode = drugsMnemoniccode;
        this.createTime = createTime;
        this.reverse1 = reverse1;
        this.reverse2 = reverse2;
        this.reverse3 = reverse3;
    }

    public Drugs() {
        super();
    }

    public Integer getDrugsId() {
        return drugsId;
    }

    public void setDrugsId(Integer drugsId) {
        this.drugsId = drugsId;
    }

    public String getDrugsCode() {
        return drugsCode;
    }

    public void setDrugsCode(String drugsCode) {
        this.drugsCode = drugsCode == null ? null : drugsCode.trim();
    }

    public String getDrugsName() {
        return drugsName;
    }

    public void setDrugsName(String drugsName) {
        this.drugsName = drugsName == null ? null : drugsName.trim();
    }

    public String getDrugsFormat() {
        return drugsFormat;
    }

    public void setDrugsFormat(String drugsFormat) {
        this.drugsFormat = drugsFormat == null ? null : drugsFormat.trim();
    }

    public String getDrugsUnit() {
        return drugsUnit;
    }

    public void setDrugsUnit(String drugsUnit) {
        this.drugsUnit = drugsUnit == null ? null : drugsUnit.trim();
    }

    public String getDrugsManufacturer() {
        return drugsManufacturer;
    }

    public void setDrugsManufacturer(String drugsManufacturer) {
        this.drugsManufacturer = drugsManufacturer == null ? null : drugsManufacturer.trim();
    }

    public Integer getDrugsDosageId() {
        return drugsDosageId;
    }

    public void setDrugsDosageId(Integer drugsDosageId) {
        this.drugsDosageId = drugsDosageId;
    }

    public Integer getDrugsTypeId() {
        return drugsTypeId;
    }

    public void setDrugsTypeId(Integer drugsTypeId) {
        this.drugsTypeId = drugsTypeId;
    }

    public Double getDrugsPrice() {
        return drugsPrice;
    }

    public void setDrugsPrice(Double drugsPrice) {
        this.drugsPrice = drugsPrice;
    }

    public String getDrugsMnemoniccode() {
        return drugsMnemoniccode;
    }

    public void setDrugsMnemoniccode(String drugsMnemoniccode) {
        this.drugsMnemoniccode = drugsMnemoniccode == null ? null : drugsMnemoniccode.trim();
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
        return "Drugs{" +
                "drugsId=" + drugsId +
                ", drugsCode='" + drugsCode + '\'' +
                ", drugsName='" + drugsName + '\'' +
                ", drugsFormat='" + drugsFormat + '\'' +
                ", drugsUnit='" + drugsUnit + '\'' +
                ", drugsManufacturer='" + drugsManufacturer + '\'' +
                ", drugsDosageId=" + drugsDosageId +
                ", drugsTypeId=" + drugsTypeId +
                ", drugsPrice=" + drugsPrice +
                ", drugsMnemoniccode='" + drugsMnemoniccode + '\'' +
                ", createTime=" + createTime +
                ", reverse1='" + reverse1 + '\'' +
                ", reverse2='" + reverse2 + '\'' +
                ", reverse3='" + reverse3 + '\'' +
                '}';
    }
}