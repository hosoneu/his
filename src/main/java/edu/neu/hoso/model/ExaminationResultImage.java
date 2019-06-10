package edu.neu.hoso.model;

public class ExaminationResultImage {
    private Integer examinationResultImageId;

    private Integer examinationResultId;

    private String imageUrl;

    private String imageName;

    public ExaminationResultImage(Integer examinationResultImageId, Integer examinationResultId, String imageUrl, String imageName) {
        this.examinationResultImageId = examinationResultImageId;
        this.examinationResultId = examinationResultId;
        this.imageUrl = imageUrl;
        this.imageName = imageName;
    }

    public ExaminationResultImage() {
        super();
    }

    public Integer getExaminationResultImageId() {
        return examinationResultImageId;
    }

    public void setExaminationResultImageId(Integer examinationResultImageId) {
        this.examinationResultImageId = examinationResultImageId;
    }

    public Integer getExaminationResultId() {
        return examinationResultId;
    }

    public void setExaminationResultId(Integer examinationResultId) {
        this.examinationResultId = examinationResultId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }
}