package edu.neu.hoso.model;

public class CommonlyUsedFmedical {
    private Integer commonlyUsedFmedicalId;

    private Integer doctorId;

    private Integer fmedicalItemsId;

    public CommonlyUsedFmedical(Integer commonlyUsedFmedicalId, Integer doctorId, Integer fmedicalItemsId) {
        this.commonlyUsedFmedicalId = commonlyUsedFmedicalId;
        this.doctorId = doctorId;
        this.fmedicalItemsId = fmedicalItemsId;
    }

    public CommonlyUsedFmedical() {
        super();
    }

    public Integer getCommonlyUsedFmedicalId() {
        return commonlyUsedFmedicalId;
    }

    public void setCommonlyUsedFmedicalId(Integer commonlyUsedFmedicalId) {
        this.commonlyUsedFmedicalId = commonlyUsedFmedicalId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getFmedicalItemsId() {
        return fmedicalItemsId;
    }

    public void setFmedicalItemsId(Integer fmedicalItemsId) {
        this.fmedicalItemsId = fmedicalItemsId;
    }
}