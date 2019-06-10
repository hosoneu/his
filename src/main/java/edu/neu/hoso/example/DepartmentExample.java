package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andDepartmentCodeIsNull() {
            addCriterion("Department_Code is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIsNotNull() {
            addCriterion("Department_Code is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeEqualTo(String value) {
            addCriterion("Department_Code =", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotEqualTo(String value) {
            addCriterion("Department_Code <>", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeGreaterThan(String value) {
            addCriterion("Department_Code >", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Department_Code >=", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLessThan(String value) {
            addCriterion("Department_Code <", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLessThanOrEqualTo(String value) {
            addCriterion("Department_Code <=", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLike(String value) {
            addCriterion("Department_Code like", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotLike(String value) {
            addCriterion("Department_Code not like", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIn(List<String> values) {
            addCriterion("Department_Code in", values, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotIn(List<String> values) {
            addCriterion("Department_Code not in", values, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeBetween(String value1, String value2) {
            addCriterion("Department_Code between", value1, value2, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotBetween(String value1, String value2) {
            addCriterion("Department_Code not between", value1, value2, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("Department_Name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("Department_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("Department_Name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("Department_Name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("Department_Name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("Department_Name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("Department_Name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("Department_Name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("Department_Name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("Department_Name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("Department_Name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("Department_Name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("Department_Name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("Department_Name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentCategoryIdIsNull() {
            addCriterion("Department_Category_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCategoryIdIsNotNull() {
            addCriterion("Department_Category_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCategoryIdEqualTo(Integer value) {
            addCriterion("Department_Category_ID =", value, "departmentCategoryId");
            return (Criteria) this;
        }

        public Criteria andDepartmentCategoryIdNotEqualTo(Integer value) {
            addCriterion("Department_Category_ID <>", value, "departmentCategoryId");
            return (Criteria) this;
        }

        public Criteria andDepartmentCategoryIdGreaterThan(Integer value) {
            addCriterion("Department_Category_ID >", value, "departmentCategoryId");
            return (Criteria) this;
        }

        public Criteria andDepartmentCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Department_Category_ID >=", value, "departmentCategoryId");
            return (Criteria) this;
        }

        public Criteria andDepartmentCategoryIdLessThan(Integer value) {
            addCriterion("Department_Category_ID <", value, "departmentCategoryId");
            return (Criteria) this;
        }

        public Criteria andDepartmentCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("Department_Category_ID <=", value, "departmentCategoryId");
            return (Criteria) this;
        }

        public Criteria andDepartmentCategoryIdIn(List<Integer> values) {
            addCriterion("Department_Category_ID in", values, "departmentCategoryId");
            return (Criteria) this;
        }

        public Criteria andDepartmentCategoryIdNotIn(List<Integer> values) {
            addCriterion("Department_Category_ID not in", values, "departmentCategoryId");
            return (Criteria) this;
        }

        public Criteria andDepartmentCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("Department_Category_ID between", value1, value2, "departmentCategoryId");
            return (Criteria) this;
        }

        public Criteria andDepartmentCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Department_Category_ID not between", value1, value2, "departmentCategoryId");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeIsNull() {
            addCriterion("Department_Type is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeIsNotNull() {
            addCriterion("Department_Type is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeEqualTo(String value) {
            addCriterion("Department_Type =", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeNotEqualTo(String value) {
            addCriterion("Department_Type <>", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeGreaterThan(String value) {
            addCriterion("Department_Type >", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Department_Type >=", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeLessThan(String value) {
            addCriterion("Department_Type <", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeLessThanOrEqualTo(String value) {
            addCriterion("Department_Type <=", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeLike(String value) {
            addCriterion("Department_Type like", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeNotLike(String value) {
            addCriterion("Department_Type not like", value, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeIn(List<String> values) {
            addCriterion("Department_Type in", values, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeNotIn(List<String> values) {
            addCriterion("Department_Type not in", values, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeBetween(String value1, String value2) {
            addCriterion("Department_Type between", value1, value2, "departmentType");
            return (Criteria) this;
        }

        public Criteria andDepartmentTypeNotBetween(String value1, String value2) {
            addCriterion("Department_Type not between", value1, value2, "departmentType");
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