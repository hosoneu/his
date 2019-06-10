package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class CalculationTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CalculationTypeExample() {
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

        public Criteria andCalculationTypeIdIsNull() {
            addCriterion("Calculation_Type_ID is null");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdIsNotNull() {
            addCriterion("Calculation_Type_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdEqualTo(Integer value) {
            addCriterion("Calculation_Type_ID =", value, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdNotEqualTo(Integer value) {
            addCriterion("Calculation_Type_ID <>", value, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdGreaterThan(Integer value) {
            addCriterion("Calculation_Type_ID >", value, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Calculation_Type_ID >=", value, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdLessThan(Integer value) {
            addCriterion("Calculation_Type_ID <", value, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Calculation_Type_ID <=", value, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdIn(List<Integer> values) {
            addCriterion("Calculation_Type_ID in", values, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdNotIn(List<Integer> values) {
            addCriterion("Calculation_Type_ID not in", values, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("Calculation_Type_ID between", value1, value2, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Calculation_Type_ID not between", value1, value2, "calculationTypeId");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNameIsNull() {
            addCriterion("Calculation_Type_Name is null");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNameIsNotNull() {
            addCriterion("Calculation_Type_Name is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNameEqualTo(String value) {
            addCriterion("Calculation_Type_Name =", value, "calculationTypeName");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNameNotEqualTo(String value) {
            addCriterion("Calculation_Type_Name <>", value, "calculationTypeName");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNameGreaterThan(String value) {
            addCriterion("Calculation_Type_Name >", value, "calculationTypeName");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("Calculation_Type_Name >=", value, "calculationTypeName");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNameLessThan(String value) {
            addCriterion("Calculation_Type_Name <", value, "calculationTypeName");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNameLessThanOrEqualTo(String value) {
            addCriterion("Calculation_Type_Name <=", value, "calculationTypeName");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNameLike(String value) {
            addCriterion("Calculation_Type_Name like", value, "calculationTypeName");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNameNotLike(String value) {
            addCriterion("Calculation_Type_Name not like", value, "calculationTypeName");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNameIn(List<String> values) {
            addCriterion("Calculation_Type_Name in", values, "calculationTypeName");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNameNotIn(List<String> values) {
            addCriterion("Calculation_Type_Name not in", values, "calculationTypeName");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNameBetween(String value1, String value2) {
            addCriterion("Calculation_Type_Name between", value1, value2, "calculationTypeName");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNameNotBetween(String value1, String value2) {
            addCriterion("Calculation_Type_Name not between", value1, value2, "calculationTypeName");
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