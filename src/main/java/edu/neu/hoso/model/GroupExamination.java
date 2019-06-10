package edu.neu.hoso.model;

import java.util.Date;

public class GroupExamination {
    private Integer groupExaminationId;

    private Integer doctorId;

    private String groupExaminationCode;

    private String groupExaminationName;

    private String groupExaminationScope;

    private Date createTime;

    public GroupExamination(Integer groupExaminationId, Integer doctorId, String groupExaminationCode, String groupExaminationName, String groupExaminationScope, Date createTime) {
        this.groupExaminationId = groupExaminationId;
        this.doctorId = doctorId;
        this.groupExaminationCode = groupExaminationCode;
        this.groupExaminationName = groupExaminationName;
        this.groupExaminationScope = groupExaminationScope;
        this.createTime = createTime;
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
}