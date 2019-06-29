package edu.neu.hoso.model;

import java.util.Date;
import java.util.List;

public class GroupTreatment {
    private Integer groupTreatmentId;

    private Integer doctorId;

    private String groupTreatmentCode;

    private String groupTreatmentName;

    private String groupTreatmentScope;

    private Date createTime;

    /* 对应的处置条目模板对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.17*/
    private List<GroupTreatmentItems> groupTreatmentItemsList;

    public GroupTreatment(Integer groupTreatmentId, Integer doctorId, String groupTreatmentCode, String groupTreatmentName, String groupTreatmentScope, Date createTime) {
        this.groupTreatmentId = groupTreatmentId;
        this.doctorId = doctorId;
        this.groupTreatmentCode = groupTreatmentCode;
        this.groupTreatmentName = groupTreatmentName;
        this.groupTreatmentScope = groupTreatmentScope;
        this.createTime = createTime;
    }

    public GroupTreatment(Integer groupTreatmentId, Integer doctorId, String groupTreatmentCode, String groupTreatmentName, String groupTreatmentScope, Date createTime, List<GroupTreatmentItems> groupTreatmentItemsList) {
        this.groupTreatmentId = groupTreatmentId;
        this.doctorId = doctorId;
        this.groupTreatmentCode = groupTreatmentCode;
        this.groupTreatmentName = groupTreatmentName;
        this.groupTreatmentScope = groupTreatmentScope;
        this.createTime = createTime;
        this.groupTreatmentItemsList = groupTreatmentItemsList;
    }

    public List<GroupTreatmentItems> getGroupTreatmentItemsList() {
        return groupTreatmentItemsList;
    }

    public void setGroupTreatmentItemsList(List<GroupTreatmentItems> groupTreatmentItemsList) {
        this.groupTreatmentItemsList = groupTreatmentItemsList;
    }

    public GroupTreatment() {
        super();
    }

    public Integer getGroupTreatmentId() {
        return groupTreatmentId;
    }

    public void setGroupTreatmentId(Integer groupTreatmentId) {
        this.groupTreatmentId = groupTreatmentId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getGroupTreatmentCode() {
        return groupTreatmentCode;
    }

    public void setGroupTreatmentCode(String groupTreatmentCode) {
        this.groupTreatmentCode = groupTreatmentCode == null ? null : groupTreatmentCode.trim();
    }

    public String getGroupTreatmentName() {
        return groupTreatmentName;
    }

    public void setGroupTreatmentName(String groupTreatmentName) {
        this.groupTreatmentName = groupTreatmentName == null ? null : groupTreatmentName.trim();
    }

    public String getGroupTreatmentScope() {
        return groupTreatmentScope;
    }

    public void setGroupTreatmentScope(String groupTreatmentScope) {
        this.groupTreatmentScope = groupTreatmentScope == null ? null : groupTreatmentScope.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}