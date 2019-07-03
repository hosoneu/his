package edu.neu.hoso.example;

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

        public Criteria andDayCalDateIsNull() {
            addCriterion("Day_Cal_Date is null");
            return (Criteria) this;
        }

        public Criteria andDayCalDateIsNotNull() {
            addCriterion("Day_Cal_Date is not null");
            return (Criteria) this;
        }

        public Criteria andDayCalDateEqualTo(Date value) {
            addCriterion("Day_Cal_Date =", value, "dayCalDate");
            return (Criteria) this;
        }

        public Criteria andDayCalDateNotEqualTo(Date value) {
            addCriterion("Day_Cal_Date <>", value, "dayCalDate");
            return (Criteria) this;
        }

        public Criteria andDayCalDateGreaterThan(Date value) {
            addCriterion("Day_Cal_Date >", value, "dayCalDate");
            return (Criteria) this;
        }

        public Criteria andDayCalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Day_Cal_Date >=", value, "dayCalDate");
            return (Criteria) this;
        }

        public Criteria andDayCalDateLessThan(Date value) {
            addCriterion("Day_Cal_Date <", value, "dayCalDate");
            return (Criteria) this;
        }

        public Criteria andDayCalDateLessThanOrEqualTo(Date value) {
            addCriterion("Day_Cal_Date <=", value, "dayCalDate");
            return (Criteria) this;
        }

        public Criteria andDayCalDateIn(List<Date> values) {
            addCriterion("Day_Cal_Date in", values, "dayCalDate");
            return (Criteria) this;
        }

        public Criteria andDayCalDateNotIn(List<Date> values) {
            addCriterion("Day_Cal_Date not in", values, "dayCalDate");
            return (Criteria) this;
        }

        public Criteria andDayCalDateBetween(Date value1, Date value2) {
            addCriterion("Day_Cal_Date between", value1, value2, "dayCalDate");
            return (Criteria) this;
        }

        public Criteria andDayCalDateNotBetween(Date value1, Date value2) {
            addCriterion("Day_Cal_Date not between", value1, value2, "dayCalDate");
            return (Criteria) this;
        }

        public Criteria andYfTotalIsNull() {
            addCriterion("YF_Total is null");
            return (Criteria) this;
        }

        public Criteria andYfTotalIsNotNull() {
            addCriterion("YF_Total is not null");
            return (Criteria) this;
        }

        public Criteria andYfTotalEqualTo(Double value) {
            addCriterion("YF_Total =", value, "yfTotal");
            return (Criteria) this;
        }

        public Criteria andYfTotalNotEqualTo(Double value) {
            addCriterion("YF_Total <>", value, "yfTotal");
            return (Criteria) this;
        }

        public Criteria andYfTotalGreaterThan(Double value) {
            addCriterion("YF_Total >", value, "yfTotal");
            return (Criteria) this;
        }

        public Criteria andYfTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("YF_Total >=", value, "yfTotal");
            return (Criteria) this;
        }

        public Criteria andYfTotalLessThan(Double value) {
            addCriterion("YF_Total <", value, "yfTotal");
            return (Criteria) this;
        }

        public Criteria andYfTotalLessThanOrEqualTo(Double value) {
            addCriterion("YF_Total <=", value, "yfTotal");
            return (Criteria) this;
        }

        public Criteria andYfTotalIn(List<Double> values) {
            addCriterion("YF_Total in", values, "yfTotal");
            return (Criteria) this;
        }

        public Criteria andYfTotalNotIn(List<Double> values) {
            addCriterion("YF_Total not in", values, "yfTotal");
            return (Criteria) this;
        }

        public Criteria andYfTotalBetween(Double value1, Double value2) {
            addCriterion("YF_Total between", value1, value2, "yfTotal");
            return (Criteria) this;
        }

        public Criteria andYfTotalNotBetween(Double value1, Double value2) {
            addCriterion("YF_Total not between", value1, value2, "yfTotal");
            return (Criteria) this;
        }

        public Criteria andGhTotalIsNull() {
            addCriterion("GH_Total is null");
            return (Criteria) this;
        }

        public Criteria andGhTotalIsNotNull() {
            addCriterion("GH_Total is not null");
            return (Criteria) this;
        }

        public Criteria andGhTotalEqualTo(Double value) {
            addCriterion("GH_Total =", value, "ghTotal");
            return (Criteria) this;
        }

        public Criteria andGhTotalNotEqualTo(Double value) {
            addCriterion("GH_Total <>", value, "ghTotal");
            return (Criteria) this;
        }

        public Criteria andGhTotalGreaterThan(Double value) {
            addCriterion("GH_Total >", value, "ghTotal");
            return (Criteria) this;
        }

        public Criteria andGhTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("GH_Total >=", value, "ghTotal");
            return (Criteria) this;
        }

        public Criteria andGhTotalLessThan(Double value) {
            addCriterion("GH_Total <", value, "ghTotal");
            return (Criteria) this;
        }

        public Criteria andGhTotalLessThanOrEqualTo(Double value) {
            addCriterion("GH_Total <=", value, "ghTotal");
            return (Criteria) this;
        }

        public Criteria andGhTotalIn(List<Double> values) {
            addCriterion("GH_Total in", values, "ghTotal");
            return (Criteria) this;
        }

        public Criteria andGhTotalNotIn(List<Double> values) {
            addCriterion("GH_Total not in", values, "ghTotal");
            return (Criteria) this;
        }

        public Criteria andGhTotalBetween(Double value1, Double value2) {
            addCriterion("GH_Total between", value1, value2, "ghTotal");
            return (Criteria) this;
        }

        public Criteria andGhTotalNotBetween(Double value1, Double value2) {
            addCriterion("GH_Total not between", value1, value2, "ghTotal");
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

        public Criteria andDayCalTotalEqualTo(Double value) {
            addCriterion("Day_Cal_Total =", value, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalNotEqualTo(Double value) {
            addCriterion("Day_Cal_Total <>", value, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalGreaterThan(Double value) {
            addCriterion("Day_Cal_Total >", value, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("Day_Cal_Total >=", value, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalLessThan(Double value) {
            addCriterion("Day_Cal_Total <", value, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalLessThanOrEqualTo(Double value) {
            addCriterion("Day_Cal_Total <=", value, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalIn(List<Double> values) {
            addCriterion("Day_Cal_Total in", values, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalNotIn(List<Double> values) {
            addCriterion("Day_Cal_Total not in", values, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalBetween(Double value1, Double value2) {
            addCriterion("Day_Cal_Total between", value1, value2, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andDayCalTotalNotBetween(Double value1, Double value2) {
            addCriterion("Day_Cal_Total not between", value1, value2, "dayCalTotal");
            return (Criteria) this;
        }

        public Criteria andClTotalIsNull() {
            addCriterion("CL_Total is null");
            return (Criteria) this;
        }

        public Criteria andClTotalIsNotNull() {
            addCriterion("CL_Total is not null");
            return (Criteria) this;
        }

        public Criteria andClTotalEqualTo(Double value) {
            addCriterion("CL_Total =", value, "clTotal");
            return (Criteria) this;
        }

        public Criteria andClTotalNotEqualTo(Double value) {
            addCriterion("CL_Total <>", value, "clTotal");
            return (Criteria) this;
        }

        public Criteria andClTotalGreaterThan(Double value) {
            addCriterion("CL_Total >", value, "clTotal");
            return (Criteria) this;
        }

        public Criteria andClTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("CL_Total >=", value, "clTotal");
            return (Criteria) this;
        }

        public Criteria andClTotalLessThan(Double value) {
            addCriterion("CL_Total <", value, "clTotal");
            return (Criteria) this;
        }

        public Criteria andClTotalLessThanOrEqualTo(Double value) {
            addCriterion("CL_Total <=", value, "clTotal");
            return (Criteria) this;
        }

        public Criteria andClTotalIn(List<Double> values) {
            addCriterion("CL_Total in", values, "clTotal");
            return (Criteria) this;
        }

        public Criteria andClTotalNotIn(List<Double> values) {
            addCriterion("CL_Total not in", values, "clTotal");
            return (Criteria) this;
        }

        public Criteria andClTotalBetween(Double value1, Double value2) {
            addCriterion("CL_Total between", value1, value2, "clTotal");
            return (Criteria) this;
        }

        public Criteria andClTotalNotBetween(Double value1, Double value2) {
            addCriterion("CL_Total not between", value1, value2, "clTotal");
            return (Criteria) this;
        }

        public Criteria andJcTotalIsNull() {
            addCriterion("JC_Total is null");
            return (Criteria) this;
        }

        public Criteria andJcTotalIsNotNull() {
            addCriterion("JC_Total is not null");
            return (Criteria) this;
        }

        public Criteria andJcTotalEqualTo(Double value) {
            addCriterion("JC_Total =", value, "jcTotal");
            return (Criteria) this;
        }

        public Criteria andJcTotalNotEqualTo(Double value) {
            addCriterion("JC_Total <>", value, "jcTotal");
            return (Criteria) this;
        }

        public Criteria andJcTotalGreaterThan(Double value) {
            addCriterion("JC_Total >", value, "jcTotal");
            return (Criteria) this;
        }

        public Criteria andJcTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("JC_Total >=", value, "jcTotal");
            return (Criteria) this;
        }

        public Criteria andJcTotalLessThan(Double value) {
            addCriterion("JC_Total <", value, "jcTotal");
            return (Criteria) this;
        }

        public Criteria andJcTotalLessThanOrEqualTo(Double value) {
            addCriterion("JC_Total <=", value, "jcTotal");
            return (Criteria) this;
        }

        public Criteria andJcTotalIn(List<Double> values) {
            addCriterion("JC_Total in", values, "jcTotal");
            return (Criteria) this;
        }

        public Criteria andJcTotalNotIn(List<Double> values) {
            addCriterion("JC_Total not in", values, "jcTotal");
            return (Criteria) this;
        }

        public Criteria andJcTotalBetween(Double value1, Double value2) {
            addCriterion("JC_Total between", value1, value2, "jcTotal");
            return (Criteria) this;
        }

        public Criteria andJcTotalNotBetween(Double value1, Double value2) {
            addCriterion("JC_Total not between", value1, value2, "jcTotal");
            return (Criteria) this;
        }

        public Criteria andCzTotalIsNull() {
            addCriterion("CZ_Total is null");
            return (Criteria) this;
        }

        public Criteria andCzTotalIsNotNull() {
            addCriterion("CZ_Total is not null");
            return (Criteria) this;
        }

        public Criteria andCzTotalEqualTo(Double value) {
            addCriterion("CZ_Total =", value, "czTotal");
            return (Criteria) this;
        }

        public Criteria andCzTotalNotEqualTo(Double value) {
            addCriterion("CZ_Total <>", value, "czTotal");
            return (Criteria) this;
        }

        public Criteria andCzTotalGreaterThan(Double value) {
            addCriterion("CZ_Total >", value, "czTotal");
            return (Criteria) this;
        }

        public Criteria andCzTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("CZ_Total >=", value, "czTotal");
            return (Criteria) this;
        }

        public Criteria andCzTotalLessThan(Double value) {
            addCriterion("CZ_Total <", value, "czTotal");
            return (Criteria) this;
        }

        public Criteria andCzTotalLessThanOrEqualTo(Double value) {
            addCriterion("CZ_Total <=", value, "czTotal");
            return (Criteria) this;
        }

        public Criteria andCzTotalIn(List<Double> values) {
            addCriterion("CZ_Total in", values, "czTotal");
            return (Criteria) this;
        }

        public Criteria andCzTotalNotIn(List<Double> values) {
            addCriterion("CZ_Total not in", values, "czTotal");
            return (Criteria) this;
        }

        public Criteria andCzTotalBetween(Double value1, Double value2) {
            addCriterion("CZ_Total between", value1, value2, "czTotal");
            return (Criteria) this;
        }

        public Criteria andCzTotalNotBetween(Double value1, Double value2) {
            addCriterion("CZ_Total not between", value1, value2, "czTotal");
            return (Criteria) this;
        }

        public Criteria andQtTotalIsNull() {
            addCriterion("QT_Total is null");
            return (Criteria) this;
        }

        public Criteria andQtTotalIsNotNull() {
            addCriterion("QT_Total is not null");
            return (Criteria) this;
        }

        public Criteria andQtTotalEqualTo(Double value) {
            addCriterion("QT_Total =", value, "qtTotal");
            return (Criteria) this;
        }

        public Criteria andQtTotalNotEqualTo(Double value) {
            addCriterion("QT_Total <>", value, "qtTotal");
            return (Criteria) this;
        }

        public Criteria andQtTotalGreaterThan(Double value) {
            addCriterion("QT_Total >", value, "qtTotal");
            return (Criteria) this;
        }

        public Criteria andQtTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("QT_Total >=", value, "qtTotal");
            return (Criteria) this;
        }

        public Criteria andQtTotalLessThan(Double value) {
            addCriterion("QT_Total <", value, "qtTotal");
            return (Criteria) this;
        }

        public Criteria andQtTotalLessThanOrEqualTo(Double value) {
            addCriterion("QT_Total <=", value, "qtTotal");
            return (Criteria) this;
        }

        public Criteria andQtTotalIn(List<Double> values) {
            addCriterion("QT_Total in", values, "qtTotal");
            return (Criteria) this;
        }

        public Criteria andQtTotalNotIn(List<Double> values) {
            addCriterion("QT_Total not in", values, "qtTotal");
            return (Criteria) this;
        }

        public Criteria andQtTotalBetween(Double value1, Double value2) {
            addCriterion("QT_Total between", value1, value2, "qtTotal");
            return (Criteria) this;
        }

        public Criteria andQtTotalNotBetween(Double value1, Double value2) {
            addCriterion("QT_Total not between", value1, value2, "qtTotal");
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