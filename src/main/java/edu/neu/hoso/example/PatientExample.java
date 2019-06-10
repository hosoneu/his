package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientExample() {
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

        public Criteria andPatientIdIsNull() {
            addCriterion("Patient_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("Patient_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(Integer value) {
            addCriterion("Patient_ID =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(Integer value) {
            addCriterion("Patient_ID <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(Integer value) {
            addCriterion("Patient_ID >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Patient_ID >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(Integer value) {
            addCriterion("Patient_ID <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(Integer value) {
            addCriterion("Patient_ID <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<Integer> values) {
            addCriterion("Patient_ID in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<Integer> values) {
            addCriterion("Patient_ID not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(Integer value1, Integer value2) {
            addCriterion("Patient_ID between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Patient_ID not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("Patient_Name is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("Patient_Name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("Patient_Name =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("Patient_Name <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("Patient_Name >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("Patient_Name >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("Patient_Name <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("Patient_Name <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("Patient_Name like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("Patient_Name not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("Patient_Name in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("Patient_Name not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("Patient_Name between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("Patient_Name not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientGenderIsNull() {
            addCriterion("Patient_Gender is null");
            return (Criteria) this;
        }

        public Criteria andPatientGenderIsNotNull() {
            addCriterion("Patient_Gender is not null");
            return (Criteria) this;
        }

        public Criteria andPatientGenderEqualTo(String value) {
            addCriterion("Patient_Gender =", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotEqualTo(String value) {
            addCriterion("Patient_Gender <>", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderGreaterThan(String value) {
            addCriterion("Patient_Gender >", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderGreaterThanOrEqualTo(String value) {
            addCriterion("Patient_Gender >=", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderLessThan(String value) {
            addCriterion("Patient_Gender <", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderLessThanOrEqualTo(String value) {
            addCriterion("Patient_Gender <=", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderLike(String value) {
            addCriterion("Patient_Gender like", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotLike(String value) {
            addCriterion("Patient_Gender not like", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderIn(List<String> values) {
            addCriterion("Patient_Gender in", values, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotIn(List<String> values) {
            addCriterion("Patient_Gender not in", values, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderBetween(String value1, String value2) {
            addCriterion("Patient_Gender between", value1, value2, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotBetween(String value1, String value2) {
            addCriterion("Patient_Gender not between", value1, value2, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientBirthIsNull() {
            addCriterion("Patient_Birth is null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthIsNotNull() {
            addCriterion("Patient_Birth is not null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthEqualTo(Date value) {
            addCriterionForJDBCDate("Patient_Birth =", value, "patientBirth");
            return (Criteria) this;
        }

        public Criteria andPatientBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("Patient_Birth <>", value, "patientBirth");
            return (Criteria) this;
        }

        public Criteria andPatientBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("Patient_Birth >", value, "patientBirth");
            return (Criteria) this;
        }

        public Criteria andPatientBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Patient_Birth >=", value, "patientBirth");
            return (Criteria) this;
        }

        public Criteria andPatientBirthLessThan(Date value) {
            addCriterionForJDBCDate("Patient_Birth <", value, "patientBirth");
            return (Criteria) this;
        }

        public Criteria andPatientBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Patient_Birth <=", value, "patientBirth");
            return (Criteria) this;
        }

        public Criteria andPatientBirthIn(List<Date> values) {
            addCriterionForJDBCDate("Patient_Birth in", values, "patientBirth");
            return (Criteria) this;
        }

        public Criteria andPatientBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("Patient_Birth not in", values, "patientBirth");
            return (Criteria) this;
        }

        public Criteria andPatientBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Patient_Birth between", value1, value2, "patientBirth");
            return (Criteria) this;
        }

        public Criteria andPatientBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Patient_Birth not between", value1, value2, "patientBirth");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIsNull() {
            addCriterion("Patient_Age is null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIsNotNull() {
            addCriterion("Patient_Age is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeEqualTo(Integer value) {
            addCriterion("Patient_Age =", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotEqualTo(Integer value) {
            addCriterion("Patient_Age <>", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThan(Integer value) {
            addCriterion("Patient_Age >", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Patient_Age >=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThan(Integer value) {
            addCriterion("Patient_Age <", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThanOrEqualTo(Integer value) {
            addCriterion("Patient_Age <=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIn(List<Integer> values) {
            addCriterion("Patient_Age in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotIn(List<Integer> values) {
            addCriterion("Patient_Age not in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBetween(Integer value1, Integer value2) {
            addCriterion("Patient_Age between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("Patient_Age not between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityIsNull() {
            addCriterion("Patient_IDentity is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityIsNotNull() {
            addCriterion("Patient_IDentity is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityEqualTo(String value) {
            addCriterion("Patient_IDentity =", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityNotEqualTo(String value) {
            addCriterion("Patient_IDentity <>", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityGreaterThan(String value) {
            addCriterion("Patient_IDentity >", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("Patient_IDentity >=", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityLessThan(String value) {
            addCriterion("Patient_IDentity <", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityLessThanOrEqualTo(String value) {
            addCriterion("Patient_IDentity <=", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityLike(String value) {
            addCriterion("Patient_IDentity like", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityNotLike(String value) {
            addCriterion("Patient_IDentity not like", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityIn(List<String> values) {
            addCriterion("Patient_IDentity in", values, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityNotIn(List<String> values) {
            addCriterion("Patient_IDentity not in", values, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityBetween(String value1, String value2) {
            addCriterion("Patient_IDentity between", value1, value2, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityNotBetween(String value1, String value2) {
            addCriterion("Patient_IDentity not between", value1, value2, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientAddressIsNull() {
            addCriterion("Patient_Address is null");
            return (Criteria) this;
        }

        public Criteria andPatientAddressIsNotNull() {
            addCriterion("Patient_Address is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAddressEqualTo(String value) {
            addCriterion("Patient_Address =", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotEqualTo(String value) {
            addCriterion("Patient_Address <>", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressGreaterThan(String value) {
            addCriterion("Patient_Address >", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Patient_Address >=", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressLessThan(String value) {
            addCriterion("Patient_Address <", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressLessThanOrEqualTo(String value) {
            addCriterion("Patient_Address <=", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressLike(String value) {
            addCriterion("Patient_Address like", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotLike(String value) {
            addCriterion("Patient_Address not like", value, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressIn(List<String> values) {
            addCriterion("Patient_Address in", values, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotIn(List<String> values) {
            addCriterion("Patient_Address not in", values, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressBetween(String value1, String value2) {
            addCriterion("Patient_Address between", value1, value2, "patientAddress");
            return (Criteria) this;
        }

        public Criteria andPatientAddressNotBetween(String value1, String value2) {
            addCriterion("Patient_Address not between", value1, value2, "patientAddress");
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