package edu.neu.hoso.model;

public class CommonlyUsedDrugs {
    private Integer commonlyUsedDrugs;

    private Integer doctorId;

    private Integer drugsId;

    /* 对应的药品对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.14*/
    private Drugs drugs;

    public CommonlyUsedDrugs(Integer commonlyUsedDrugs, Integer doctorId, Integer drugsId) {
        this.commonlyUsedDrugs = commonlyUsedDrugs;
        this.doctorId = doctorId;
        this.drugsId = drugsId;
    }

    public CommonlyUsedDrugs(Integer commonlyUsedDrugs, Integer doctorId, Integer drugsId, Drugs drugs) {
        this.commonlyUsedDrugs = commonlyUsedDrugs;
        this.doctorId = doctorId;
        this.drugsId = drugsId;
        this.drugs = drugs;
    }

    public Drugs getDrugs() {
        return drugs;
    }

    public void setDrugs(Drugs drugs) {
        this.drugs = drugs;
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

    @Override
    public String toString() {
        return "CommonlyUsedDrugs{" +
                "commonlyUsedDrugs=" + commonlyUsedDrugs +
                ", doctorId=" + doctorId +
                ", drugsId=" + drugsId +
                ", drugs=" + drugs +
                '}';
    }
}