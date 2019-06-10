package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class CommonlyUsedDiagnosisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonlyUsedDiagnosisExample() {
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

        public Criteria andCommonlyUsedDiagnosisIdIsNull() {
            addCriterion("Commonly_Used_Diagnosis_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedDiagnosisIdIsNotNull() {
            addCriterion("Commonly_Used_Diagnosis_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedDiagnosisIdEqualTo(Integer value) {
            addCriterion("Commonly_Used_Diagnosis_ID =", value, "commonlyUsedDiagnosisId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedDiagnosisIdNotEqualTo(Integer value) {
            addCriterion("Commonly_Used_Diagnosis_ID <>", value, "commonlyUsedDiagnosisId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedDiagnosisIdGreaterThan(Integer value) {
            addCriterion("Commonly_Used_Diagnosis_ID >", value, "commonlyUsedDiagnosisId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedDiagnosisIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Commonly_Used_Diagnosis_ID >=", value, "commonlyUsedDiagnosisId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedDiagnosisIdLessThan(Integer value) {
            addCriterion("Commonly_Used_Diagnosis_ID <", value, "commonlyUsedDiagnosisId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedDiagnosisIdLessThanOrEqualTo(Integer value) {
            addCriterion("Commonly_Used_Diagnosis_ID <=", value, "commonlyUsedDiagnosisId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedDiagnosisIdIn(List<Integer> values) {
            addCriterion("Commonly_Used_Diagnosis_ID in", values, "commonlyUsedDiagnosisId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedDiagnosisIdNotIn(List<Integer> values) {
            addCriterion("Commonly_Used_Diagnosis_ID not in", values, "commonlyUsedDiagnosisId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedDiagnosisIdBetween(Integer value1, Integer value2) {
            addCriterion("Commonly_Used_Diagnosis_ID between", value1, value2, "commonlyUsedDiagnosisId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedDiagnosisIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Commonly_Used_Diagnosis_ID not between", value1, value2, "commonlyUsedDiagnosisId");
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

        public Criteria andDiseaseIdIsNull() {
            addCriterion("Disease_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIsNotNull() {
            addCriterion("Disease_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdEqualTo(Integer value) {
            addCriterion("Disease_ID =", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotEqualTo(Integer value) {
            addCriterion("Disease_ID <>", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdGreaterThan(Integer value) {
            addCriterion("Disease_ID >", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Disease_ID >=", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdLessThan(Integer value) {
            addCriterion("Disease_ID <", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("Disease_ID <=", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIn(List<Integer> values) {
            addCriterion("Disease_ID in", values, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotIn(List<Integer> values) {
            addCriterion("Disease_ID not in", values, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdBetween(Integer value1, Integer value2) {
            addCriterion("Disease_ID between", value1, value2, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Disease_ID not between", value1, value2, "diseaseId");
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