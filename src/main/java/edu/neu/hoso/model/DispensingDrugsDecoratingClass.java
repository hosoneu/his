package edu.neu.hoso.model;

import java.util.List;

public class DispensingDrugsDecoratingClass {
    private List<ExaminationDrugsItems> examinationDrugsItemsList;
    private int medicalRecordID;

    public DispensingDrugsDecoratingClass(List<ExaminationDrugsItems> examinationDrugsItemsList, int medicalRecordID) {
        this.examinationDrugsItemsList = examinationDrugsItemsList;
        medicalRecordID = medicalRecordID;
    }

    public List<ExaminationDrugsItems> getExaminationDrugsItemsList() {
        return examinationDrugsItemsList;
    }

    public void setExaminationDrugsItemsList(List<ExaminationDrugsItems> examinationDrugsItemsList) {
        this.examinationDrugsItemsList = examinationDrugsItemsList;
    }

    public int getMedicalRecordID() {
        return medicalRecordID;
    }

    public void setMedicalRecordID(int medicalRecordID) {
        this.medicalRecordID = medicalRecordID;
    }

    @Override
    public String toString() {
        return "DispensingDrugsDecoratingClass{" +
                "examinationDrugsItemsList=" + examinationDrugsItemsList +
                ", medicalRecordID=" + medicalRecordID +
                '}';
    }
}
