package edu.neu.hoso.model;

public class CommonlyUsedDrugs {
    private Integer commonlyUsedDrugs;

    private Integer doctorId;

    private Integer drugsId;

    public CommonlyUsedDrugs(Integer commonlyUsedDrugs, Integer doctorId, Integer drugsId) {
        this.commonlyUsedDrugs = commonlyUsedDrugs;
        this.doctorId = doctorId;
        this.drugsId = drugsId;
    }

    public CommonlyUsedDrugs() {
        super();
    }

    public Integer getCommonlyUsedDrugs() {
        return commonlyUsedDrugs;
    }

    public void setCommonlyUsedDrugs(Integer commonlyUsedDrugs) {
        this.commonlyUsedDrugs = commonlyUsedDrugs;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getDrugsId() {
        return drugsId;
    }

    public void setDrugsId(Integer drugsId) {
        this.drugsId = drugsId;
    }
}