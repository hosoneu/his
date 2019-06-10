package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class ConstantItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConstantItemsExample() {
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

        public Criteria andConstantItemsIdIsNull() {
            addCriterion("Constant_Items_ID is null");
            return (Criteria) this;
        }

        public Criteria andConstantItemsIdIsNotNull() {
            addCriterion("Constant_Items_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConstantItemsIdEqualTo(Integer value) {
            addCriterion("Constant_Items_ID =", value, "constantItemsId");
            return (Criteria) this;
        }

        public Criteria andConstantItemsIdNotEqualTo(Integer value) {
            addCriterion("Constant_Items_ID <>", value, "constantItemsId");
            return (Criteria) this;
        }

        public Criteria andConstantItemsIdGreaterThan(Integer value) {
            addCriterion("Constant_Items_ID >", value, "constantItemsId");
            return (Criteria) this;
        }

        public Criteria andConstantItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Constant_Items_ID >=", value, "constantItemsId");
            return (Criteria) this;
        }

        public Criteria andConstantItemsIdLessThan(Integer value) {
            addCriterion("Constant_Items_ID <", value, "constantItemsId");
            return (Criteria) this;
        }

        public Criteria andConstantItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Constant_Items_ID <=", value, "constantItemsId");
            return (Criteria) this;
        }

        public Criteria andConstantItemsIdIn(List<Integer> values) {
            addCriterion("Constant_Items_ID in", values, "constantItemsId");
            return (Criteria) this;
        }

        public Criteria andConstantItemsIdNotIn(List<Integer> values) {
            addCriterion("Constant_Items_ID not in", values, "constantItemsId");
            return (Criteria) this;
        }

        public Criteria andConstantItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("Constant_Items_ID between", value1, value2, "constantItemsId");
            return (Criteria) this;
        }

        public Criteria andConstantItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Constant_Items_ID not between", value1, value2, "constantItemsId");
            return (Criteria) this;
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

        public Criteria andConstantItemsCodeIsNull() {
            addCriterion("Constant_Items_Code is null");
            return (Criteria) this;
        }

        public Criteria andConstantItemsCodeIsNotNull() {
            addCriterion("Constant_Items_Code is not null");
            return (Criteria) this;
        }

        public Criteria andConstantItemsCodeEqualTo(String value) {
            addCriterion("Constant_Items_Code =", value, "constantItemsCode");
            return (Criteria) this;
        }

        public Criteria andConstantItemsCodeNotEqualTo(String value) {
            addCriterion("Constant_Items_Code <>", value, "constantItemsCode");
            return (Criteria) this;
        }

        public Criteria andConstantItemsCodeGreaterThan(String value) {
            addCriterion("Constant_Items_Code >", value, "constantItemsCode");
            return (Criteria) this;
        }

        public Criteria andConstantItemsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Constant_Items_Code >=", value, "constantItemsCode");
            return (Criteria) this;
        }

        public Criteria andConstantItemsCodeLessThan(String value) {
            addCriterion("Constant_Items_Code <", value, "constantItemsCode");
            return (Criteria) this;
        }

        public Criteria andConstantItemsCodeLessThanOrEqualTo(String value) {
            addCriterion("Constant_Items_Code <=", value, "constantItemsCode");
            return (Criteria) this;
        }

        public Criteria andConstantItemsCodeLike(String value) {
            addCriterion("Constant_Items_Code like", value, "constantItemsCode");
            return (Criteria) this;
        }

        public Criteria andConstantItemsCodeNotLike(String value) {
            addCriterion("Constant_Items_Code not like", value, "constantItemsCode");
            return (Criteria) this;
        }

        public Criteria andConstantItemsCodeIn(List<String> values) {
            addCriterion("Constant_Items_Code in", values, "constantItemsCode");
            return (Criteria) this;
        }

        public Criteria andConstantItemsCodeNotIn(List<String> values) {
            addCriterion("Constant_Items_Code not in", values, "constantItemsCode");
            return (Criteria) this;
        }

        public Criteria andConstantItemsCodeBetween(String value1, String value2) {
            addCriterion("Constant_Items_Code between", value1, value2, "constantItemsCode");
            return (Criteria) this;
        }

        public Criteria andConstantItemsCodeNotBetween(String value1, String value2) {
            addCriterion("Constant_Items_Code not between", value1, value2, "constantItemsCode");
            return (Criteria) this;
        }

        public Criteria andConstantItemsNameIsNull() {
            addCriterion("Constant_Items_Name is null");
            return (Criteria) this;
        }

        public Criteria andConstantItemsNameIsNotNull() {
            addCriterion("Constant_Items_Name is not null");
            return (Criteria) this;
        }

        public Criteria andConstantItemsNameEqualTo(String value) {
            addCriterion("Constant_Items_Name =", value, "constantItemsName");
            return (Criteria) this;
        }

        public Criteria andConstantItemsNameNotEqualTo(String value) {
            addCriterion("Constant_Items_Name <>", value, "constantItemsName");
            return (Criteria) this;
        }

        public Criteria andConstantItemsNameGreaterThan(String value) {
            addCriterion("Constant_Items_Name >", value, "constantItemsName");
            return (Criteria) this;
        }

        public Criteria andConstantItemsNameGreaterThanOrEqualTo(String value) {
            addCriterion("Constant_Items_Name >=", value, "constantItemsName");
            return (Criteria) this;
        }

        public Criteria andConstantItemsNameLessThan(String value) {
            addCriterion("Constant_Items_Name <", value, "constantItemsName");
            return (Criteria) this;
        }

        public Criteria andConstantItemsNameLessThanOrEqualTo(String value) {
            addCriterion("Constant_Items_Name <=", value, "constantItemsName");
            return (Criteria) this;
        }

        public Criteria andConstantItemsNameLike(String value) {
            addCriterion("Constant_Items_Name like", value, "constantItemsName");
            return (Criteria) this;
        }

        public Criteria andConstantItemsNameNotLike(String value) {
            addCriterion("Constant_Items_Name not like", value, "constantItemsName");
            return (Criteria) this;
        }

        public Criteria andConstantItemsNameIn(List<String> values) {
            addCriterion("Constant_Items_Name in", values, "constantItemsName");
            return (Criteria) this;
        }

        public Criteria andConstantItemsNameNotIn(List<String> values) {
            addCriterion("Constant_Items_Name not in", values, "constantItemsName");
            return (Criteria) this;
        }

        public Criteria andConstantItemsNameBetween(String value1, String value2) {
            addCriterion("Constant_Items_Name between", value1, value2, "constantItemsName");
            return (Criteria) this;
        }

        public Criteria andConstantItemsNameNotBetween(String value1, String value2) {
            addCriterion("Constant_Items_Name not between", value1, value2, "constantItemsName");
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