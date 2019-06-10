package edu.neu.hoso.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DayCalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DayCalExample() {
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

        public Criteria andDayCalIdIsNull() {
            addCriterion("Day_Cal_ID is null");
            return (Criteria) this;
        }

        public Criteria andDayCalIdIsNotNull() {
            addCriterion("Day_Cal_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDayCalIdEqualTo(Integer value) {
            addCriterion("Day_Cal_ID =", value, "dayCalId");
            return (Criteria) this;
        }

        public Criteria andDayCalIdNotEqualTo(Integer value) {
            addCriterion("Day_Cal_ID <>", value, "dayCalId");
            return (Criteria) this;
        }

        public Criteria andDayCalIdGreaterThan(Integer value) {
            addCriterion("Day_Cal_ID >", value, "dayCalId");
            return (Criteria) this;
        }

        public Criteria andDayCalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Day_Cal_ID >=", value, "dayCalId");
            return (Criteria) this;
        }

        public Criteria andDayCalIdLessThan(Integer value) {
            addCriterion("Day_Cal_ID <", value, "dayCalId");
            return (Criteria) this;
        }

        public Criteria andDayCalIdLessThanOrEqualTo(Integer value) {
            addCriterion("Day_Cal_ID <=", value, "dayCalId");
            return (Criteria) this;
        }

        public Criteria andDayCalIdIn(List<Integer> values) {
            addCriterion("Day_Cal_ID in", values, "dayCalId");
            return (Criteria) this;
        }

        public Criteria andDayCalIdNotIn(List<Integer> values) {
            addCriterion("Day_Cal_ID not in", values, "dayCalId");
            return (Criteria) this;
        }

        public Criteria andDayCalIdBetween(Integer value1, Integer value2) {
            addCriterion("Day_Cal_ID between", value1, value2, "dayCalId");
            return (Criteria) this;
        }

        public Criteria andDayCalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Day_Cal_ID not between", value1, value2, "dayCalId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("User_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("User_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("User_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("User_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("User_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("User_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("User_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("User_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("User_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDayCalStartdateIsNull() {
            addCriterion("Day_Cal_StartDate is null");
            return (Criteria) this;
        }

        public Criteria andDayCalStartdateIsNotNull() {
            addCriterion("Day_Cal_StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andDayCalStartdateEqualTo(Date value) {
            addCriterion("Day_Cal_StartDate =", value, "dayCalStartdate");
            return (Criteria) this;
        }

        public Criteria andDayCalStartdateNotEqualTo(Date value) {
            addCriterion("Day_Cal_StartDate <>", value, "dayCalStartdate");
            return (Criteria) this;
        }

        public Criteria andDayCalStartdateGreaterThan(Date value) {
            addCriterion("Day_Cal_StartDate >", value, "dayCalStartdate");
            return (Criteria) this;
        }

        public Criteria andDayCalStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("Day_Cal_StartDate >=", value, "dayCalStartdate");
            return (Criteria) this;
        }

        public Criteria andDayCalStartdateLessThan(Date value) {
            addCriterion("Day_Cal_StartDate <", value, "dayCalStartdate");
            return (Criteria) this;
        }

        public Criteria andDayCalStartdateLessThanOrEqualTo(Date value) {
            addCriterion("Day_Cal_StartDate <=", value, "dayCalStartdate");
            return (Criteria) this;
        }

        public Criteria andDayCalStartdateIn(List<Date> values) {
            addCriterion("Day_Cal_StartDate in", values, "dayCalStartdate");
            return (Criteria) this;
        }

        public Criteria andDayCalStartdateNotIn(List<Date> values) {
            addCriterion("Day_Cal_StartDate not in", values, "dayCalStartdate");
            return (Criteria) this;
        }

        public Criteria andDayCalStartdateBetween(Date value1, Date value2) {
            addCriterion("Day_Cal_StartDate between", value1, value2, "dayCalStartdate");
            return (Criteria) this;
        }

        public Criteria andDayCalStartdateNotBetween(Date value1, Date value2) {
            addCriterion("Day_Cal_StartDate not between", value1, value2, "dayCalStartdate");
            return (Criteria) this;
        }

        public Criteria andDayCalEnddateIsNull() {
            addCriterion("Day_Cal_EndDate is null");
            return (Criteria) this;
        }

        public Criteria andDayCalEnddateIsNotNull() {
            addCriterion("Day_Cal_EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andDayCalEnddateEqualTo(Date value) {
            addCriterion("Day_Cal_EndDate =", value, "dayCalEnddate");
            return (Criteria) this;
        }

        public Criteria andDayCalEnddateNotEqualTo(Date value) {
            addCriterion("Day_Cal_EndDate <>", value, "dayCalEnddate");
            return (Criteria) this;
        }

        public Criteria andDayCalEnddateGreaterThan(Date value) {
            addCriterion("Day_Cal_EndDate >", value, "dayCalEnddate");
            return (Criteria) this;
        }

        public Criteria andDayCalEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("Day_Cal_EndDate >=", value, "dayCalEnddate");
            return (Criteria) this;
        }

        public Criteria andDayCalEnddateLessThan(Date value) {
            addCriterion("Day_Cal_EndDate <", value, "dayCalEnddate");
            return (Criteria) this;
        }

        public Criteria andDayCalEnddateLessThanOrEqualTo(Date value) {
            addCriterion("Day_Cal_EndDate <=", value, "dayCalEnddate");
            return (Criteria) this;
        }

        public Criteria andDayCalEnddateIn(List<Date> values) {
            addCriterion("Day_Cal_EndDate in", values, "dayCalEnddate");
            return (Criteria) this;
        }

        public Criteria andDayCalEnddateNotIn(List<Date> values) {
            addCriterion("Day_Cal_EndDate not in", values, "dayCalEnddate");
            return (Criteria) this;
        }

        public Criteria andDayCalEnddateBetween(Date value1, Date value2) {
            addCriterion("Day_Cal_EndDate between", value1, value2, "dayCalEnddate");
            return (Criteria) this;
        }

        public Criteria andDayCalEnddateNotBetween(Date value1, Date value2) {
            addCriterion("Day_Cal_EndDate not between", value1, value2, "dayCalEnddate");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalIsNull() {
            addCriterion("Day_Cal_Total is null");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalIsNotNull() {
            addCriterion("Day_Cal_Total is not null");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalEqualTo(BigDecimal value) {
            addCriterion("Day_Cal_Total =", value, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalNotEqualTo(BigDecimal value) {
            addCriterion("Day_Cal_Total <>", value, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalGreaterThan(BigDecimal value) {
            addCriterion("Day_Cal_Total >", value, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Day_Cal_Total >=", value, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalLessThan(BigDecimal value) {
            addCriterion("Day_Cal_Total <", value, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Day_Cal_Total <=", value, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalIn(List<BigDecimal> values) {
            addCriterion("Day_Cal_Total in", values, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalNotIn(List<BigDecimal> values) {
            addCriterion("Day_Cal_Total not in", values, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Day_Cal_Total between", value1, value2, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Day_Cal_Total not between", value1, value2, "dayCalTotal");
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