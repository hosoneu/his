package edu.neu.hoso.model;

public class ConstantItems {
    private Integer constantItemsId;

    private Integer constantTypeId;

    private String constantItemsCode;

    private String constantItemsName;

    public ConstantItems(Integer constantItemsId, Integer constantTypeId, String constantItemsCode, String constantItemsName) {
        this.constantItemsId = constantItemsId;
        this.constantTypeId = constantTypeId;
        this.constantItemsCode = constantItemsCode;
        this.constantItemsName = constantItemsName;
    }

    public ConstantItems() {
        super();
    }

    public Integer getConstantItemsId() {
        return constantItemsId;
    }

    public void setConstantItemsId(Integer constantItemsId) {
        this.constantItemsId = constantItemsId;
    }

    public Integer getConstantTypeId() {
        return constantTypeId;
    }

    public void setConstantTypeId(Integer constantTypeId) {
        this.constantTypeId = constantTypeId;
    }

    public String getConstantItemsCode() {
        return constantItemsCode;
    }

    public void setConstantItemsCode(String constantItemsCode) {
        this.constantItemsCode = constantItemsCode == null ? null : constantItemsCode.trim();
    }

    public String getConstantItemsName() {
        return constantItemsName;
    }

    public void setConstantItemsName(String constantItemsName) {
        this.constantItemsName = constantItemsName == null ? null : constantItemsName.trim();
    }
}