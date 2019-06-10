package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupPrescriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupPrescriptionExample() {
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

        public Criteria andGroupPrescriptionIdIsNull() {
            addCriterion("Group_Prescription_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionIdIsNotNull() {
            addCriterion("Group_Prescription_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionIdEqualTo(Integer value) {
            addCriterion("Group_Prescription_ID =", value, "groupPrescriptionId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionIdNotEqualTo(Integer value) {
            addCriterion("Group_Prescription_ID <>", value, "groupPrescriptionId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionIdGreaterThan(Integer value) {
            addCriterion("Group_Prescription_ID >", value, "groupPrescriptionId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Group_Prescription_ID >=", value, "groupPrescriptionId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionIdLessThan(Integer value) {
            addCriterion("Group_Prescription_ID <", value, "groupPrescriptionId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionIdLessThanOrEqualTo(Integer value) {
            addCriterion("Group_Prescription_ID <=", value, "groupPrescriptionId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionIdIn(List<Integer> values) {
            addCriterion("Group_Prescription_ID in", values, "groupPrescriptionId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionIdNotIn(List<Integer> values) {
            addCriterion("Group_Prescription_ID not in", values, "groupPrescriptionId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionIdBetween(Integer value1, Integer value2) {
            addCriterion("Group_Prescription_ID between", value1, value2, "groupPrescriptionId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Group_Prescription_ID not between", value1, value2, "groupPrescriptionId");
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

        public Criteria andGroupPrescriptionCodeIsNull() {
            addCriterion("Group_Prescription_Code is null");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionCodeIsNotNull() {
            addCriterion("Group_Prescription_Code is not null");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionCodeEqualTo(String value) {
            addCriterion("Group_Prescription_Code =", value, "groupPrescriptionCode");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionCodeNotEqualTo(String value) {
            addCriterion("Group_Prescription_Code <>", value, "groupPrescriptionCode");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionCodeGreaterThan(String value) {
            addCriterion("Group_Prescription_Code >", value, "groupPrescriptionCode");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Group_Prescription_Code >=", value, "groupPrescriptionCode");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionCodeLessThan(String value) {
            addCriterion("Group_Prescription_Code <", value, "groupPrescriptionCode");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionCodeLessThanOrEqualTo(String value) {
            addCriterion("Group_Prescription_Code <=", value, "groupPrescriptionCode");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionCodeLike(String value) {
            addCriterion("Group_Prescription_Code like", value, "groupPrescriptionCode");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionCodeNotLike(String value) {
            addCriterion("Group_Prescription_Code not like", value, "groupPrescriptionCode");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionCodeIn(List<String> values) {
            addCriterion("Group_Prescription_Code in", values, "groupPrescriptionCode");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionCodeNotIn(List<String> values) {
            addCriterion("Group_Prescription_Code not in", values, "groupPrescriptionCode");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionCodeBetween(String value1, String value2) {
            addCriterion("Group_Prescription_Code between", value1, value2, "groupPrescriptionCode");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionCodeNotBetween(String value1, String value2) {
            addCriterion("Group_Prescription_Code not between", value1, value2, "groupPrescriptionCode");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionNameIsNull() {
            addCriterion("Group_Prescription_Name is null");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionNameIsNotNull() {
            addCriterion("Group_Prescription_Name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionNameEqualTo(String value) {
            addCriterion("Group_Prescription_Name =", value, "groupPrescriptionName");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionNameNotEqualTo(String value) {
            addCriterion("Group_Prescription_Name <>", value, "groupPrescriptionName");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionNameGreaterThan(String value) {
            addCriterion("Group_Prescription_Name >", value, "groupPrescriptionName");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionNameGreaterThanOrEqualTo(String value) {
            addCriterion("Group_Prescription_Name >=", value, "groupPrescriptionName");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionNameLessThan(String value) {
            addCriterion("Group_Prescription_Name <", value, "groupPrescriptionName");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionNameLessThanOrEqualTo(String value) {
            addCriterion("Group_Prescription_Name <=", value, "groupPrescriptionName");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionNameLike(String value) {
            addCriterion("Group_Prescription_Name like", value, "groupPrescriptionName");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionNameNotLike(String value) {
            addCriterion("Group_Prescription_Name not like", value, "groupPrescriptionName");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionNameIn(List<String> values) {
            addCriterion("Group_Prescription_Name in", values, "groupPrescriptionName");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionNameNotIn(List<String> values) {
            addCriterion("Group_Prescription_Name not in", values, "groupPrescriptionName");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionNameBetween(String value1, String value2) {
            addCriterion("Group_Prescription_Name between", value1, value2, "groupPrescriptionName");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionNameNotBetween(String value1, String value2) {
            addCriterion("Group_Prescription_Name not between", value1, value2, "groupPrescriptionName");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionScopeIsNull() {
            addCriterion("Group_Prescription_Scope is null");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionScopeIsNotNull() {
            addCriterion("Group_Prescription_Scope is not null");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionScopeEqualTo(String value) {
            addCriterion("Group_Prescription_Scope =", value, "groupPrescriptionScope");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionScopeNotEqualTo(String value) {
            addCriterion("Group_Prescription_Scope <>", value, "groupPrescriptionScope");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionScopeGreaterThan(String value) {
            addCriterion("Group_Prescription_Scope >", value, "groupPrescriptionScope");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionScopeGreaterThanOrEqualTo(String value) {
            addCriterion("Group_Prescription_Scope >=", value, "groupPrescriptionScope");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionScopeLessThan(String value) {
            addCriterion("Group_Prescription_Scope <", value, "groupPrescriptionScope");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionScopeLessThanOrEqualTo(String value) {
            addCriterion("Group_Prescription_Scope <=", value, "groupPrescriptionScope");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionScopeLike(String value) {
            addCriterion("Group_Prescription_Scope like", value, "groupPrescriptionScope");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionScopeNotLike(String value) {
            addCriterion("Group_Prescription_Scope not like", value, "groupPrescriptionScope");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionScopeIn(List<String> values) {
            addCriterion("Group_Prescription_Scope in", values, "groupPrescriptionScope");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionScopeNotIn(List<String> values) {
            addCriterion("Group_Prescription_Scope not in", values, "groupPrescriptionScope");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionScopeBetween(String value1, String value2) {
            addCriterion("Group_Prescription_Scope between", value1, value2, "groupPrescriptionScope");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionScopeNotBetween(String value1, String value2) {
            addCriterion("Group_Prescription_Scope not between", value1, value2, "groupPrescriptionScope");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("Create_Time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("Create_Time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("Create_Time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("Create_Time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("Create_Time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Create_Time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("Create_Time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Create_Time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("Create_Time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("Create_Time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("Create_Time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Create_Time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIsNull() {
            addCriterion("Prescription_Type is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIsNotNull() {
            addCriterion("Prescription_Type is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeEqualTo(String value) {
            addCriterion("Prescription_Type =", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeNotEqualTo(String value) {
            addCriterion("Prescription_Type <>", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeGreaterThan(String value) {
            addCriterion("Prescription_Type >", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Prescription_Type >=", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeLessThan(String value) {
            addCriterion("Prescription_Type <", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeLessThanOrEqualTo(String value) {
            addCriterion("Prescription_Type <=", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeLike(String value) {
            addCriterion("Prescription_Type like", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeNotLike(String value) {
            addCriterion("Prescription_Type not like", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIn(List<String> values) {
            addCriterion("Prescription_Type in", values, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeNotIn(List<String> values) {
            addCriterion("Prescription_Type not in", values, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeBetween(String value1, String value2) {
            addCriterion("Prescription_Type between", value1, value2, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeNotBetween(String value1, String value2) {
            addCriterion("Prescription_Type not between", value1, value2, "prescriptionType");
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