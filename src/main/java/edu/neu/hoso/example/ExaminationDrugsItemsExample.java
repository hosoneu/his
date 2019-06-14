package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class ExaminationDrugsItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminationDrugsItemsExample() {
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

        public Criteria andExaminationDrugsItemsIdIsNull() {
            addCriterion("Examination_Drugs_Items_ID is null");
            return (Criteria) this;
        }

        public Criteria andExaminationDrugsItemsIdIsNotNull() {
            addCriterion("Examination_Drugs_Items_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationDrugsItemsIdEqualTo(Integer value) {
            addCriterion("Examination_Drugs_Items_ID =", value, "examinationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationDrugsItemsIdNotEqualTo(Integer value) {
            addCriterion("Examination_Drugs_Items_ID <>", value, "examinationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationDrugsItemsIdGreaterThan(Integer value) {
            addCriterion("Examination_Drugs_Items_ID >", value, "examinationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationDrugsItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Examination_Drugs_Items_ID >=", value, "examinationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationDrugsItemsIdLessThan(Integer value) {
            addCriterion("Examination_Drugs_Items_ID <", value, "examinationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationDrugsItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Examination_Drugs_Items_ID <=", value, "examinationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationDrugsItemsIdIn(List<Integer> values) {
            addCriterion("Examination_Drugs_Items_ID in", values, "examinationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationDrugsItemsIdNotIn(List<Integer> values) {
            addCriterion("Examination_Drugs_Items_ID not in", values, "examinationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationDrugsItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("Examination_Drugs_Items_ID between", value1, value2, "examinationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationDrugsItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Examination_Drugs_Items_ID not between", value1, value2, "examinationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationFmedicalItemsIdIsNull() {
            addCriterion("Examination_Fmedical_Items_ID is null");
            return (Criteria) this;
        }

        public Criteria andExaminationFmedicalItemsIdIsNotNull() {
            addCriterion("Examination_Fmedical_Items_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationFmedicalItemsIdEqualTo(Integer value) {
            addCriterion("Examination_Fmedical_Items_ID =", value, "examinationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationFmedicalItemsIdNotEqualTo(Integer value) {
            addCriterion("Examination_Fmedical_Items_ID <>", value, "examinationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationFmedicalItemsIdGreaterThan(Integer value) {
            addCriterion("Examination_Fmedical_Items_ID >", value, "examinationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationFmedicalItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Examination_Fmedical_Items_ID >=", value, "examinationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationFmedicalItemsIdLessThan(Integer value) {
            addCriterion("Examination_Fmedical_Items_ID <", value, "examinationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationFmedicalItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Examination_Fmedical_Items_ID <=", value, "examinationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationFmedicalItemsIdIn(List<Integer> values) {
            addCriterion("Examination_Fmedical_Items_ID in", values, "examinationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationFmedicalItemsIdNotIn(List<Integer> values) {
            addCriterion("Examination_Fmedical_Items_ID not in", values, "examinationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationFmedicalItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("Examination_Fmedical_Items_ID between", value1, value2, "examinationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andExaminationFmedicalItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Examination_Fmedical_Items_ID not between", value1, value2, "examinationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdIsNull() {
            addCriterion("Drugs_ID is null");
            return (Criteria) this;
        }

        public Criteria andDrugsIdIsNotNull() {
            addCriterion("Drugs_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsIdEqualTo(Integer value) {
            addCriterion("Drugs_ID =", value, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdNotEqualTo(Integer value) {
            addCriterion("Drugs_ID <>", value, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdGreaterThan(Integer value) {
            addCriterion("Drugs_ID >", value, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Drugs_ID >=", value, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdLessThan(Integer value) {
            addCriterion("Drugs_ID <", value, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Drugs_ID <=", value, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdIn(List<Integer> values) {
            addCriterion("Drugs_ID in", values, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdNotIn(List<Integer> values) {
            addCriterion("Drugs_ID not in", values, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdBetween(Integer value1, Integer value2) {
            addCriterion("Drugs_ID between", value1, value2, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Drugs_ID not between", value1, value2, "drugsId");
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

        public Criteria andDrugsUsageIsNull() {
            addCriterion("Drugs_Usage is null");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageIsNotNull() {
            addCriterion("Drugs_Usage is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageEqualTo(String value) {
            addCriterion("Drugs_Usage =", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageNotEqualTo(String value) {
            addCriterion("Drugs_Usage <>", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageGreaterThan(String value) {
            addCriterion("Drugs_Usage >", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageGreaterThanOrEqualTo(String value) {
            addCriterion("Drugs_Usage >=", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageLessThan(String value) {
            addCriterion("Drugs_Usage <", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageLessThanOrEqualTo(String value) {
            addCriterion("Drugs_Usage <=", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageLike(String value) {
            addCriterion("Drugs_Usage like", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageNotLike(String value) {
            addCriterion("Drugs_Usage not like", value, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageIn(List<String> values) {
            addCriterion("Drugs_Usage in", values, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageNotIn(List<String> values) {
            addCriterion("Drugs_Usage not in", values, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageBetween(String value1, String value2) {
            addCriterion("Drugs_Usage between", value1, value2, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andDrugsUsageNotBetween(String value1, String value2) {
            addCriterion("Drugs_Usage not between", value1, value2, "drugsUsage");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("Quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("Quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("Quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("Quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("Quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("Quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("Quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("Quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("Quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("Quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityIsNull() {
            addCriterion("Actual_Quantity is null");
            return (Criteria) this;
        }

        public Criteria andActualQuantityIsNotNull() {
            addCriterion("Actual_Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andActualQuantityEqualTo(Integer value) {
            addCriterion("Actual_Quantity =", value, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityNotEqualTo(Integer value) {
            addCriterion("Actual_Quantity <>", value, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityGreaterThan(Integer value) {
            addCriterion("Actual_Quantity >", value, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Actual_Quantity >=", value, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityLessThan(Integer value) {
            addCriterion("Actual_Quantity <", value, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("Actual_Quantity <=", value, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityIn(List<Integer> values) {
            addCriterion("Actual_Quantity in", values, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityNotIn(List<Integer> values) {
            addCriterion("Actual_Quantity not in", values, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityBetween(Integer value1, Integer value2) {
            addCriterion("Actual_Quantity between", value1, value2, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("Actual_Quantity not between", value1, value2, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andDrugsDispensingStatusIsNull() {
            addCriterion("Drugs_Dispensing_Status is null");
            return (Criteria) this;
        }

        public Criteria andDrugsDispensingStatusIsNotNull() {
            addCriterion("Drugs_Dispensing_Status is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsDispensingStatusEqualTo(String value) {
            addCriterion("Drugs_Dispensing_Status =", value, "drugsDispensingStatus");
            return (Criteria) this;
        }

        public Criteria andDrugsDispensingStatusNotEqualTo(String value) {
            addCriterion("Drugs_Dispensing_Status <>", value, "drugsDispensingStatus");
            return (Criteria) this;
        }

        public Criteria andDrugsDispensingStatusGreaterThan(String value) {
            addCriterion("Drugs_Dispensing_Status >", value, "drugsDispensingStatus");
            return (Criteria) this;
        }

        public Criteria andDrugsDispensingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Drugs_Dispensing_Status >=", value, "drugsDispensingStatus");
            return (Criteria) this;
        }

        public Criteria andDrugsDispensingStatusLessThan(String value) {
            addCriterion("Drugs_Dispensing_Status <", value, "drugsDispensingStatus");
            return (Criteria) this;
        }

        public Criteria andDrugsDispensingStatusLessThanOrEqualTo(String value) {
            addCriterion("Drugs_Dispensing_Status <=", value, "drugsDispensingStatus");
            return (Criteria) this;
        }

        public Criteria andDrugsDispensingStatusLike(String value) {
            addCriterion("Drugs_Dispensing_Status like", value, "drugsDispensingStatus");
            return (Criteria) this;
        }

        public Criteria andDrugsDispensingStatusNotLike(String value) {
            addCriterion("Drugs_Dispensing_Status not like", value, "drugsDispensingStatus");
            return (Criteria) this;
        }

        public Criteria andDrugsDispensingStatusIn(List<String> values) {
            addCriterion("Drugs_Dispensing_Status in", values, "drugsDispensingStatus");
            return (Criteria) this;
        }

        public Criteria andDrugsDispensingStatusNotIn(List<String> values) {
            addCriterion("Drugs_Dispensing_Status not in", values, "drugsDispensingStatus");
            return (Criteria) this;
        }

        public Criteria andDrugsDispensingStatusBetween(String value1, String value2) {
            addCriterion("Drugs_Dispensing_Status between", value1, value2, "drugsDispensingStatus");
            return (Criteria) this;
        }

        public Criteria andDrugsDispensingStatusNotBetween(String value1, String value2) {
            addCriterion("Drugs_Dispensing_Status not between", value1, value2, "drugsDispensingStatus");
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

        public Criteria andTimesIsNull() {
            addCriterion("Times is null");
            return (Criteria) this;
        }

        public Criteria andTimesIsNotNull() {
            addCriterion("Times is not null");
            return (Criteria) this;
        }

        public Criteria andTimesEqualTo(Integer value) {
            addCriterion("Times =", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotEqualTo(Integer value) {
            addCriterion("Times <>", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThan(Integer value) {
            addCriterion("Times >", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("Times >=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThan(Integer value) {
            addCriterion("Times <", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThanOrEqualTo(Integer value) {
            addCriterion("Times <=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesIn(List<Integer> values) {
            addCriterion("Times in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotIn(List<Integer> values) {
            addCriterion("Times not in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesBetween(Integer value1, Integer value2) {
            addCriterion("Times between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("Times not between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("Days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("Days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Integer value) {
            addCriterion("Days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Integer value) {
            addCriterion("Days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Integer value) {
            addCriterion("Days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("Days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Integer value) {
            addCriterion("Days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Integer value) {
            addCriterion("Days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Integer> values) {
            addCriterion("Days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Integer> values) {
            addCriterion("Days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Integer value1, Integer value2) {
            addCriterion("Days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("Days not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDosageIsNull() {
            addCriterion("Dosage is null");
            return (Criteria) this;
        }

        public Criteria andDosageIsNotNull() {
            addCriterion("Dosage is not null");
            return (Criteria) this;
        }

        public Criteria andDosageEqualTo(Double value) {
            addCriterion("Dosage =", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotEqualTo(Double value) {
            addCriterion("Dosage <>", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThan(Double value) {
            addCriterion("Dosage >", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThanOrEqualTo(Double value) {
            addCriterion("Dosage >=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThan(Double value) {
            addCriterion("Dosage <", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThanOrEqualTo(Double value) {
            addCriterion("Dosage <=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageIn(List<Double> values) {
            addCriterion("Dosage in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotIn(List<Double> values) {
            addCriterion("Dosage not in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageBetween(Double value1, Double value2) {
            addCriterion("Dosage between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotBetween(Double value1, Double value2) {
            addCriterion("Dosage not between", value1, value2, "dosage");
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