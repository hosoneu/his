package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class ExaminationFmedicalItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminationFmedicalItemsExample() {
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

        public Criteria andExaminationIdIsNull() {
            addCriterion("Examination_ID is null");
            return (Criteria) this;
        }

        public Criteria andExaminationIdIsNotNull() {
            addCriterion("Examination_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationIdEqualTo(Integer value) {
            addCriterion("Examination_ID =", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdNotEqualTo(Integer value) {
            addCriterion("Examination_ID <>", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdGreaterThan(Integer value) {
            addCriterion("Examination_ID >", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Examination_ID >=", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdLessThan(Integer value) {
            addCriterion("Examination_ID <", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdLessThanOrEqualTo(Integer value) {
            addCriterion("Examination_ID <=", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdIn(List<Integer> values) {
            addCriterion("Examination_ID in", values, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdNotIn(List<Integer> values) {
            addCriterion("Examination_ID not in", values, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdBetween(Integer value1, Integer value2) {
            addCriterion("Examination_ID between", value1, value2, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Examination_ID not between", value1, value2, "examinationId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdIsNull() {
            addCriterion("Fmedical_Items_ID is null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdIsNotNull() {
            addCriterion("Fmedical_Items_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdEqualTo(Integer value) {
            addCriterion("Fmedical_Items_ID =", value, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdNotEqualTo(Integer value) {
            addCriterion("Fmedical_Items_ID <>", value, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdGreaterThan(Integer value) {
            addCriterion("Fmedical_Items_ID >", value, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fmedical_Items_ID >=", value, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdLessThan(Integer value) {
            addCriterion("Fmedical_Items_ID <", value, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Fmedical_Items_ID <=", value, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdIn(List<Integer> values) {
            addCriterion("Fmedical_Items_ID in", values, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdNotIn(List<Integer> values) {
            addCriterion("Fmedical_Items_ID not in", values, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("Fmedical_Items_ID between", value1, value2, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Fmedical_Items_ID not between", value1, value2, "fmedicalItemsId");
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

        public Criteria andPurposeRequirementsIsNull() {
            addCriterion("Purpose_Requirements is null");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsIsNotNull() {
            addCriterion("Purpose_Requirements is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsEqualTo(String value) {
            addCriterion("Purpose_Requirements =", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsNotEqualTo(String value) {
            addCriterion("Purpose_Requirements <>", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsGreaterThan(String value) {
            addCriterion("Purpose_Requirements >", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsGreaterThanOrEqualTo(String value) {
            addCriterion("Purpose_Requirements >=", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsLessThan(String value) {
            addCriterion("Purpose_Requirements <", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsLessThanOrEqualTo(String value) {
            addCriterion("Purpose_Requirements <=", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsLike(String value) {
            addCriterion("Purpose_Requirements like", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsNotLike(String value) {
            addCriterion("Purpose_Requirements not like", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsIn(List<String> values) {
            addCriterion("Purpose_Requirements in", values, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsNotIn(List<String> values) {
            addCriterion("Purpose_Requirements not in", values, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsBetween(String value1, String value2) {
            addCriterion("Purpose_Requirements between", value1, value2, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsNotBetween(String value1, String value2) {
            addCriterion("Purpose_Requirements not between", value1, value2, "purposeRequirements");
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

        public Criteria andExaminationResultIdIsNull() {
            addCriterion("Examination_Result_ID is null");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdIsNotNull() {
            addCriterion("Examination_Result_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdEqualTo(Integer value) {
            addCriterion("Examination_Result_ID =", value, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdNotEqualTo(Integer value) {
            addCriterion("Examination_Result_ID <>", value, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdGreaterThan(Integer value) {
            addCriterion("Examination_Result_ID >", value, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Examination_Result_ID >=", value, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdLessThan(Integer value) {
            addCriterion("Examination_Result_ID <", value, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdLessThanOrEqualTo(Integer value) {
            addCriterion("Examination_Result_ID <=", value, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdIn(List<Integer> values) {
            addCriterion("Examination_Result_ID in", values, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdNotIn(List<Integer> values) {
            addCriterion("Examination_Result_ID not in", values, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdBetween(Integer value1, Integer value2) {
            addCriterion("Examination_Result_ID between", value1, value2, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Examination_Result_ID not between", value1, value2, "examinationResultId");
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

        public Criteria andValidStatusIsNull() {
            addCriterion("Valid_Status is null");
            return (Criteria) this;
        }

        public Criteria andValidStatusIsNotNull() {
            addCriterion("Valid_Status is not null");
            return (Criteria) this;
        }

        public Criteria andValidStatusEqualTo(String value) {
            addCriterion("Valid_Status =", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotEqualTo(String value) {
            addCriterion("Valid_Status <>", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusGreaterThan(String value) {
            addCriterion("Valid_Status >", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Valid_Status >=", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusLessThan(String value) {
            addCriterion("Valid_Status <", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusLessThanOrEqualTo(String value) {
            addCriterion("Valid_Status <=", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusLike(String value) {
            addCriterion("Valid_Status like", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotLike(String value) {
            addCriterion("Valid_Status not like", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusIn(List<String> values) {
            addCriterion("Valid_Status in", values, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotIn(List<String> values) {
            addCriterion("Valid_Status not in", values, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusBetween(String value1, String value2) {
            addCriterion("Valid_Status between", value1, value2, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotBetween(String value1, String value2) {
            addCriterion("Valid_Status not between", value1, value2, "validStatus");
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