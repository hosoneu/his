package edu.neu.hoso.model;

import lombok.Getter;
import lombok.Setter;

public class Department {
    private Integer departmentId;

    private String departmentCode;

    private String departmentName;

    private Integer departmentCategoryId;

    private String departmentType;

    @Getter
    @Setter
    private ConstantItems constantItems;

    public Department(Integer departmentId, String departmentCode, String departmentName, Integer departmentCategoryId, String departmentType) {
        this.departmentId = departmentId;
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.departmentCategoryId = departmentCategoryId;
        this.departmentType = departmentType;
    }

    public Department() {
        super();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode == null ? null : departmentCode.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Integer getDepartmentCategoryId() {
        return departmentCategoryId;
    }

    public void setDepartmentCategoryId(Integer departmentCategoryId) {
        this.departmentCategoryId = departmentCategoryId;
    }

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType == null ? null : departmentType.trim();
    }
}