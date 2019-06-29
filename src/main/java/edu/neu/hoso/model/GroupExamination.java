package edu.neu.hoso.model;

import java.util.Date;
import java.util.List;

public class GroupExamination {
    private Integer groupExaminationId;

    private Integer doctorId;

    private String groupExaminationCode;

    private String groupExaminationName;

    private String groupExaminationScope;

    private Date createTime;

    private String groupExaminationType;

    /* 对应的检查检验组套非药品项目列表对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.19*/
    private List<GroupExaminationFmedicalItems> groupExaminationFmedicalItemsList;

    public GroupExamination(Integer groupExaminationId, Integer doctorId, String groupExaminationCode, String groupExaminationName, String groupExaminationScope, Date createTime, String groupExaminationType) {
        this.groupExaminationId = groupExaminationId;
        this.doctorId = doctorId;
        this.groupExaminationCode = groupExaminationCode;
        this.groupExaminationName = groupExaminationName;
        this.groupExaminationScope = groupExaminationScope;
        this.createTime = createTime;
        this.groupExaminationType = groupExaminationType;
    }

    public GroupExamination(Integer groupExaminationId, Integer doctorId, String groupExaminationCode, String groupExaminationName, String groupExaminationScope, Date createTime, String groupExaminationType, List<GroupExaminationFmedicalItems> groupExaminationFmedicalItemsList) {
        this.groupExaminationId = groupExaminationId;
        this.doctorId = doctorId;
        this.groupExaminationCode = groupExaminationCode;
        this.groupExaminationName = groupExaminationName;
        this.groupExaminationScope = groupExaminationScope;
        this.createTime = createTime;
        this.groupExaminationType = groupExaminationType;
        this.groupExaminationFmedicalItemsList = groupExaminationFmedicalItemsList;
    }

    public List<GroupExaminationFmedicalItems> getGroupExaminationFmedicalItemsList() {
        return groupExaminationFmedicalItemsList;
    }

    public void setGroupExaminationFmedicalItemsList(List<GroupExaminationFmedicalItems> groupExaminationFmedicalItemsList) {
        this.groupExaminationFmedicalItemsList = groupExaminationFmedicalItemsList;
    }

    public GroupExamination() {
        super();
    }

    public Integer getGroupExaminationId() {
        return groupExaminationId;
    }

    public void setGroupExaminationId(Integer groupExaminationId) {
        this.groupExaminationId = groupExaminationId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getGroupExaminationCode() {
        return groupExaminationCode;
    }

    public void setGroupExaminationCode(String groupExaminationCode) {
        this.groupExaminationCode = groupExaminationCode == null ? null : groupExaminationCode.trim();
    }

    public String getGroupExaminationName() {
        return groupExaminationName;
    }

    public void setGroupExaminationName(String groupExaminationName) {
        this.groupExaminationName = groupExaminationName == null ? null : groupExaminationName.trim();
    }

    public String getGroupExaminationScope() {
        return groupExaminationScope;
    }

    public void setGroupExaminationScope(String groupExaminationScope) {
        this.groupExaminationScope = groupExaminationScope == null ? null : groupExaminationScope.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getGroupExaminationType() {
        return groupExaminationType;
    }

    public void setGroupExaminationType(String groupExaminationType) {
        this.groupExaminationType = groupExaminationType == null ? null : groupExaminationType.trim();
    }
}