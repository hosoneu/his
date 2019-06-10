package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class FunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FunctionExample() {
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

        public Criteria andFunctionIdIsNull() {
            addCriterion("Function_ID is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNotNull() {
            addCriterion("Function_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdEqualTo(Integer value) {
            addCriterion("Function_ID =", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotEqualTo(Integer value) {
            addCriterion("Function_ID <>", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThan(Integer value) {
            addCriterion("Function_ID >", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Function_ID >=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThan(Integer value) {
            addCriterion("Function_ID <", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThanOrEqualTo(Integer value) {
            addCriterion("Function_ID <=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIn(List<Integer> values) {
            addCriterion("Function_ID in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotIn(List<Integer> values) {
            addCriterion("Function_ID not in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdBetween(Integer value1, Integer value2) {
            addCriterion("Function_ID between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Function_ID not between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("Role_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("Role_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("Role_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("Role_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("Role_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Role_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("Role_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("Role_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("Role_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("Role_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("Role_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Role_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlIsNull() {
            addCriterion("Function_URL is null");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlIsNotNull() {
            addCriterion("Function_URL is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlEqualTo(String value) {
            addCriterion("Function_URL =", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotEqualTo(String value) {
            addCriterion("Function_URL <>", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlGreaterThan(String value) {
            addCriterion("Function_URL >", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Function_URL >=", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlLessThan(String value) {
            addCriterion("Function_URL <", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlLessThanOrEqualTo(String value) {
            addCriterion("Function_URL <=", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlLike(String value) {
            addCriterion("Function_URL like", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotLike(String value) {
            addCriterion("Function_URL not like", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlIn(List<String> values) {
            addCriterion("Function_URL in", values, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotIn(List<String> values) {
            addCriterion("Function_URL not in", values, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlBetween(String value1, String value2) {
            addCriterion("Function_URL between", value1, value2, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotBetween(String value1, String value2) {
            addCriterion("Function_URL not between", value1, value2, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNull() {
            addCriterion("Function_Name is null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNotNull() {
            addCriterion("Function_Name is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameEqualTo(String value) {
            addCriterion("Function_Name =", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotEqualTo(String value) {
            addCriterion("Function_Name <>", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThan(String value) {
            addCriterion("Function_Name >", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("Function_Name >=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThan(String value) {
            addCriterion("Function_Name <", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("Function_Name <=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLike(String value) {
            addCriterion("Function_Name like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotLike(String value) {
            addCriterion("Function_Name not like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIn(List<String> values) {
            addCriterion("Function_Name in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotIn(List<String> values) {
            addCriterion("Function_Name not in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameBetween(String value1, String value2) {
            addCriterion("Function_Name between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotBetween(String value1, String value2) {
            addCriterion("Function_Name not between", value1, value2, "functionName");
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

        public Criteria andReverse1EqualTo(Integer value) {
            addCriterion("Reverse1 =", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1NotEqualTo(Integer value) {
            addCriterion("Reverse1 <>", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1GreaterThan(Integer value) {
            addCriterion("Reverse1 >", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1GreaterThanOrEqualTo(Integer value) {
            addCriterion("Reverse1 >=", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1LessThan(Integer value) {
            addCriterion("Reverse1 <", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1LessThanOrEqualTo(Integer value) {
            addCriterion("Reverse1 <=", value, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1In(List<Integer> values) {
            addCriterion("Reverse1 in", values, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1NotIn(List<Integer> values) {
            addCriterion("Reverse1 not in", values, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1Between(Integer value1, Integer value2) {
            addCriterion("Reverse1 between", value1, value2, "reverse1");
            return (Criteria) this;
        }

        public Criteria andReverse1NotBetween(Integer value1, Integer value2) {
            addCriterion("Reverse1 not between", value1, value2, "reverse1");
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