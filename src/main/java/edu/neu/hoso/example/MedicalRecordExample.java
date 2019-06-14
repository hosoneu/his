package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicalRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicalRecordExample() {
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

        public Criteria andIsTreamentOverIsNull() {
            addCriterion("Is_Treament_Over is null");
            return (Criteria) this;
        }

        public Criteria andIsTreamentOverIsNotNull() {
            addCriterion("Is_Treament_Over is not null");
            return (Criteria) this;
        }

        public Criteria andIsTreamentOverEqualTo(String value) {
            addCriterion("Is_Treament_Over =", value, "isTreamentOver");
            return (Criteria) this;
        }

        public Criteria andIsTreamentOverNotEqualTo(String value) {
            addCriterion("Is_Treament_Over <>", value, "isTreamentOver");
            return (Criteria) this;
        }

        public Criteria andIsTreamentOverGreaterThan(String value) {
            addCriterion("Is_Treament_Over >", value, "isTreamentOver");
            return (Criteria) this;
        }

        public Criteria andIsTreamentOverGreaterThanOrEqualTo(String value) {
            addCriterion("Is_Treament_Over >=", value, "isTreamentOver");
            return (Criteria) this;
        }

        public Criteria andIsTreamentOverLessThan(String value) {
            addCriterion("Is_Treament_Over <", value, "isTreamentOver");
            return (Criteria) this;
        }

        public Criteria andIsTreamentOverLessThanOrEqualTo(String value) {
            addCriterion("Is_Treament_Over <=", value, "isTreamentOver");
            return (Criteria) this;
        }

        public Criteria andIsTreamentOverLike(String value) {
            addCriterion("Is_Treament_Over like", value, "isTreamentOver");
            return (Criteria) this;
        }

        public Criteria andIsTreamentOverNotLike(String value) {
            addCriterion("Is_Treament_Over not like", value, "isTreamentOver");
            return (Criteria) this;
        }

        public Criteria andIsTreamentOverIn(List<String> values) {
            addCriterion("Is_Treament_Over in", values, "isTreamentOver");
            return (Criteria) this;
        }

        public Criteria andIsTreamentOverNotIn(List<String> values) {
            addCriterion("Is_Treament_Over not in", values, "isTreamentOver");
            return (Criteria) this;
        }

        public Criteria andIsTreamentOverBetween(String value1, String value2) {
            addCriterion("Is_Treament_Over between", value1, value2, "isTreamentOver");
            return (Criteria) this;
        }

        public Criteria andIsTreamentOverNotBetween(String value1, String value2) {
            addCriterion("Is_Treament_Over not between", value1, value2, "isTreamentOver");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisDoctorIdIsNull() {
            addCriterion("First_Diagnosis_Doctor_ID is null");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisDoctorIdIsNotNull() {
            addCriterion("First_Diagnosis_Doctor_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisDoctorIdEqualTo(Integer value) {
            addCriterion("First_Diagnosis_Doctor_ID =", value, "firstDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisDoctorIdNotEqualTo(Integer value) {
            addCriterion("First_Diagnosis_Doctor_ID <>", value, "firstDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisDoctorIdGreaterThan(Integer value) {
            addCriterion("First_Diagnosis_Doctor_ID >", value, "firstDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("First_Diagnosis_Doctor_ID >=", value, "firstDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisDoctorIdLessThan(Integer value) {
            addCriterion("First_Diagnosis_Doctor_ID <", value, "firstDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("First_Diagnosis_Doctor_ID <=", value, "firstDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisDoctorIdIn(List<Integer> values) {
            addCriterion("First_Diagnosis_Doctor_ID in", values, "firstDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisDoctorIdNotIn(List<Integer> values) {
            addCriterion("First_Diagnosis_Doctor_ID not in", values, "firstDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("First_Diagnosis_Doctor_ID between", value1, value2, "firstDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("First_Diagnosis_Doctor_ID not between", value1, value2, "firstDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisDoctorIdIsNull() {
            addCriterion("Final_Diagnosis_Doctor_ID is null");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisDoctorIdIsNotNull() {
            addCriterion("Final_Diagnosis_Doctor_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisDoctorIdEqualTo(Integer value) {
            addCriterion("Final_Diagnosis_Doctor_ID =", value, "finalDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisDoctorIdNotEqualTo(Integer value) {
            addCriterion("Final_Diagnosis_Doctor_ID <>", value, "finalDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisDoctorIdGreaterThan(Integer value) {
            addCriterion("Final_Diagnosis_Doctor_ID >", value, "finalDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Final_Diagnosis_Doctor_ID >=", value, "finalDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisDoctorIdLessThan(Integer value) {
            addCriterion("Final_Diagnosis_Doctor_ID <", value, "finalDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("Final_Diagnosis_Doctor_ID <=", value, "finalDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisDoctorIdIn(List<Integer> values) {
            addCriterion("Final_Diagnosis_Doctor_ID in", values, "finalDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisDoctorIdNotIn(List<Integer> values) {
            addCriterion("Final_Diagnosis_Doctor_ID not in", values, "finalDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("Final_Diagnosis_Doctor_ID between", value1, value2, "finalDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Final_Diagnosis_Doctor_ID not between", value1, value2, "finalDiagnosisDoctorId");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisTimeIsNull() {
            addCriterion("First_Diagnosis_Time is null");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisTimeIsNotNull() {
            addCriterion("First_Diagnosis_Time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisTimeEqualTo(Date value) {
            addCriterion("First_Diagnosis_Time =", value, "firstDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisTimeNotEqualTo(Date value) {
            addCriterion("First_Diagnosis_Time <>", value, "firstDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisTimeGreaterThan(Date value) {
            addCriterion("First_Diagnosis_Time >", value, "firstDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("First_Diagnosis_Time >=", value, "firstDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisTimeLessThan(Date value) {
            addCriterion("First_Diagnosis_Time <", value, "firstDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisTimeLessThanOrEqualTo(Date value) {
            addCriterion("First_Diagnosis_Time <=", value, "firstDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisTimeIn(List<Date> values) {
            addCriterion("First_Diagnosis_Time in", values, "firstDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisTimeNotIn(List<Date> values) {
            addCriterion("First_Diagnosis_Time not in", values, "firstDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisTimeBetween(Date value1, Date value2) {
            addCriterion("First_Diagnosis_Time between", value1, value2, "firstDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFirstDiagnosisTimeNotBetween(Date value1, Date value2) {
            addCriterion("First_Diagnosis_Time not between", value1, value2, "firstDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisTimeIsNull() {
            addCriterion("Final_Diagnosis_Time is null");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisTimeIsNotNull() {
            addCriterion("Final_Diagnosis_Time is not null");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisTimeEqualTo(Date value) {
            addCriterion("Final_Diagnosis_Time =", value, "finalDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisTimeNotEqualTo(Date value) {
            addCriterion("Final_Diagnosis_Time <>", value, "finalDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisTimeGreaterThan(Date value) {
            addCriterion("Final_Diagnosis_Time >", value, "finalDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Final_Diagnosis_Time >=", value, "finalDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisTimeLessThan(Date value) {
            addCriterion("Final_Diagnosis_Time <", value, "finalDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisTimeLessThanOrEqualTo(Date value) {
            addCriterion("Final_Diagnosis_Time <=", value, "finalDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisTimeIn(List<Date> values) {
            addCriterion("Final_Diagnosis_Time in", values, "finalDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisTimeNotIn(List<Date> values) {
            addCriterion("Final_Diagnosis_Time not in", values, "finalDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisTimeBetween(Date value1, Date value2) {
            addCriterion("Final_Diagnosis_Time between", value1, value2, "finalDiagnosisTime");
            return (Criteria) this;
        }

        public Criteria andFinalDiagnosisTimeNotBetween(Date value1, Date value2) {
            addCriterion("Final_Diagnosis_Time not between", value1, value2, "finalDiagnosisTime");
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