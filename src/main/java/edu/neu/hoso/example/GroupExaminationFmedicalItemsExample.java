package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class GroupExaminationFmedicalItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupExaminationFmedicalItemsExample() {
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

        public Criteria andGroupExaminationFmedicalItemsIdIsNull() {
            addCriterion("Group_Examination_Fmedical_Items_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdIsNotNull() {
            addCriterion("Group_Examination_Fmedical_Items_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdEqualTo(Integer value) {
            addCriterion("Group_Examination_Fmedical_Items_ID =", value, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdNotEqualTo(Integer value) {
            addCriterion("Group_Examination_Fmedical_Items_ID <>", value, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdGreaterThan(Integer value) {
            addCriterion("Group_Examination_Fmedical_Items_ID >", value, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Group_Examination_Fmedical_Items_ID >=", value, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdLessThan(Integer value) {
            addCriterion("Group_Examination_Fmedical_Items_ID <", value, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Group_Examination_Fmedical_Items_ID <=", value, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdIn(List<Integer> values) {
            addCriterion("Group_Examination_Fmedical_Items_ID in", values, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdNotIn(List<Integer> values) {
            addCriterion("Group_Examination_Fmedical_Items_ID not in", values, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("Group_Examination_Fmedical_Items_ID between", value1, value2, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Group_Examination_Fmedical_Items_ID not between", value1, value2, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
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

        public Criteria andPurposeRequirementsIsNull() {
            addCriterion("Purpose_Requirements is null");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsIsNotNull() {
            addCriterion("Purpose_Requirements is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsEqualTo(String value) {
            addCriterion("Purpose_Requirements =", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsNotEqualTo(String value) {
            addCriterion("Purpose_Requirements <>", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsGreaterThan(String value) {
            addCriterion("Purpose_Requirements >", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsGreaterThanOrEqualTo(String value) {
            addCriterion("Purpose_Requirements >=", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsLessThan(String value) {
            addCriterion("Purpose_Requirements <", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsLessThanOrEqualTo(String value) {
            addCriterion("Purpose_Requirements <=", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsLike(String value) {
            addCriterion("Purpose_Requirements like", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsNotLike(String value) {
            addCriterion("Purpose_Requirements not like", value, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsIn(List<String> values) {
            addCriterion("Purpose_Requirements in", values, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsNotIn(List<String> values) {
            addCriterion("Purpose_Requirements not in", values, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsBetween(String value1, String value2) {
            addCriterion("Purpose_Requirements between", value1, value2, "purposeRequirements");
            return (Criteria) this;
        }

        public Criteria andPurposeRequirementsNotBetween(String value1, String value2) {
            addCriterion("Purpose_Requirements not between", value1, value2, "purposeRequirements");
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