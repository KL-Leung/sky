package com.sky.pojo;

import java.util.ArrayList;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andSupplieridIsNull() {
            addCriterion("SupplierId is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("SupplierId is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(Integer value) {
            addCriterion("SupplierId =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(Integer value) {
            addCriterion("SupplierId <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(Integer value) {
            addCriterion("SupplierId >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("SupplierId >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(Integer value) {
            addCriterion("SupplierId <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(Integer value) {
            addCriterion("SupplierId <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<Integer> values) {
            addCriterion("SupplierId in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<Integer> values) {
            addCriterion("SupplierId not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(Integer value1, Integer value2) {
            addCriterion("SupplierId between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(Integer value1, Integer value2) {
            addCriterion("SupplierId not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNull() {
            addCriterion("SupplierName is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("SupplierName is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("SupplierName =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("SupplierName <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("SupplierName >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierName >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("SupplierName <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("SupplierName <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("SupplierName like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("SupplierName not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("SupplierName in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("SupplierName not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("SupplierName between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("SupplierName not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("Contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("Contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("Contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("Contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("Contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("Contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("Contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("Contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("Contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("Contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("Contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("Contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("Contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("Contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andExplainIsNull() {
            addCriterion("Explain is null");
            return (Criteria) this;
        }

        public Criteria andExplainIsNotNull() {
            addCriterion("Explain is not null");
            return (Criteria) this;
        }

        public Criteria andExplainEqualTo(String value) {
            addCriterion("Explain =", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotEqualTo(String value) {
            addCriterion("Explain <>", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThan(String value) {
            addCriterion("Explain >", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThanOrEqualTo(String value) {
            addCriterion("Explain >=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThan(String value) {
            addCriterion("Explain <", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThanOrEqualTo(String value) {
            addCriterion("Explain <=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLike(String value) {
            addCriterion("Explain like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotLike(String value) {
            addCriterion("Explain not like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainIn(List<String> values) {
            addCriterion("Explain in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotIn(List<String> values) {
            addCriterion("Explain not in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainBetween(String value1, String value2) {
            addCriterion("Explain between", value1, value2, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotBetween(String value1, String value2) {
            addCriterion("Explain not between", value1, value2, "explain");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("State like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("State not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andGspgmpIsNull() {
            addCriterion("GSPGMP is null");
            return (Criteria) this;
        }

        public Criteria andGspgmpIsNotNull() {
            addCriterion("GSPGMP is not null");
            return (Criteria) this;
        }

        public Criteria andGspgmpEqualTo(String value) {
            addCriterion("GSPGMP =", value, "gspgmp");
            return (Criteria) this;
        }

        public Criteria andGspgmpNotEqualTo(String value) {
            addCriterion("GSPGMP <>", value, "gspgmp");
            return (Criteria) this;
        }

        public Criteria andGspgmpGreaterThan(String value) {
            addCriterion("GSPGMP >", value, "gspgmp");
            return (Criteria) this;
        }

        public Criteria andGspgmpGreaterThanOrEqualTo(String value) {
            addCriterion("GSPGMP >=", value, "gspgmp");
            return (Criteria) this;
        }

        public Criteria andGspgmpLessThan(String value) {
            addCriterion("GSPGMP <", value, "gspgmp");
            return (Criteria) this;
        }

        public Criteria andGspgmpLessThanOrEqualTo(String value) {
            addCriterion("GSPGMP <=", value, "gspgmp");
            return (Criteria) this;
        }

        public Criteria andGspgmpLike(String value) {
            addCriterion("GSPGMP like", value, "gspgmp");
            return (Criteria) this;
        }

        public Criteria andGspgmpNotLike(String value) {
            addCriterion("GSPGMP not like", value, "gspgmp");
            return (Criteria) this;
        }

        public Criteria andGspgmpIn(List<String> values) {
            addCriterion("GSPGMP in", values, "gspgmp");
            return (Criteria) this;
        }

        public Criteria andGspgmpNotIn(List<String> values) {
            addCriterion("GSPGMP not in", values, "gspgmp");
            return (Criteria) this;
        }

        public Criteria andGspgmpBetween(String value1, String value2) {
            addCriterion("GSPGMP between", value1, value2, "gspgmp");
            return (Criteria) this;
        }

        public Criteria andGspgmpNotBetween(String value1, String value2) {
            addCriterion("GSPGMP not between", value1, value2, "gspgmp");
            return (Criteria) this;
        }

        public Criteria andCharterIsNull() {
            addCriterion("Charter is null");
            return (Criteria) this;
        }

        public Criteria andCharterIsNotNull() {
            addCriterion("Charter is not null");
            return (Criteria) this;
        }

        public Criteria andCharterEqualTo(String value) {
            addCriterion("Charter =", value, "charter");
            return (Criteria) this;
        }

        public Criteria andCharterNotEqualTo(String value) {
            addCriterion("Charter <>", value, "charter");
            return (Criteria) this;
        }

        public Criteria andCharterGreaterThan(String value) {
            addCriterion("Charter >", value, "charter");
            return (Criteria) this;
        }

        public Criteria andCharterGreaterThanOrEqualTo(String value) {
            addCriterion("Charter >=", value, "charter");
            return (Criteria) this;
        }

        public Criteria andCharterLessThan(String value) {
            addCriterion("Charter <", value, "charter");
            return (Criteria) this;
        }

        public Criteria andCharterLessThanOrEqualTo(String value) {
            addCriterion("Charter <=", value, "charter");
            return (Criteria) this;
        }

        public Criteria andCharterLike(String value) {
            addCriterion("Charter like", value, "charter");
            return (Criteria) this;
        }

        public Criteria andCharterNotLike(String value) {
            addCriterion("Charter not like", value, "charter");
            return (Criteria) this;
        }

        public Criteria andCharterIn(List<String> values) {
            addCriterion("Charter in", values, "charter");
            return (Criteria) this;
        }

        public Criteria andCharterNotIn(List<String> values) {
            addCriterion("Charter not in", values, "charter");
            return (Criteria) this;
        }

        public Criteria andCharterBetween(String value1, String value2) {
            addCriterion("Charter between", value1, value2, "charter");
            return (Criteria) this;
        }

        public Criteria andCharterNotBetween(String value1, String value2) {
            addCriterion("Charter not between", value1, value2, "charter");
            return (Criteria) this;
        }

        public Criteria andOperatingpermitIsNull() {
            addCriterion("OperatingPermit is null");
            return (Criteria) this;
        }

        public Criteria andOperatingpermitIsNotNull() {
            addCriterion("OperatingPermit is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingpermitEqualTo(String value) {
            addCriterion("OperatingPermit =", value, "operatingpermit");
            return (Criteria) this;
        }

        public Criteria andOperatingpermitNotEqualTo(String value) {
            addCriterion("OperatingPermit <>", value, "operatingpermit");
            return (Criteria) this;
        }

        public Criteria andOperatingpermitGreaterThan(String value) {
            addCriterion("OperatingPermit >", value, "operatingpermit");
            return (Criteria) this;
        }

        public Criteria andOperatingpermitGreaterThanOrEqualTo(String value) {
            addCriterion("OperatingPermit >=", value, "operatingpermit");
            return (Criteria) this;
        }

        public Criteria andOperatingpermitLessThan(String value) {
            addCriterion("OperatingPermit <", value, "operatingpermit");
            return (Criteria) this;
        }

        public Criteria andOperatingpermitLessThanOrEqualTo(String value) {
            addCriterion("OperatingPermit <=", value, "operatingpermit");
            return (Criteria) this;
        }

        public Criteria andOperatingpermitLike(String value) {
            addCriterion("OperatingPermit like", value, "operatingpermit");
            return (Criteria) this;
        }

        public Criteria andOperatingpermitNotLike(String value) {
            addCriterion("OperatingPermit not like", value, "operatingpermit");
            return (Criteria) this;
        }

        public Criteria andOperatingpermitIn(List<String> values) {
            addCriterion("OperatingPermit in", values, "operatingpermit");
            return (Criteria) this;
        }

        public Criteria andOperatingpermitNotIn(List<String> values) {
            addCriterion("OperatingPermit not in", values, "operatingpermit");
            return (Criteria) this;
        }

        public Criteria andOperatingpermitBetween(String value1, String value2) {
            addCriterion("OperatingPermit between", value1, value2, "operatingpermit");
            return (Criteria) this;
        }

        public Criteria andOperatingpermitNotBetween(String value1, String value2) {
            addCriterion("OperatingPermit not between", value1, value2, "operatingpermit");
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