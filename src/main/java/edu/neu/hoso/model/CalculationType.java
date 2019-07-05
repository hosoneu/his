package edu.neu.hoso.model;

public class CalculationType {
    private Integer calculationTypeId;

    private String calculationTypeName;

    public CalculationType(Integer calculationTypeId, String calculationTypeName) {
        this.calculationTypeId = calculationTypeId;
        this.calculationTypeName = calculationTypeName;
    }

    public CalculationType() {
        super();
    }

    public Integer getCalculationTypeId() {
        return calculationTypeId;
    }

    public void setCalculationTypeId(Integer calculationTypeId) {
        this.calculationTypeId = calculationTypeId;
    }

    public String getCalculationTypeName() {
        return calculationTypeName;
    }

    public void setCalculationTypeName(String calculationTypeName) {
        this.calculationTypeName = calculationTypeName == null ? null : calculationTypeName.trim();
    }

}