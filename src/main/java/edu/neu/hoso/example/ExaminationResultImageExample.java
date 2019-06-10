package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class ExaminationResultImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminationResultImageExample() {
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

        public Criteria andExaminationResultImageIdIsNull() {
            addCriterion("Examination_Result_Image_ID is null");
            return (Criteria) this;
        }

        public Criteria andExaminationResultImageIdIsNotNull() {
            addCriterion("Examination_Result_Image_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationResultImageIdEqualTo(Integer value) {
            addCriterion("Examination_Result_Image_ID =", value, "examinationResultImageId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultImageIdNotEqualTo(Integer value) {
            addCriterion("Examination_Result_Image_ID <>", value, "examinationResultImageId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultImageIdGreaterThan(Integer value) {
            addCriterion("Examination_Result_Image_ID >", value, "examinationResultImageId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Examination_Result_Image_ID >=", value, "examinationResultImageId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultImageIdLessThan(Integer value) {
            addCriterion("Examination_Result_Image_ID <", value, "examinationResultImageId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("Examination_Result_Image_ID <=", value, "examinationResultImageId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultImageIdIn(List<Integer> values) {
            addCriterion("Examination_Result_Image_ID in", values, "examinationResultImageId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultImageIdNotIn(List<Integer> values) {
            addCriterion("Examination_Result_Image_ID not in", values, "examinationResultImageId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultImageIdBetween(Integer value1, Integer value2) {
            addCriterion("Examination_Result_Image_ID between", value1, value2, "examinationResultImageId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Examination_Result_Image_ID not between", value1, value2, "examinationResultImageId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdIsNull() {
            addCriterion("Examination_Result_ID is null");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdIsNotNull() {
            addCriterion("Examination_Result_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdEqualTo(Integer value) {
            addCriterion("Examination_Result_ID =", value, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdNotEqualTo(Integer value) {
            addCriterion("Examination_Result_ID <>", value, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdGreaterThan(Integer value) {
            addCriterion("Examination_Result_ID >", value, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Examination_Result_ID >=", value, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdLessThan(Integer value) {
            addCriterion("Examination_Result_ID <", value, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdLessThanOrEqualTo(Integer value) {
            addCriterion("Examination_Result_ID <=", value, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdIn(List<Integer> values) {
            addCriterion("Examination_Result_ID in", values, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdNotIn(List<Integer> values) {
            addCriterion("Examination_Result_ID not in", values, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdBetween(Integer value1, Integer value2) {
            addCriterion("Examination_Result_ID between", value1, value2, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andExaminationResultIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Examination_Result_ID not between", value1, value2, "examinationResultId");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("Image_URL is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("Image_URL is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("Image_URL =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("Image_URL <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("Image_URL >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Image_URL >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("Image_URL <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("Image_URL <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("Image_URL like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("Image_URL not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("Image_URL in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("Image_URL not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("Image_URL between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("Image_URL not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNull() {
            addCriterion("Image_Name is null");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNotNull() {
            addCriterion("Image_Name is not null");
            return (Criteria) this;
        }

        public Criteria andImageNameEqualTo(String value) {
            addCriterion("Image_Name =", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotEqualTo(String value) {
            addCriterion("Image_Name <>", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThan(String value) {
            addCriterion("Image_Name >", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThanOrEqualTo(String value) {
            addCriterion("Image_Name >=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThan(String value) {
            addCriterion("Image_Name <", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThanOrEqualTo(String value) {
            addCriterion("Image_Name <=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLike(String value) {
            addCriterion("Image_Name like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotLike(String value) {
            addCriterion("Image_Name not like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameIn(List<String> values) {
            addCriterion("Image_Name in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotIn(List<String> values) {
            addCriterion("Image_Name not in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameBetween(String value1, String value2) {
            addCriterion("Image_Name between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotBetween(String value1, String value2) {
            addCriterion("Image_Name not between", value1, value2, "imageName");
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