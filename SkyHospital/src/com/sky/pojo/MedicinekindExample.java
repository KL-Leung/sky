package com.sky.pojo;

import java.util.ArrayList;
import java.util.List;

public class MedicinekindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicinekindExample() {
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

        public Criteria andMedicinekindidIsNull() {
            addCriterion("MedicineKindID is null");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidIsNotNull() {
            addCriterion("MedicineKindID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidEqualTo(Integer value) {
            addCriterion("MedicineKindID =", value, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidNotEqualTo(Integer value) {
            addCriterion("MedicineKindID <>", value, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidGreaterThan(Integer value) {
            addCriterion("MedicineKindID >", value, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MedicineKindID >=", value, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidLessThan(Integer value) {
            addCriterion("MedicineKindID <", value, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidLessThanOrEqualTo(Integer value) {
            addCriterion("MedicineKindID <=", value, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidIn(List<Integer> values) {
            addCriterion("MedicineKindID in", values, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidNotIn(List<Integer> values) {
            addCriterion("MedicineKindID not in", values, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidBetween(Integer value1, Integer value2) {
            addCriterion("MedicineKindID between", value1, value2, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidNotBetween(Integer value1, Integer value2) {
            addCriterion("MedicineKindID not between", value1, value2, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindnameIsNull() {
            addCriterion("MedicineKindName is null");
            return (Criteria) this;
        }

        public Criteria andMedicinekindnameIsNotNull() {
            addCriterion("MedicineKindName is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinekindnameEqualTo(String value) {
            addCriterion("MedicineKindName =", value, "medicinekindname");
            return (Criteria) this;
        }

        public Criteria andMedicinekindnameNotEqualTo(String value) {
            addCriterion("MedicineKindName <>", value, "medicinekindname");
            return (Criteria) this;
        }

        public Criteria andMedicinekindnameGreaterThan(String value) {
            addCriterion("MedicineKindName >", value, "medicinekindname");
            return (Criteria) this;
        }

        public Criteria andMedicinekindnameGreaterThanOrEqualTo(String value) {
            addCriterion("MedicineKindName >=", value, "medicinekindname");
            return (Criteria) this;
        }

        public Criteria andMedicinekindnameLessThan(String value) {
            addCriterion("MedicineKindName <", value, "medicinekindname");
            return (Criteria) this;
        }

        public Criteria andMedicinekindnameLessThanOrEqualTo(String value) {
            addCriterion("MedicineKindName <=", value, "medicinekindname");
            return (Criteria) this;
        }

        public Criteria andMedicinekindnameLike(String value) {
            addCriterion("MedicineKindName like", value, "medicinekindname");
            return (Criteria) this;
        }

        public Criteria andMedicinekindnameNotLike(String value) {
            addCriterion("MedicineKindName not like", value, "medicinekindname");
            return (Criteria) this;
        }

        public Criteria andMedicinekindnameIn(List<String> values) {
            addCriterion("MedicineKindName in", values, "medicinekindname");
            return (Criteria) this;
        }

        public Criteria andMedicinekindnameNotIn(List<String> values) {
            addCriterion("MedicineKindName not in", values, "medicinekindname");
            return (Criteria) this;
        }

        public Criteria andMedicinekindnameBetween(String value1, String value2) {
            addCriterion("MedicineKindName between", value1, value2, "medicinekindname");
            return (Criteria) this;
        }

        public Criteria andMedicinekindnameNotBetween(String value1, String value2) {
            addCriterion("MedicineKindName not between", value1, value2, "medicinekindname");
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