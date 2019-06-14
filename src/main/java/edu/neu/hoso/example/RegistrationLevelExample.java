package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class RegistrationLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegistrationLevelExample() {
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

        public Criteria andRegistrationLevelIdIsNull() {
            addCriterion("Registration_Level_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdIsNotNull() {
            addCriterion("Registration_Level_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdEqualTo(Integer value) {
            addCriterion("Registration_Level_ID =", value, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdNotEqualTo(Integer value) {
            addCriterion("Registration_Level_ID <>", value, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdGreaterThan(Integer value) {
            addCriterion("Registration_Level_ID >", value, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Registration_Level_ID >=", value, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdLessThan(Integer value) {
            addCriterion("Registration_Level_ID <", value, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("Registration_Level_ID <=", value, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdIn(List<Integer> values) {
            addCriterion("Registration_Level_ID in", values, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdNotIn(List<Integer> values) {
            addCriterion("Registration_Level_ID not in", values, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("Registration_Level_ID between", value1, value2, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Registration_Level_ID not between", value1, value2, "registrationLevelId");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelNameIsNull() {
            addCriterion("Registration_Level_Name is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelNameIsNotNull() {
            addCriterion("Registration_Level_Name is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelNameEqualTo(String value) {
            addCriterion("Registration_Level_Name =", value, "registrationLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelNameNotEqualTo(String value) {
            addCriterion("Registration_Level_Name <>", value, "registrationLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelNameGreaterThan(String value) {
            addCriterion("Registration_Level_Name >", value, "registrationLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("Registration_Level_Name >=", value, "registrationLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelNameLessThan(String value) {
            addCriterion("Registration_Level_Name <", value, "registrationLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelNameLessThanOrEqualTo(String value) {
            addCriterion("Registration_Level_Name <=", value, "registrationLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelNameLike(String value) {
            addCriterion("Registration_Level_Name like", value, "registrationLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelNameNotLike(String value) {
            addCriterion("Registration_Level_Name not like", value, "registrationLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelNameIn(List<String> values) {
            addCriterion("Registration_Level_Name in", values, "registrationLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelNameNotIn(List<String> values) {
            addCriterion("Registration_Level_Name not in", values, "registrationLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelNameBetween(String value1, String value2) {
            addCriterion("Registration_Level_Name between", value1, value2, "registrationLevelName");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelNameNotBetween(String value1, String value2) {
            addCriterion("Registration_Level_Name not between", value1, value2, "registrationLevelName");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("Is_Default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("Is_Default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(String value) {
            addCriterion("Is_Default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(String value) {
            addCriterion("Is_Default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(String value) {
            addCriterion("Is_Default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("Is_Default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(String value) {
            addCriterion("Is_Default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(String value) {
            addCriterion("Is_Default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLike(String value) {
            addCriterion("Is_Default like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotLike(String value) {
            addCriterion("Is_Default not like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<String> values) {
            addCriterion("Is_Default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<String> values) {
            addCriterion("Is_Default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(String value1, String value2) {
            addCriterion("Is_Default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(String value1, String value2) {
            addCriterion("Is_Default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andRegistrationSequenceIsNull() {
            addCriterion("Registration_Sequence is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationSequenceIsNotNull() {
            addCriterion("Registration_Sequence is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationSequenceEqualTo(Integer value) {
            addCriterion("Registration_Sequence =", value, "registrationSequence");
            return (Criteria) this;
        }

        public Criteria andRegistrationSequenceNotEqualTo(Integer value) {
            addCriterion("Registration_Sequence <>", value, "registrationSequence");
            return (Criteria) this;
        }

        public Criteria andRegistrationSequenceGreaterThan(Integer value) {
            addCriterion("Registration_Sequence >", value, "registrationSequence");
            return (Criteria) this;
        }

        public Criteria andRegistrationSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Registration_Sequence >=", value, "registrationSequence");
            return (Criteria) this;
        }

        public Criteria andRegistrationSequenceLessThan(Integer value) {
            addCriterion("Registration_Sequence <", value, "registrationSequence");
            return (Criteria) this;
        }

        public Criteria andRegistrationSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("Registration_Sequence <=", value, "registrationSequence");
            return (Criteria) this;
        }

        public Criteria andRegistrationSequenceIn(List<Integer> values) {
            addCriterion("Registration_Sequence in", values, "registrationSequence");
            return (Criteria) this;
        }

        public Criteria andRegistrationSequenceNotIn(List<Integer> values) {
            addCriterion("Registration_Sequence not in", values, "registrationSequence");
            return (Criteria) this;
        }

        public Criteria andRegistrationSequenceBetween(Integer value1, Integer value2) {
            addCriterion("Registration_Sequence between", value1, value2, "registrationSequence");
            return (Criteria) this;
        }

        public Criteria andRegistrationSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("Registration_Sequence not between", value1, value2, "registrationSequence");
            return (Criteria) this;
        }

        public Criteria andRegistrationCostIsNull() {
            addCriterion("Registration_Cost is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationCostIsNotNull() {
            addCriterion("Registration_Cost is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationCostEqualTo(Double value) {
            addCriterion("Registration_Cost =", value, "registrationCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationCostNotEqualTo(Double value) {
            addCriterion("Registration_Cost <>", value, "registrationCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationCostGreaterThan(Double value) {
            addCriterion("Registration_Cost >", value, "registrationCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationCostGreaterThanOrEqualTo(Double value) {
            addCriterion("Registration_Cost >=", value, "registrationCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationCostLessThan(Double value) {
            addCriterion("Registration_Cost <", value, "registrationCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationCostLessThanOrEqualTo(Double value) {
            addCriterion("Registration_Cost <=", value, "registrationCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationCostIn(List<Double> values) {
            addCriterion("Registration_Cost in", values, "registrationCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationCostNotIn(List<Double> values) {
            addCriterion("Registration_Cost not in", values, "registrationCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationCostBetween(Double value1, Double value2) {
            addCriterion("Registration_Cost between", value1, value2, "registrationCost");
            return (Criteria) this;
        }

        public Criteria andRegistrationCostNotBetween(Double value1, Double value2) {
            addCriterion("Registration_Cost not between", value1, value2, "registrationCost");
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