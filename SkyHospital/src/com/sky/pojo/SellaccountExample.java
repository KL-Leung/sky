package com.sky.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SellaccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellaccountExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andSelldateIsNull() {
            addCriterion("SellDate is null");
            return (Criteria) this;
        }

        public Criteria andSelldateIsNotNull() {
            addCriterion("SellDate is not null");
            return (Criteria) this;
        }

        public Criteria andSelldateEqualTo(Date value) {
            addCriterionForJDBCDate("SellDate =", value, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SellDate <>", value, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateGreaterThan(Date value) {
            addCriterionForJDBCDate("SellDate >", value, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SellDate >=", value, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateLessThan(Date value) {
            addCriterionForJDBCDate("SellDate <", value, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SellDate <=", value, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateIn(List<Date> values) {
            addCriterionForJDBCDate("SellDate in", values, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SellDate not in", values, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SellDate between", value1, value2, "selldate");
            return (Criteria) this;
        }

        public Criteria andSelldateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SellDate not between", value1, value2, "selldate");
            return (Criteria) this;
        }

        public Criteria andVipidIsNull() {
            addCriterion("VipId is null");
            return (Criteria) this;
        }

        public Criteria andVipidIsNotNull() {
            addCriterion("VipId is not null");
            return (Criteria) this;
        }

        public Criteria andVipidEqualTo(String value) {
            addCriterion("VipId =", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotEqualTo(String value) {
            addCriterion("VipId <>", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidGreaterThan(String value) {
            addCriterion("VipId >", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidGreaterThanOrEqualTo(String value) {
            addCriterion("VipId >=", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidLessThan(String value) {
            addCriterion("VipId <", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidLessThanOrEqualTo(String value) {
            addCriterion("VipId <=", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidLike(String value) {
            addCriterion("VipId like", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotLike(String value) {
            addCriterion("VipId not like", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidIn(List<String> values) {
            addCriterion("VipId in", values, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotIn(List<String> values) {
            addCriterion("VipId not in", values, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidBetween(String value1, String value2) {
            addCriterion("VipId between", value1, value2, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotBetween(String value1, String value2) {
            addCriterion("VipId not between", value1, value2, "vipid");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("Amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("Amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("Amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("Amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("Amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("Amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("Amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("Amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andActuallypaidIsNull() {
            addCriterion("ActuallyPaid is null");
            return (Criteria) this;
        }

        public Criteria andActuallypaidIsNotNull() {
            addCriterion("ActuallyPaid is not null");
            return (Criteria) this;
        }

        public Criteria andActuallypaidEqualTo(BigDecimal value) {
            addCriterion("ActuallyPaid =", value, "actuallypaid");
            return (Criteria) this;
        }

        public Criteria andActuallypaidNotEqualTo(BigDecimal value) {
            addCriterion("ActuallyPaid <>", value, "actuallypaid");
            return (Criteria) this;
        }

        public Criteria andActuallypaidGreaterThan(BigDecimal value) {
            addCriterion("ActuallyPaid >", value, "actuallypaid");
            return (Criteria) this;
        }

        public Criteria andActuallypaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ActuallyPaid >=", value, "actuallypaid");
            return (Criteria) this;
        }

        public Criteria andActuallypaidLessThan(BigDecimal value) {
            addCriterion("ActuallyPaid <", value, "actuallypaid");
            return (Criteria) this;
        }

        public Criteria andActuallypaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ActuallyPaid <=", value, "actuallypaid");
            return (Criteria) this;
        }

        public Criteria andActuallypaidIn(List<BigDecimal> values) {
            addCriterion("ActuallyPaid in", values, "actuallypaid");
            return (Criteria) this;
        }

        public Criteria andActuallypaidNotIn(List<BigDecimal> values) {
            addCriterion("ActuallyPaid not in", values, "actuallypaid");
            return (Criteria) this;
        }

        public Criteria andActuallypaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ActuallyPaid between", value1, value2, "actuallypaid");
            return (Criteria) this;
        }

        public Criteria andActuallypaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ActuallyPaid not between", value1, value2, "actuallypaid");
            return (Criteria) this;
        }

        public Criteria andDueIsNull() {
            addCriterion("Due is null");
            return (Criteria) this;
        }

        public Criteria andDueIsNotNull() {
            addCriterion("Due is not null");
            return (Criteria) this;
        }

        public Criteria andDueEqualTo(BigDecimal value) {
            addCriterion("Due =", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueNotEqualTo(BigDecimal value) {
            addCriterion("Due <>", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueGreaterThan(BigDecimal value) {
            addCriterion("Due >", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Due >=", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueLessThan(BigDecimal value) {
            addCriterion("Due <", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Due <=", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueIn(List<BigDecimal> values) {
            addCriterion("Due in", values, "due");
            return (Criteria) this;
        }

        public Criteria andDueNotIn(List<BigDecimal> values) {
            addCriterion("Due not in", values, "due");
            return (Criteria) this;
        }

        public Criteria andDueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Due between", value1, value2, "due");
            return (Criteria) this;
        }

        public Criteria andDueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Due not between", value1, value2, "due");
            return (Criteria) this;
        }

        public Criteria andCutamountIsNull() {
            addCriterion("CutAmount is null");
            return (Criteria) this;
        }

        public Criteria andCutamountIsNotNull() {
            addCriterion("CutAmount is not null");
            return (Criteria) this;
        }

        public Criteria andCutamountEqualTo(BigDecimal value) {
            addCriterion("CutAmount =", value, "cutamount");
            return (Criteria) this;
        }

        public Criteria andCutamountNotEqualTo(BigDecimal value) {
            addCriterion("CutAmount <>", value, "cutamount");
            return (Criteria) this;
        }

        public Criteria andCutamountGreaterThan(BigDecimal value) {
            addCriterion("CutAmount >", value, "cutamount");
            return (Criteria) this;
        }

        public Criteria andCutamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CutAmount >=", value, "cutamount");
            return (Criteria) this;
        }

        public Criteria andCutamountLessThan(BigDecimal value) {
            addCriterion("CutAmount <", value, "cutamount");
            return (Criteria) this;
        }

        public Criteria andCutamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CutAmount <=", value, "cutamount");
            return (Criteria) this;
        }

        public Criteria andCutamountIn(List<BigDecimal> values) {
            addCriterion("CutAmount in", values, "cutamount");
            return (Criteria) this;
        }

        public Criteria andCutamountNotIn(List<BigDecimal> values) {
            addCriterion("CutAmount not in", values, "cutamount");
            return (Criteria) this;
        }

        public Criteria andCutamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CutAmount between", value1, value2, "cutamount");
            return (Criteria) this;
        }

        public Criteria andCutamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CutAmount not between", value1, value2, "cutamount");
            return (Criteria) this;
        }

        public Criteria andCutcommentIsNull() {
            addCriterion("CutComment is null");
            return (Criteria) this;
        }

        public Criteria andCutcommentIsNotNull() {
            addCriterion("CutComment is not null");
            return (Criteria) this;
        }

        public Criteria andCutcommentEqualTo(String value) {
            addCriterion("CutComment =", value, "cutcomment");
            return (Criteria) this;
        }

        public Criteria andCutcommentNotEqualTo(String value) {
            addCriterion("CutComment <>", value, "cutcomment");
            return (Criteria) this;
        }

        public Criteria andCutcommentGreaterThan(String value) {
            addCriterion("CutComment >", value, "cutcomment");
            return (Criteria) this;
        }

        public Criteria andCutcommentGreaterThanOrEqualTo(String value) {
            addCriterion("CutComment >=", value, "cutcomment");
            return (Criteria) this;
        }

        public Criteria andCutcommentLessThan(String value) {
            addCriterion("CutComment <", value, "cutcomment");
            return (Criteria) this;
        }

        public Criteria andCutcommentLessThanOrEqualTo(String value) {
            addCriterion("CutComment <=", value, "cutcomment");
            return (Criteria) this;
        }

        public Criteria andCutcommentLike(String value) {
            addCriterion("CutComment like", value, "cutcomment");
            return (Criteria) this;
        }

        public Criteria andCutcommentNotLike(String value) {
            addCriterion("CutComment not like", value, "cutcomment");
            return (Criteria) this;
        }

        public Criteria andCutcommentIn(List<String> values) {
            addCriterion("CutComment in", values, "cutcomment");
            return (Criteria) this;
        }

        public Criteria andCutcommentNotIn(List<String> values) {
            addCriterion("CutComment not in", values, "cutcomment");
            return (Criteria) this;
        }

        public Criteria andCutcommentBetween(String value1, String value2) {
            addCriterion("CutComment between", value1, value2, "cutcomment");
            return (Criteria) this;
        }

        public Criteria andCutcommentNotBetween(String value1, String value2) {
            addCriterion("CutComment not between", value1, value2, "cutcomment");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNull() {
            addCriterion("PayWay is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("PayWay is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("PayWay =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("PayWay <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("PayWay >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("PayWay >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("PayWay <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("PayWay <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("PayWay like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("PayWay not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("PayWay in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("PayWay not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("PayWay between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("PayWay not between", value1, value2, "payway");
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

        public Criteria andClosingdateIsNull() {
            addCriterion("ClosingDate is null");
            return (Criteria) this;
        }

        public Criteria andClosingdateIsNotNull() {
            addCriterion("ClosingDate is not null");
            return (Criteria) this;
        }

        public Criteria andClosingdateEqualTo(Date value) {
            addCriterionForJDBCDate("ClosingDate =", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ClosingDate <>", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ClosingDate >", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ClosingDate >=", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateLessThan(Date value) {
            addCriterionForJDBCDate("ClosingDate <", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ClosingDate <=", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateIn(List<Date> values) {
            addCriterionForJDBCDate("ClosingDate in", values, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ClosingDate not in", values, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ClosingDate between", value1, value2, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ClosingDate not between", value1, value2, "closingdate");
            return (Criteria) this;
        }

        public Criteria andSalesmanIsNull() {
            addCriterion("Salesman is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIsNotNull() {
            addCriterion("Salesman is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanEqualTo(String value) {
            addCriterion("Salesman =", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotEqualTo(String value) {
            addCriterion("Salesman <>", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThan(String value) {
            addCriterion("Salesman >", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThanOrEqualTo(String value) {
            addCriterion("Salesman >=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThan(String value) {
            addCriterion("Salesman <", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThanOrEqualTo(String value) {
            addCriterion("Salesman <=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLike(String value) {
            addCriterion("Salesman like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotLike(String value) {
            addCriterion("Salesman not like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanIn(List<String> values) {
            addCriterion("Salesman in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotIn(List<String> values) {
            addCriterion("Salesman not in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanBetween(String value1, String value2) {
            addCriterion("Salesman between", value1, value2, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotBetween(String value1, String value2) {
            addCriterion("Salesman not between", value1, value2, "salesman");
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