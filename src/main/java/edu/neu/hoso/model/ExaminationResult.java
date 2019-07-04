package edu.neu.hoso.model;

import java.util.Date;
import java.util.List;

public class ExaminationResult {
    private Integer examinationResultId;

    private Integer doctorId;

    private String findings;

    private String diagnosticSuggestion;

    private Date submitTime;

    /* 对应的检查检验结果图片列表对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.18*/
    private List<ExaminationResultImage> examinationResultImageList;

    public ExaminationResult(Integer examinationResultId, Integer doctorId, String findings, String diagnosticSuggestion, Date submitTime) {
        this.examinationResultId = examinationResultId;
        this.doctorId = doctorId;
        this.findings = findings;
        this.diagnosticSuggestion = diagnosticSuggestion;
        this.submitTime = submitTime;
    }

    public ExaminationResult(Integer examinationResultId, Integer doctorId, String findings, String diagnosticSuggestion, Date submitTime, List<ExaminationResultImage> examinationResultImageList) {
        this.examinationResultId = examinationResultId;
        this.doctorId = doctorId;
        this.findings = findings;
        this.diagnosticSuggestion = diagnosticSuggestion;
        this.submitTime = submitTime;
        this.examinationResultImageList = examinationResultImageList;
    }

    public List<ExaminationResultImage> getExaminationResultImageList() {
        return examinationResultImageList;
    }

    public void setExaminationResultImageList(List<ExaminationResultImage> examinationResultImageList) {
        this.examinationResultImageList = examinationResultImageList;
    }

    public ExaminationResult() {
        super();
    }

    public Integer getExaminationResultId() {
        return examinationResultId;
    }

    public void setExaminationResultId(Integer examinationResultId) {
        this.examinationResultId = examinationResultId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getFindings() {
        return findings;
    }

    public void setFindings(String findings) {
        this.findings = findings == null ? null : findings.trim();
    }

    public String getDiagnosticSuggestion() {
        return diagnosticSuggestion;
    }

    public void setDiagnosticSuggestion(String diagnosticSuggestion) {
        this.diagnosticSuggestion = diagnosticSuggestion == null ? null : diagnosticSuggestion.trim();
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    @Override
    public String toString() {
        return "ExaminationResult{" +
                "examinationResultId=" + examinationResultId +
                ", doctorId=" + doctorId +
                ", findings='" + findings + '\'' +
                ", diagnosticSuggestion='" + diagnosticSuggestion + '\'' +
                ", submitTime=" + submitTime +
                ", examinationResultImageList=" + examinationResultImageList +
                '}';
    }
}