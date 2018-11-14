package com.fox.model;

import java.util.ArrayList;
import java.util.List;

public class TblComDicdtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblComDicdtlExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDataValueIsNull() {
            addCriterion("DATA_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andDataValueIsNotNull() {
            addCriterion("DATA_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDataValueEqualTo(String value) {
            addCriterion("DATA_VALUE =", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueNotEqualTo(String value) {
            addCriterion("DATA_VALUE <>", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueGreaterThan(String value) {
            addCriterion("DATA_VALUE >", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_VALUE >=", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueLessThan(String value) {
            addCriterion("DATA_VALUE <", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueLessThanOrEqualTo(String value) {
            addCriterion("DATA_VALUE <=", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueLike(String value) {
            addCriterion("DATA_VALUE like", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueNotLike(String value) {
            addCriterion("DATA_VALUE not like", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueIn(List<String> values) {
            addCriterion("DATA_VALUE in", values, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueNotIn(List<String> values) {
            addCriterion("DATA_VALUE not in", values, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueBetween(String value1, String value2) {
            addCriterion("DATA_VALUE between", value1, value2, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueNotBetween(String value1, String value2) {
            addCriterion("DATA_VALUE not between", value1, value2, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataSubvalueIsNull() {
            addCriterion("DATA_SUBVALUE is null");
            return (Criteria) this;
        }

        public Criteria andDataSubvalueIsNotNull() {
            addCriterion("DATA_SUBVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDataSubvalueEqualTo(String value) {
            addCriterion("DATA_SUBVALUE =", value, "dataSubvalue");
            return (Criteria) this;
        }

        public Criteria andDataSubvalueNotEqualTo(String value) {
            addCriterion("DATA_SUBVALUE <>", value, "dataSubvalue");
            return (Criteria) this;
        }

        public Criteria andDataSubvalueGreaterThan(String value) {
            addCriterion("DATA_SUBVALUE >", value, "dataSubvalue");
            return (Criteria) this;
        }

        public Criteria andDataSubvalueGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_SUBVALUE >=", value, "dataSubvalue");
            return (Criteria) this;
        }

        public Criteria andDataSubvalueLessThan(String value) {
            addCriterion("DATA_SUBVALUE <", value, "dataSubvalue");
            return (Criteria) this;
        }

        public Criteria andDataSubvalueLessThanOrEqualTo(String value) {
            addCriterion("DATA_SUBVALUE <=", value, "dataSubvalue");
            return (Criteria) this;
        }

        public Criteria andDataSubvalueLike(String value) {
            addCriterion("DATA_SUBVALUE like", value, "dataSubvalue");
            return (Criteria) this;
        }

        public Criteria andDataSubvalueNotLike(String value) {
            addCriterion("DATA_SUBVALUE not like", value, "dataSubvalue");
            return (Criteria) this;
        }

        public Criteria andDataSubvalueIn(List<String> values) {
            addCriterion("DATA_SUBVALUE in", values, "dataSubvalue");
            return (Criteria) this;
        }

        public Criteria andDataSubvalueNotIn(List<String> values) {
            addCriterion("DATA_SUBVALUE not in", values, "dataSubvalue");
            return (Criteria) this;
        }

        public Criteria andDataSubvalueBetween(String value1, String value2) {
            addCriterion("DATA_SUBVALUE between", value1, value2, "dataSubvalue");
            return (Criteria) this;
        }

        public Criteria andDataSubvalueNotBetween(String value1, String value2) {
            addCriterion("DATA_SUBVALUE not between", value1, value2, "dataSubvalue");
            return (Criteria) this;
        }

        public Criteria andDataSubnameIsNull() {
            addCriterion("DATA_SUBNAME is null");
            return (Criteria) this;
        }

        public Criteria andDataSubnameIsNotNull() {
            addCriterion("DATA_SUBNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDataSubnameEqualTo(String value) {
            addCriterion("DATA_SUBNAME =", value, "dataSubname");
            return (Criteria) this;
        }

        public Criteria andDataSubnameNotEqualTo(String value) {
            addCriterion("DATA_SUBNAME <>", value, "dataSubname");
            return (Criteria) this;
        }

        public Criteria andDataSubnameGreaterThan(String value) {
            addCriterion("DATA_SUBNAME >", value, "dataSubname");
            return (Criteria) this;
        }

        public Criteria andDataSubnameGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_SUBNAME >=", value, "dataSubname");
            return (Criteria) this;
        }

        public Criteria andDataSubnameLessThan(String value) {
            addCriterion("DATA_SUBNAME <", value, "dataSubname");
            return (Criteria) this;
        }

        public Criteria andDataSubnameLessThanOrEqualTo(String value) {
            addCriterion("DATA_SUBNAME <=", value, "dataSubname");
            return (Criteria) this;
        }

        public Criteria andDataSubnameLike(String value) {
            addCriterion("DATA_SUBNAME like", value, "dataSubname");
            return (Criteria) this;
        }

        public Criteria andDataSubnameNotLike(String value) {
            addCriterion("DATA_SUBNAME not like", value, "dataSubname");
            return (Criteria) this;
        }

        public Criteria andDataSubnameIn(List<String> values) {
            addCriterion("DATA_SUBNAME in", values, "dataSubname");
            return (Criteria) this;
        }

        public Criteria andDataSubnameNotIn(List<String> values) {
            addCriterion("DATA_SUBNAME not in", values, "dataSubname");
            return (Criteria) this;
        }

        public Criteria andDataSubnameBetween(String value1, String value2) {
            addCriterion("DATA_SUBNAME between", value1, value2, "dataSubname");
            return (Criteria) this;
        }

        public Criteria andDataSubnameNotBetween(String value1, String value2) {
            addCriterion("DATA_SUBNAME not between", value1, value2, "dataSubname");
            return (Criteria) this;
        }

        public Criteria andPreDataValueIsNull() {
            addCriterion("PRE_DATA_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andPreDataValueIsNotNull() {
            addCriterion("PRE_DATA_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andPreDataValueEqualTo(String value) {
            addCriterion("PRE_DATA_VALUE =", value, "preDataValue");
            return (Criteria) this;
        }

        public Criteria andPreDataValueNotEqualTo(String value) {
            addCriterion("PRE_DATA_VALUE <>", value, "preDataValue");
            return (Criteria) this;
        }

        public Criteria andPreDataValueGreaterThan(String value) {
            addCriterion("PRE_DATA_VALUE >", value, "preDataValue");
            return (Criteria) this;
        }

        public Criteria andPreDataValueGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_DATA_VALUE >=", value, "preDataValue");
            return (Criteria) this;
        }

        public Criteria andPreDataValueLessThan(String value) {
            addCriterion("PRE_DATA_VALUE <", value, "preDataValue");
            return (Criteria) this;
        }

        public Criteria andPreDataValueLessThanOrEqualTo(String value) {
            addCriterion("PRE_DATA_VALUE <=", value, "preDataValue");
            return (Criteria) this;
        }

        public Criteria andPreDataValueLike(String value) {
            addCriterion("PRE_DATA_VALUE like", value, "preDataValue");
            return (Criteria) this;
        }

        public Criteria andPreDataValueNotLike(String value) {
            addCriterion("PRE_DATA_VALUE not like", value, "preDataValue");
            return (Criteria) this;
        }

        public Criteria andPreDataValueIn(List<String> values) {
            addCriterion("PRE_DATA_VALUE in", values, "preDataValue");
            return (Criteria) this;
        }

        public Criteria andPreDataValueNotIn(List<String> values) {
            addCriterion("PRE_DATA_VALUE not in", values, "preDataValue");
            return (Criteria) this;
        }

        public Criteria andPreDataValueBetween(String value1, String value2) {
            addCriterion("PRE_DATA_VALUE between", value1, value2, "preDataValue");
            return (Criteria) this;
        }

        public Criteria andPreDataValueNotBetween(String value1, String value2) {
            addCriterion("PRE_DATA_VALUE not between", value1, value2, "preDataValue");
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