package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class GroupTreatmentItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupTreatmentItemsExample() {
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

        public Criteria andGroupTreatmentItemsIdIsNull() {
            addCriterion("Group_Treatment_Items_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentItemsIdIsNotNull() {
            addCriterion("Group_Treatment_Items_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentItemsIdEqualTo(Integer value) {
            addCriterion("Group_Treatment_Items_ID =", value, "groupTreatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentItemsIdNotEqualTo(Integer value) {
            addCriterion("Group_Treatment_Items_ID <>", value, "groupTreatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentItemsIdGreaterThan(Integer value) {
            addCriterion("Group_Treatment_Items_ID >", value, "groupTreatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Group_Treatment_Items_ID >=", value, "groupTreatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentItemsIdLessThan(Integer value) {
            addCriterion("Group_Treatment_Items_ID <", value, "groupTreatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Group_Treatment_Items_ID <=", value, "groupTreatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentItemsIdIn(List<Integer> values) {
            addCriterion("Group_Treatment_Items_ID in", values, "groupTreatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentItemsIdNotIn(List<Integer> values) {
            addCriterion("Group_Treatment_Items_ID not in", values, "groupTreatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("Group_Treatment_Items_ID between", value1, value2, "groupTreatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupTreatmentItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Group_Treatment_Items_ID not between", value1, value2, "groupTreatmentItemsId");
            return (Criteria) this;
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

        public Criteria andFmedicalItemsIdIsNull() {
            addCriterion("Fmedical_Items_ID is null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdIsNotNull() {
            addCriterion("Fmedical_Items_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdEqualTo(Integer value) {
            addCriterion("Fmedical_Items_ID =", value, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdNotEqualTo(Integer value) {
            addCriterion("Fmedical_Items_ID <>", value, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdGreaterThan(Integer value) {
            addCriterion("Fmedical_Items_ID >", value, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fmedical_Items_ID >=", value, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdLessThan(Integer value) {
            addCriterion("Fmedical_Items_ID <", value, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Fmedical_Items_ID <=", value, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdIn(List<Integer> values) {
            addCriterion("Fmedical_Items_ID in", values, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdNotIn(List<Integer> values) {
            addCriterion("Fmedical_Items_ID not in", values, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("Fmedical_Items_ID between", value1, value2, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Fmedical_Items_ID not between", value1, value2, "fmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("Quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("Quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("Quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("Quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("Quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("Quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("Quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("Quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("Quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("Quantity not between", value1, value2, "quantity");
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