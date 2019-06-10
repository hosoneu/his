package edu.neu.hoso.model;

import java.util.Date;

public class ExaminationResult {
    private Integer examinationResultId;

    private Integer doctorId;

    private String findings;

    private String diagnosticSuggestion;

    private Date submitTime;

    public ExaminationResult(Integer examinationResultId, Integer doctorId, String findings, String diagnosticSuggestion, Date submitTime) {
        this.examinationResultId = examinationResultId;
        this.doctorId = doctorId;
        this.findings = findings;
        this.diagnosticSuggestion = diagnosticSuggestion;
        this.submitTime = submitTime;
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
}