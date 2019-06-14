package edu.neu.hoso.model;

public class RegistrationLevel {
    private Integer registrationLevelId;

    private String registrationLevelName;

    private String isDefault;

    private Integer registrationSequence;

    private Double registrationCost;

    public RegistrationLevel(Integer registrationLevelId, String registrationLevelName, String isDefault, Integer registrationSequence, Double registrationCost) {
        this.registrationLevelId = registrationLevelId;
        this.registrationLevelName = registrationLevelName;
        this.isDefault = isDefault;
        this.registrationSequence = registrationSequence;
        this.registrationCost = registrationCost;
    }

    public RegistrationLevel() {
        super();
    }

    public Integer getRegistrationLevelId() {
        return registrationLevelId;
    }

    public void setRegistrationLevelId(Integer registrationLevelId) {
        this.registrationLevelId = registrationLevelId;
    }

    public String getRegistrationLevelName() {
        return registrationLevelName;
    }

    public void setRegistrationLevelName(String registrationLevelName) {
        this.registrationLevelName = registrationLevelName == null ? null : registrationLevelName.trim();
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    public Integer getRegistrationSequence() {
        return registrationSequence;
    }

    public void setRegistrationSequence(Integer registrationSequence) {
        this.registrationSequence = registrationSequence;
    }

    public Double getRegistrationCost() {
        return registrationCost;
    }

    public void setRegistrationCost(Double registrationCost) {
        this.registrationCost = registrationCost;
    }
}