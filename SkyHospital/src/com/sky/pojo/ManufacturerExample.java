package com.sky.pojo;

import java.util.ArrayList;
import java.util.List;

public class ManufacturerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManufacturerExample() {
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

        public Criteria andManufactureridIsNull() {
            addCriterion("ManufacturerId is null");
            return (Criteria) this;
        }

        public Criteria andManufactureridIsNotNull() {
            addCriterion("ManufacturerId is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureridEqualTo(Integer value) {
            addCriterion("ManufacturerId =", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridNotEqualTo(Integer value) {
            addCriterion("ManufacturerId <>", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridGreaterThan(Integer value) {
            addCriterion("ManufacturerId >", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ManufacturerId >=", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridLessThan(Integer value) {
            addCriterion("ManufacturerId <", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridLessThanOrEqualTo(Integer value) {
            addCriterion("ManufacturerId <=", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridIn(List<Integer> values) {
            addCriterion("ManufacturerId in", values, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridNotIn(List<Integer> values) {
            addCriterion("ManufacturerId not in", values, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridBetween(Integer value1, Integer value2) {
            addCriterion("ManufacturerId between", value1, value2, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridNotBetween(Integer value1, Integer value2) {
            addCriterion("ManufacturerId not between", value1, value2, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufacturernameIsNull() {
            addCriterion("ManufacturerName is null");
            return (Criteria) this;
        }

        public Criteria andManufacturernameIsNotNull() {
            addCriterion("ManufacturerName is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturernameEqualTo(String value) {
            addCriterion("ManufacturerName =", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameNotEqualTo(String value) {
            addCriterion("ManufacturerName <>", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameGreaterThan(String value) {
            addCriterion("ManufacturerName >", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameGreaterThanOrEqualTo(String value) {
            addCriterion("ManufacturerName >=", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameLessThan(String value) {
            addCriterion("ManufacturerName <", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameLessThanOrEqualTo(String value) {
            addCriterion("ManufacturerName <=", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameLike(String value) {
            addCriterion("ManufacturerName like", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameNotLike(String value) {
            addCriterion("ManufacturerName not like", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameIn(List<String> values) {
            addCriterion("ManufacturerName in", values, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameNotIn(List<String> values) {
            addCriterion("ManufacturerName not in", values, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameBetween(String value1, String value2) {
            addCriterion("ManufacturerName between", value1, value2, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameNotBetween(String value1, String value2) {
            addCriterion("ManufacturerName not between", value1, value2, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andShorIsNull() {
            addCriterion("Shor is null");
            return (Criteria) this;
        }

        public Criteria andShorIsNotNull() {
            addCriterion("Shor is not null");
            return (Criteria) this;
        }

        public Criteria andShorEqualTo(String value) {
            addCriterion("Shor =", value, "shor");
            return (Criteria) this;
        }

        public Criteria andShorNotEqualTo(String value) {
            addCriterion("Shor <>", value, "shor");
            return (Criteria) this;
        }

        public Criteria andShorGreaterThan(String value) {
            addCriterion("Shor >", value, "shor");
            return (Criteria) this;
        }

        public Criteria andShorGreaterThanOrEqualTo(String value) {
            addCriterion("Shor >=", value, "shor");
            return (Criteria) this;
        }

        public Criteria andShorLessThan(String value) {
            addCriterion("Shor <", value, "shor");
            return (Criteria) this;
        }

        public Criteria andShorLessThanOrEqualTo(String value) {
            addCriterion("Shor <=", value, "shor");
            return (Criteria) this;
        }

        public Criteria andShorLike(String value) {
            addCriterion("Shor like", value, "shor");
            return (Criteria) this;
        }

        public Criteria andShorNotLike(String value) {
            addCriterion("Shor not like", value, "shor");
            return (Criteria) this;
        }

        public Criteria andShorIn(List<String> values) {
            addCriterion("Shor in", values, "shor");
            return (Criteria) this;
        }

        public Criteria andShorNotIn(List<String> values) {
            addCriterion("Shor not in", values, "shor");
            return (Criteria) this;
        }

        public Criteria andShorBetween(String value1, String value2) {
            addCriterion("Shor between", value1, value2, "shor");
            return (Criteria) this;
        }

        public Criteria andShorNotBetween(String value1, String value2) {
            addCriterion("Shor not between", value1, value2, "shor");
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