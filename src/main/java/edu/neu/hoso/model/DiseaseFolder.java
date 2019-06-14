package edu.neu.hoso.model;

public class DiseaseFolder {
    private Integer diseaseFolderId;

    private String diseaseFolderName;

    public DiseaseFolder(Integer diseaseFolderId, String diseaseFolderName) {
        this.diseaseFolderId = diseaseFolderId;
        this.diseaseFolderName = diseaseFolderName;
    }

    public DiseaseFolder() {
        super();
    }

    public Integer getDiseaseFolderId() {
        return diseaseFolderId;
    }

    public void setDiseaseFolderId(Integer diseaseFolderId) {
        this.diseaseFolderId = diseaseFolderId;
    }

    public String getDiseaseFolderName() {
        return diseaseFolderName;
    }

    public void setDiseaseFolderName(String diseaseFolderName) {
        this.diseaseFolderName = diseaseFolderName == null ? null : diseaseFolderName.trim();
    }
}