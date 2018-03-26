package com.sky.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SaitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaitemExample() {
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

        public Criteria andBatchnumberIsNull() {
            addCriterion("BatchNumber is null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNotNull() {
            addCriterion("BatchNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberEqualTo(String value) {
            addCriterion("BatchNumber =", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotEqualTo(String value) {
            addCriterion("BatchNumber <>", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThan(String value) {
            addCriterion("BatchNumber >", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("BatchNumber >=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThan(String value) {
            addCriterion("BatchNumber <", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThanOrEqualTo(String value) {
            addCriterion("BatchNumber <=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLike(String value) {
            addCriterion("BatchNumber like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotLike(String value) {
            addCriterion("BatchNumber not like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIn(List<String> values) {
            addCriterion("BatchNumber in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotIn(List<String> values) {
            addCriterion("BatchNumber not in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberBetween(String value1, String value2) {
            addCriterion("BatchNumber between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotBetween(String value1, String value2) {
            addCriterion("BatchNumber not between", value1, value2, "batchnumber");
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

        public Criteria andValidityIsNull() {
            addCriterion("Validity is null");
            return (Criteria) this;
        }

        public Criteria andValidityIsNotNull() {
            addCriterion("Validity is not null");
            return (Criteria) this;
        }

        public Criteria andValidityEqualTo(Date value) {
            addCriterionForJDBCDate("Validity =", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotEqualTo(Date value) {
            addCriterionForJDBCDate("Validity <>", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityGreaterThan(Date value) {
            addCriterionForJDBCDate("Validity >", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Validity >=", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityLessThan(Date value) {
            addCriterionForJDBCDate("Validity <", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Validity <=", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityIn(List<Date> values) {
            addCriterionForJDBCDate("Validity in", values, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotIn(List<Date> values) {
            addCriterionForJDBCDate("Validity not in", values, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Validity between", value1, value2, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Validity not between", value1, value2, "validity");
            return (Criteria) this;
        }

        public Criteria andRespectivelyIsNull() {
            addCriterion("Respectively is null");
            return (Criteria) this;
        }

        public Criteria andRespectivelyIsNotNull() {
            addCriterion("Respectively is not null");
            return (Criteria) this;
        }

        public Criteria andRespectivelyEqualTo(Integer value) {
            addCriterion("Respectively =", value, "respectively");
            return (Criteria) this;
        }

        public Criteria andRespectivelyNotEqualTo(Integer value) {
            addCriterion("Respectively <>", value, "respectively");
            return (Criteria) this;
        }

        public Criteria andRespectivelyGreaterThan(Integer value) {
            addCriterion("Respectively >", value, "respectively");
            return (Criteria) this;
        }

        public Criteria andRespectivelyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Respectively >=", value, "respectively");
            return (Criteria) this;
        }

        public Criteria andRespectivelyLessThan(Integer value) {
            addCriterion("Respectively <", value, "respectively");
            return (Criteria) this;
        }

        public Criteria andRespectivelyLessThanOrEqualTo(Integer value) {
            addCriterion("Respectively <=", value, "respectively");
            return (Criteria) this;
        }

        public Criteria andRespectivelyIn(List<Integer> values) {
            addCriterion("Respectively in", values, "respectively");
            return (Criteria) this;
        }

        public Criteria andRespectivelyNotIn(List<Integer> values) {
            addCriterion("Respectively not in", values, "respectively");
            return (Criteria) this;
        }

        public Criteria andRespectivelyBetween(Integer value1, Integer value2) {
            addCriterion("Respectively between", value1, value2, "respectively");
            return (Criteria) this;
        }

        public Criteria andRespectivelyNotBetween(Integer value1, Integer value2) {
            addCriterion("Respectively not between", value1, value2, "respectively");
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