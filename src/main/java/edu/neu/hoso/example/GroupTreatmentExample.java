package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupTreatmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupTreatmentExample() {
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

        public Criteria andGroupTreatmentIdIsNull() {
            addCriterion("Group_Treatment_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentIdIsNotNull() {
            addCriterion("Group_Treatment_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentIdEqualTo(Integer value) {
            addCriterion("Group_Treatment_ID =", value, "groupTreatmentId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentIdNotEqualTo(Integer value) {
            addCriterion("Group_Treatment_ID <>", value, "groupTreatmentId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentIdGreaterThan(Integer value) {
            addCriterion("Group_Treatment_ID >", value, "groupTreatmentId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Group_Treatment_ID >=", value, "groupTreatmentId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentIdLessThan(Integer value) {
            addCriterion("Group_Treatment_ID <", value, "groupTreatmentId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("Group_Treatment_ID <=", value, "groupTreatmentId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentIdIn(List<Integer> values) {
            addCriterion("Group_Treatment_ID in", values, "groupTreatmentId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentIdNotIn(List<Integer> values) {
            addCriterion("Group_Treatment_ID not in", values, "groupTreatmentId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentIdBetween(Integer value1, Integer value2) {
            addCriterion("Group_Treatment_ID between", value1, value2, "groupTreatmentId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Group_Treatment_ID not between", value1, value2, "groupTreatmentId");
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

        public Criteria andGroupTreatmentCodeIsNull() {
            addCriterion("Group_Treatment_Code is null");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentCodeIsNotNull() {
            addCriterion("Group_Treatment_Code is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentCodeEqualTo(String value) {
            addCriterion("Group_Treatment_Code =", value, "groupTreatmentCode");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentCodeNotEqualTo(String value) {
            addCriterion("Group_Treatment_Code <>", value, "groupTreatmentCode");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentCodeGreaterThan(String value) {
            addCriterion("Group_Treatment_Code >", value, "groupTreatmentCode");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Group_Treatment_Code >=", value, "groupTreatmentCode");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentCodeLessThan(String value) {
            addCriterion("Group_Treatment_Code <", value, "groupTreatmentCode");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentCodeLessThanOrEqualTo(String value) {
            addCriterion("Group_Treatment_Code <=", value, "groupTreatmentCode");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentCodeLike(String value) {
            addCriterion("Group_Treatment_Code like", value, "groupTreatmentCode");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentCodeNotLike(String value) {
            addCriterion("Group_Treatment_Code not like", value, "groupTreatmentCode");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentCodeIn(List<String> values) {
            addCriterion("Group_Treatment_Code in", values, "groupTreatmentCode");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentCodeNotIn(List<String> values) {
            addCriterion("Group_Treatment_Code not in", values, "groupTreatmentCode");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentCodeBetween(String value1, String value2) {
            addCriterion("Group_Treatment_Code between", value1, value2, "groupTreatmentCode");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentCodeNotBetween(String value1, String value2) {
            addCriterion("Group_Treatment_Code not between", value1, value2, "groupTreatmentCode");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentNameIsNull() {
            addCriterion("Group_Treatment_Name is null");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentNameIsNotNull() {
            addCriterion("Group_Treatment_Name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentNameEqualTo(String value) {
            addCriterion("Group_Treatment_Name =", value, "groupTreatmentName");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentNameNotEqualTo(String value) {
            addCriterion("Group_Treatment_Name <>", value, "groupTreatmentName");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentNameGreaterThan(String value) {
            addCriterion("Group_Treatment_Name >", value, "groupTreatmentName");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("Group_Treatment_Name >=", value, "groupTreatmentName");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentNameLessThan(String value) {
            addCriterion("Group_Treatment_Name <", value, "groupTreatmentName");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentNameLessThanOrEqualTo(String value) {
            addCriterion("Group_Treatment_Name <=", value, "groupTreatmentName");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentNameLike(String value) {
            addCriterion("Group_Treatment_Name like", value, "groupTreatmentName");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentNameNotLike(String value) {
            addCriterion("Group_Treatment_Name not like", value, "groupTreatmentName");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentNameIn(List<String> values) {
            addCriterion("Group_Treatment_Name in", values, "groupTreatmentName");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentNameNotIn(List<String> values) {
            addCriterion("Group_Treatment_Name not in", values, "groupTreatmentName");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentNameBetween(String value1, String value2) {
            addCriterion("Group_Treatment_Name between", value1, value2, "groupTreatmentName");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentNameNotBetween(String value1, String value2) {
            addCriterion("Group_Treatment_Name not between", value1, value2, "groupTreatmentName");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentScopeIsNull() {
            addCriterion("Group_Treatment_Scope is null");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentScopeIsNotNull() {
            addCriterion("Group_Treatment_Scope is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentScopeEqualTo(String value) {
            addCriterion("Group_Treatment_Scope =", value, "groupTreatmentScope");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentScopeNotEqualTo(String value) {
            addCriterion("Group_Treatment_Scope <>", value, "groupTreatmentScope");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentScopeGreaterThan(String value) {
            addCriterion("Group_Treatment_Scope >", value, "groupTreatmentScope");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentScopeGreaterThanOrEqualTo(String value) {
            addCriterion("Group_Treatment_Scope >=", value, "groupTreatmentScope");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentScopeLessThan(String value) {
            addCriterion("Group_Treatment_Scope <", value, "groupTreatmentScope");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentScopeLessThanOrEqualTo(String value) {
            addCriterion("Group_Treatment_Scope <=", value, "groupTreatmentScope");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentScopeLike(String value) {
            addCriterion("Group_Treatment_Scope like", value, "groupTreatmentScope");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentScopeNotLike(String value) {
            addCriterion("Group_Treatment_Scope not like", value, "groupTreatmentScope");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentScopeIn(List<String> values) {
            addCriterion("Group_Treatment_Scope in", values, "groupTreatmentScope");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentScopeNotIn(List<String> values) {
            addCriterion("Group_Treatment_Scope not in", values, "groupTreatmentScope");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentScopeBetween(String value1, String value2) {
            addCriterion("Group_Treatment_Scope between", value1, value2, "groupTreatmentScope");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentScopeNotBetween(String value1, String value2) {
            addCriterion("Group_Treatment_Scope not between", value1, value2, "groupTreatmentScope");
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