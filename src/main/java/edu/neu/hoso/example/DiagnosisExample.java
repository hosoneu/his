package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DiagnosisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiagnosisExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDiagnosisIdIsNull() {
            addCriterion("Diagnosis_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIdIsNotNull() {
            addCriterion("Diagnosis_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIdEqualTo(Integer value) {
            addCriterion("Diagnosis_ID =", value, "diagnosisId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIdNotEqualTo(Integer value) {
            addCriterion("Diagnosis_ID <>", value, "diagnosisId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIdGreaterThan(Integer value) {
            addCriterion("Diagnosis_ID >", value, "diagnosisId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Diagnosis_ID >=", value, "diagnosisId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIdLessThan(Integer value) {
            addCriterion("Diagnosis_ID <", value, "diagnosisId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIdLessThanOrEqualTo(Integer value) {
            addCriterion("Diagnosis_ID <=", value, "diagnosisId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIdIn(List<Integer> values) {
            addCriterion("Diagnosis_ID in", values, "diagnosisId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIdNotIn(List<Integer> values) {
            addCriterion("Diagnosis_ID not in", values, "diagnosisId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIdBetween(Integer value1, Integer value2) {
            addCriterion("Diagnosis_ID between", value1, value2, "diagnosisId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Diagnosis_ID not between", value1, value2, "diagnosisId");
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

        public Criteria andOnsetDateIsNull() {
            addCriterion("Onset_Date is null");
            return (Criteria) this;
        }

        public Criteria andOnsetDateIsNotNull() {
            addCriterion("Onset_Date is not null");
            return (Criteria) this;
        }

        public Criteria andOnsetDateEqualTo(Date value) {
            addCriterionForJDBCDate("Onset_Date =", value, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Onset_Date <>", value, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateGreaterThan(Date value) {
            addCriterionForJDBCDate("Onset_Date >", value, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Onset_Date >=", value, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateLessThan(Date value) {
            addCriterionForJDBCDate("Onset_Date <", value, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Onset_Date <=", value, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateIn(List<Date> values) {
            addCriterionForJDBCDate("Onset_Date in", values, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Onset_Date not in", values, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Onset_Date between", value1, value2, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andOnsetDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Onset_Date not between", value1, value2, "onsetDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkIsNull() {
            addCriterion("Diagnosis_Mark is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkIsNotNull() {
            addCriterion("Diagnosis_Mark is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkEqualTo(String value) {
            addCriterion("Diagnosis_Mark =", value, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkNotEqualTo(String value) {
            addCriterion("Diagnosis_Mark <>", value, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkGreaterThan(String value) {
            addCriterion("Diagnosis_Mark >", value, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkGreaterThanOrEqualTo(String value) {
            addCriterion("Diagnosis_Mark >=", value, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkLessThan(String value) {
            addCriterion("Diagnosis_Mark <", value, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkLessThanOrEqualTo(String value) {
            addCriterion("Diagnosis_Mark <=", value, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkLike(String value) {
            addCriterion("Diagnosis_Mark like", value, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkNotLike(String value) {
            addCriterion("Diagnosis_Mark not like", value, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkIn(List<String> values) {
            addCriterion("Diagnosis_Mark in", values, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkNotIn(List<String> values) {
            addCriterion("Diagnosis_Mark not in", values, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkBetween(String value1, String value2) {
            addCriterion("Diagnosis_Mark between", value1, value2, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkNotBetween(String value1, String value2) {
            addCriterion("Diagnosis_Mark not between", value1, value2, "diagnosisMark");
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