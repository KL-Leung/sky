package com.sky.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MtinyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MtinyExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMtidIsNull() {
            addCriterion("MTID is null");
            return (Criteria) this;
        }

        public Criteria andMtidIsNotNull() {
            addCriterion("MTID is not null");
            return (Criteria) this;
        }

        public Criteria andMtidEqualTo(Integer value) {
            addCriterion("MTID =", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidNotEqualTo(Integer value) {
            addCriterion("MTID <>", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidGreaterThan(Integer value) {
            addCriterion("MTID >", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MTID >=", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidLessThan(Integer value) {
            addCriterion("MTID <", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidLessThanOrEqualTo(Integer value) {
            addCriterion("MTID <=", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidIn(List<Integer> values) {
            addCriterion("MTID in", values, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidNotIn(List<Integer> values) {
            addCriterion("MTID not in", values, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidBetween(Integer value1, Integer value2) {
            addCriterion("MTID between", value1, value2, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidNotBetween(Integer value1, Integer value2) {
            addCriterion("MTID not between", value1, value2, "mtid");
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

        public Criteria andUnitidIsNull() {
            addCriterion("UnitID is null");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNotNull() {
            addCriterion("UnitID is not null");
            return (Criteria) this;
        }

        public Criteria andUnitidEqualTo(Integer value) {
            addCriterion("UnitID =", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotEqualTo(Integer value) {
            addCriterion("UnitID <>", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThan(Integer value) {
            addCriterion("UnitID >", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UnitID >=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThan(Integer value) {
            addCriterion("UnitID <", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThanOrEqualTo(Integer value) {
            addCriterion("UnitID <=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidIn(List<Integer> values) {
            addCriterion("UnitID in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotIn(List<Integer> values) {
            addCriterion("UnitID not in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidBetween(Integer value1, Integer value2) {
            addCriterion("UnitID between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotBetween(Integer value1, Integer value2) {
            addCriterion("UnitID not between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andTinyspecificationIsNull() {
            addCriterion("TinySpecification is null");
            return (Criteria) this;
        }

        public Criteria andTinyspecificationIsNotNull() {
            addCriterion("TinySpecification is not null");
            return (Criteria) this;
        }

        public Criteria andTinyspecificationEqualTo(String value) {
            addCriterion("TinySpecification =", value, "tinyspecification");
            return (Criteria) this;
        }

        public Criteria andTinyspecificationNotEqualTo(String value) {
            addCriterion("TinySpecification <>", value, "tinyspecification");
            return (Criteria) this;
        }

        public Criteria andTinyspecificationGreaterThan(String value) {
            addCriterion("TinySpecification >", value, "tinyspecification");
            return (Criteria) this;
        }

        public Criteria andTinyspecificationGreaterThanOrEqualTo(String value) {
            addCriterion("TinySpecification >=", value, "tinyspecification");
            return (Criteria) this;
        }

        public Criteria andTinyspecificationLessThan(String value) {
            addCriterion("TinySpecification <", value, "tinyspecification");
            return (Criteria) this;
        }

        public Criteria andTinyspecificationLessThanOrEqualTo(String value) {
            addCriterion("TinySpecification <=", value, "tinyspecification");
            return (Criteria) this;
        }

        public Criteria andTinyspecificationLike(String value) {
            addCriterion("TinySpecification like", value, "tinyspecification");
            return (Criteria) this;
        }

        public Criteria andTinyspecificationNotLike(String value) {
            addCriterion("TinySpecification not like", value, "tinyspecification");
            return (Criteria) this;
        }

        public Criteria andTinyspecificationIn(List<String> values) {
            addCriterion("TinySpecification in", values, "tinyspecification");
            return (Criteria) this;
        }

        public Criteria andTinyspecificationNotIn(List<String> values) {
            addCriterion("TinySpecification not in", values, "tinyspecification");
            return (Criteria) this;
        }

        public Criteria andTinyspecificationBetween(String value1, String value2) {
            addCriterion("TinySpecification between", value1, value2, "tinyspecification");
            return (Criteria) this;
        }

        public Criteria andTinyspecificationNotBetween(String value1, String value2) {
            addCriterion("TinySpecification not between", value1, value2, "tinyspecification");
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

        public Criteria andCostpriceIsNull() {
            addCriterion("CostPrice is null");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNotNull() {
            addCriterion("CostPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCostpriceEqualTo(BigDecimal value) {
            addCriterion("CostPrice =", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotEqualTo(BigDecimal value) {
            addCriterion("CostPrice <>", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThan(BigDecimal value) {
            addCriterion("CostPrice >", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CostPrice >=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThan(BigDecimal value) {
            addCriterion("CostPrice <", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CostPrice <=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceIn(List<BigDecimal> values) {
            addCriterion("CostPrice in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotIn(List<BigDecimal> values) {
            addCriterion("CostPrice not in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CostPrice between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CostPrice not between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNull() {
            addCriterion("SalePrice is null");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNotNull() {
            addCriterion("SalePrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalepriceEqualTo(BigDecimal value) {
            addCriterion("SalePrice =", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotEqualTo(BigDecimal value) {
            addCriterion("SalePrice <>", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThan(BigDecimal value) {
            addCriterion("SalePrice >", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalePrice >=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThan(BigDecimal value) {
            addCriterion("SalePrice <", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalePrice <=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceIn(List<BigDecimal> values) {
            addCriterion("SalePrice in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotIn(List<BigDecimal> values) {
            addCriterion("SalePrice not in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalePrice between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalePrice not between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andTinydateIsNull() {
            addCriterion("TinyDate is null");
            return (Criteria) this;
        }

        public Criteria andTinydateIsNotNull() {
            addCriterion("TinyDate is not null");
            return (Criteria) this;
        }

        public Criteria andTinydateEqualTo(Date value) {
            addCriterionForJDBCDate("TinyDate =", value, "tinydate");
            return (Criteria) this;
        }

        public Criteria andTinydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TinyDate <>", value, "tinydate");
            return (Criteria) this;
        }

        public Criteria andTinydateGreaterThan(Date value) {
            addCriterionForJDBCDate("TinyDate >", value, "tinydate");
            return (Criteria) this;
        }

        public Criteria andTinydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TinyDate >=", value, "tinydate");
            return (Criteria) this;
        }

        public Criteria andTinydateLessThan(Date value) {
            addCriterionForJDBCDate("TinyDate <", value, "tinydate");
            return (Criteria) this;
        }

        public Criteria andTinydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TinyDate <=", value, "tinydate");
            return (Criteria) this;
        }

        public Criteria andTinydateIn(List<Date> values) {
            addCriterionForJDBCDate("TinyDate in", values, "tinydate");
            return (Criteria) this;
        }

        public Criteria andTinydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TinyDate not in", values, "tinydate");
            return (Criteria) this;
        }

        public Criteria andTinydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TinyDate between", value1, value2, "tinydate");
            return (Criteria) this;
        }

        public Criteria andTinydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TinyDate not between", value1, value2, "tinydate");
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