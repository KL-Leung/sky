package com.sky.pojo;

import java.util.ArrayList;
import java.util.List;

public class CounterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CounterExample() {
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

        public Criteria andCounteridIsNull() {
            addCriterion("CounterID is null");
            return (Criteria) this;
        }

        public Criteria andCounteridIsNotNull() {
            addCriterion("CounterID is not null");
            return (Criteria) this;
        }

        public Criteria andCounteridEqualTo(Integer value) {
            addCriterion("CounterID =", value, "counterid");
            return (Criteria) this;
        }

        public Criteria andCounteridNotEqualTo(Integer value) {
            addCriterion("CounterID <>", value, "counterid");
            return (Criteria) this;
        }

        public Criteria andCounteridGreaterThan(Integer value) {
            addCriterion("CounterID >", value, "counterid");
            return (Criteria) this;
        }

        public Criteria andCounteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("CounterID >=", value, "counterid");
            return (Criteria) this;
        }

        public Criteria andCounteridLessThan(Integer value) {
            addCriterion("CounterID <", value, "counterid");
            return (Criteria) this;
        }

        public Criteria andCounteridLessThanOrEqualTo(Integer value) {
            addCriterion("CounterID <=", value, "counterid");
            return (Criteria) this;
        }

        public Criteria andCounteridIn(List<Integer> values) {
            addCriterion("CounterID in", values, "counterid");
            return (Criteria) this;
        }

        public Criteria andCounteridNotIn(List<Integer> values) {
            addCriterion("CounterID not in", values, "counterid");
            return (Criteria) this;
        }

        public Criteria andCounteridBetween(Integer value1, Integer value2) {
            addCriterion("CounterID between", value1, value2, "counterid");
            return (Criteria) this;
        }

        public Criteria andCounteridNotBetween(Integer value1, Integer value2) {
            addCriterion("CounterID not between", value1, value2, "counterid");
            return (Criteria) this;
        }

        public Criteria andSaitemidIsNull() {
            addCriterion("SAItemId is null");
            return (Criteria) this;
        }

        public Criteria andSaitemidIsNotNull() {
            addCriterion("SAItemId is not null");
            return (Criteria) this;
        }

        public Criteria andSaitemidEqualTo(Integer value) {
            addCriterion("SAItemId =", value, "saitemid");
            return (Criteria) this;
        }

        public Criteria andSaitemidNotEqualTo(Integer value) {
            addCriterion("SAItemId <>", value, "saitemid");
            return (Criteria) this;
        }

        public Criteria andSaitemidGreaterThan(Integer value) {
            addCriterion("SAItemId >", value, "saitemid");
            return (Criteria) this;
        }

        public Criteria andSaitemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SAItemId >=", value, "saitemid");
            return (Criteria) this;
        }

        public Criteria andSaitemidLessThan(Integer value) {
            addCriterion("SAItemId <", value, "saitemid");
            return (Criteria) this;
        }

        public Criteria andSaitemidLessThanOrEqualTo(Integer value) {
            addCriterion("SAItemId <=", value, "saitemid");
            return (Criteria) this;
        }

        public Criteria andSaitemidIn(List<Integer> values) {
            addCriterion("SAItemId in", values, "saitemid");
            return (Criteria) this;
        }

        public Criteria andSaitemidNotIn(List<Integer> values) {
            addCriterion("SAItemId not in", values, "saitemid");
            return (Criteria) this;
        }

        public Criteria andSaitemidBetween(Integer value1, Integer value2) {
            addCriterion("SAItemId between", value1, value2, "saitemid");
            return (Criteria) this;
        }

        public Criteria andSaitemidNotBetween(Integer value1, Integer value2) {
            addCriterion("SAItemId not between", value1, value2, "saitemid");
            return (Criteria) this;
        }

        public Criteria andGaidIsNull() {
            addCriterion("GAID is null");
            return (Criteria) this;
        }

        public Criteria andGaidIsNotNull() {
            addCriterion("GAID is not null");
            return (Criteria) this;
        }

        public Criteria andGaidEqualTo(Integer value) {
            addCriterion("GAID =", value, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidNotEqualTo(Integer value) {
            addCriterion("GAID <>", value, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidGreaterThan(Integer value) {
            addCriterion("GAID >", value, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GAID >=", value, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidLessThan(Integer value) {
            addCriterion("GAID <", value, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidLessThanOrEqualTo(Integer value) {
            addCriterion("GAID <=", value, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidIn(List<Integer> values) {
            addCriterion("GAID in", values, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidNotIn(List<Integer> values) {
            addCriterion("GAID not in", values, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidBetween(Integer value1, Integer value2) {
            addCriterion("GAID between", value1, value2, "gaid");
            return (Criteria) this;
        }

        public Criteria andGaidNotBetween(Integer value1, Integer value2) {
            addCriterion("GAID not between", value1, value2, "gaid");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("Number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("Number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("Number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("Number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("Number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("Number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("Number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("Number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("Number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("Number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("Number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("Number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andUpperIsNull() {
            addCriterion("Upper is null");
            return (Criteria) this;
        }

        public Criteria andUpperIsNotNull() {
            addCriterion("Upper is not null");
            return (Criteria) this;
        }

        public Criteria andUpperEqualTo(Integer value) {
            addCriterion("Upper =", value, "upper");
            return (Criteria) this;
        }

        public Criteria andUpperNotEqualTo(Integer value) {
            addCriterion("Upper <>", value, "upper");
            return (Criteria) this;
        }

        public Criteria andUpperGreaterThan(Integer value) {
            addCriterion("Upper >", value, "upper");
            return (Criteria) this;
        }

        public Criteria andUpperGreaterThanOrEqualTo(Integer value) {
            addCriterion("Upper >=", value, "upper");
            return (Criteria) this;
        }

        public Criteria andUpperLessThan(Integer value) {
            addCriterion("Upper <", value, "upper");
            return (Criteria) this;
        }

        public Criteria andUpperLessThanOrEqualTo(Integer value) {
            addCriterion("Upper <=", value, "upper");
            return (Criteria) this;
        }

        public Criteria andUpperIn(List<Integer> values) {
            addCriterion("Upper in", values, "upper");
            return (Criteria) this;
        }

        public Criteria andUpperNotIn(List<Integer> values) {
            addCriterion("Upper not in", values, "upper");
            return (Criteria) this;
        }

        public Criteria andUpperBetween(Integer value1, Integer value2) {
            addCriterion("Upper between", value1, value2, "upper");
            return (Criteria) this;
        }

        public Criteria andUpperNotBetween(Integer value1, Integer value2) {
            addCriterion("Upper not between", value1, value2, "upper");
            return (Criteria) this;
        }

        public Criteria andLowerIsNull() {
            addCriterion("Lower is null");
            return (Criteria) this;
        }

        public Criteria andLowerIsNotNull() {
            addCriterion("Lower is not null");
            return (Criteria) this;
        }

        public Criteria andLowerEqualTo(Integer value) {
            addCriterion("Lower =", value, "lower");
            return (Criteria) this;
        }

        public Criteria andLowerNotEqualTo(Integer value) {
            addCriterion("Lower <>", value, "lower");
            return (Criteria) this;
        }

        public Criteria andLowerGreaterThan(Integer value) {
            addCriterion("Lower >", value, "lower");
            return (Criteria) this;
        }

        public Criteria andLowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("Lower >=", value, "lower");
            return (Criteria) this;
        }

        public Criteria andLowerLessThan(Integer value) {
            addCriterion("Lower <", value, "lower");
            return (Criteria) this;
        }

        public Criteria andLowerLessThanOrEqualTo(Integer value) {
            addCriterion("Lower <=", value, "lower");
            return (Criteria) this;
        }

        public Criteria andLowerIn(List<Integer> values) {
            addCriterion("Lower in", values, "lower");
            return (Criteria) this;
        }

        public Criteria andLowerNotIn(List<Integer> values) {
            addCriterion("Lower not in", values, "lower");
            return (Criteria) this;
        }

        public Criteria andLowerBetween(Integer value1, Integer value2) {
            addCriterion("Lower between", value1, value2, "lower");
            return (Criteria) this;
        }

        public Criteria andLowerNotBetween(Integer value1, Integer value2) {
            addCriterion("Lower not between", value1, value2, "lower");
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