package com.sky.pojo;

import java.util.ArrayList;
import java.util.List;

public class SellitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellitemExample() {
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

        public Criteria andSellitemIsNull() {
            addCriterion("SellItem is null");
            return (Criteria) this;
        }

        public Criteria andSellitemIsNotNull() {
            addCriterion("SellItem is not null");
            return (Criteria) this;
        }

        public Criteria andSellitemEqualTo(Integer value) {
            addCriterion("SellItem =", value, "sellitem");
            return (Criteria) this;
        }

        public Criteria andSellitemNotEqualTo(Integer value) {
            addCriterion("SellItem <>", value, "sellitem");
            return (Criteria) this;
        }

        public Criteria andSellitemGreaterThan(Integer value) {
            addCriterion("SellItem >", value, "sellitem");
            return (Criteria) this;
        }

        public Criteria andSellitemGreaterThanOrEqualTo(Integer value) {
            addCriterion("SellItem >=", value, "sellitem");
            return (Criteria) this;
        }

        public Criteria andSellitemLessThan(Integer value) {
            addCriterion("SellItem <", value, "sellitem");
            return (Criteria) this;
        }

        public Criteria andSellitemLessThanOrEqualTo(Integer value) {
            addCriterion("SellItem <=", value, "sellitem");
            return (Criteria) this;
        }

        public Criteria andSellitemIn(List<Integer> values) {
            addCriterion("SellItem in", values, "sellitem");
            return (Criteria) this;
        }

        public Criteria andSellitemNotIn(List<Integer> values) {
            addCriterion("SellItem not in", values, "sellitem");
            return (Criteria) this;
        }

        public Criteria andSellitemBetween(Integer value1, Integer value2) {
            addCriterion("SellItem between", value1, value2, "sellitem");
            return (Criteria) this;
        }

        public Criteria andSellitemNotBetween(Integer value1, Integer value2) {
            addCriterion("SellItem not between", value1, value2, "sellitem");
            return (Criteria) this;
        }

        public Criteria andSellaccountidIsNull() {
            addCriterion("SellAccountId is null");
            return (Criteria) this;
        }

        public Criteria andSellaccountidIsNotNull() {
            addCriterion("SellAccountId is not null");
            return (Criteria) this;
        }

        public Criteria andSellaccountidEqualTo(String value) {
            addCriterion("SellAccountId =", value, "sellaccountid");
            return (Criteria) this;
        }

        public Criteria andSellaccountidNotEqualTo(String value) {
            addCriterion("SellAccountId <>", value, "sellaccountid");
            return (Criteria) this;
        }

        public Criteria andSellaccountidGreaterThan(String value) {
            addCriterion("SellAccountId >", value, "sellaccountid");
            return (Criteria) this;
        }

        public Criteria andSellaccountidGreaterThanOrEqualTo(String value) {
            addCriterion("SellAccountId >=", value, "sellaccountid");
            return (Criteria) this;
        }

        public Criteria andSellaccountidLessThan(String value) {
            addCriterion("SellAccountId <", value, "sellaccountid");
            return (Criteria) this;
        }

        public Criteria andSellaccountidLessThanOrEqualTo(String value) {
            addCriterion("SellAccountId <=", value, "sellaccountid");
            return (Criteria) this;
        }

        public Criteria andSellaccountidLike(String value) {
            addCriterion("SellAccountId like", value, "sellaccountid");
            return (Criteria) this;
        }

        public Criteria andSellaccountidNotLike(String value) {
            addCriterion("SellAccountId not like", value, "sellaccountid");
            return (Criteria) this;
        }

        public Criteria andSellaccountidIn(List<String> values) {
            addCriterion("SellAccountId in", values, "sellaccountid");
            return (Criteria) this;
        }

        public Criteria andSellaccountidNotIn(List<String> values) {
            addCriterion("SellAccountId not in", values, "sellaccountid");
            return (Criteria) this;
        }

        public Criteria andSellaccountidBetween(String value1, String value2) {
            addCriterion("SellAccountId between", value1, value2, "sellaccountid");
            return (Criteria) this;
        }

        public Criteria andSellaccountidNotBetween(String value1, String value2) {
            addCriterion("SellAccountId not between", value1, value2, "sellaccountid");
            return (Criteria) this;
        }

        public Criteria andMedicineidIsNull() {
            addCriterion("MedicineID is null");
            return (Criteria) this;
        }

        public Criteria andMedicineidIsNotNull() {
            addCriterion("MedicineID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineidEqualTo(Integer value) {
            addCriterion("MedicineID =", value, "medicineid");
            return (Criteria) this;
        }

        public Criteria andMedicineidNotEqualTo(Integer value) {
            addCriterion("MedicineID <>", value, "medicineid");
            return (Criteria) this;
        }

        public Criteria andMedicineidGreaterThan(Integer value) {
            addCriterion("MedicineID >", value, "medicineid");
            return (Criteria) this;
        }

        public Criteria andMedicineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MedicineID >=", value, "medicineid");
            return (Criteria) this;
        }

        public Criteria andMedicineidLessThan(Integer value) {
            addCriterion("MedicineID <", value, "medicineid");
            return (Criteria) this;
        }

        public Criteria andMedicineidLessThanOrEqualTo(Integer value) {
            addCriterion("MedicineID <=", value, "medicineid");
            return (Criteria) this;
        }

        public Criteria andMedicineidIn(List<Integer> values) {
            addCriterion("MedicineID in", values, "medicineid");
            return (Criteria) this;
        }

        public Criteria andMedicineidNotIn(List<Integer> values) {
            addCriterion("MedicineID not in", values, "medicineid");
            return (Criteria) this;
        }

        public Criteria andMedicineidBetween(Integer value1, Integer value2) {
            addCriterion("MedicineID between", value1, value2, "medicineid");
            return (Criteria) this;
        }

        public Criteria andMedicineidNotBetween(Integer value1, Integer value2) {
            addCriterion("MedicineID not between", value1, value2, "medicineid");
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