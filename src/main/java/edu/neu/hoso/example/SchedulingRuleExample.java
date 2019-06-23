package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchedulingRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchedulingRuleExample() {
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

        public Criteria andSchedulingRuleIdIsNull() {
            addCriterion("Scheduling_Rule_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdIsNotNull() {
            addCriterion("Scheduling_Rule_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdEqualTo(Integer value) {
            addCriterion("Scheduling_Rule_ID =", value, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdNotEqualTo(Integer value) {
            addCriterion("Scheduling_Rule_ID <>", value, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdGreaterThan(Integer value) {
            addCriterion("Scheduling_Rule_ID >", value, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Scheduling_Rule_ID >=", value, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdLessThan(Integer value) {
            addCriterion("Scheduling_Rule_ID <", value, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("Scheduling_Rule_ID <=", value, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdIn(List<Integer> values) {
            addCriterion("Scheduling_Rule_ID in", values, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdNotIn(List<Integer> values) {
            addCriterion("Scheduling_Rule_ID not in", values, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("Scheduling_Rule_ID between", value1, value2, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Scheduling_Rule_ID not between", value1, value2, "schedulingRuleId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("Doctor_ID is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("Doctor_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Integer value) {
            addCriterion("Doctor_ID =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Integer value) {
            addCriterion("Doctor_ID <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Integer value) {
            addCriterion("Doctor_ID >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Doctor_ID >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Integer value) {
            addCriterion("Doctor_ID <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("Doctor_ID <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Integer> values) {
            addCriterion("Doctor_ID in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Integer> values) {
            addCriterion("Doctor_ID not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("Doctor_ID between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Doctor_ID not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoonbreakIsNull() {
            addCriterion("Scheduling_Rule_NoonBreak is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoonbreakIsNotNull() {
            addCriterion("Scheduling_Rule_NoonBreak is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoonbreakEqualTo(String value) {
            addCriterion("Scheduling_Rule_NoonBreak =", value, "schedulingRuleNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoonbreakNotEqualTo(String value) {
            addCriterion("Scheduling_Rule_NoonBreak <>", value, "schedulingRuleNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoonbreakGreaterThan(String value) {
            addCriterion("Scheduling_Rule_NoonBreak >", value, "schedulingRuleNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoonbreakGreaterThanOrEqualTo(String value) {
            addCriterion("Scheduling_Rule_NoonBreak >=", value, "schedulingRuleNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoonbreakLessThan(String value) {
            addCriterion("Scheduling_Rule_NoonBreak <", value, "schedulingRuleNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoonbreakLessThanOrEqualTo(String value) {
            addCriterion("Scheduling_Rule_NoonBreak <=", value, "schedulingRuleNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoonbreakLike(String value) {
            addCriterion("Scheduling_Rule_NoonBreak like", value, "schedulingRuleNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoonbreakNotLike(String value) {
            addCriterion("Scheduling_Rule_NoonBreak not like", value, "schedulingRuleNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoonbreakIn(List<String> values) {
            addCriterion("Scheduling_Rule_NoonBreak in", values, "schedulingRuleNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoonbreakNotIn(List<String> values) {
            addCriterion("Scheduling_Rule_NoonBreak not in", values, "schedulingRuleNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoonbreakBetween(String value1, String value2) {
            addCriterion("Scheduling_Rule_NoonBreak between", value1, value2, "schedulingRuleNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleNoonbreakNotBetween(String value1, String value2) {
            addCriterion("Scheduling_Rule_NoonBreak not between", value1, value2, "schedulingRuleNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleStarttimeIsNull() {
            addCriterion("Scheduling_Rule_StartTime is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleStarttimeIsNotNull() {
            addCriterion("Scheduling_Rule_StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleStarttimeEqualTo(Date value) {
            addCriterion("Scheduling_Rule_StartTime =", value, "schedulingRuleStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleStarttimeNotEqualTo(Date value) {
            addCriterion("Scheduling_Rule_StartTime <>", value, "schedulingRuleStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleStarttimeGreaterThan(Date value) {
            addCriterion("Scheduling_Rule_StartTime >", value, "schedulingRuleStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Scheduling_Rule_StartTime >=", value, "schedulingRuleStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleStarttimeLessThan(Date value) {
            addCriterion("Scheduling_Rule_StartTime <", value, "schedulingRuleStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("Scheduling_Rule_StartTime <=", value, "schedulingRuleStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleStarttimeIn(List<Date> values) {
            addCriterion("Scheduling_Rule_StartTime in", values, "schedulingRuleStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleStarttimeNotIn(List<Date> values) {
            addCriterion("Scheduling_Rule_StartTime not in", values, "schedulingRuleStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleStarttimeBetween(Date value1, Date value2) {
            addCriterion("Scheduling_Rule_StartTime between", value1, value2, "schedulingRuleStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("Scheduling_Rule_StartTime not between", value1, value2, "schedulingRuleStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleEndtimeIsNull() {
            addCriterion("Scheduling_Rule_EndTime is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleEndtimeIsNotNull() {
            addCriterion("Scheduling_Rule_EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleEndtimeEqualTo(Date value) {
            addCriterion("Scheduling_Rule_EndTime =", value, "schedulingRuleEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleEndtimeNotEqualTo(Date value) {
            addCriterion("Scheduling_Rule_EndTime <>", value, "schedulingRuleEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleEndtimeGreaterThan(Date value) {
            addCriterion("Scheduling_Rule_EndTime >", value, "schedulingRuleEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Scheduling_Rule_EndTime >=", value, "schedulingRuleEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleEndtimeLessThan(Date value) {
            addCriterion("Scheduling_Rule_EndTime <", value, "schedulingRuleEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("Scheduling_Rule_EndTime <=", value, "schedulingRuleEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleEndtimeIn(List<Date> values) {
            addCriterion("Scheduling_Rule_EndTime in", values, "schedulingRuleEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleEndtimeNotIn(List<Date> values) {
            addCriterion("Scheduling_Rule_EndTime not in", values, "schedulingRuleEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleEndtimeBetween(Date value1, Date value2) {
            addCriterion("Scheduling_Rule_EndTime between", value1, value2, "schedulingRuleEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("Scheduling_Rule_EndTime not between", value1, value2, "schedulingRuleEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleWeekdayIsNull() {
            addCriterion("Scheduling_Rule_Weekday is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleWeekdayIsNotNull() {
            addCriterion("Scheduling_Rule_Weekday is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleWeekdayEqualTo(String value) {
            addCriterion("Scheduling_Rule_Weekday =", value, "schedulingRuleWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleWeekdayNotEqualTo(String value) {
            addCriterion("Scheduling_Rule_Weekday <>", value, "schedulingRuleWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleWeekdayGreaterThan(String value) {
            addCriterion("Scheduling_Rule_Weekday >", value, "schedulingRuleWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleWeekdayGreaterThanOrEqualTo(String value) {
            addCriterion("Scheduling_Rule_Weekday >=", value, "schedulingRuleWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleWeekdayLessThan(String value) {
            addCriterion("Scheduling_Rule_Weekday <", value, "schedulingRuleWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleWeekdayLessThanOrEqualTo(String value) {
            addCriterion("Scheduling_Rule_Weekday <=", value, "schedulingRuleWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleWeekdayLike(String value) {
            addCriterion("Scheduling_Rule_Weekday like", value, "schedulingRuleWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleWeekdayNotLike(String value) {
            addCriterion("Scheduling_Rule_Weekday not like", value, "schedulingRuleWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleWeekdayIn(List<String> values) {
            addCriterion("Scheduling_Rule_Weekday in", values, "schedulingRuleWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleWeekdayNotIn(List<String> values) {
            addCriterion("Scheduling_Rule_Weekday not in", values, "schedulingRuleWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleWeekdayBetween(String value1, String value2) {
            addCriterion("Scheduling_Rule_Weekday between", value1, value2, "schedulingRuleWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleWeekdayNotBetween(String value1, String value2) {
            addCriterion("Scheduling_Rule_Weekday not between", value1, value2, "schedulingRuleWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleLimitcountIsNull() {
            addCriterion("Scheduling_Rule_LimitCount is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleLimitcountIsNotNull() {
            addCriterion("Scheduling_Rule_LimitCount is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleLimitcountEqualTo(Integer value) {
            addCriterion("Scheduling_Rule_LimitCount =", value, "schedulingRuleLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleLimitcountNotEqualTo(Integer value) {
            addCriterion("Scheduling_Rule_LimitCount <>", value, "schedulingRuleLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleLimitcountGreaterThan(Integer value) {
            addCriterion("Scheduling_Rule_LimitCount >", value, "schedulingRuleLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleLimitcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Scheduling_Rule_LimitCount >=", value, "schedulingRuleLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleLimitcountLessThan(Integer value) {
            addCriterion("Scheduling_Rule_LimitCount <", value, "schedulingRuleLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleLimitcountLessThanOrEqualTo(Integer value) {
            addCriterion("Scheduling_Rule_LimitCount <=", value, "schedulingRuleLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleLimitcountIn(List<Integer> values) {
            addCriterion("Scheduling_Rule_LimitCount in", values, "schedulingRuleLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleLimitcountNotIn(List<Integer> values) {
            addCriterion("Scheduling_Rule_LimitCount not in", values, "schedulingRuleLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleLimitcountBetween(Integer value1, Integer value2) {
            addCriterion("Scheduling_Rule_LimitCount between", value1, value2, "schedulingRuleLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRuleLimitcountNotBetween(Integer value1, Integer value2) {
            addCriterion("Scheduling_Rule_LimitCount not between", value1, value2, "schedulingRuleLimitcount");
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