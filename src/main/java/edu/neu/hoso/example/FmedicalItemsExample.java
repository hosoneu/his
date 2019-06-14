package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FmedicalItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmedicalItemsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andFmedicalItemsCodeIsNull() {
            addCriterion("Fmedical_Items_Code is null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsCodeIsNotNull() {
            addCriterion("Fmedical_Items_Code is not null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsCodeEqualTo(String value) {
            addCriterion("Fmedical_Items_Code =", value, "fmedicalItemsCode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsCodeNotEqualTo(String value) {
            addCriterion("Fmedical_Items_Code <>", value, "fmedicalItemsCode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsCodeGreaterThan(String value) {
            addCriterion("Fmedical_Items_Code >", value, "fmedicalItemsCode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Fmedical_Items_Code >=", value, "fmedicalItemsCode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsCodeLessThan(String value) {
            addCriterion("Fmedical_Items_Code <", value, "fmedicalItemsCode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsCodeLessThanOrEqualTo(String value) {
            addCriterion("Fmedical_Items_Code <=", value, "fmedicalItemsCode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsCodeLike(String value) {
            addCriterion("Fmedical_Items_Code like", value, "fmedicalItemsCode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsCodeNotLike(String value) {
            addCriterion("Fmedical_Items_Code not like", value, "fmedicalItemsCode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsCodeIn(List<String> values) {
            addCriterion("Fmedical_Items_Code in", values, "fmedicalItemsCode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsCodeNotIn(List<String> values) {
            addCriterion("Fmedical_Items_Code not in", values, "fmedicalItemsCode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsCodeBetween(String value1, String value2) {
            addCriterion("Fmedical_Items_Code between", value1, value2, "fmedicalItemsCode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsCodeNotBetween(String value1, String value2) {
            addCriterion("Fmedical_Items_Code not between", value1, value2, "fmedicalItemsCode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsNameIsNull() {
            addCriterion("Fmedical_Items_Name is null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsNameIsNotNull() {
            addCriterion("Fmedical_Items_Name is not null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsNameEqualTo(String value) {
            addCriterion("Fmedical_Items_Name =", value, "fmedicalItemsName");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsNameNotEqualTo(String value) {
            addCriterion("Fmedical_Items_Name <>", value, "fmedicalItemsName");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsNameGreaterThan(String value) {
            addCriterion("Fmedical_Items_Name >", value, "fmedicalItemsName");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsNameGreaterThanOrEqualTo(String value) {
            addCriterion("Fmedical_Items_Name >=", value, "fmedicalItemsName");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsNameLessThan(String value) {
            addCriterion("Fmedical_Items_Name <", value, "fmedicalItemsName");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsNameLessThanOrEqualTo(String value) {
            addCriterion("Fmedical_Items_Name <=", value, "fmedicalItemsName");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsNameLike(String value) {
            addCriterion("Fmedical_Items_Name like", value, "fmedicalItemsName");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsNameNotLike(String value) {
            addCriterion("Fmedical_Items_Name not like", value, "fmedicalItemsName");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsNameIn(List<String> values) {
            addCriterion("Fmedical_Items_Name in", values, "fmedicalItemsName");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsNameNotIn(List<String> values) {
            addCriterion("Fmedical_Items_Name not in", values, "fmedicalItemsName");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsNameBetween(String value1, String value2) {
            addCriterion("Fmedical_Items_Name between", value1, value2, "fmedicalItemsName");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsNameNotBetween(String value1, String value2) {
            addCriterion("Fmedical_Items_Name not between", value1, value2, "fmedicalItemsName");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsFormatIsNull() {
            addCriterion("Fmedical_Items_Format is null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsFormatIsNotNull() {
            addCriterion("Fmedical_Items_Format is not null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsFormatEqualTo(String value) {
            addCriterion("Fmedical_Items_Format =", value, "fmedicalItemsFormat");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsFormatNotEqualTo(String value) {
            addCriterion("Fmedical_Items_Format <>", value, "fmedicalItemsFormat");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsFormatGreaterThan(String value) {
            addCriterion("Fmedical_Items_Format >", value, "fmedicalItemsFormat");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsFormatGreaterThanOrEqualTo(String value) {
            addCriterion("Fmedical_Items_Format >=", value, "fmedicalItemsFormat");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsFormatLessThan(String value) {
            addCriterion("Fmedical_Items_Format <", value, "fmedicalItemsFormat");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsFormatLessThanOrEqualTo(String value) {
            addCriterion("Fmedical_Items_Format <=", value, "fmedicalItemsFormat");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsFormatLike(String value) {
            addCriterion("Fmedical_Items_Format like", value, "fmedicalItemsFormat");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsFormatNotLike(String value) {
            addCriterion("Fmedical_Items_Format not like", value, "fmedicalItemsFormat");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsFormatIn(List<String> values) {
            addCriterion("Fmedical_Items_Format in", values, "fmedicalItemsFormat");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsFormatNotIn(List<String> values) {
            addCriterion("Fmedical_Items_Format not in", values, "fmedicalItemsFormat");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsFormatBetween(String value1, String value2) {
            addCriterion("Fmedical_Items_Format between", value1, value2, "fmedicalItemsFormat");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsFormatNotBetween(String value1, String value2) {
            addCriterion("Fmedical_Items_Format not between", value1, value2, "fmedicalItemsFormat");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsPriceIsNull() {
            addCriterion("Fmedical_Items_Price is null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsPriceIsNotNull() {
            addCriterion("Fmedical_Items_Price is not null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsPriceEqualTo(Double value) {
            addCriterion("Fmedical_Items_Price =", value, "fmedicalItemsPrice");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsPriceNotEqualTo(Double value) {
            addCriterion("Fmedical_Items_Price <>", value, "fmedicalItemsPrice");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsPriceGreaterThan(Double value) {
            addCriterion("Fmedical_Items_Price >", value, "fmedicalItemsPrice");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Fmedical_Items_Price >=", value, "fmedicalItemsPrice");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsPriceLessThan(Double value) {
            addCriterion("Fmedical_Items_Price <", value, "fmedicalItemsPrice");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsPriceLessThanOrEqualTo(Double value) {
            addCriterion("Fmedical_Items_Price <=", value, "fmedicalItemsPrice");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsPriceIn(List<Double> values) {
            addCriterion("Fmedical_Items_Price in", values, "fmedicalItemsPrice");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsPriceNotIn(List<Double> values) {
            addCriterion("Fmedical_Items_Price not in", values, "fmedicalItemsPrice");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsPriceBetween(Double value1, Double value2) {
            addCriterion("Fmedical_Items_Price between", value1, value2, "fmedicalItemsPrice");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsPriceNotBetween(Double value1, Double value2) {
            addCriterion("Fmedical_Items_Price not between", value1, value2, "fmedicalItemsPrice");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdIsNull() {
            addCriterion("Expense_Type_ID is null");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdIsNotNull() {
            addCriterion("Expense_Type_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdEqualTo(Integer value) {
            addCriterion("Expense_Type_ID =", value, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdNotEqualTo(Integer value) {
            addCriterion("Expense_Type_ID <>", value, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdGreaterThan(Integer value) {
            addCriterion("Expense_Type_ID >", value, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Expense_Type_ID >=", value, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdLessThan(Integer value) {
            addCriterion("Expense_Type_ID <", value, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Expense_Type_ID <=", value, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdIn(List<Integer> values) {
            addCriterion("Expense_Type_ID in", values, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdNotIn(List<Integer> values) {
            addCriterion("Expense_Type_ID not in", values, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("Expense_Type_ID between", value1, value2, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andExpenseTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Expense_Type_ID not between", value1, value2, "expenseTypeId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("Department_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("Department_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("Department_ID =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("Department_ID <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("Department_ID >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Department_ID >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("Department_ID <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("Department_ID <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("Department_ID in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("Department_ID not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("Department_ID between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Department_ID not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsMnemoniccodeIsNull() {
            addCriterion("Fmedical_Items_MnemonicCode is null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsMnemoniccodeIsNotNull() {
            addCriterion("Fmedical_Items_MnemonicCode is not null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsMnemoniccodeEqualTo(String value) {
            addCriterion("Fmedical_Items_MnemonicCode =", value, "fmedicalItemsMnemoniccode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsMnemoniccodeNotEqualTo(String value) {
            addCriterion("Fmedical_Items_MnemonicCode <>", value, "fmedicalItemsMnemoniccode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsMnemoniccodeGreaterThan(String value) {
            addCriterion("Fmedical_Items_MnemonicCode >", value, "fmedicalItemsMnemoniccode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsMnemoniccodeGreaterThanOrEqualTo(String value) {
            addCriterion("Fmedical_Items_MnemonicCode >=", value, "fmedicalItemsMnemoniccode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsMnemoniccodeLessThan(String value) {
            addCriterion("Fmedical_Items_MnemonicCode <", value, "fmedicalItemsMnemoniccode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsMnemoniccodeLessThanOrEqualTo(String value) {
            addCriterion("Fmedical_Items_MnemonicCode <=", value, "fmedicalItemsMnemoniccode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsMnemoniccodeLike(String value) {
            addCriterion("Fmedical_Items_MnemonicCode like", value, "fmedicalItemsMnemoniccode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsMnemoniccodeNotLike(String value) {
            addCriterion("Fmedical_Items_MnemonicCode not like", value, "fmedicalItemsMnemoniccode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsMnemoniccodeIn(List<String> values) {
            addCriterion("Fmedical_Items_MnemonicCode in", values, "fmedicalItemsMnemoniccode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsMnemoniccodeNotIn(List<String> values) {
            addCriterion("Fmedical_Items_MnemonicCode not in", values, "fmedicalItemsMnemoniccode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsMnemoniccodeBetween(String value1, String value2) {
            addCriterion("Fmedical_Items_MnemonicCode between", value1, value2, "fmedicalItemsMnemoniccode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsMnemoniccodeNotBetween(String value1, String value2) {
            addCriterion("Fmedical_Items_MnemonicCode not between", value1, value2, "fmedicalItemsMnemoniccode");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsTypeIsNull() {
            addCriterion("Fmedical_Items_Type is null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsTypeIsNotNull() {
            addCriterion("Fmedical_Items_Type is not null");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsTypeEqualTo(String value) {
            addCriterion("Fmedical_Items_Type =", value, "fmedicalItemsType");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsTypeNotEqualTo(String value) {
            addCriterion("Fmedical_Items_Type <>", value, "fmedicalItemsType");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsTypeGreaterThan(String value) {
            addCriterion("Fmedical_Items_Type >", value, "fmedicalItemsType");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Fmedical_Items_Type >=", value, "fmedicalItemsType");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsTypeLessThan(String value) {
            addCriterion("Fmedical_Items_Type <", value, "fmedicalItemsType");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsTypeLessThanOrEqualTo(String value) {
            addCriterion("Fmedical_Items_Type <=", value, "fmedicalItemsType");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsTypeLike(String value) {
            addCriterion("Fmedical_Items_Type like", value, "fmedicalItemsType");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsTypeNotLike(String value) {
            addCriterion("Fmedical_Items_Type not like", value, "fmedicalItemsType");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsTypeIn(List<String> values) {
            addCriterion("Fmedical_Items_Type in", values, "fmedicalItemsType");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsTypeNotIn(List<String> values) {
            addCriterion("Fmedical_Items_Type not in", values, "fmedicalItemsType");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsTypeBetween(String value1, String value2) {
            addCriterion("Fmedical_Items_Type between", value1, value2, "fmedicalItemsType");
            return (Criteria) this;
        }

        public Criteria andFmedicalItemsTypeNotBetween(String value1, String value2) {
            addCriterion("Fmedical_Items_Type not between", value1, value2, "fmedicalItemsType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("Create_Time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("Create_Time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("Create_Time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Create_Time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Create_Time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Create_Time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("Create_Time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Create_Time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("Create_Time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Create_Time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Create_Time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Create_Time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andReverse1IsNull() {
            addCriterion("Reverse1 is null");
            return (Criteria) this;
        }

        public Criteria andReverse1IsNotNull() {
            addCriterion("Reverse1 is not null");
            return (Criteria) this;
        }

        public Criteria andReverse1EqualTo(String value) {
            addCriterion("Reverse1 =", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1NotEqualTo(String value) {
            addCriterion("Reverse1 <>", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1GreaterThan(String value) {
            addCriterion("Reverse1 >", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1GreaterThanOrEqualTo(String value) {
            addCriterion("Reverse1 >=", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1LessThan(String value) {
            addCriterion("Reverse1 <", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1LessThanOrEqualTo(String value) {
            addCriterion("Reverse1 <=", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1Like(String value) {
            addCriterion("Reverse1 like", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1NotLike(String value) {
            addCriterion("Reverse1 not like", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1In(List<String> values) {
            addCriterion("Reverse1 in", values, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1NotIn(List<String> values) {
            addCriterion("Reverse1 not in", values, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1Between(String value1, String value2) {
            addCriterion("Reverse1 between", value1, value2, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1NotBetween(String value1, String value2) {
            addCriterion("Reverse1 not between", value1, value2, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse2IsNull() {
            addCriterion("Reverse2 is null");
            return (Criteria) this;
        }

        public Criteria andReverse2IsNotNull() {
            addCriterion("Reverse2 is not null");
            return (Criteria) this;
        }

        public Criteria andReverse2EqualTo(String value) {
            addCriterion("Reverse2 =", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2NotEqualTo(String value) {
            addCriterion("Reverse2 <>", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2GreaterThan(String value) {
            addCriterion("Reverse2 >", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2GreaterThanOrEqualTo(String value) {
            addCriterion("Reverse2 >=", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2LessThan(String value) {
            addCriterion("Reverse2 <", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2LessThanOrEqualTo(String value) {
            addCriterion("Reverse2 <=", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2Like(String value) {
            addCriterion("Reverse2 like", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2NotLike(String value) {
            addCriterion("Reverse2 not like", value, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2In(List<String> values) {
            addCriterion("Reverse2 in", values, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2NotIn(List<String> values) {
            addCriterion("Reverse2 not in", values, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2Between(String value1, String value2) {
            addCriterion("Reverse2 between", value1, value2, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse2NotBetween(String value1, String value2) {
            addCriterion("Reverse2 not between", value1, value2, "reverse2");
            return (Criteria) this;
        }

        public Criteria andReverse3IsNull() {
            addCriterion("Reverse3 is null");
            return (Criteria) this;
        }

        public Criteria andReverse3IsNotNull() {
            addCriterion("Reverse3 is not null");
            return (Criteria) this;
        }

        public Criteria andReverse3EqualTo(String value) {
            addCriterion("Reverse3 =", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3NotEqualTo(String value) {
            addCriterion("Reverse3 <>", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3GreaterThan(String value) {
            addCriterion("Reverse3 >", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3GreaterThanOrEqualTo(String value) {
            addCriterion("Reverse3 >=", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3LessThan(String value) {
            addCriterion("Reverse3 <", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3LessThanOrEqualTo(String value) {
            addCriterion("Reverse3 <=", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3Like(String value) {
            addCriterion("Reverse3 like", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3NotLike(String value) {
            addCriterion("Reverse3 not like", value, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3In(List<String> values) {
            addCriterion("Reverse3 in", values, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3NotIn(List<String> values) {
            addCriterion("Reverse3 not in", values, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3Between(String value1, String value2) {
            addCriterion("Reverse3 between", value1, value2, "reverse3");
            return (Criteria) this;
        }

        public Criteria andReverse3NotBetween(String value1, String value2) {
            addCriterion("Reverse3 not between", value1, value2, "reverse3");
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