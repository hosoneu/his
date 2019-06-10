package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class DiagnosisTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiagnosisTemplateExample() {
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

        public Criteria andDiagnosisTemplateIdIsNull() {
            addCriterion("Diagnosis_Template_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTemplateIdIsNotNull() {
            addCriterion("Diagnosis_Template_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTemplateIdEqualTo(Integer value) {
            addCriterion("Diagnosis_Template_ID =", value, "diagnosisTemplateId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTemplateIdNotEqualTo(Integer value) {
            addCriterion("Diagnosis_Template_ID <>", value, "diagnosisTemplateId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTemplateIdGreaterThan(Integer value) {
            addCriterion("Diagnosis_Template_ID >", value, "diagnosisTemplateId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Diagnosis_Template_ID >=", value, "diagnosisTemplateId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTemplateIdLessThan(Integer value) {
            addCriterion("Diagnosis_Template_ID <", value, "diagnosisTemplateId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("Diagnosis_Template_ID <=", value, "diagnosisTemplateId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTemplateIdIn(List<Integer> values) {
            addCriterion("Diagnosis_Template_ID in", values, "diagnosisTemplateId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTemplateIdNotIn(List<Integer> values) {
            addCriterion("Diagnosis_Template_ID not in", values, "diagnosisTemplateId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("Diagnosis_Template_ID between", value1, value2, "diagnosisTemplateId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Diagnosis_Template_ID not between", value1, value2, "diagnosisTemplateId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageTemplateIdIsNull() {
            addCriterion("Medical_Record_Home_Page_Template_ID is null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageTemplateIdIsNotNull() {
            addCriterion("Medical_Record_Home_Page_Template_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageTemplateIdEqualTo(Integer value) {
            addCriterion("Medical_Record_Home_Page_Template_ID =", value, "medicalRecordHomePageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageTemplateIdNotEqualTo(Integer value) {
            addCriterion("Medical_Record_Home_Page_Template_ID <>", value, "medicalRecordHomePageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageTemplateIdGreaterThan(Integer value) {
            addCriterion("Medical_Record_Home_Page_Template_ID >", value, "medicalRecordHomePageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Medical_Record_Home_Page_Template_ID >=", value, "medicalRecordHomePageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageTemplateIdLessThan(Integer value) {
            addCriterion("Medical_Record_Home_Page_Template_ID <", value, "medicalRecordHomePageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("Medical_Record_Home_Page_Template_ID <=", value, "medicalRecordHomePageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageTemplateIdIn(List<Integer> values) {
            addCriterion("Medical_Record_Home_Page_Template_ID in", values, "medicalRecordHomePageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageTemplateIdNotIn(List<Integer> values) {
            addCriterion("Medical_Record_Home_Page_Template_ID not in", values, "medicalRecordHomePageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("Medical_Record_Home_Page_Template_ID between", value1, value2, "medicalRecordHomePageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Medical_Record_Home_Page_Template_ID not between", value1, value2, "medicalRecordHomePageTemplateId");
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

        public Criteria andMainDiagnosisMarkIsNull() {
            addCriterion("Main_Diagnosis_Mark is null");
            return (Criteria) this;
        }

        public Criteria andMainDiagnosisMarkIsNotNull() {
            addCriterion("Main_Diagnosis_Mark is not null");
            return (Criteria) this;
        }

        public Criteria andMainDiagnosisMarkEqualTo(String value) {
            addCriterion("Main_Diagnosis_Mark =", value, "mainDiagnosisMark");
            return (Criteria) this;
        }

        public Criteria andMainDiagnosisMarkNotEqualTo(String value) {
            addCriterion("Main_Diagnosis_Mark <>", value, "mainDiagnosisMark");
            return (Criteria) this;
        }

        public Criteria andMainDiagnosisMarkGreaterThan(String value) {
            addCriterion("Main_Diagnosis_Mark >", value, "mainDiagnosisMark");
            return (Criteria) this;
        }

        public Criteria andMainDiagnosisMarkGreaterThanOrEqualTo(String value) {
            addCriterion("Main_Diagnosis_Mark >=", value, "mainDiagnosisMark");
            return (Criteria) this;
        }

        public Criteria andMainDiagnosisMarkLessThan(String value) {
            addCriterion("Main_Diagnosis_Mark <", value, "mainDiagnosisMark");
            return (Criteria) this;
        }

        public Criteria andMainDiagnosisMarkLessThanOrEqualTo(String value) {
            addCriterion("Main_Diagnosis_Mark <=", value, "mainDiagnosisMark");
            return (Criteria) this;
        }

        public Criteria andMainDiagnosisMarkLike(String value) {
            addCriterion("Main_Diagnosis_Mark like", value, "mainDiagnosisMark");
            return (Criteria) this;
        }

        public Criteria andMainDiagnosisMarkNotLike(String value) {
            addCriterion("Main_Diagnosis_Mark not like", value, "mainDiagnosisMark");
            return (Criteria) this;
        }

        public Criteria andMainDiagnosisMarkIn(List<String> values) {
            addCriterion("Main_Diagnosis_Mark in", values, "mainDiagnosisMark");
            return (Criteria) this;
        }

        public Criteria andMainDiagnosisMarkNotIn(List<String> values) {
            addCriterion("Main_Diagnosis_Mark not in", values, "mainDiagnosisMark");
            return (Criteria) this;
        }

        public Criteria andMainDiagnosisMarkBetween(String value1, String value2) {
            addCriterion("Main_Diagnosis_Mark between", value1, value2, "mainDiagnosisMark");
            return (Criteria) this;
        }

        public Criteria andMainDiagnosisMarkNotBetween(String value1, String value2) {
            addCriterion("Main_Diagnosis_Mark not between", value1, value2, "mainDiagnosisMark");
            return (Criteria) this;
        }

        public Criteria andSuspectMarkIsNull() {
            addCriterion("Suspect_Mark is null");
            return (Criteria) this;
        }

        public Criteria andSuspectMarkIsNotNull() {
            addCriterion("Suspect_Mark is not null");
            return (Criteria) this;
        }

        public Criteria andSuspectMarkEqualTo(String value) {
            addCriterion("Suspect_Mark =", value, "suspectMark");
            return (Criteria) this;
        }

        public Criteria andSuspectMarkNotEqualTo(String value) {
            addCriterion("Suspect_Mark <>", value, "suspectMark");
            return (Criteria) this;
        }

        public Criteria andSuspectMarkGreaterThan(String value) {
            addCriterion("Suspect_Mark >", value, "suspectMark");
            return (Criteria) this;
        }

        public Criteria andSuspectMarkGreaterThanOrEqualTo(String value) {
            addCriterion("Suspect_Mark >=", value, "suspectMark");
            return (Criteria) this;
        }

        public Criteria andSuspectMarkLessThan(String value) {
            addCriterion("Suspect_Mark <", value, "suspectMark");
            return (Criteria) this;
        }

        public Criteria andSuspectMarkLessThanOrEqualTo(String value) {
            addCriterion("Suspect_Mark <=", value, "suspectMark");
            return (Criteria) this;
        }

        public Criteria andSuspectMarkLike(String value) {
            addCriterion("Suspect_Mark like", value, "suspectMark");
            return (Criteria) this;
        }

        public Criteria andSuspectMarkNotLike(String value) {
            addCriterion("Suspect_Mark not like", value, "suspectMark");
            return (Criteria) this;
        }

        public Criteria andSuspectMarkIn(List<String> values) {
            addCriterion("Suspect_Mark in", values, "suspectMark");
            return (Criteria) this;
        }

        public Criteria andSuspectMarkNotIn(List<String> values) {
            addCriterion("Suspect_Mark not in", values, "suspectMark");
            return (Criteria) this;
        }

        public Criteria andSuspectMarkBetween(String value1, String value2) {
            addCriterion("Suspect_Mark between", value1, value2, "suspectMark");
            return (Criteria) this;
        }

        public Criteria andSuspectMarkNotBetween(String value1, String value2) {
            addCriterion("Suspect_Mark not between", value1, value2, "suspectMark");
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