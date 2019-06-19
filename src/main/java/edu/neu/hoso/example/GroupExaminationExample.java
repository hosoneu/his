package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupExaminationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupExaminationExample() {
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

        public Criteria andGroupExaminationIdIsNull() {
            addCriterion("Group_Examination_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationIdIsNotNull() {
            addCriterion("Group_Examination_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationIdEqualTo(Integer value) {
            addCriterion("Group_Examination_ID =", value, "groupExaminationId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationIdNotEqualTo(Integer value) {
            addCriterion("Group_Examination_ID <>", value, "groupExaminationId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationIdGreaterThan(Integer value) {
            addCriterion("Group_Examination_ID >", value, "groupExaminationId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Group_Examination_ID >=", value, "groupExaminationId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationIdLessThan(Integer value) {
            addCriterion("Group_Examination_ID <", value, "groupExaminationId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationIdLessThanOrEqualTo(Integer value) {
            addCriterion("Group_Examination_ID <=", value, "groupExaminationId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationIdIn(List<Integer> values) {
            addCriterion("Group_Examination_ID in", values, "groupExaminationId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationIdNotIn(List<Integer> values) {
            addCriterion("Group_Examination_ID not in", values, "groupExaminationId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationIdBetween(Integer value1, Integer value2) {
            addCriterion("Group_Examination_ID between", value1, value2, "groupExaminationId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Group_Examination_ID not between", value1, value2, "groupExaminationId");
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

        public Criteria andGroupExaminationCodeIsNull() {
            addCriterion("Group_Examination_Code is null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationCodeIsNotNull() {
            addCriterion("Group_Examination_Code is not null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationCodeEqualTo(String value) {
            addCriterion("Group_Examination_Code =", value, "groupExaminationCode");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationCodeNotEqualTo(String value) {
            addCriterion("Group_Examination_Code <>", value, "groupExaminationCode");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationCodeGreaterThan(String value) {
            addCriterion("Group_Examination_Code >", value, "groupExaminationCode");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Group_Examination_Code >=", value, "groupExaminationCode");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationCodeLessThan(String value) {
            addCriterion("Group_Examination_Code <", value, "groupExaminationCode");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationCodeLessThanOrEqualTo(String value) {
            addCriterion("Group_Examination_Code <=", value, "groupExaminationCode");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationCodeLike(String value) {
            addCriterion("Group_Examination_Code like", value, "groupExaminationCode");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationCodeNotLike(String value) {
            addCriterion("Group_Examination_Code not like", value, "groupExaminationCode");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationCodeIn(List<String> values) {
            addCriterion("Group_Examination_Code in", values, "groupExaminationCode");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationCodeNotIn(List<String> values) {
            addCriterion("Group_Examination_Code not in", values, "groupExaminationCode");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationCodeBetween(String value1, String value2) {
            addCriterion("Group_Examination_Code between", value1, value2, "groupExaminationCode");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationCodeNotBetween(String value1, String value2) {
            addCriterion("Group_Examination_Code not between", value1, value2, "groupExaminationCode");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationNameIsNull() {
            addCriterion("Group_Examination_Name is null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationNameIsNotNull() {
            addCriterion("Group_Examination_Name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationNameEqualTo(String value) {
            addCriterion("Group_Examination_Name =", value, "groupExaminationName");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationNameNotEqualTo(String value) {
            addCriterion("Group_Examination_Name <>", value, "groupExaminationName");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationNameGreaterThan(String value) {
            addCriterion("Group_Examination_Name >", value, "groupExaminationName");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationNameGreaterThanOrEqualTo(String value) {
            addCriterion("Group_Examination_Name >=", value, "groupExaminationName");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationNameLessThan(String value) {
            addCriterion("Group_Examination_Name <", value, "groupExaminationName");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationNameLessThanOrEqualTo(String value) {
            addCriterion("Group_Examination_Name <=", value, "groupExaminationName");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationNameLike(String value) {
            addCriterion("Group_Examination_Name like", value, "groupExaminationName");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationNameNotLike(String value) {
            addCriterion("Group_Examination_Name not like", value, "groupExaminationName");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationNameIn(List<String> values) {
            addCriterion("Group_Examination_Name in", values, "groupExaminationName");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationNameNotIn(List<String> values) {
            addCriterion("Group_Examination_Name not in", values, "groupExaminationName");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationNameBetween(String value1, String value2) {
            addCriterion("Group_Examination_Name between", value1, value2, "groupExaminationName");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationNameNotBetween(String value1, String value2) {
            addCriterion("Group_Examination_Name not between", value1, value2, "groupExaminationName");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationScopeIsNull() {
            addCriterion("Group_Examination_Scope is null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationScopeIsNotNull() {
            addCriterion("Group_Examination_Scope is not null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationScopeEqualTo(String value) {
            addCriterion("Group_Examination_Scope =", value, "groupExaminationScope");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationScopeNotEqualTo(String value) {
            addCriterion("Group_Examination_Scope <>", value, "groupExaminationScope");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationScopeGreaterThan(String value) {
            addCriterion("Group_Examination_Scope >", value, "groupExaminationScope");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationScopeGreaterThanOrEqualTo(String value) {
            addCriterion("Group_Examination_Scope >=", value, "groupExaminationScope");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationScopeLessThan(String value) {
            addCriterion("Group_Examination_Scope <", value, "groupExaminationScope");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationScopeLessThanOrEqualTo(String value) {
            addCriterion("Group_Examination_Scope <=", value, "groupExaminationScope");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationScopeLike(String value) {
            addCriterion("Group_Examination_Scope like", value, "groupExaminationScope");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationScopeNotLike(String value) {
            addCriterion("Group_Examination_Scope not like", value, "groupExaminationScope");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationScopeIn(List<String> values) {
            addCriterion("Group_Examination_Scope in", values, "groupExaminationScope");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationScopeNotIn(List<String> values) {
            addCriterion("Group_Examination_Scope not in", values, "groupExaminationScope");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationScopeBetween(String value1, String value2) {
            addCriterion("Group_Examination_Scope between", value1, value2, "groupExaminationScope");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationScopeNotBetween(String value1, String value2) {
            addCriterion("Group_Examination_Scope not between", value1, value2, "groupExaminationScope");
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

        public Criteria andGroupExaminationTypeIsNull() {
            addCriterion("Group_Examination_Type is null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationTypeIsNotNull() {
            addCriterion("Group_Examination_Type is not null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationTypeEqualTo(String value) {
            addCriterion("Group_Examination_Type =", value, "groupExaminationType");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationTypeNotEqualTo(String value) {
            addCriterion("Group_Examination_Type <>", value, "groupExaminationType");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationTypeGreaterThan(String value) {
            addCriterion("Group_Examination_Type >", value, "groupExaminationType");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Group_Examination_Type >=", value, "groupExaminationType");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationTypeLessThan(String value) {
            addCriterion("Group_Examination_Type <", value, "groupExaminationType");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationTypeLessThanOrEqualTo(String value) {
            addCriterion("Group_Examination_Type <=", value, "groupExaminationType");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationTypeLike(String value) {
            addCriterion("Group_Examination_Type like", value, "groupExaminationType");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationTypeNotLike(String value) {
            addCriterion("Group_Examination_Type not like", value, "groupExaminationType");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationTypeIn(List<String> values) {
            addCriterion("Group_Examination_Type in", values, "groupExaminationType");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationTypeNotIn(List<String> values) {
            addCriterion("Group_Examination_Type not in", values, "groupExaminationType");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationTypeBetween(String value1, String value2) {
            addCriterion("Group_Examination_Type between", value1, value2, "groupExaminationType");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationTypeNotBetween(String value1, String value2) {
            addCriterion("Group_Examination_Type not between", value1, value2, "groupExaminationType");
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