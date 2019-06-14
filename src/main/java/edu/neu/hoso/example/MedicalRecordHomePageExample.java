package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecordHomePageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicalRecordHomePageExample() {
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

        public Criteria andMedicalRecordHomePageIdIsNull() {
            addCriterion("Medical_Record_Home_Page_ID is null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageIdIsNotNull() {
            addCriterion("Medical_Record_Home_Page_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageIdEqualTo(Integer value) {
            addCriterion("Medical_Record_Home_Page_ID =", value, "medicalRecordHomePageId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageIdNotEqualTo(Integer value) {
            addCriterion("Medical_Record_Home_Page_ID <>", value, "medicalRecordHomePageId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageIdGreaterThan(Integer value) {
            addCriterion("Medical_Record_Home_Page_ID >", value, "medicalRecordHomePageId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Medical_Record_Home_Page_ID >=", value, "medicalRecordHomePageId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageIdLessThan(Integer value) {
            addCriterion("Medical_Record_Home_Page_ID <", value, "medicalRecordHomePageId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageIdLessThanOrEqualTo(Integer value) {
            addCriterion("Medical_Record_Home_Page_ID <=", value, "medicalRecordHomePageId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageIdIn(List<Integer> values) {
            addCriterion("Medical_Record_Home_Page_ID in", values, "medicalRecordHomePageId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageIdNotIn(List<Integer> values) {
            addCriterion("Medical_Record_Home_Page_ID not in", values, "medicalRecordHomePageId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageIdBetween(Integer value1, Integer value2) {
            addCriterion("Medical_Record_Home_Page_ID between", value1, value2, "medicalRecordHomePageId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordHomePageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Medical_Record_Home_Page_ID not between", value1, value2, "medicalRecordHomePageId");
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

        public Criteria andPresentTreatmentIsNull() {
            addCriterion("Present_Treatment is null");
            return (Criteria) this;
        }

        public Criteria andPresentTreatmentIsNotNull() {
            addCriterion("Present_Treatment is not null");
            return (Criteria) this;
        }

        public Criteria andPresentTreatmentEqualTo(String value) {
            addCriterion("Present_Treatment =", value, "presentTreatment");
            return (Criteria) this;
        }

        public Criteria andPresentTreatmentNotEqualTo(String value) {
            addCriterion("Present_Treatment <>", value, "presentTreatment");
            return (Criteria) this;
        }

        public Criteria andPresentTreatmentGreaterThan(String value) {
            addCriterion("Present_Treatment >", value, "presentTreatment");
            return (Criteria) this;
        }

        public Criteria andPresentTreatmentGreaterThanOrEqualTo(String value) {
            addCriterion("Present_Treatment >=", value, "presentTreatment");
            return (Criteria) this;
        }

        public Criteria andPresentTreatmentLessThan(String value) {
            addCriterion("Present_Treatment <", value, "presentTreatment");
            return (Criteria) this;
        }

        public Criteria andPresentTreatmentLessThanOrEqualTo(String value) {
            addCriterion("Present_Treatment <=", value, "presentTreatment");
            return (Criteria) this;
        }

        public Criteria andPresentTreatmentLike(String value) {
            addCriterion("Present_Treatment like", value, "presentTreatment");
            return (Criteria) this;
        }

        public Criteria andPresentTreatmentNotLike(String value) {
            addCriterion("Present_Treatment not like", value, "presentTreatment");
            return (Criteria) this;
        }

        public Criteria andPresentTreatmentIn(List<String> values) {
            addCriterion("Present_Treatment in", values, "presentTreatment");
            return (Criteria) this;
        }

        public Criteria andPresentTreatmentNotIn(List<String> values) {
            addCriterion("Present_Treatment not in", values, "presentTreatment");
            return (Criteria) this;
        }

        public Criteria andPresentTreatmentBetween(String value1, String value2) {
            addCriterion("Present_Treatment between", value1, value2, "presentTreatment");
            return (Criteria) this;
        }

        public Criteria andPresentTreatmentNotBetween(String value1, String value2) {
            addCriterion("Present_Treatment not between", value1, value2, "presentTreatment");
            return (Criteria) this;
        }

        public Criteria andPastHistoryIsNull() {
            addCriterion("Past_History is null");
            return (Criteria) this;
        }

        public Criteria andPastHistoryIsNotNull() {
            addCriterion("Past_History is not null");
            return (Criteria) this;
        }

        public Criteria andPastHistoryEqualTo(String value) {
            addCriterion("Past_History =", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotEqualTo(String value) {
            addCriterion("Past_History <>", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryGreaterThan(String value) {
            addCriterion("Past_History >", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("Past_History >=", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryLessThan(String value) {
            addCriterion("Past_History <", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryLessThanOrEqualTo(String value) {
            addCriterion("Past_History <=", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryLike(String value) {
            addCriterion("Past_History like", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotLike(String value) {
            addCriterion("Past_History not like", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryIn(List<String> values) {
            addCriterion("Past_History in", values, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotIn(List<String> values) {
            addCriterion("Past_History not in", values, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryBetween(String value1, String value2) {
            addCriterion("Past_History between", value1, value2, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotBetween(String value1, String value2) {
            addCriterion("Past_History not between", value1, value2, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryIsNull() {
            addCriterion("Allergic_History is null");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryIsNotNull() {
            addCriterion("Allergic_History is not null");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryEqualTo(String value) {
            addCriterion("Allergic_History =", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryNotEqualTo(String value) {
            addCriterion("Allergic_History <>", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryGreaterThan(String value) {
            addCriterion("Allergic_History >", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("Allergic_History >=", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryLessThan(String value) {
            addCriterion("Allergic_History <", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryLessThanOrEqualTo(String value) {
            addCriterion("Allergic_History <=", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryLike(String value) {
            addCriterion("Allergic_History like", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryNotLike(String value) {
            addCriterion("Allergic_History not like", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryIn(List<String> values) {
            addCriterion("Allergic_History in", values, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryNotIn(List<String> values) {
            addCriterion("Allergic_History not in", values, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryBetween(String value1, String value2) {
            addCriterion("Allergic_History between", value1, value2, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryNotBetween(String value1, String value2) {
            addCriterion("Allergic_History not between", value1, value2, "allergicHistory");
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

        public Criteria andAssistantExaminationIsNull() {
            addCriterion("Assistant_Examination is null");
            return (Criteria) this;
        }

        public Criteria andAssistantExaminationIsNotNull() {
            addCriterion("Assistant_Examination is not null");
            return (Criteria) this;
        }

        public Criteria andAssistantExaminationEqualTo(String value) {
            addCriterion("Assistant_Examination =", value, "assistantExamination");
            return (Criteria) this;
        }

        public Criteria andAssistantExaminationNotEqualTo(String value) {
            addCriterion("Assistant_Examination <>", value, "assistantExamination");
            return (Criteria) this;
        }

        public Criteria andAssistantExaminationGreaterThan(String value) {
            addCriterion("Assistant_Examination >", value, "assistantExamination");
            return (Criteria) this;
        }

        public Criteria andAssistantExaminationGreaterThanOrEqualTo(String value) {
            addCriterion("Assistant_Examination >=", value, "assistantExamination");
            return (Criteria) this;
        }

        public Criteria andAssistantExaminationLessThan(String value) {
            addCriterion("Assistant_Examination <", value, "assistantExamination");
            return (Criteria) this;
        }

        public Criteria andAssistantExaminationLessThanOrEqualTo(String value) {
            addCriterion("Assistant_Examination <=", value, "assistantExamination");
            return (Criteria) this;
        }

        public Criteria andAssistantExaminationLike(String value) {
            addCriterion("Assistant_Examination like", value, "assistantExamination");
            return (Criteria) this;
        }

        public Criteria andAssistantExaminationNotLike(String value) {
            addCriterion("Assistant_Examination not like", value, "assistantExamination");
            return (Criteria) this;
        }

        public Criteria andAssistantExaminationIn(List<String> values) {
            addCriterion("Assistant_Examination in", values, "assistantExamination");
            return (Criteria) this;
        }

        public Criteria andAssistantExaminationNotIn(List<String> values) {
            addCriterion("Assistant_Examination not in", values, "assistantExamination");
            return (Criteria) this;
        }

        public Criteria andAssistantExaminationBetween(String value1, String value2) {
            addCriterion("Assistant_Examination between", value1, value2, "assistantExamination");
            return (Criteria) this;
        }

        public Criteria andAssistantExaminationNotBetween(String value1, String value2) {
            addCriterion("Assistant_Examination not between", value1, value2, "assistantExamination");
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