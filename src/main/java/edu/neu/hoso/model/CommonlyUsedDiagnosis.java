package edu.neu.hoso.model;

public class CommonlyUsedDiagnosis {
    private Integer commonlyUsedDiagnosisId;

    private Integer doctorId;

    private Integer diseaseId;

    public CommonlyUsedDiagnosis(Integer commonlyUsedDiagnosisId, Integer doctorId, Integer diseaseId) {
        this.commonlyUsedDiagnosisId = commonlyUsedDiagnosisId;
        this.doctorId = doctorId;
        this.diseaseId = diseaseId;
    }

    public CommonlyUsedDiagnosis() {
        super();
    }

    public Integer getCommonlyUsedDiagnosisId() {
        return commonlyUsedDiagnosisId;
    }

    public void setCommonlyUsedDiagnosisId(Integer commonlyUsedDiagnosisId) {
        this.commonlyUsedDiagnosisId = commonlyUsedDiagnosisId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }
}