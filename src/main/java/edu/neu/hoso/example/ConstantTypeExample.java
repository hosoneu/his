package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class ConstantTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConstantTypeExample() {
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

        public Criteria andConstantTypeIdIsNull() {
            addCriterion("Constant_Type_ID is null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdIsNotNull() {
            addCriterion("Constant_Type_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdEqualTo(Integer value) {
            addCriterion("Constant_Type_ID =", value, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdNotEqualTo(Integer value) {
            addCriterion("Constant_Type_ID <>", value, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdGreaterThan(Integer value) {
            addCriterion("Constant_Type_ID >", value, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Constant_Type_ID >=", value, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdLessThan(Integer value) {
            addCriterion("Constant_Type_ID <", value, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Constant_Type_ID <=", value, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdIn(List<Integer> values) {
            addCriterion("Constant_Type_ID in", values, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdNotIn(List<Integer> values) {
            addCriterion("Constant_Type_ID not in", values, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("Constant_Type_ID between", value1, value2, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Constant_Type_ID not between", value1, value2, "constantTypeId");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeIsNull() {
            addCriterion("Constant_Type_Code is null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeIsNotNull() {
            addCriterion("Constant_Type_Code is not null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeEqualTo(String value) {
            addCriterion("Constant_Type_Code =", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeNotEqualTo(String value) {
            addCriterion("Constant_Type_Code <>", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeGreaterThan(String value) {
            addCriterion("Constant_Type_Code >", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Constant_Type_Code >=", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeLessThan(String value) {
            addCriterion("Constant_Type_Code <", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("Constant_Type_Code <=", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeLike(String value) {
            addCriterion("Constant_Type_Code like", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeNotLike(String value) {
            addCriterion("Constant_Type_Code not like", value, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeIn(List<String> values) {
            addCriterion("Constant_Type_Code in", values, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeNotIn(List<String> values) {
            addCriterion("Constant_Type_Code not in", values, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeBetween(String value1, String value2) {
            addCriterion("Constant_Type_Code between", value1, value2, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeCodeNotBetween(String value1, String value2) {
            addCriterion("Constant_Type_Code not between", value1, value2, "constantTypeCode");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameIsNull() {
            addCriterion("Constant_Type_Name is null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameIsNotNull() {
            addCriterion("Constant_Type_Name is not null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameEqualTo(String value) {
            addCriterion("Constant_Type_Name =", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameNotEqualTo(String value) {
            addCriterion("Constant_Type_Name <>", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameGreaterThan(String value) {
            addCriterion("Constant_Type_Name >", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("Constant_Type_Name >=", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameLessThan(String value) {
            addCriterion("Constant_Type_Name <", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameLessThanOrEqualTo(String value) {
            addCriterion("Constant_Type_Name <=", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameLike(String value) {
            addCriterion("Constant_Type_Name like", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameNotLike(String value) {
            addCriterion("Constant_Type_Name not like", value, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameIn(List<String> values) {
            addCriterion("Constant_Type_Name in", values, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameNotIn(List<String> values) {
            addCriterion("Constant_Type_Name not in", values, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameBetween(String value1, String value2) {
            addCriterion("Constant_Type_Name between", value1, value2, "constantTypeName");
            return (Criteria) this;
        }

        public Criteria andConstantTypeNameNotBetween(String value1, String value2) {
            addCriterion("Constant_Type_Name not between", value1, value2, "constantTypeName");
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