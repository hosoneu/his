package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class CommonlyUsedFmedicalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonlyUsedFmedicalExample() {
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

        public Criteria andCommonlyUsedFmedicalIdIsNull() {
            addCriterion("Commonly_Used_Fmedical_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedFmedicalIdIsNotNull() {
            addCriterion("Commonly_Used_Fmedical_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedFmedicalIdEqualTo(Integer value) {
            addCriterion("Commonly_Used_Fmedical_ID =", value, "commonlyUsedFmedicalId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedFmedicalIdNotEqualTo(Integer value) {
            addCriterion("Commonly_Used_Fmedical_ID <>", value, "commonlyUsedFmedicalId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedFmedicalIdGreaterThan(Integer value) {
            addCriterion("Commonly_Used_Fmedical_ID >", value, "commonlyUsedFmedicalId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedFmedicalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Commonly_Used_Fmedical_ID >=", value, "commonlyUsedFmedicalId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedFmedicalIdLessThan(Integer value) {
            addCriterion("Commonly_Used_Fmedical_ID <", value, "commonlyUsedFmedicalId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedFmedicalIdLessThanOrEqualTo(Integer value) {
            addCriterion("Commonly_Used_Fmedical_ID <=", value, "commonlyUsedFmedicalId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedFmedicalIdIn(List<Integer> values) {
            addCriterion("Commonly_Used_Fmedical_ID in", values, "commonlyUsedFmedicalId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedFmedicalIdNotIn(List<Integer> values) {
            addCriterion("Commonly_Used_Fmedical_ID not in", values, "commonlyUsedFmedicalId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedFmedicalIdBetween(Integer value1, Integer value2) {
            addCriterion("Commonly_Used_Fmedical_ID between", value1, value2, "commonlyUsedFmedicalId");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedFmedicalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Commonly_Used_Fmedical_ID not between", value1, value2, "commonlyUsedFmedicalId");
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