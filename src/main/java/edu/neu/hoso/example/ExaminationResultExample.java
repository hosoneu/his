package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExaminationResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminationResultExample() {
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

        public Criteria andFindingsIsNull() {
            addCriterion("Findings is null");
            return (Criteria) this;
        }

        public Criteria andFindingsIsNotNull() {
            addCriterion("Findings is not null");
            return (Criteria) this;
        }

        public Criteria andFindingsEqualTo(String value) {
            addCriterion("Findings =", value, "findings");
            return (Criteria) this;
        }

        public Criteria andFindingsNotEqualTo(String value) {
            addCriterion("Findings <>", value, "findings");
            return (Criteria) this;
        }

        public Criteria andFindingsGreaterThan(String value) {
            addCriterion("Findings >", value, "findings");
            return (Criteria) this;
        }

        public Criteria andFindingsGreaterThanOrEqualTo(String value) {
            addCriterion("Findings >=", value, "findings");
            return (Criteria) this;
        }

        public Criteria andFindingsLessThan(String value) {
            addCriterion("Findings <", value, "findings");
            return (Criteria) this;
        }

        public Criteria andFindingsLessThanOrEqualTo(String value) {
            addCriterion("Findings <=", value, "findings");
            return (Criteria) this;
        }

        public Criteria andFindingsLike(String value) {
            addCriterion("Findings like", value, "findings");
            return (Criteria) this;
        }

        public Criteria andFindingsNotLike(String value) {
            addCriterion("Findings not like", value, "findings");
            return (Criteria) this;
        }

        public Criteria andFindingsIn(List<String> values) {
            addCriterion("Findings in", values, "findings");
            return (Criteria) this;
        }

        public Criteria andFindingsNotIn(List<String> values) {
            addCriterion("Findings not in", values, "findings");
            return (Criteria) this;
        }

        public Criteria andFindingsBetween(String value1, String value2) {
            addCriterion("Findings between", value1, value2, "findings");
            return (Criteria) this;
        }

        public Criteria andFindingsNotBetween(String value1, String value2) {
            addCriterion("Findings not between", value1, value2, "findings");
            return (Criteria) this;
        }

        public Criteria andDiagnosticSuggestionIsNull() {
            addCriterion("Diagnostic_Suggestion is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosticSuggestionIsNotNull() {
            addCriterion("Diagnostic_Suggestion is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosticSuggestionEqualTo(String value) {
            addCriterion("Diagnostic_Suggestion =", value, "diagnosticSuggestion");
            return (Criteria) this;
        }

        public Criteria andDiagnosticSuggestionNotEqualTo(String value) {
            addCriterion("Diagnostic_Suggestion <>", value, "diagnosticSuggestion");
            return (Criteria) this;
        }

        public Criteria andDiagnosticSuggestionGreaterThan(String value) {
            addCriterion("Diagnostic_Suggestion >", value, "diagnosticSuggestion");
            return (Criteria) this;
        }

        public Criteria andDiagnosticSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("Diagnostic_Suggestion >=", value, "diagnosticSuggestion");
            return (Criteria) this;
        }

        public Criteria andDiagnosticSuggestionLessThan(String value) {
            addCriterion("Diagnostic_Suggestion <", value, "diagnosticSuggestion");
            return (Criteria) this;
        }

        public Criteria andDiagnosticSuggestionLessThanOrEqualTo(String value) {
            addCriterion("Diagnostic_Suggestion <=", value, "diagnosticSuggestion");
            return (Criteria) this;
        }

        public Criteria andDiagnosticSuggestionLike(String value) {
            addCriterion("Diagnostic_Suggestion like", value, "diagnosticSuggestion");
            return (Criteria) this;
        }

        public Criteria andDiagnosticSuggestionNotLike(String value) {
            addCriterion("Diagnostic_Suggestion not like", value, "diagnosticSuggestion");
            return (Criteria) this;
        }

        public Criteria andDiagnosticSuggestionIn(List<String> values) {
            addCriterion("Diagnostic_Suggestion in", values, "diagnosticSuggestion");
            return (Criteria) this;
        }

        public Criteria andDiagnosticSuggestionNotIn(List<String> values) {
            addCriterion("Diagnostic_Suggestion not in", values, "diagnosticSuggestion");
            return (Criteria) this;
        }

        public Criteria andDiagnosticSuggestionBetween(String value1, String value2) {
            addCriterion("Diagnostic_Suggestion between", value1, value2, "diagnosticSuggestion");
            return (Criteria) this;
        }

        public Criteria andDiagnosticSuggestionNotBetween(String value1, String value2) {
            addCriterion("Diagnostic_Suggestion not between", value1, value2, "diagnosticSuggestion");
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