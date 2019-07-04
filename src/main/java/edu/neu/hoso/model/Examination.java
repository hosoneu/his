package edu.neu.hoso.model;

import java.util.Date;
import java.util.List;

public class Examination {
    private Integer examinationId;

    private Integer medicalRecordId;

    private Integer doctorId;

    private String examinationMark;

    private String doctorAdvice;

    private Date submitTime;

    /* 对应的检查检验非药品项目列表对象 重载了构造方法 新建了getter和setter 同时修改Mapper @29-y 2019.06.18*/
    private List<ExaminationFmedicalItems> examinationFmedicalItemsList;

    //我也不想加这个属性的
    private List<ExaminationDrugsItems> examinationDrugsItemsList;

    public Examination(Integer examinationId, Integer medicalRecordId, Integer doctorId, String examinationMark, String doctorAdvice, Date submitTime) {
        this.examinationId = examinationId;
        this.medicalRecordId = medicalRecordId;
        this.doctorId = doctorId;
        this.examinationMark = examinationMark;
        this.doctorAdvice = doctorAdvice;
        this.submitTime = submitTime;
    }

    public Examination(Integer examinationId, Integer medicalRecordId, Integer doctorId, String examinationMark, String doctorAdvice, Date submitTime, List<ExaminationFmedicalItems> examinationFmedicalItemsList) {
        this.examinationId = examinationId;
        this.medicalRecordId = medicalRecordId;
        this.doctorId = doctorId;
        this.examinationMark = examinationMark;
        this.doctorAdvice = doctorAdvice;
        this.submitTime = submitTime;
        this.examinationFmedicalItemsList = examinationFmedicalItemsList;
    }

    public List<ExaminationFmedicalItems> getExaminationFmedicalItemsList() {
        return examinationFmedicalItemsList;
    }

    public void setExaminationFmedicalItemsList(List<ExaminationFmedicalItems> examinationFmedicalItemsList) {
        this.examinationFmedicalItemsList = examinationFmedicalItemsList;
    }

    public Examination() {
        super();
    }

    public List<ExaminationDrugsItems> getExaminationDrugsItemsList() {
        return examinationDrugsItemsList;
    }

    public void setExaminationDrugsItemsList(List<ExaminationDrugsItems> examinationDrugsItemsList) {
        this.examinationDrugsItemsList = examinationDrugsItemsList;
    }

    public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
    }

    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getExaminationMark() {
        return examinationMark;
    }

    public void setExaminationMark(String examinationMark) {
        this.examinationMark = examinationMark == null ? null : examinationMark.trim();
    }

    public String getDoctorAdvice() {
        return doctorAdvice;
    }

    public void setDoctorAdvice(String doctorAdvice) {
        this.doctorAdvice = doctorAdvice == null ? null : doctorAdvice.trim();
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    @Override
    public String toString() {
        return "Examination{" +
                "examinationId=" + examinationId +
                ", medicalRecordId=" + medicalRecordId +
                ", doctorId=" + doctorId +
                ", examinationMark='" + examinationMark + '\'' +
                ", doctorAdvice='" + doctorAdvice + '\'' +
                ", submitTime=" + submitTime +
                ", examinationFmedicalItemsList=" + examinationFmedicalItemsList +
                ", examinationDrugsItemsList=" + examinationDrugsItemsList +
                '}';
    }
}