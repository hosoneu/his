package edu.neu.hoso.model;

import java.util.Date;

public class Diagnosis {
    private Integer diagnosisId;

    private Integer diseaseId;

    private Integer medicalRecordId;

    private String mainDiagnosisMark;

    private String suspectMark;

    private Date onsetDate;

    private String diagnosisMark;

    public Diagnosis(Integer diagnosisId, Integer diseaseId, Integer medicalRecordId, String mainDiagnosisMark, String suspectMark, Date onsetDate, String diagnosisMark) {
        this.diagnosisId = diagnosisId;
        this.diseaseId = diseaseId;
        this.medicalRecordId = medicalRecordId;
        this.mainDiagnosisMark = mainDiagnosisMark;
        this.suspectMark = suspectMark;
        this.onsetDate = onsetDate;
        this.diagnosisMark = diagnosisMark;
    }

    public Diagnosis() {
        super();
    }

    public Integer getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(Integer diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    public String getMainDiagnosisMark() {
        return mainDiagnosisMark;
    }

    public void setMainDiagnosisMark(String mainDiagnosisMark) {
        this.mainDiagnosisMark = mainDiagnosisMark == null ? null : mainDiagnosisMark.trim();
    }

    public String getSuspectMark() {
        return suspectMark;
    }

    public void setSuspectMark(String suspectMark) {
        this.suspectMark = suspectMark == null ? null : suspectMark.trim();
    }

    public Date getOnsetDate() {
        return onsetDate;
    }

    public void setOnsetDate(Date onsetDate) {
        this.onsetDate = onsetDate;
    }

    public String getDiagnosisMark() {
        return diagnosisMark;
    }

    public void setDiagnosisMark(String diagnosisMark) {
        this.diagnosisMark = diagnosisMark == null ? null : diagnosisMark.trim();
    }
}