package edu.neu.hoso.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GroupPrescriptionItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupPrescriptionItemsExample() {
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

        public Criteria andGroupPrescriptionItemsIdIsNull() {
            addCriterion("Group_Prescription_Items_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionItemsIdIsNotNull() {
            addCriterion("Group_Prescription_Items_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionItemsIdEqualTo(Integer value) {
            addCriterion("Group_Prescription_Items_ID =", value, "groupPrescriptionItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionItemsIdNotEqualTo(Integer value) {
            addCriterion("Group_Prescription_Items_ID <>", value, "groupPrescriptionItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionItemsIdGreaterThan(Integer value) {
            addCriterion("Group_Prescription_Items_ID >", value, "groupPrescriptionItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Group_Prescription_Items_ID >=", value, "groupPrescriptionItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionItemsIdLessThan(Integer value) {
            addCriterion("Group_Prescription_Items_ID <", value, "groupPrescriptionItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Group_Prescription_Items_ID <=", value, "groupPrescriptionItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionItemsIdIn(List<Integer> values) {
            addCriterion("Group_Prescription_Items_ID in", values, "groupPrescriptionItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionItemsIdNotIn(List<Integer> values) {
            addCriterion("Group_Prescription_Items_ID not in", values, "groupPrescriptionItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("Group_Prescription_Items_ID between", value1, value2, "groupPrescriptionItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupPrescriptionItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Group_Prescription_Items_ID not between", value1, value2, "groupPrescriptionItemsId");
            return (Criteria) this;
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

        public Criteria andDragsIdIsNull() {
            addCriterion("Drags_ID is null");
            return (Criteria) this;
        }

        public Criteria andDragsIdIsNotNull() {
            addCriterion("Drags_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDragsIdEqualTo(Integer value) {
            addCriterion("Drags_ID =", value, "dragsId");
            return (Criteria) this;
        }

        public Criteria andDragsIdNotEqualTo(Integer value) {
            addCriterion("Drags_ID <>", value, "dragsId");
            return (Criteria) this;
        }

        public Criteria andDragsIdGreaterThan(Integer value) {
            addCriterion("Drags_ID >", value, "dragsId");
            return (Criteria) this;
        }

        public Criteria andDragsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Drags_ID >=", value, "dragsId");
            return (Criteria) this;
        }

        public Criteria andDragsIdLessThan(Integer value) {
            addCriterion("Drags_ID <", value, "dragsId");
            return (Criteria) this;
        }

        public Criteria andDragsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Drags_ID <=", value, "dragsId");
            return (Criteria) this;
        }

        public Criteria andDragsIdIn(List<Integer> values) {
            addCriterion("Drags_ID in", values, "dragsId");
            return (Criteria) this;
        }

        public Criteria andDragsIdNotIn(List<Integer> values) {
            addCriterion("Drags_ID not in", values, "dragsId");
            return (Criteria) this;
        }

        public Criteria andDragsIdBetween(Integer value1, Integer value2) {
            addCriterion("Drags_ID between", value1, value2, "dragsId");
            return (Criteria) this;
        }

        public Criteria andDragsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Drags_ID not between", value1, value2, "dragsId");
            return (Criteria) this;
        }

        public Criteria andUsageIsNull() {
            addCriterion("Usage is null");
            return (Criteria) this;
        }

        public Criteria andUsageIsNotNull() {
            addCriterion("Usage is not null");
            return (Criteria) this;
        }

        public Criteria andUsageEqualTo(String value) {
            addCriterion("Usage =", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotEqualTo(String value) {
            addCriterion("Usage <>", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageGreaterThan(String value) {
            addCriterion("Usage >", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageGreaterThanOrEqualTo(String value) {
            addCriterion("Usage >=", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLessThan(String value) {
            addCriterion("Usage <", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLessThanOrEqualTo(String value) {
            addCriterion("Usage <=", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLike(String value) {
            addCriterion("Usage like", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotLike(String value) {
            addCriterion("Usage not like", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageIn(List<String> values) {
            addCriterion("Usage in", values, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotIn(List<String> values) {
            addCriterion("Usage not in", values, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageBetween(String value1, String value2) {
            addCriterion("Usage between", value1, value2, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotBetween(String value1, String value2) {
            addCriterion("Usage not between", value1, value2, "usage");
            return (Criteria) this;
        }

        public Criteria andDosageIsNull() {
            addCriterion("Dosage is null");
            return (Criteria) this;
        }

        public Criteria andDosageIsNotNull() {
            addCriterion("Dosage is not null");
            return (Criteria) this;
        }

        public Criteria andDosageEqualTo(BigDecimal value) {
            addCriterion("Dosage =", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotEqualTo(BigDecimal value) {
            addCriterion("Dosage <>", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThan(BigDecimal value) {
            addCriterion("Dosage >", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Dosage >=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThan(BigDecimal value) {
            addCriterion("Dosage <", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Dosage <=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageIn(List<BigDecimal> values) {
            addCriterion("Dosage in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotIn(List<BigDecimal> values) {
            addCriterion("Dosage not in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Dosage between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Dosage not between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andTimesIsNull() {
            addCriterion("Times is null");
            return (Criteria) this;
        }

        public Criteria andTimesIsNotNull() {
            addCriterion("Times is not null");
            return (Criteria) this;
        }

        public Criteria andTimesEqualTo(Integer value) {
            addCriterion("Times =", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotEqualTo(Integer value) {
            addCriterion("Times <>", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThan(Integer value) {
            addCriterion("Times >", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("Times >=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThan(Integer value) {
            addCriterion("Times <", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThanOrEqualTo(Integer value) {
            addCriterion("Times <=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesIn(List<Integer> values) {
            addCriterion("Times in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotIn(List<Integer> values) {
            addCriterion("Times not in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesBetween(Integer value1, Integer value2) {
            addCriterion("Times between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("Times not between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("Days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("Days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Integer value) {
            addCriterion("Days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Integer value) {
            addCriterion("Days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Integer value) {
            addCriterion("Days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("Days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Integer value) {
            addCriterion("Days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Integer value) {
            addCriterion("Days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Integer> values) {
            addCriterion("Days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Integer> values) {
            addCriterion("Days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Integer value1, Integer value2) {
            addCriterion("Days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("Days not between", value1, value2, "days");
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

        public Criteria andDrugsAdviceIsNull() {
            addCriterion("Drugs_Advice is null");
            return (Criteria) this;
        }

        public Criteria andDrugsAdviceIsNotNull() {
            addCriterion("Drugs_Advice is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsAdviceEqualTo(String value) {
            addCriterion("Drugs_Advice =", value, "drugsAdvice");
            return (Criteria) this;
        }

        public Criteria andDrugsAdviceNotEqualTo(String value) {
            addCriterion("Drugs_Advice <>", value, "drugsAdvice");
            return (Criteria) this;
        }

        public Criteria andDrugsAdviceGreaterThan(String value) {
            addCriterion("Drugs_Advice >", value, "drugsAdvice");
            return (Criteria) this;
        }

        public Criteria andDrugsAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("Drugs_Advice >=", value, "drugsAdvice");
            return (Criteria) this;
        }

        public Criteria andDrugsAdviceLessThan(String value) {
            addCriterion("Drugs_Advice <", value, "drugsAdvice");
            return (Criteria) this;
        }

        public Criteria andDrugsAdviceLessThanOrEqualTo(String value) {
            addCriterion("Drugs_Advice <=", value, "drugsAdvice");
            return (Criteria) this;
        }

        public Criteria andDrugsAdviceLike(String value) {
            addCriterion("Drugs_Advice like", value, "drugsAdvice");
            return (Criteria) this;
        }

        public Criteria andDrugsAdviceNotLike(String value) {
            addCriterion("Drugs_Advice not like", value, "drugsAdvice");
            return (Criteria) this;
        }

        public Criteria andDrugsAdviceIn(List<String> values) {
            addCriterion("Drugs_Advice in", values, "drugsAdvice");
            return (Criteria) this;
        }

        public Criteria andDrugsAdviceNotIn(List<String> values) {
            addCriterion("Drugs_Advice not in", values, "drugsAdvice");
            return (Criteria) this;
        }

        public Criteria andDrugsAdviceBetween(String value1, String value2) {
            addCriterion("Drugs_Advice between", value1, value2, "drugsAdvice");
            return (Criteria) this;
        }

        public Criteria andDrugsAdviceNotBetween(String value1, String value2) {
            addCriterion("Drugs_Advice not between", value1, value2, "drugsAdvice");
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