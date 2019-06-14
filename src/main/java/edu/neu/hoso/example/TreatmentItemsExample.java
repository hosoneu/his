package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class TreatmentItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TreatmentItemsExample() {
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

        public Criteria andTreatmentItemsIdIsNull() {
            addCriterion("Treatment_Items_ID is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentItemsIdIsNotNull() {
            addCriterion("Treatment_Items_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentItemsIdEqualTo(Integer value) {
            addCriterion("Treatment_Items_ID =", value, "treatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andTreatmentItemsIdNotEqualTo(Integer value) {
            addCriterion("Treatment_Items_ID <>", value, "treatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andTreatmentItemsIdGreaterThan(Integer value) {
            addCriterion("Treatment_Items_ID >", value, "treatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andTreatmentItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Treatment_Items_ID >=", value, "treatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andTreatmentItemsIdLessThan(Integer value) {
            addCriterion("Treatment_Items_ID <", value, "treatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andTreatmentItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Treatment_Items_ID <=", value, "treatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andTreatmentItemsIdIn(List<Integer> values) {
            addCriterion("Treatment_Items_ID in", values, "treatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andTreatmentItemsIdNotIn(List<Integer> values) {
            addCriterion("Treatment_Items_ID not in", values, "treatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andTreatmentItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("Treatment_Items_ID between", value1, value2, "treatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andTreatmentItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Treatment_Items_ID not between", value1, value2, "treatmentItemsId");
            return (Criteria) this;
        }

        public Criteria andTreatmentIdIsNull() {
            addCriterion("Treatment_ID is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentIdIsNotNull() {
            addCriterion("Treatment_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentIdEqualTo(Integer value) {
            addCriterion("Treatment_ID =", value, "treatmentId");
            return (Criteria) this;
        }

        public Criteria andTreatmentIdNotEqualTo(Integer value) {
            addCriterion("Treatment_ID <>", value, "treatmentId");
            return (Criteria) this;
        }

        public Criteria andTreatmentIdGreaterThan(Integer value) {
            addCriterion("Treatment_ID >", value, "treatmentId");
            return (Criteria) this;
        }

        public Criteria andTreatmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Treatment_ID >=", value, "treatmentId");
            return (Criteria) this;
        }

        public Criteria andTreatmentIdLessThan(Integer value) {
            addCriterion("Treatment_ID <", value, "treatmentId");
            return (Criteria) this;
        }

        public Criteria andTreatmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("Treatment_ID <=", value, "treatmentId");
            return (Criteria) this;
        }

        public Criteria andTreatmentIdIn(List<Integer> values) {
            addCriterion("Treatment_ID in", values, "treatmentId");
            return (Criteria) this;
        }

        public Criteria andTreatmentIdNotIn(List<Integer> values) {
            addCriterion("Treatment_ID not in", values, "treatmentId");
            return (Criteria) this;
        }

        public Criteria andTreatmentIdBetween(Integer value1, Integer value2) {
            addCriterion("Treatment_ID between", value1, value2, "treatmentId");
            return (Criteria) this;
        }

        public Criteria andTreatmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Treatment_ID not between", value1, value2, "treatmentId");
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

        public Criteria andActualQuantityIsNull() {
            addCriterion("Actual_Quantity is null");
            return (Criteria) this;
        }

        public Criteria andActualQuantityIsNotNull() {
            addCriterion("Actual_Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andActualQuantityEqualTo(Integer value) {
            addCriterion("Actual_Quantity =", value, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityNotEqualTo(Integer value) {
            addCriterion("Actual_Quantity <>", value, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityGreaterThan(Integer value) {
            addCriterion("Actual_Quantity >", value, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Actual_Quantity >=", value, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityLessThan(Integer value) {
            addCriterion("Actual_Quantity <", value, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("Actual_Quantity <=", value, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityIn(List<Integer> values) {
            addCriterion("Actual_Quantity in", values, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityNotIn(List<Integer> values) {
            addCriterion("Actual_Quantity not in", values, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityBetween(Integer value1, Integer value2) {
            addCriterion("Actual_Quantity between", value1, value2, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andActualQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("Actual_Quantity not between", value1, value2, "actualQuantity");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdIsNull() {
            addCriterion("Expense_Items_ID is null");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdIsNotNull() {
            addCriterion("Expense_Items_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdEqualTo(Integer value) {
            addCriterion("Expense_Items_ID =", value, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdNotEqualTo(Integer value) {
            addCriterion("Expense_Items_ID <>", value, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdGreaterThan(Integer value) {
            addCriterion("Expense_Items_ID >", value, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Expense_Items_ID >=", value, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdLessThan(Integer value) {
            addCriterion("Expense_Items_ID <", value, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Expense_Items_ID <=", value, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdIn(List<Integer> values) {
            addCriterion("Expense_Items_ID in", values, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdNotIn(List<Integer> values) {
            addCriterion("Expense_Items_ID not in", values, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("Expense_Items_ID between", value1, value2, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andExpenseItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Expense_Items_ID not between", value1, value2, "expenseItemsId");
            return (Criteria) this;
        }

        public Criteria andValidStatusIsNull() {
            addCriterion("Valid_Status is null");
            return (Criteria) this;
        }

        public Criteria andValidStatusIsNotNull() {
            addCriterion("Valid_Status is not null");
            return (Criteria) this;
        }

        public Criteria andValidStatusEqualTo(String value) {
            addCriterion("Valid_Status =", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotEqualTo(String value) {
            addCriterion("Valid_Status <>", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusGreaterThan(String value) {
            addCriterion("Valid_Status >", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Valid_Status >=", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusLessThan(String value) {
            addCriterion("Valid_Status <", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusLessThanOrEqualTo(String value) {
            addCriterion("Valid_Status <=", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusLike(String value) {
            addCriterion("Valid_Status like", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotLike(String value) {
            addCriterion("Valid_Status not like", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusIn(List<String> values) {
            addCriterion("Valid_Status in", values, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotIn(List<String> values) {
            addCriterion("Valid_Status not in", values, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusBetween(String value1, String value2) {
            addCriterion("Valid_Status between", value1, value2, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotBetween(String value1, String value2) {
            addCriterion("Valid_Status not between", value1, value2, "validStatus");
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