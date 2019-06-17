package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchedulingInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchedulingInfoExample() {
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

        public Criteria andSchedulingInfoIdIsNull() {
            addCriterion("Scheduling_Info_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingInfoIdIsNotNull() {
            addCriterion("Scheduling_Info_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingInfoIdEqualTo(Integer value) {
            addCriterion("Scheduling_Info_ID =", value, "schedulingInfoId");
            return (Criteria) this;
        }

        public Criteria andSchedulingInfoIdNotEqualTo(Integer value) {
            addCriterion("Scheduling_Info_ID <>", value, "schedulingInfoId");
            return (Criteria) this;
        }

        public Criteria andSchedulingInfoIdGreaterThan(Integer value) {
            addCriterion("Scheduling_Info_ID >", value, "schedulingInfoId");
            return (Criteria) this;
        }

        public Criteria andSchedulingInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Scheduling_Info_ID >=", value, "schedulingInfoId");
            return (Criteria) this;
        }

        public Criteria andSchedulingInfoIdLessThan(Integer value) {
            addCriterion("Scheduling_Info_ID <", value, "schedulingInfoId");
            return (Criteria) this;
        }

        public Criteria andSchedulingInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("Scheduling_Info_ID <=", value, "schedulingInfoId");
            return (Criteria) this;
        }

        public Criteria andSchedulingInfoIdIn(List<Integer> values) {
            addCriterion("Scheduling_Info_ID in", values, "schedulingInfoId");
            return (Criteria) this;
        }

        public Criteria andSchedulingInfoIdNotIn(List<Integer> values) {
            addCriterion("Scheduling_Info_ID not in", values, "schedulingInfoId");
            return (Criteria) this;
        }

        public Criteria andSchedulingInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("Scheduling_Info_ID between", value1, value2, "schedulingInfoId");
            return (Criteria) this;
        }

        public Criteria andSchedulingInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Scheduling_Info_ID not between", value1, value2, "schedulingInfoId");
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

        public Criteria andSchedulingNoonbreakIsNull() {
            addCriterion("Scheduling_NoonBreak is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingNoonbreakIsNotNull() {
            addCriterion("Scheduling_NoonBreak is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingNoonbreakEqualTo(String value) {
            addCriterion("Scheduling_NoonBreak =", value, "schedulingNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingNoonbreakNotEqualTo(String value) {
            addCriterion("Scheduling_NoonBreak <>", value, "schedulingNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingNoonbreakGreaterThan(String value) {
            addCriterion("Scheduling_NoonBreak >", value, "schedulingNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingNoonbreakGreaterThanOrEqualTo(String value) {
            addCriterion("Scheduling_NoonBreak >=", value, "schedulingNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingNoonbreakLessThan(String value) {
            addCriterion("Scheduling_NoonBreak <", value, "schedulingNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingNoonbreakLessThanOrEqualTo(String value) {
            addCriterion("Scheduling_NoonBreak <=", value, "schedulingNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingNoonbreakLike(String value) {
            addCriterion("Scheduling_NoonBreak like", value, "schedulingNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingNoonbreakNotLike(String value) {
            addCriterion("Scheduling_NoonBreak not like", value, "schedulingNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingNoonbreakIn(List<String> values) {
            addCriterion("Scheduling_NoonBreak in", values, "schedulingNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingNoonbreakNotIn(List<String> values) {
            addCriterion("Scheduling_NoonBreak not in", values, "schedulingNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingNoonbreakBetween(String value1, String value2) {
            addCriterion("Scheduling_NoonBreak between", value1, value2, "schedulingNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingNoonbreakNotBetween(String value1, String value2) {
            addCriterion("Scheduling_NoonBreak not between", value1, value2, "schedulingNoonbreak");
            return (Criteria) this;
        }

        public Criteria andSchedulingStarttimeIsNull() {
            addCriterion("Scheduling_StartTime is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingStarttimeIsNotNull() {
            addCriterion("Scheduling_StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingStarttimeEqualTo(Date value) {
            addCriterion("Scheduling_StartTime =", value, "schedulingStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingStarttimeNotEqualTo(Date value) {
            addCriterion("Scheduling_StartTime <>", value, "schedulingStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingStarttimeGreaterThan(Date value) {
            addCriterion("Scheduling_StartTime >", value, "schedulingStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Scheduling_StartTime >=", value, "schedulingStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingStarttimeLessThan(Date value) {
            addCriterion("Scheduling_StartTime <", value, "schedulingStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("Scheduling_StartTime <=", value, "schedulingStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingStarttimeIn(List<Date> values) {
            addCriterion("Scheduling_StartTime in", values, "schedulingStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingStarttimeNotIn(List<Date> values) {
            addCriterion("Scheduling_StartTime not in", values, "schedulingStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingStarttimeBetween(Date value1, Date value2) {
            addCriterion("Scheduling_StartTime between", value1, value2, "schedulingStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("Scheduling_StartTime not between", value1, value2, "schedulingStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingEndtimeIsNull() {
            addCriterion("Scheduling_EndTime is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingEndtimeIsNotNull() {
            addCriterion("Scheduling_EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingEndtimeEqualTo(Date value) {
            addCriterion("Scheduling_EndTime =", value, "schedulingEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingEndtimeNotEqualTo(Date value) {
            addCriterion("Scheduling_EndTime <>", value, "schedulingEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingEndtimeGreaterThan(Date value) {
            addCriterion("Scheduling_EndTime >", value, "schedulingEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Scheduling_EndTime >=", value, "schedulingEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingEndtimeLessThan(Date value) {
            addCriterion("Scheduling_EndTime <", value, "schedulingEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("Scheduling_EndTime <=", value, "schedulingEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingEndtimeIn(List<Date> values) {
            addCriterion("Scheduling_EndTime in", values, "schedulingEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingEndtimeNotIn(List<Date> values) {
            addCriterion("Scheduling_EndTime not in", values, "schedulingEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingEndtimeBetween(Date value1, Date value2) {
            addCriterion("Scheduling_EndTime between", value1, value2, "schedulingEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("Scheduling_EndTime not between", value1, value2, "schedulingEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingWeekdayIsNull() {
            addCriterion("Scheduling_Weekday is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingWeekdayIsNotNull() {
            addCriterion("Scheduling_Weekday is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingWeekdayEqualTo(String value) {
            addCriterion("Scheduling_Weekday =", value, "schedulingWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingWeekdayNotEqualTo(String value) {
            addCriterion("Scheduling_Weekday <>", value, "schedulingWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingWeekdayGreaterThan(String value) {
            addCriterion("Scheduling_Weekday >", value, "schedulingWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingWeekdayGreaterThanOrEqualTo(String value) {
            addCriterion("Scheduling_Weekday >=", value, "schedulingWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingWeekdayLessThan(String value) {
            addCriterion("Scheduling_Weekday <", value, "schedulingWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingWeekdayLessThanOrEqualTo(String value) {
            addCriterion("Scheduling_Weekday <=", value, "schedulingWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingWeekdayLike(String value) {
            addCriterion("Scheduling_Weekday like", value, "schedulingWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingWeekdayNotLike(String value) {
            addCriterion("Scheduling_Weekday not like", value, "schedulingWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingWeekdayIn(List<String> values) {
            addCriterion("Scheduling_Weekday in", values, "schedulingWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingWeekdayNotIn(List<String> values) {
            addCriterion("Scheduling_Weekday not in", values, "schedulingWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingWeekdayBetween(String value1, String value2) {
            addCriterion("Scheduling_Weekday between", value1, value2, "schedulingWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingWeekdayNotBetween(String value1, String value2) {
            addCriterion("Scheduling_Weekday not between", value1, value2, "schedulingWeekday");
            return (Criteria) this;
        }

        public Criteria andSchedulingLimitcountIsNull() {
            addCriterion("Scheduling_LimitCount is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingLimitcountIsNotNull() {
            addCriterion("Scheduling_LimitCount is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingLimitcountEqualTo(Integer value) {
            addCriterion("Scheduling_LimitCount =", value, "schedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingLimitcountNotEqualTo(Integer value) {
            addCriterion("Scheduling_LimitCount <>", value, "schedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingLimitcountGreaterThan(Integer value) {
            addCriterion("Scheduling_LimitCount >", value, "schedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingLimitcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Scheduling_LimitCount >=", value, "schedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingLimitcountLessThan(Integer value) {
            addCriterion("Scheduling_LimitCount <", value, "schedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingLimitcountLessThanOrEqualTo(Integer value) {
            addCriterion("Scheduling_LimitCount <=", value, "schedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingLimitcountIn(List<Integer> values) {
            addCriterion("Scheduling_LimitCount in", values, "schedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingLimitcountNotIn(List<Integer> values) {
            addCriterion("Scheduling_LimitCount not in", values, "schedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingLimitcountBetween(Integer value1, Integer value2) {
            addCriterion("Scheduling_LimitCount between", value1, value2, "schedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingLimitcountNotBetween(Integer value1, Integer value2) {
            addCriterion("Scheduling_LimitCount not between", value1, value2, "schedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRestcountIsNull() {
            addCriterion("Scheduling_RestCount is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRestcountIsNotNull() {
            addCriterion("Scheduling_RestCount is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingRestcountEqualTo(Integer value) {
            addCriterion("Scheduling_RestCount =", value, "schedulingRestcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRestcountNotEqualTo(Integer value) {
            addCriterion("Scheduling_RestCount <>", value, "schedulingRestcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRestcountGreaterThan(Integer value) {
            addCriterion("Scheduling_RestCount >", value, "schedulingRestcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRestcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Scheduling_RestCount >=", value, "schedulingRestcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRestcountLessThan(Integer value) {
            addCriterion("Scheduling_RestCount <", value, "schedulingRestcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRestcountLessThanOrEqualTo(Integer value) {
            addCriterion("Scheduling_RestCount <=", value, "schedulingRestcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRestcountIn(List<Integer> values) {
            addCriterion("Scheduling_RestCount in", values, "schedulingRestcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRestcountNotIn(List<Integer> values) {
            addCriterion("Scheduling_RestCount not in", values, "schedulingRestcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRestcountBetween(Integer value1, Integer value2) {
            addCriterion("Scheduling_RestCount between", value1, value2, "schedulingRestcount");
            return (Criteria) this;
        }

        public Criteria andSchedulingRestcountNotBetween(Integer value1, Integer value2) {
            addCriterion("Scheduling_RestCount not between", value1, value2, "schedulingRestcount");
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