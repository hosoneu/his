package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class DiseaseTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiseaseTypeExample() {
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

        public Criteria andDiseaseTypeCodeIsNull() {
            addCriterion("Disease_Type_Code is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeCodeIsNotNull() {
            addCriterion("Disease_Type_Code is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeCodeEqualTo(String value) {
            addCriterion("Disease_Type_Code =", value, "diseaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeCodeNotEqualTo(String value) {
            addCriterion("Disease_Type_Code <>", value, "diseaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeCodeGreaterThan(String value) {
            addCriterion("Disease_Type_Code >", value, "diseaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Disease_Type_Code >=", value, "diseaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeCodeLessThan(String value) {
            addCriterion("Disease_Type_Code <", value, "diseaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("Disease_Type_Code <=", value, "diseaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeCodeLike(String value) {
            addCriterion("Disease_Type_Code like", value, "diseaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeCodeNotLike(String value) {
            addCriterion("Disease_Type_Code not like", value, "diseaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeCodeIn(List<String> values) {
            addCriterion("Disease_Type_Code in", values, "diseaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeCodeNotIn(List<String> values) {
            addCriterion("Disease_Type_Code not in", values, "diseaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeCodeBetween(String value1, String value2) {
            addCriterion("Disease_Type_Code between", value1, value2, "diseaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeCodeNotBetween(String value1, String value2) {
            addCriterion("Disease_Type_Code not between", value1, value2, "diseaseTypeCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeNameIsNull() {
            addCriterion("Disease_Type_Name is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeNameIsNotNull() {
            addCriterion("Disease_Type_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeNameEqualTo(String value) {
            addCriterion("Disease_Type_Name =", value, "diseaseTypeName");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeNameNotEqualTo(String value) {
            addCriterion("Disease_Type_Name <>", value, "diseaseTypeName");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeNameGreaterThan(String value) {
            addCriterion("Disease_Type_Name >", value, "diseaseTypeName");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("Disease_Type_Name >=", value, "diseaseTypeName");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeNameLessThan(String value) {
            addCriterion("Disease_Type_Name <", value, "diseaseTypeName");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeNameLessThanOrEqualTo(String value) {
            addCriterion("Disease_Type_Name <=", value, "diseaseTypeName");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeNameLike(String value) {
            addCriterion("Disease_Type_Name like", value, "diseaseTypeName");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeNameNotLike(String value) {
            addCriterion("Disease_Type_Name not like", value, "diseaseTypeName");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeNameIn(List<String> values) {
            addCriterion("Disease_Type_Name in", values, "diseaseTypeName");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeNameNotIn(List<String> values) {
            addCriterion("Disease_Type_Name not in", values, "diseaseTypeName");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeNameBetween(String value1, String value2) {
            addCriterion("Disease_Type_Name between", value1, value2, "diseaseTypeName");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeNameNotBetween(String value1, String value2) {
            addCriterion("Disease_Type_Name not between", value1, value2, "diseaseTypeName");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeSequenceIsNull() {
            addCriterion("Disease_Type_Sequence is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeSequenceIsNotNull() {
            addCriterion("Disease_Type_Sequence is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeSequenceEqualTo(Integer value) {
            addCriterion("Disease_Type_Sequence =", value, "diseaseTypeSequence");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeSequenceNotEqualTo(Integer value) {
            addCriterion("Disease_Type_Sequence <>", value, "diseaseTypeSequence");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeSequenceGreaterThan(Integer value) {
            addCriterion("Disease_Type_Sequence >", value, "diseaseTypeSequence");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Disease_Type_Sequence >=", value, "diseaseTypeSequence");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeSequenceLessThan(Integer value) {
            addCriterion("Disease_Type_Sequence <", value, "diseaseTypeSequence");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("Disease_Type_Sequence <=", value, "diseaseTypeSequence");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeSequenceIn(List<Integer> values) {
            addCriterion("Disease_Type_Sequence in", values, "diseaseTypeSequence");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeSequenceNotIn(List<Integer> values) {
            addCriterion("Disease_Type_Sequence not in", values, "diseaseTypeSequence");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeSequenceBetween(Integer value1, Integer value2) {
            addCriterion("Disease_Type_Sequence between", value1, value2, "diseaseTypeSequence");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("Disease_Type_Sequence not between", value1, value2, "diseaseTypeSequence");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeTypeIsNull() {
            addCriterion("Disease_Type_Type is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeTypeIsNotNull() {
            addCriterion("Disease_Type_Type is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeTypeEqualTo(String value) {
            addCriterion("Disease_Type_Type =", value, "diseaseTypeType");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeTypeNotEqualTo(String value) {
            addCriterion("Disease_Type_Type <>", value, "diseaseTypeType");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeTypeGreaterThan(String value) {
            addCriterion("Disease_Type_Type >", value, "diseaseTypeType");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Disease_Type_Type >=", value, "diseaseTypeType");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeTypeLessThan(String value) {
            addCriterion("Disease_Type_Type <", value, "diseaseTypeType");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeTypeLessThanOrEqualTo(String value) {
            addCriterion("Disease_Type_Type <=", value, "diseaseTypeType");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeTypeLike(String value) {
            addCriterion("Disease_Type_Type like", value, "diseaseTypeType");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeTypeNotLike(String value) {
            addCriterion("Disease_Type_Type not like", value, "diseaseTypeType");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeTypeIn(List<String> values) {
            addCriterion("Disease_Type_Type in", values, "diseaseTypeType");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeTypeNotIn(List<String> values) {
            addCriterion("Disease_Type_Type not in", values, "diseaseTypeType");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeTypeBetween(String value1, String value2) {
            addCriterion("Disease_Type_Type between", value1, value2, "diseaseTypeType");
            return (Criteria) this;
        }

        public Criteria andDiseaseTypeTypeNotBetween(String value1, String value2) {
            addCriterion("Disease_Type_Type not between", value1, value2, "diseaseTypeType");
            return (Criteria) this;
        }

        public Criteria andDiseaseFolderIdIsNull() {
            addCriterion("Disease_Folder_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseFolderIdIsNotNull() {
            addCriterion("Disease_Folder_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseFolderIdEqualTo(Integer value) {
            addCriterion("Disease_Folder_ID =", value, "diseaseFolderId");
            return (Criteria) this;
        }

        public Criteria andDiseaseFolderIdNotEqualTo(Integer value) {
            addCriterion("Disease_Folder_ID <>", value, "diseaseFolderId");
            return (Criteria) this;
        }

        public Criteria andDiseaseFolderIdGreaterThan(Integer value) {
            addCriterion("Disease_Folder_ID >", value, "diseaseFolderId");
            return (Criteria) this;
        }

        public Criteria andDiseaseFolderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Disease_Folder_ID >=", value, "diseaseFolderId");
            return (Criteria) this;
        }

        public Criteria andDiseaseFolderIdLessThan(Integer value) {
            addCriterion("Disease_Folder_ID <", value, "diseaseFolderId");
            return (Criteria) this;
        }

        public Criteria andDiseaseFolderIdLessThanOrEqualTo(Integer value) {
            addCriterion("Disease_Folder_ID <=", value, "diseaseFolderId");
            return (Criteria) this;
        }

        public Criteria andDiseaseFolderIdIn(List<Integer> values) {
            addCriterion("Disease_Folder_ID in", values, "diseaseFolderId");
            return (Criteria) this;
        }

        public Criteria andDiseaseFolderIdNotIn(List<Integer> values) {
            addCriterion("Disease_Folder_ID not in", values, "diseaseFolderId");
            return (Criteria) this;
        }

        public Criteria andDiseaseFolderIdBetween(Integer value1, Integer value2) {
            addCriterion("Disease_Folder_ID between", value1, value2, "diseaseFolderId");
            return (Criteria) this;
        }

        public Criteria andDiseaseFolderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Disease_Folder_ID not between", value1, value2, "diseaseFolderId");
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