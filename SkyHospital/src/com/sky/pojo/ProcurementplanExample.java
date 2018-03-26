package com.sky.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProcurementplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcurementplanExample() {
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

        public Criteria andPpidIsNull() {
            addCriterion("PPID is null");
            return (Criteria) this;
        }

        public Criteria andPpidIsNotNull() {
            addCriterion("PPID is not null");
            return (Criteria) this;
        }

        public Criteria andPpidEqualTo(Integer value) {
            addCriterion("PPID =", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidNotEqualTo(Integer value) {
            addCriterion("PPID <>", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidGreaterThan(Integer value) {
            addCriterion("PPID >", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PPID >=", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidLessThan(Integer value) {
            addCriterion("PPID <", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidLessThanOrEqualTo(Integer value) {
            addCriterion("PPID <=", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidIn(List<Integer> values) {
            addCriterion("PPID in", values, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidNotIn(List<Integer> values) {
            addCriterion("PPID not in", values, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidBetween(Integer value1, Integer value2) {
            addCriterion("PPID between", value1, value2, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidNotBetween(Integer value1, Integer value2) {
            addCriterion("PPID not between", value1, value2, "ppid");
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

        public Criteria andPpnumberIsNull() {
            addCriterion("PPNumber is null");
            return (Criteria) this;
        }

        public Criteria andPpnumberIsNotNull() {
            addCriterion("PPNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPpnumberEqualTo(Integer value) {
            addCriterion("PPNumber =", value, "ppnumber");
            return (Criteria) this;
        }

        public Criteria andPpnumberNotEqualTo(Integer value) {
            addCriterion("PPNumber <>", value, "ppnumber");
            return (Criteria) this;
        }

        public Criteria andPpnumberGreaterThan(Integer value) {
            addCriterion("PPNumber >", value, "ppnumber");
            return (Criteria) this;
        }

        public Criteria andPpnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("PPNumber >=", value, "ppnumber");
            return (Criteria) this;
        }

        public Criteria andPpnumberLessThan(Integer value) {
            addCriterion("PPNumber <", value, "ppnumber");
            return (Criteria) this;
        }

        public Criteria andPpnumberLessThanOrEqualTo(Integer value) {
            addCriterion("PPNumber <=", value, "ppnumber");
            return (Criteria) this;
        }

        public Criteria andPpnumberIn(List<Integer> values) {
            addCriterion("PPNumber in", values, "ppnumber");
            return (Criteria) this;
        }

        public Criteria andPpnumberNotIn(List<Integer> values) {
            addCriterion("PPNumber not in", values, "ppnumber");
            return (Criteria) this;
        }

        public Criteria andPpnumberBetween(Integer value1, Integer value2) {
            addCriterion("PPNumber between", value1, value2, "ppnumber");
            return (Criteria) this;
        }

        public Criteria andPpnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("PPNumber not between", value1, value2, "ppnumber");
            return (Criteria) this;
        }

        public Criteria andPporganizationIsNull() {
            addCriterion("PPOrganization is null");
            return (Criteria) this;
        }

        public Criteria andPporganizationIsNotNull() {
            addCriterion("PPOrganization is not null");
            return (Criteria) this;
        }

        public Criteria andPporganizationEqualTo(String value) {
            addCriterion("PPOrganization =", value, "pporganization");
            return (Criteria) this;
        }

        public Criteria andPporganizationNotEqualTo(String value) {
            addCriterion("PPOrganization <>", value, "pporganization");
            return (Criteria) this;
        }

        public Criteria andPporganizationGreaterThan(String value) {
            addCriterion("PPOrganization >", value, "pporganization");
            return (Criteria) this;
        }

        public Criteria andPporganizationGreaterThanOrEqualTo(String value) {
            addCriterion("PPOrganization >=", value, "pporganization");
            return (Criteria) this;
        }

        public Criteria andPporganizationLessThan(String value) {
            addCriterion("PPOrganization <", value, "pporganization");
            return (Criteria) this;
        }

        public Criteria andPporganizationLessThanOrEqualTo(String value) {
            addCriterion("PPOrganization <=", value, "pporganization");
            return (Criteria) this;
        }

        public Criteria andPporganizationLike(String value) {
            addCriterion("PPOrganization like", value, "pporganization");
            return (Criteria) this;
        }

        public Criteria andPporganizationNotLike(String value) {
            addCriterion("PPOrganization not like", value, "pporganization");
            return (Criteria) this;
        }

        public Criteria andPporganizationIn(List<String> values) {
            addCriterion("PPOrganization in", values, "pporganization");
            return (Criteria) this;
        }

        public Criteria andPporganizationNotIn(List<String> values) {
            addCriterion("PPOrganization not in", values, "pporganization");
            return (Criteria) this;
        }

        public Criteria andPporganizationBetween(String value1, String value2) {
            addCriterion("PPOrganization between", value1, value2, "pporganization");
            return (Criteria) this;
        }

        public Criteria andPporganizationNotBetween(String value1, String value2) {
            addCriterion("PPOrganization not between", value1, value2, "pporganization");
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