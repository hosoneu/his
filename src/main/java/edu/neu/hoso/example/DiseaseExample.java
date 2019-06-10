package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class DiseaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiseaseExample() {
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

        public Criteria andDiseaseIdIsNull() {
            addCriterion("Disease_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIsNotNull() {
            addCriterion("Disease_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdEqualTo(Integer value) {
            addCriterion("Disease_ID =", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotEqualTo(Integer value) {
            addCriterion("Disease_ID <>", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdGreaterThan(Integer value) {
            addCriterion("Disease_ID >", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Disease_ID >=", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdLessThan(Integer value) {
            addCriterion("Disease_ID <", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("Disease_ID <=", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIn(List<Integer> values) {
            addCriterion("Disease_ID in", values, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotIn(List<Integer> values) {
            addCriterion("Disease_ID not in", values, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdBetween(Integer value1, Integer value2) {
            addCriterion("Disease_ID between", value1, value2, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Disease_ID not between", value1, value2, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeIsNull() {
            addCriterion("Disease_Code is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeIsNotNull() {
            addCriterion("Disease_Code is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeEqualTo(String value) {
            addCriterion("Disease_Code =", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeNotEqualTo(String value) {
            addCriterion("Disease_Code <>", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeGreaterThan(String value) {
            addCriterion("Disease_Code >", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Disease_Code >=", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeLessThan(String value) {
            addCriterion("Disease_Code <", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeLessThanOrEqualTo(String value) {
            addCriterion("Disease_Code <=", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeLike(String value) {
            addCriterion("Disease_Code like", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeNotLike(String value) {
            addCriterion("Disease_Code not like", value, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeIn(List<String> values) {
            addCriterion("Disease_Code in", values, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeNotIn(List<String> values) {
            addCriterion("Disease_Code not in", values, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeBetween(String value1, String value2) {
            addCriterion("Disease_Code between", value1, value2, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCodeNotBetween(String value1, String value2) {
            addCriterion("Disease_Code not between", value1, value2, "diseaseCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameIsNull() {
            addCriterion("Disease_Name is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameIsNotNull() {
            addCriterion("Disease_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameEqualTo(String value) {
            addCriterion("Disease_Name =", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotEqualTo(String value) {
            addCriterion("Disease_Name <>", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameGreaterThan(String value) {
            addCriterion("Disease_Name >", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("Disease_Name >=", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameLessThan(String value) {
            addCriterion("Disease_Name <", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameLessThanOrEqualTo(String value) {
            addCriterion("Disease_Name <=", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameLike(String value) {
            addCriterion("Disease_Name like", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotLike(String value) {
            addCriterion("Disease_Name not like", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameIn(List<String> values) {
            addCriterion("Disease_Name in", values, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotIn(List<String> values) {
            addCriterion("Disease_Name not in", values, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameBetween(String value1, String value2) {
            addCriterion("Disease_Name between", value1, value2, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotBetween(String value1, String value2) {
            addCriterion("Disease_Name not between", value1, value2, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdIsNull() {
            addCriterion("Disease_ICD is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdIsNotNull() {
            addCriterion("Disease_ICD is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdEqualTo(String value) {
            addCriterion("Disease_ICD =", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdNotEqualTo(String value) {
            addCriterion("Disease_ICD <>", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdGreaterThan(String value) {
            addCriterion("Disease_ICD >", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdGreaterThanOrEqualTo(String value) {
            addCriterion("Disease_ICD >=", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdLessThan(String value) {
            addCriterion("Disease_ICD <", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdLessThanOrEqualTo(String value) {
            addCriterion("Disease_ICD <=", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdLike(String value) {
            addCriterion("Disease_ICD like", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdNotLike(String value) {
            addCriterion("Disease_ICD not like", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdIn(List<String> values) {
            addCriterion("Disease_ICD in", values, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdNotIn(List<String> values) {
            addCriterion("Disease_ICD not in", values, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdBetween(String value1, String value2) {
            addCriterion("Disease_ICD between", value1, value2, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdNotBetween(String value1, String value2) {
            addCriterion("Disease_ICD not between", value1, value2, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeIdIsNull() {
            addCriterion("Disease_Type_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeIdIsNotNull() {
            addCriterion("Disease_Type_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeIdEqualTo(Integer value) {
            addCriterion("Disease_Type_ID =", value, "diseaseTypeId");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeIdNotEqualTo(Integer value) {
            addCriterion("Disease_Type_ID <>", value, "diseaseTypeId");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeIdGreaterThan(Integer value) {
            addCriterion("Disease_Type_ID >", value, "diseaseTypeId");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Disease_Type_ID >=", value, "diseaseTypeId");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeIdLessThan(Integer value) {
            addCriterion("Disease_Type_ID <", value, "diseaseTypeId");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Disease_Type_ID <=", value, "diseaseTypeId");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeIdIn(List<Integer> values) {
            addCriterion("Disease_Type_ID in", values, "diseaseTypeId");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeIdNotIn(List<Integer> values) {
            addCriterion("Disease_Type_ID not in", values, "diseaseTypeId");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("Disease_Type_ID between", value1, value2, "diseaseTypeId");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Disease_Type_ID not between", value1, value2, "diseaseTypeId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName1IsNull() {
            addCriterion("Disease_Customize_Name1 is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName1IsNotNull() {
            addCriterion("Disease_Customize_Name1 is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName1EqualTo(String value) {
            addCriterion("Disease_Customize_Name1 =", value, "diseaseCustomizeName1");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName1NotEqualTo(String value) {
            addCriterion("Disease_Customize_Name1 <>", value, "diseaseCustomizeName1");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName1GreaterThan(String value) {
            addCriterion("Disease_Customize_Name1 >", value, "diseaseCustomizeName1");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName1GreaterThanOrEqualTo(String value) {
            addCriterion("Disease_Customize_Name1 >=", value, "diseaseCustomizeName1");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName1LessThan(String value) {
            addCriterion("Disease_Customize_Name1 <", value, "diseaseCustomizeName1");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName1LessThanOrEqualTo(String value) {
            addCriterion("Disease_Customize_Name1 <=", value, "diseaseCustomizeName1");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName1Like(String value) {
            addCriterion("Disease_Customize_Name1 like", value, "diseaseCustomizeName1");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName1NotLike(String value) {
            addCriterion("Disease_Customize_Name1 not like", value, "diseaseCustomizeName1");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName1In(List<String> values) {
            addCriterion("Disease_Customize_Name1 in", values, "diseaseCustomizeName1");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName1NotIn(List<String> values) {
            addCriterion("Disease_Customize_Name1 not in", values, "diseaseCustomizeName1");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName1Between(String value1, String value2) {
            addCriterion("Disease_Customize_Name1 between", value1, value2, "diseaseCustomizeName1");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName1NotBetween(String value1, String value2) {
            addCriterion("Disease_Customize_Name1 not between", value1, value2, "diseaseCustomizeName1");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName2IsNull() {
            addCriterion("Disease_Customize_Name2 is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName2IsNotNull() {
            addCriterion("Disease_Customize_Name2 is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName2EqualTo(String value) {
            addCriterion("Disease_Customize_Name2 =", value, "diseaseCustomizeName2");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName2NotEqualTo(String value) {
            addCriterion("Disease_Customize_Name2 <>", value, "diseaseCustomizeName2");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName2GreaterThan(String value) {
            addCriterion("Disease_Customize_Name2 >", value, "diseaseCustomizeName2");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName2GreaterThanOrEqualTo(String value) {
            addCriterion("Disease_Customize_Name2 >=", value, "diseaseCustomizeName2");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName2LessThan(String value) {
            addCriterion("Disease_Customize_Name2 <", value, "diseaseCustomizeName2");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName2LessThanOrEqualTo(String value) {
            addCriterion("Disease_Customize_Name2 <=", value, "diseaseCustomizeName2");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName2Like(String value) {
            addCriterion("Disease_Customize_Name2 like", value, "diseaseCustomizeName2");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName2NotLike(String value) {
            addCriterion("Disease_Customize_Name2 not like", value, "diseaseCustomizeName2");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName2In(List<String> values) {
            addCriterion("Disease_Customize_Name2 in", values, "diseaseCustomizeName2");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName2NotIn(List<String> values) {
            addCriterion("Disease_Customize_Name2 not in", values, "diseaseCustomizeName2");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName2Between(String value1, String value2) {
            addCriterion("Disease_Customize_Name2 between", value1, value2, "diseaseCustomizeName2");
            return (Criteria) this;
        }

        public Criteria andDiseaseCustomizeName2NotBetween(String value1, String value2) {
            addCriterion("Disease_Customize_Name2 not between", value1, value2, "diseaseCustomizeName2");
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