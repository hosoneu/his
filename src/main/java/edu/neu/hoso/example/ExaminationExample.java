package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExaminationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminationExample() {
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

        public Criteria andExaminationMarkIsNull() {
            addCriterion("Examination_Mark is null");
            return (Criteria) this;
        }

        public Criteria andExaminationMarkIsNotNull() {
            addCriterion("Examination_Mark is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationMarkEqualTo(String value) {
            addCriterion("Examination_Mark =", value, "examinationMark");
            return (Criteria) this;
        }

        public Criteria andExaminationMarkNotEqualTo(String value) {
            addCriterion("Examination_Mark <>", value, "examinationMark");
            return (Criteria) this;
        }

        public Criteria andExaminationMarkGreaterThan(String value) {
            addCriterion("Examination_Mark >", value, "examinationMark");
            return (Criteria) this;
        }

        public Criteria andExaminationMarkGreaterThanOrEqualTo(String value) {
            addCriterion("Examination_Mark >=", value, "examinationMark");
            return (Criteria) this;
        }

        public Criteria andExaminationMarkLessThan(String value) {
            addCriterion("Examination_Mark <", value, "examinationMark");
            return (Criteria) this;
        }

        public Criteria andExaminationMarkLessThanOrEqualTo(String value) {
            addCriterion("Examination_Mark <=", value, "examinationMark");
            return (Criteria) this;
        }

        public Criteria andExaminationMarkLike(String value) {
            addCriterion("Examination_Mark like", value, "examinationMark");
            return (Criteria) this;
        }

        public Criteria andExaminationMarkNotLike(String value) {
            addCriterion("Examination_Mark not like", value, "examinationMark");
            return (Criteria) this;
        }

        public Criteria andExaminationMarkIn(List<String> values) {
            addCriterion("Examination_Mark in", values, "examinationMark");
            return (Criteria) this;
        }

        public Criteria andExaminationMarkNotIn(List<String> values) {
            addCriterion("Examination_Mark not in", values, "examinationMark");
            return (Criteria) this;
        }

        public Criteria andExaminationMarkBetween(String value1, String value2) {
            addCriterion("Examination_Mark between", value1, value2, "examinationMark");
            return (Criteria) this;
        }

        public Criteria andExaminationMarkNotBetween(String value1, String value2) {
            addCriterion("Examination_Mark not between", value1, value2, "examinationMark");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceIsNull() {
            addCriterion("Doctor_Advice is null");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceIsNotNull() {
            addCriterion("Doctor_Advice is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceEqualTo(String value) {
            addCriterion("Doctor_Advice =", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotEqualTo(String value) {
            addCriterion("Doctor_Advice <>", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceGreaterThan(String value) {
            addCriterion("Doctor_Advice >", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("Doctor_Advice >=", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceLessThan(String value) {
            addCriterion("Doctor_Advice <", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceLessThanOrEqualTo(String value) {
            addCriterion("Doctor_Advice <=", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceLike(String value) {
            addCriterion("Doctor_Advice like", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotLike(String value) {
            addCriterion("Doctor_Advice not like", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceIn(List<String> values) {
            addCriterion("Doctor_Advice in", values, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotIn(List<String> values) {
            addCriterion("Doctor_Advice not in", values, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceBetween(String value1, String value2) {
            addCriterion("Doctor_Advice between", value1, value2, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotBetween(String value1, String value2) {
            addCriterion("Doctor_Advice not between", value1, value2, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("Submit_Time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("Submit_Time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("Submit_Time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("Submit_Time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("Submit_Time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Submit_Time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("Submit_Time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("Submit_Time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("Submit_Time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("Submit_Time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("Submit_Time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("Submit_Time not between", value1, value2, "submitTime");
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