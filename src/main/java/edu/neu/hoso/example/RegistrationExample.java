package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistrationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegistrationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRegistrationIdIsNull() {
            addCriterion("Registration_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdIsNotNull() {
            addCriterion("Registration_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdEqualTo(Integer value) {
            addCriterion("Registration_ID =", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdNotEqualTo(Integer value) {
            addCriterion("Registration_ID <>", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdGreaterThan(Integer value) {
            addCriterion("Registration_ID >", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Registration_ID >=", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdLessThan(Integer value) {
            addCriterion("Registration_ID <", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdLessThanOrEqualTo(Integer value) {
            addCriterion("Registration_ID <=", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdIn(List<Integer> values) {
            addCriterion("Registration_ID in", values, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdNotIn(List<Integer> values) {
            addCriterion("Registration_ID not in", values, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdBetween(Integer value1, Integer value2) {
            addCriterion("Registration_ID between", value1, value2, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Registration_ID not between", value1, value2, "registrationId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdIsNull() {
            addCriterion("Medical_Record_ID is null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdIsNotNull() {
            addCriterion("Medical_Record_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdEqualTo(Integer value) {
            addCriterion("Medical_Record_ID =", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdNotEqualTo(Integer value) {
            addCriterion("Medical_Record_ID <>", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdGreaterThan(Integer value) {
            addCriterion("Medical_Record_ID >", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Medical_Record_ID >=", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdLessThan(Integer value) {
            addCriterion("Medical_Record_ID <", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("Medical_Record_ID <=", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdIn(List<Integer> values) {
            addCriterion("Medical_Record_ID in", values, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdNotIn(List<Integer> values) {
            addCriterion("Medical_Record_ID not in", values, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("Medical_Record_ID between", value1, value2, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Medical_Record_ID not between", value1, value2, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdIsNull() {
            addCriterion("Registration_Level_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdIsNotNull() {
            addCriterion("Registration_Level_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdEqualTo(Integer value) {
            addCriterion("Registration_Level_ID =", value, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdNotEqualTo(Integer value) {
            addCriterion("Registration_Level_ID <>", value, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdGreaterThan(Integer value) {
            addCriterion("Registration_Level_ID >", value, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Registration_Level_ID >=", value, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdLessThan(Integer value) {
            addCriterion("Registration_Level_ID <", value, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("Registration_Level_ID <=", value, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdIn(List<Integer> values) {
            addCriterion("Registration_Level_ID in", values, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdNotIn(List<Integer> values) {
            addCriterion("Registration_Level_ID not in", values, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("Registration_Level_ID between", value1, value2, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Registration_Level_ID not between", value1, value2, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNull() {
            addCriterion("Patient_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("Patient_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(Integer value) {
            addCriterion("Patient_ID =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(Integer value) {
            addCriterion("Patient_ID <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(Integer value) {
            addCriterion("Patient_ID >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Patient_ID >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(Integer value) {
            addCriterion("Patient_ID <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(Integer value) {
            addCriterion("Patient_ID <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<Integer> values) {
            addCriterion("Patient_ID in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<Integer> values) {
            addCriterion("Patient_ID not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(Integer value1, Integer value2) {
            addCriterion("Patient_ID between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Patient_ID not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("Department_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("Department_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("Department_ID =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("Department_ID <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("Department_ID >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Department_ID >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("Department_ID <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("Department_ID <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("Department_ID in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("Department_ID not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("Department_ID between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Department_ID not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdIsNull() {
            addCriterion("Calculation_Type_ID is null");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdIsNotNull() {
            addCriterion("Calculation_Type_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdEqualTo(Integer value) {
            addCriterion("Calculation_Type_ID =", value, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdNotEqualTo(Integer value) {
            addCriterion("Calculation_Type_ID <>", value, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdGreaterThan(Integer value) {
            addCriterion("Calculation_Type_ID >", value, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Calculation_Type_ID >=", value, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdLessThan(Integer value) {
            addCriterion("Calculation_Type_ID <", value, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Calculation_Type_ID <=", value, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdIn(List<Integer> values) {
            addCriterion("Calculation_Type_ID in", values, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdNotIn(List<Integer> values) {
            addCriterion("Calculation_Type_ID not in", values, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("Calculation_Type_ID between", value1, value2, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Calculation_Type_ID not between", value1, value2, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("Doctor_ID is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("Doctor_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Integer value) {
            addCriterion("Doctor_ID =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Integer value) {
            addCriterion("Doctor_ID <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Integer value) {
            addCriterion("Doctor_ID >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Doctor_ID >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Integer value) {
            addCriterion("Doctor_ID <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("Doctor_ID <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Integer> values) {
            addCriterion("Doctor_ID in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Integer> values) {
            addCriterion("Doctor_ID not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("Doctor_ID between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Doctor_ID not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNull() {
            addCriterion("Registration_Date is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNotNull() {
            addCriterion("Registration_Date is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateEqualTo(Date value) {
            addCriterion("Registration_Date =", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotEqualTo(Date value) {
            addCriterion("Registration_Date <>", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThan(Date value) {
            addCriterion("Registration_Date >", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Registration_Date >=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThan(Date value) {
            addCriterion("Registration_Date <", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThanOrEqualTo(Date value) {
            addCriterion("Registration_Date <=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIn(List<Date> values) {
            addCriterion("Registration_Date in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotIn(List<Date> values) {
            addCriterion("Registration_Date not in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateBetween(Date value1, Date value2) {
            addCriterion("Registration_Date between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotBetween(Date value1, Date value2) {
            addCriterion("Registration_Date not between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andBuyMedicalRecordIsNull() {
            addCriterion("Buy_Medical_Record is null");
            return (Criteria) this;
        }

        public Criteria andBuyMedicalRecordIsNotNull() {
            addCriterion("Buy_Medical_Record is not null");
            return (Criteria) this;
        }

        public Criteria andBuyMedicalRecordEqualTo(String value) {
            addCriterion("Buy_Medical_Record =", value, "buyMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andBuyMedicalRecordNotEqualTo(String value) {
            addCriterion("Buy_Medical_Record <>", value, "buyMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andBuyMedicalRecordGreaterThan(String value) {
            addCriterion("Buy_Medical_Record >", value, "buyMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andBuyMedicalRecordGreaterThanOrEqualTo(String value) {
            addCriterion("Buy_Medical_Record >=", value, "buyMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andBuyMedicalRecordLessThan(String value) {
            addCriterion("Buy_Medical_Record <", value, "buyMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andBuyMedicalRecordLessThanOrEqualTo(String value) {
            addCriterion("Buy_Medical_Record <=", value, "buyMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andBuyMedicalRecordLike(String value) {
            addCriterion("Buy_Medical_Record like", value, "buyMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andBuyMedicalRecordNotLike(String value) {
            addCriterion("Buy_Medical_Record not like", value, "buyMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andBuyMedicalRecordIn(List<String> values) {
            addCriterion("Buy_Medical_Record in", values, "buyMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andBuyMedicalRecordNotIn(List<String> values) {
            addCriterion("Buy_Medical_Record not in", values, "buyMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andBuyMedicalRecordBetween(String value1, String value2) {
            addCriterion("Buy_Medical_Record between", value1, value2, "buyMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andBuyMedicalRecordNotBetween(String value1, String value2) {
            addCriterion("Buy_Medical_Record not between", value1, value2, "buyMedicalRecord");
            return (Criteria) this;
        }

        public Criteria andRegistrationTotalCostIsNull() {
            addCriterion("Registration_Total_Cost is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationTotalCostIsNotNull() {
            addCriterion("Registration_Total_Cost is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationTotalCostEqualTo(Double value) {
            addCriterion("Registration_Total_Cost =", value, "registrationTotalCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationTotalCostNotEqualTo(Double value) {
            addCriterion("Registration_Total_Cost <>", value, "registrationTotalCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationTotalCostGreaterThan(Double value) {
            addCriterion("Registration_Total_Cost >", value, "registrationTotalCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationTotalCostGreaterThanOrEqualTo(Double value) {
            addCriterion("Registration_Total_Cost >=", value, "registrationTotalCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationTotalCostLessThan(Double value) {
            addCriterion("Registration_Total_Cost <", value, "registrationTotalCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationTotalCostLessThanOrEqualTo(Double value) {
            addCriterion("Registration_Total_Cost <=", value, "registrationTotalCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationTotalCostIn(List<Double> values) {
            addCriterion("Registration_Total_Cost in", values, "registrationTotalCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationTotalCostNotIn(List<Double> values) {
            addCriterion("Registration_Total_Cost not in", values, "registrationTotalCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationTotalCostBetween(Double value1, Double value2) {
            addCriterion("Registration_Total_Cost between", value1, value2, "registrationTotalCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationTotalCostNotBetween(Double value1, Double value2) {
            addCriterion("Registration_Total_Cost not between", value1, value2, "registrationTotalCost");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdIsNull() {
            addCriterion("Expense_Type_ID is null");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdIsNotNull() {
            addCriterion("Expense_Type_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdEqualTo(Integer value) {
            addCriterion("Expense_Type_ID =", value, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdNotEqualTo(Integer value) {
            addCriterion("Expense_Type_ID <>", value, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdGreaterThan(Integer value) {
            addCriterion("Expense_Type_ID >", value, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Expense_Type_ID >=", value, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdLessThan(Integer value) {
            addCriterion("Expense_Type_ID <", value, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Expense_Type_ID <=", value, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdIn(List<Integer> values) {
            addCriterion("Expense_Type_ID in", values, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdNotIn(List<Integer> values) {
            addCriterion("Expense_Type_ID not in", values, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("Expense_Type_ID between", value1, value2, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Expense_Type_ID not between", value1, value2, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdIsNull() {
            addCriterion("Expense_Items_ID is null");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdIsNotNull() {
            addCriterion("Expense_Items_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdEqualTo(Integer value) {
            addCriterion("Expense_Items_ID =", value, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdNotEqualTo(Integer value) {
            addCriterion("Expense_Items_ID <>", value, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdGreaterThan(Integer value) {
            addCriterion("Expense_Items_ID >", value, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Expense_Items_ID >=", value, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdLessThan(Integer value) {
            addCriterion("Expense_Items_ID <", value, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Expense_Items_ID <=", value, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdIn(List<Integer> values) {
            addCriterion("Expense_Items_ID in", values, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdNotIn(List<Integer> values) {
            addCriterion("Expense_Items_ID not in", values, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("Expense_Items_ID between", value1, value2, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Expense_Items_ID not between", value1, value2, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusIsNull() {
            addCriterion("Registration_Status is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusIsNotNull() {
            addCriterion("Registration_Status is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusEqualTo(String value) {
            addCriterion("Registration_Status =", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusNotEqualTo(String value) {
            addCriterion("Registration_Status <>", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusGreaterThan(String value) {
            addCriterion("Registration_Status >", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Registration_Status >=", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusLessThan(String value) {
            addCriterion("Registration_Status <", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusLessThanOrEqualTo(String value) {
            addCriterion("Registration_Status <=", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusLike(String value) {
            addCriterion("Registration_Status like", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusNotLike(String value) {
            addCriterion("Registration_Status not like", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusIn(List<String> values) {
            addCriterion("Registration_Status in", values, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusNotIn(List<String> values) {
            addCriterion("Registration_Status not in", values, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusBetween(String value1, String value2) {
            addCriterion("Registration_Status between", value1, value2, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusNotBetween(String value1, String value2) {
            addCriterion("Registration_Status not between", value1, value2, "registrationStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}