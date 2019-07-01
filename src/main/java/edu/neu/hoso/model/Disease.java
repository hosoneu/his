package edu.neu.hoso.model;

import lombok.Getter;
import lombok.Setter;

public class Disease {
    private Integer diseaseId;

    private String diseaseCode;

    private String diseaseName;

    private String diseaseIcd;

    private Integer diseaseTypeId;

    private String diseaseCustomizeName1;

    private String diseaseCustomizeName2;

    @Getter
    @Setter
    private DiseaseType diseaseType;

    public Disease(Integer diseaseId, String diseaseCode, String diseaseName, String diseaseIcd, Integer diseaseTypeId, String diseaseCustomizeName1, String diseaseCustomizeName2) {
        this.diseaseId = diseaseId;
        this.diseaseCode = diseaseCode;
        this.diseaseName = diseaseName;
        this.diseaseIcd = diseaseIcd;
        this.diseaseTypeId = diseaseTypeId;
        this.diseaseCustomizeName1 = diseaseCustomizeName1;
        this.diseaseCustomizeName2 = diseaseCustomizeName2;
    }

    public Disease() {
        super();
    }

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode == null ? null : diseaseCode.trim();
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName == null ? null : diseaseName.trim();
    }

    public String getDiseaseIcd() {
        return diseaseIcd;
    }

    public void setDiseaseIcd(String diseaseIcd) {
        this.diseaseIcd = diseaseIcd == null ? null : diseaseIcd.trim();
    }

    public Integer getDiseaseTypeId() {
        return diseaseTypeId;
    }

    public void setDiseaseTypeId(Integer diseaseTypeId) {
        this.diseaseTypeId = diseaseTypeId;
    }

    public String getDiseaseCustomizeName1() {
        return diseaseCustomizeName1;
    }

    public void setDiseaseCustomizeName1(String diseaseCustomizeName1) {
        this.diseaseCustomizeName1 = diseaseCustomizeName1 == null ? null : diseaseCustomizeName1.trim();
    }

    public String getDiseaseCustomizeName2() {
        return diseaseCustomizeName2;
    }

    public void setDiseaseCustomizeName2(String diseaseCustomizeName2) {
        this.diseaseCustomizeName2 = diseaseCustomizeName2 == null ? null : diseaseCustomizeName2.trim();
    }
}