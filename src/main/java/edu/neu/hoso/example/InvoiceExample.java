package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvoiceExample() {
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

        public Criteria andInvoiceIdIsNull() {
            addCriterion("Invoice_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIsNotNull() {
            addCriterion("Invoice_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdEqualTo(Integer value) {
            addCriterion("Invoice_ID =", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotEqualTo(Integer value) {
            addCriterion("Invoice_ID <>", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThan(Integer value) {
            addCriterion("Invoice_ID >", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Invoice_ID >=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThan(Integer value) {
            addCriterion("Invoice_ID <", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("Invoice_ID <=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIn(List<Integer> values) {
            addCriterion("Invoice_ID in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotIn(List<Integer> values) {
            addCriterion("Invoice_ID not in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdBetween(Integer value1, Integer value2) {
            addCriterion("Invoice_ID between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Invoice_ID not between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNull() {
            addCriterion("Invoice_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("Invoice_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("Invoice_NO =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("Invoice_NO <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("Invoice_NO >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("Invoice_NO >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("Invoice_NO <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("Invoice_NO <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("Invoice_NO like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("Invoice_NO not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("Invoice_NO in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("Invoice_NO not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("Invoice_NO between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("Invoice_NO not between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNull() {
            addCriterion("Total_Cost is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNotNull() {
            addCriterion("Total_Cost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostEqualTo(Double value) {
            addCriterion("Total_Cost =", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotEqualTo(Double value) {
            addCriterion("Total_Cost <>", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThan(Double value) {
            addCriterion("Total_Cost >", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThanOrEqualTo(Double value) {
            addCriterion("Total_Cost >=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThan(Double value) {
            addCriterion("Total_Cost <", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThanOrEqualTo(Double value) {
            addCriterion("Total_Cost <=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIn(List<Double> values) {
            addCriterion("Total_Cost in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotIn(List<Double> values) {
            addCriterion("Total_Cost not in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostBetween(Double value1, Double value2) {
            addCriterion("Total_Cost between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotBetween(Double value1, Double value2) {
            addCriterion("Total_Cost not between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andIsDayCalIsNull() {
            addCriterion("Is_Day_Cal is null");
            return (Criteria) this;
        }

        public Criteria andIsDayCalIsNotNull() {
            addCriterion("Is_Day_Cal is not null");
            return (Criteria) this;
        }

        public Criteria andIsDayCalEqualTo(String value) {
            addCriterion("Is_Day_Cal =", value, "isDayCal");
            return (Criteria) this;
        }

        public Criteria andIsDayCalNotEqualTo(String value) {
            addCriterion("Is_Day_Cal <>", value, "isDayCal");
            return (Criteria) this;
        }

        public Criteria andIsDayCalGreaterThan(String value) {
            addCriterion("Is_Day_Cal >", value, "isDayCal");
            return (Criteria) this;
        }

        public Criteria andIsDayCalGreaterThanOrEqualTo(String value) {
            addCriterion("Is_Day_Cal >=", value, "isDayCal");
            return (Criteria) this;
        }

        public Criteria andIsDayCalLessThan(String value) {
            addCriterion("Is_Day_Cal <", value, "isDayCal");
            return (Criteria) this;
        }

        public Criteria andIsDayCalLessThanOrEqualTo(String value) {
            addCriterion("Is_Day_Cal <=", value, "isDayCal");
            return (Criteria) this;
        }

        public Criteria andIsDayCalLike(String value) {
            addCriterion("Is_Day_Cal like", value, "isDayCal");
            return (Criteria) this;
        }

        public Criteria andIsDayCalNotLike(String value) {
            addCriterion("Is_Day_Cal not like", value, "isDayCal");
            return (Criteria) this;
        }

        public Criteria andIsDayCalIn(List<String> values) {
            addCriterion("Is_Day_Cal in", values, "isDayCal");
            return (Criteria) this;
        }

        public Criteria andIsDayCalNotIn(List<String> values) {
            addCriterion("Is_Day_Cal not in", values, "isDayCal");
            return (Criteria) this;
        }

        public Criteria andIsDayCalBetween(String value1, String value2) {
            addCriterion("Is_Day_Cal between", value1, value2, "isDayCal");
            return (Criteria) this;
        }

        public Criteria andIsDayCalNotBetween(String value1, String value2) {
            addCriterion("Is_Day_Cal not between", value1, value2, "isDayCal");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("Pay_Time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("Pay_Time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("Pay_Time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("Pay_Time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("Pay_Time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Pay_Time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("Pay_Time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("Pay_Time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("Pay_Time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("Pay_Time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("Pay_Time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("Pay_Time not between", value1, value2, "payTime");
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

        public Criteria andPayModeIdIsNull() {
            addCriterion("Pay_Mode_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayModeIdIsNotNull() {
            addCriterion("Pay_Mode_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayModeIdEqualTo(Integer value) {
            addCriterion("Pay_Mode_ID =", value, "payModeId");
            return (Criteria) this;
        }

        public Criteria andPayModeIdNotEqualTo(Integer value) {
            addCriterion("Pay_Mode_ID <>", value, "payModeId");
            return (Criteria) this;
        }

        public Criteria andPayModeIdGreaterThan(Integer value) {
            addCriterion("Pay_Mode_ID >", value, "payModeId");
            return (Criteria) this;
        }

        public Criteria andPayModeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Pay_Mode_ID >=", value, "payModeId");
            return (Criteria) this;
        }

        public Criteria andPayModeIdLessThan(Integer value) {
            addCriterion("Pay_Mode_ID <", value, "payModeId");
            return (Criteria) this;
        }

        public Criteria andPayModeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Pay_Mode_ID <=", value, "payModeId");
            return (Criteria) this;
        }

        public Criteria andPayModeIdIn(List<Integer> values) {
            addCriterion("Pay_Mode_ID in", values, "payModeId");
            return (Criteria) this;
        }

        public Criteria andPayModeIdNotIn(List<Integer> values) {
            addCriterion("Pay_Mode_ID not in", values, "payModeId");
            return (Criteria) this;
        }

        public Criteria andPayModeIdBetween(Integer value1, Integer value2) {
            addCriterion("Pay_Mode_ID between", value1, value2, "payModeId");
            return (Criteria) this;
        }

        public Criteria andPayModeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Pay_Mode_ID not between", value1, value2, "payModeId");
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