package edu.neu.hoso.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpenseItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpenseItemsExample() {
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

        public Criteria andMedicalRecordIdIsNull() {
            addCriterion("Medical_Record_ID is null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdIsNotNull() {
            addCriterion("Medical_Record_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdEqualTo(Integer value) {
            addCriterion("Medical_Record_ID =", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdNotEqualTo(Integer value) {
            addCriterion("Medical_Record_ID <>", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdGreaterThan(Integer value) {
            addCriterion("Medical_Record_ID >", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Medical_Record_ID >=", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdLessThan(Integer value) {
            addCriterion("Medical_Record_ID <", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("Medical_Record_ID <=", value, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdIn(List<Integer> values) {
            addCriterion("Medical_Record_ID in", values, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdNotIn(List<Integer> values) {
            addCriterion("Medical_Record_ID not in", values, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("Medical_Record_ID between", value1, value2, "medicalRecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Medical_Record_ID not between", value1, value2, "medicalRecordId");
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

        public Criteria andTotalCostEqualTo(BigDecimal value) {
            addCriterion("Total_Cost =", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotEqualTo(BigDecimal value) {
            addCriterion("Total_Cost <>", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThan(BigDecimal value) {
            addCriterion("Total_Cost >", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Total_Cost >=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThan(BigDecimal value) {
            addCriterion("Total_Cost <", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Total_Cost <=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIn(List<BigDecimal> values) {
            addCriterion("Total_Cost in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotIn(List<BigDecimal> values) {
            addCriterion("Total_Cost not in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Total_Cost between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Total_Cost not between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("Pay_Status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("Pay_Status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(String value) {
            addCriterion("Pay_Status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(String value) {
            addCriterion("Pay_Status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(String value) {
            addCriterion("Pay_Status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Pay_Status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(String value) {
            addCriterion("Pay_Status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(String value) {
            addCriterion("Pay_Status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLike(String value) {
            addCriterion("Pay_Status like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotLike(String value) {
            addCriterion("Pay_Status not like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<String> values) {
            addCriterion("Pay_Status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<String> values) {
            addCriterion("Pay_Status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(String value1, String value2) {
            addCriterion("Pay_Status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(String value1, String value2) {
            addCriterion("Pay_Status not between", value1, value2, "payStatus");
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

        public Criteria andInvoiceNoIsNull() {
            addCriterion("Invoice_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("Invoice_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(Integer value) {
            addCriterion("Invoice_NO =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(Integer value) {
            addCriterion("Invoice_NO <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(Integer value) {
            addCriterion("Invoice_NO >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("Invoice_NO >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(Integer value) {
            addCriterion("Invoice_NO <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(Integer value) {
            addCriterion("Invoice_NO <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<Integer> values) {
            addCriterion("Invoice_NO in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<Integer> values) {
            addCriterion("Invoice_NO not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(Integer value1, Integer value2) {
            addCriterion("Invoice_NO between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(Integer value1, Integer value2) {
            addCriterion("Invoice_NO not between", value1, value2, "invoiceNo");
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