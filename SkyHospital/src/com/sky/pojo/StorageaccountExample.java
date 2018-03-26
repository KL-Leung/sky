package com.sky.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StorageaccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StorageaccountExample() {
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

        public Criteria andStorageaccountidIsNull() {
            addCriterion("StorageAccountId is null");
            return (Criteria) this;
        }

        public Criteria andStorageaccountidIsNotNull() {
            addCriterion("StorageAccountId is not null");
            return (Criteria) this;
        }

        public Criteria andStorageaccountidEqualTo(String value) {
            addCriterion("StorageAccountId =", value, "storageaccountid");
            return (Criteria) this;
        }

        public Criteria andStorageaccountidNotEqualTo(String value) {
            addCriterion("StorageAccountId <>", value, "storageaccountid");
            return (Criteria) this;
        }

        public Criteria andStorageaccountidGreaterThan(String value) {
            addCriterion("StorageAccountId >", value, "storageaccountid");
            return (Criteria) this;
        }

        public Criteria andStorageaccountidGreaterThanOrEqualTo(String value) {
            addCriterion("StorageAccountId >=", value, "storageaccountid");
            return (Criteria) this;
        }

        public Criteria andStorageaccountidLessThan(String value) {
            addCriterion("StorageAccountId <", value, "storageaccountid");
            return (Criteria) this;
        }

        public Criteria andStorageaccountidLessThanOrEqualTo(String value) {
            addCriterion("StorageAccountId <=", value, "storageaccountid");
            return (Criteria) this;
        }

        public Criteria andStorageaccountidLike(String value) {
            addCriterion("StorageAccountId like", value, "storageaccountid");
            return (Criteria) this;
        }

        public Criteria andStorageaccountidNotLike(String value) {
            addCriterion("StorageAccountId not like", value, "storageaccountid");
            return (Criteria) this;
        }

        public Criteria andStorageaccountidIn(List<String> values) {
            addCriterion("StorageAccountId in", values, "storageaccountid");
            return (Criteria) this;
        }

        public Criteria andStorageaccountidNotIn(List<String> values) {
            addCriterion("StorageAccountId not in", values, "storageaccountid");
            return (Criteria) this;
        }

        public Criteria andStorageaccountidBetween(String value1, String value2) {
            addCriterion("StorageAccountId between", value1, value2, "storageaccountid");
            return (Criteria) this;
        }

        public Criteria andStorageaccountidNotBetween(String value1, String value2) {
            addCriterion("StorageAccountId not between", value1, value2, "storageaccountid");
            return (Criteria) this;
        }

        public Criteria andIodateIsNull() {
            addCriterion("IODate is null");
            return (Criteria) this;
        }

        public Criteria andIodateIsNotNull() {
            addCriterion("IODate is not null");
            return (Criteria) this;
        }

        public Criteria andIodateEqualTo(Date value) {
            addCriterionForJDBCDate("IODate =", value, "iodate");
            return (Criteria) this;
        }

        public Criteria andIodateNotEqualTo(Date value) {
            addCriterionForJDBCDate("IODate <>", value, "iodate");
            return (Criteria) this;
        }

        public Criteria andIodateGreaterThan(Date value) {
            addCriterionForJDBCDate("IODate >", value, "iodate");
            return (Criteria) this;
        }

        public Criteria andIodateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("IODate >=", value, "iodate");
            return (Criteria) this;
        }

        public Criteria andIodateLessThan(Date value) {
            addCriterionForJDBCDate("IODate <", value, "iodate");
            return (Criteria) this;
        }

        public Criteria andIodateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("IODate <=", value, "iodate");
            return (Criteria) this;
        }

        public Criteria andIodateIn(List<Date> values) {
            addCriterionForJDBCDate("IODate in", values, "iodate");
            return (Criteria) this;
        }

        public Criteria andIodateNotIn(List<Date> values) {
            addCriterionForJDBCDate("IODate not in", values, "iodate");
            return (Criteria) this;
        }

        public Criteria andIodateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("IODate between", value1, value2, "iodate");
            return (Criteria) this;
        }

        public Criteria andIodateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("IODate not between", value1, value2, "iodate");
            return (Criteria) this;
        }

        public Criteria andIounitIsNull() {
            addCriterion("IOUnit is null");
            return (Criteria) this;
        }

        public Criteria andIounitIsNotNull() {
            addCriterion("IOUnit is not null");
            return (Criteria) this;
        }

        public Criteria andIounitEqualTo(Date value) {
            addCriterionForJDBCDate("IOUnit =", value, "iounit");
            return (Criteria) this;
        }

        public Criteria andIounitNotEqualTo(Date value) {
            addCriterionForJDBCDate("IOUnit <>", value, "iounit");
            return (Criteria) this;
        }

        public Criteria andIounitGreaterThan(Date value) {
            addCriterionForJDBCDate("IOUnit >", value, "iounit");
            return (Criteria) this;
        }

        public Criteria andIounitGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("IOUnit >=", value, "iounit");
            return (Criteria) this;
        }

        public Criteria andIounitLessThan(Date value) {
            addCriterionForJDBCDate("IOUnit <", value, "iounit");
            return (Criteria) this;
        }

        public Criteria andIounitLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("IOUnit <=", value, "iounit");
            return (Criteria) this;
        }

        public Criteria andIounitIn(List<Date> values) {
            addCriterionForJDBCDate("IOUnit in", values, "iounit");
            return (Criteria) this;
        }

        public Criteria andIounitNotIn(List<Date> values) {
            addCriterionForJDBCDate("IOUnit not in", values, "iounit");
            return (Criteria) this;
        }

        public Criteria andIounitBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("IOUnit between", value1, value2, "iounit");
            return (Criteria) this;
        }

        public Criteria andIounitNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("IOUnit not between", value1, value2, "iounit");
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

        public Criteria andInvoiceIsNull() {
            addCriterion("Invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("Invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(String value) {
            addCriterion("Invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(String value) {
            addCriterion("Invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(String value) {
            addCriterion("Invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("Invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(String value) {
            addCriterion("Invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(String value) {
            addCriterion("Invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLike(String value) {
            addCriterion("Invoice like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotLike(String value) {
            addCriterion("Invoice not like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<String> values) {
            addCriterion("Invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<String> values) {
            addCriterion("Invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(String value1, String value2) {
            addCriterion("Invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(String value1, String value2) {
            addCriterion("Invoice not between", value1, value2, "invoice");
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

        public Criteria andJudgeIsNull() {
            addCriterion("Judge is null");
            return (Criteria) this;
        }

        public Criteria andJudgeIsNotNull() {
            addCriterion("Judge is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeEqualTo(Integer value) {
            addCriterion("Judge =", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotEqualTo(Integer value) {
            addCriterion("Judge <>", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeGreaterThan(Integer value) {
            addCriterion("Judge >", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Judge >=", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLessThan(Integer value) {
            addCriterion("Judge <", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLessThanOrEqualTo(Integer value) {
            addCriterion("Judge <=", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeIn(List<Integer> values) {
            addCriterion("Judge in", values, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotIn(List<Integer> values) {
            addCriterion("Judge not in", values, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeBetween(Integer value1, Integer value2) {
            addCriterion("Judge between", value1, value2, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotBetween(Integer value1, Integer value2) {
            addCriterion("Judge not between", value1, value2, "judge");
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