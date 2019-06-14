package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserLoginnameIsNull() {
            addCriterion("User_loginName is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameIsNotNull() {
            addCriterion("User_loginName is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameEqualTo(String value) {
            addCriterion("User_loginName =", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotEqualTo(String value) {
            addCriterion("User_loginName <>", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameGreaterThan(String value) {
            addCriterion("User_loginName >", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("User_loginName >=", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameLessThan(String value) {
            addCriterion("User_loginName <", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameLessThanOrEqualTo(String value) {
            addCriterion("User_loginName <=", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameLike(String value) {
            addCriterion("User_loginName like", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotLike(String value) {
            addCriterion("User_loginName not like", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameIn(List<String> values) {
            addCriterion("User_loginName in", values, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotIn(List<String> values) {
            addCriterion("User_loginName not in", values, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameBetween(String value1, String value2) {
            addCriterion("User_loginName between", value1, value2, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotBetween(String value1, String value2) {
            addCriterion("User_loginName not between", value1, value2, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("User_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("User_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("User_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("User_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("User_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("User_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("User_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("User_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("User_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("User_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("User_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("User_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("User_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("User_password not between", value1, value2, "userPassword");
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

        public Criteria andUserNameIsNull() {
            addCriterion("User_Name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("User_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("User_Name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("User_Name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("User_Name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("User_Name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("User_Name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("User_Name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("User_Name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("User_Name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("User_Name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("User_Name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("User_Name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("User_Name not between", value1, value2, "userName");
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

        public Criteria andUserTitleIdIsNull() {
            addCriterion("User_Title_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserTitleIdIsNotNull() {
            addCriterion("User_Title_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserTitleIdEqualTo(Integer value) {
            addCriterion("User_Title_ID =", value, "userTitleId");
            return (Criteria) this;
        }

        public Criteria andUserTitleIdNotEqualTo(Integer value) {
            addCriterion("User_Title_ID <>", value, "userTitleId");
            return (Criteria) this;
        }

        public Criteria andUserTitleIdGreaterThan(Integer value) {
            addCriterion("User_Title_ID >", value, "userTitleId");
            return (Criteria) this;
        }

        public Criteria andUserTitleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Title_ID >=", value, "userTitleId");
            return (Criteria) this;
        }

        public Criteria andUserTitleIdLessThan(Integer value) {
            addCriterion("User_Title_ID <", value, "userTitleId");
            return (Criteria) this;
        }

        public Criteria andUserTitleIdLessThanOrEqualTo(Integer value) {
            addCriterion("User_Title_ID <=", value, "userTitleId");
            return (Criteria) this;
        }

        public Criteria andUserTitleIdIn(List<Integer> values) {
            addCriterion("User_Title_ID in", values, "userTitleId");
            return (Criteria) this;
        }

        public Criteria andUserTitleIdNotIn(List<Integer> values) {
            addCriterion("User_Title_ID not in", values, "userTitleId");
            return (Criteria) this;
        }

        public Criteria andUserTitleIdBetween(Integer value1, Integer value2) {
            addCriterion("User_Title_ID between", value1, value2, "userTitleId");
            return (Criteria) this;
        }

        public Criteria andUserTitleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Title_ID not between", value1, value2, "userTitleId");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("User_Gender is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("User_Gender is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(String value) {
            addCriterion("User_Gender =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(String value) {
            addCriterion("User_Gender <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(String value) {
            addCriterion("User_Gender >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(String value) {
            addCriterion("User_Gender >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(String value) {
            addCriterion("User_Gender <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(String value) {
            addCriterion("User_Gender <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLike(String value) {
            addCriterion("User_Gender like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotLike(String value) {
            addCriterion("User_Gender not like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<String> values) {
            addCriterion("User_Gender in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<String> values) {
            addCriterion("User_Gender not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(String value1, String value2) {
            addCriterion("User_Gender between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(String value1, String value2) {
            addCriterion("User_Gender not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("User_Status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("User_Status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(String value) {
            addCriterion("User_Status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(String value) {
            addCriterion("User_Status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(String value) {
            addCriterion("User_Status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("User_Status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(String value) {
            addCriterion("User_Status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(String value) {
            addCriterion("User_Status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLike(String value) {
            addCriterion("User_Status like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotLike(String value) {
            addCriterion("User_Status not like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<String> values) {
            addCriterion("User_Status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<String> values) {
            addCriterion("User_Status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(String value1, String value2) {
            addCriterion("User_Status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(String value1, String value2) {
            addCriterion("User_Status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserSchedulingLimitcountIsNull() {
            addCriterion("User_Scheduling_LimitCount is null");
            return (Criteria) this;
        }

        public Criteria andUserSchedulingLimitcountIsNotNull() {
            addCriterion("User_Scheduling_LimitCount is not null");
            return (Criteria) this;
        }

        public Criteria andUserSchedulingLimitcountEqualTo(Integer value) {
            addCriterion("User_Scheduling_LimitCount =", value, "userSchedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andUserSchedulingLimitcountNotEqualTo(Integer value) {
            addCriterion("User_Scheduling_LimitCount <>", value, "userSchedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andUserSchedulingLimitcountGreaterThan(Integer value) {
            addCriterion("User_Scheduling_LimitCount >", value, "userSchedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andUserSchedulingLimitcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Scheduling_LimitCount >=", value, "userSchedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andUserSchedulingLimitcountLessThan(Integer value) {
            addCriterion("User_Scheduling_LimitCount <", value, "userSchedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andUserSchedulingLimitcountLessThanOrEqualTo(Integer value) {
            addCriterion("User_Scheduling_LimitCount <=", value, "userSchedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andUserSchedulingLimitcountIn(List<Integer> values) {
            addCriterion("User_Scheduling_LimitCount in", values, "userSchedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andUserSchedulingLimitcountNotIn(List<Integer> values) {
            addCriterion("User_Scheduling_LimitCount not in", values, "userSchedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andUserSchedulingLimitcountBetween(Integer value1, Integer value2) {
            addCriterion("User_Scheduling_LimitCount between", value1, value2, "userSchedulingLimitcount");
            return (Criteria) this;
        }

        public Criteria andUserSchedulingLimitcountNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Scheduling_LimitCount not between", value1, value2, "userSchedulingLimitcount");
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