package com.sky.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsallocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsallocationExample() {
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

        public Criteria andGanameIsNull() {
            addCriterion("GAName is null");
            return (Criteria) this;
        }

        public Criteria andGanameIsNotNull() {
            addCriterion("GAName is not null");
            return (Criteria) this;
        }

        public Criteria andGanameEqualTo(String value) {
            addCriterion("GAName =", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameNotEqualTo(String value) {
            addCriterion("GAName <>", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameGreaterThan(String value) {
            addCriterion("GAName >", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameGreaterThanOrEqualTo(String value) {
            addCriterion("GAName >=", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameLessThan(String value) {
            addCriterion("GAName <", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameLessThanOrEqualTo(String value) {
            addCriterion("GAName <=", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameLike(String value) {
            addCriterion("GAName like", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameNotLike(String value) {
            addCriterion("GAName not like", value, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameIn(List<String> values) {
            addCriterion("GAName in", values, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameNotIn(List<String> values) {
            addCriterion("GAName not in", values, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameBetween(String value1, String value2) {
            addCriterion("GAName between", value1, value2, "ganame");
            return (Criteria) this;
        }

        public Criteria andGanameNotBetween(String value1, String value2) {
            addCriterion("GAName not between", value1, value2, "ganame");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("Comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("Comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("Comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("Comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("Comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("Comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("Comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("Comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("Comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("Comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("Comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("Comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("Comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("Comment not between", value1, value2, "comment");
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