package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecordHomePageTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicalRecordHomePageTemplateExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andScopeIsNull() {
            addCriterion("Scope is null");
            return (Criteria) this;
        }

        public Criteria andScopeIsNotNull() {
            addCriterion("Scope is not null");
            return (Criteria) this;
        }

        public Criteria andScopeEqualTo(String value) {
            addCriterion("Scope =", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotEqualTo(String value) {
            addCriterion("Scope <>", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThan(String value) {
            addCriterion("Scope >", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThanOrEqualTo(String value) {
            addCriterion("Scope >=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThan(String value) {
            addCriterion("Scope <", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThanOrEqualTo(String value) {
            addCriterion("Scope <=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLike(String value) {
            addCriterion("Scope like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotLike(String value) {
            addCriterion("Scope not like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeIn(List<String> values) {
            addCriterion("Scope in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotIn(List<String> values) {
            addCriterion("Scope not in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeBetween(String value1, String value2) {
            addCriterion("Scope between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotBetween(String value1, String value2) {
            addCriterion("Scope not between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintIsNull() {
            addCriterion("Chief_Complaint is null");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintIsNotNull() {
            addCriterion("Chief_Complaint is not null");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintEqualTo(String value) {
            addCriterion("Chief_Complaint =", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotEqualTo(String value) {
            addCriterion("Chief_Complaint <>", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintGreaterThan(String value) {
            addCriterion("Chief_Complaint >", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintGreaterThanOrEqualTo(String value) {
            addCriterion("Chief_Complaint >=", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintLessThan(String value) {
            addCriterion("Chief_Complaint <", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintLessThanOrEqualTo(String value) {
            addCriterion("Chief_Complaint <=", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintLike(String value) {
            addCriterion("Chief_Complaint like", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotLike(String value) {
            addCriterion("Chief_Complaint not like", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintIn(List<String> values) {
            addCriterion("Chief_Complaint in", values, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotIn(List<String> values) {
            addCriterion("Chief_Complaint not in", values, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintBetween(String value1, String value2) {
            addCriterion("Chief_Complaint between", value1, value2, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotBetween(String value1, String value2) {
            addCriterion("Chief_Complaint not between", value1, value2, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryIsNull() {
            addCriterion("Present_History is null");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryIsNotNull() {
            addCriterion("Present_History is not null");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryEqualTo(String value) {
            addCriterion("Present_History =", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryNotEqualTo(String value) {
            addCriterion("Present_History <>", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryGreaterThan(String value) {
            addCriterion("Present_History >", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("Present_History >=", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryLessThan(String value) {
            addCriterion("Present_History <", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryLessThanOrEqualTo(String value) {
            addCriterion("Present_History <=", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryLike(String value) {
            addCriterion("Present_History like", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryNotLike(String value) {
            addCriterion("Present_History not like", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryIn(List<String> values) {
            addCriterion("Present_History in", values, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryNotIn(List<String> values) {
            addCriterion("Present_History not in", values, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryBetween(String value1, String value2) {
            addCriterion("Present_History between", value1, value2, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryNotBetween(String value1, String value2) {
            addCriterion("Present_History not between", value1, value2, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationIsNull() {
            addCriterion("Physical_Examination is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationIsNotNull() {
            addCriterion("Physical_Examination is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationEqualTo(String value) {
            addCriterion("Physical_Examination =", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationNotEqualTo(String value) {
            addCriterion("Physical_Examination <>", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationGreaterThan(String value) {
            addCriterion("Physical_Examination >", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationGreaterThanOrEqualTo(String value) {
            addCriterion("Physical_Examination >=", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationLessThan(String value) {
            addCriterion("Physical_Examination <", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationLessThanOrEqualTo(String value) {
            addCriterion("Physical_Examination <=", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationLike(String value) {
            addCriterion("Physical_Examination like", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationNotLike(String value) {
            addCriterion("Physical_Examination not like", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationIn(List<String> values) {
            addCriterion("Physical_Examination in", values, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationNotIn(List<String> values) {
            addCriterion("Physical_Examination not in", values, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationBetween(String value1, String value2) {
            addCriterion("Physical_Examination between", value1, value2, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationNotBetween(String value1, String value2) {
            addCriterion("Physical_Examination not between", value1, value2, "physicalExamination");
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