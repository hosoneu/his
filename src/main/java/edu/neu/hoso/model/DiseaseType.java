package edu.neu.hoso.model;

public class DiseaseType {
    private Integer diseaseTypeId;

    private String diseaseTypeCode;

    private String diseaseTypeName;

    private Integer diseaseTypeSequence;

    private String diseaseTypeType;

    private Integer diseaseFolderId;

    public DiseaseType(Integer diseaseTypeId, String diseaseTypeCode, String diseaseTypeName, Integer diseaseTypeSequence, String diseaseTypeType, Integer diseaseFolderId) {
        this.diseaseTypeId = diseaseTypeId;
        this.diseaseTypeCode = diseaseTypeCode;
        this.diseaseTypeName = diseaseTypeName;
        this.diseaseTypeSequence = diseaseTypeSequence;
        this.diseaseTypeType = diseaseTypeType;
        this.diseaseFolderId = diseaseFolderId;
    }

    public DiseaseType() {
        super();
    }

    public Integer getDiseaseTypeId() {
        return diseaseTypeId;
    }

    public void setDiseaseTypeId(Integer diseaseTypeId) {
        this.diseaseTypeId = diseaseTypeId;
    }

    public String getDiseaseTypeCode() {
        return diseaseTypeCode;
    }

    public void setDiseaseTypeCode(String diseaseTypeCode) {
        this.diseaseTypeCode = diseaseTypeCode == null ? null : diseaseTypeCode.trim();
    }

    public String getDiseaseTypeName() {
        return diseaseTypeName;
    }

    public void setDiseaseTypeName(String diseaseTypeName) {
        this.diseaseTypeName = diseaseTypeName == null ? null : diseaseTypeName.trim();
    }

    public Integer getDiseaseTypeSequence() {
        return diseaseTypeSequence;
    }

    public void setDiseaseTypeSequence(Integer diseaseTypeSequence) {
        this.diseaseTypeSequence = diseaseTypeSequence;
    }

    public String getDiseaseTypeType() {
        return diseaseTypeType;
    }

    public void setDiseaseTypeType(String diseaseTypeType) {
        this.diseaseTypeType = diseaseTypeType == null ? null : diseaseTypeType.trim();
    }

    public Integer getDiseaseFolderId() {
        return diseaseFolderId;
    }

    public void setDiseaseFolderId(Integer diseaseFolderId) {
        this.diseaseFolderId = diseaseFolderId;
    }
}