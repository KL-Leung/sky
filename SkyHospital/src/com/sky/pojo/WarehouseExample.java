package com.sky.pojo;

import java.util.ArrayList;
import java.util.List;

public class WarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseExample() {
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

        public Criteria andWarehouseidIsNull() {
            addCriterion("WarehouseId is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("WarehouseId is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(Integer value) {
            addCriterion("WarehouseId =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(Integer value) {
            addCriterion("WarehouseId <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(Integer value) {
            addCriterion("WarehouseId >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WarehouseId >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(Integer value) {
            addCriterion("WarehouseId <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(Integer value) {
            addCriterion("WarehouseId <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<Integer> values) {
            addCriterion("WarehouseId in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<Integer> values) {
            addCriterion("WarehouseId not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(Integer value1, Integer value2) {
            addCriterion("WarehouseId between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(Integer value1, Integer value2) {
            addCriterion("WarehouseId not between", value1, value2, "warehouseid");
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

        public Criteria andInventoryfloorIsNull() {
            addCriterion("InventoryFloor is null");
            return (Criteria) this;
        }

        public Criteria andInventoryfloorIsNotNull() {
            addCriterion("InventoryFloor is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryfloorEqualTo(Integer value) {
            addCriterion("InventoryFloor =", value, "inventoryfloor");
            return (Criteria) this;
        }

        public Criteria andInventoryfloorNotEqualTo(Integer value) {
            addCriterion("InventoryFloor <>", value, "inventoryfloor");
            return (Criteria) this;
        }

        public Criteria andInventoryfloorGreaterThan(Integer value) {
            addCriterion("InventoryFloor >", value, "inventoryfloor");
            return (Criteria) this;
        }

        public Criteria andInventoryfloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("InventoryFloor >=", value, "inventoryfloor");
            return (Criteria) this;
        }

        public Criteria andInventoryfloorLessThan(Integer value) {
            addCriterion("InventoryFloor <", value, "inventoryfloor");
            return (Criteria) this;
        }

        public Criteria andInventoryfloorLessThanOrEqualTo(Integer value) {
            addCriterion("InventoryFloor <=", value, "inventoryfloor");
            return (Criteria) this;
        }

        public Criteria andInventoryfloorIn(List<Integer> values) {
            addCriterion("InventoryFloor in", values, "inventoryfloor");
            return (Criteria) this;
        }

        public Criteria andInventoryfloorNotIn(List<Integer> values) {
            addCriterion("InventoryFloor not in", values, "inventoryfloor");
            return (Criteria) this;
        }

        public Criteria andInventoryfloorBetween(Integer value1, Integer value2) {
            addCriterion("InventoryFloor between", value1, value2, "inventoryfloor");
            return (Criteria) this;
        }

        public Criteria andInventoryfloorNotBetween(Integer value1, Integer value2) {
            addCriterion("InventoryFloor not between", value1, value2, "inventoryfloor");
            return (Criteria) this;
        }

        public Criteria andHandlingIsNull() {
            addCriterion("Handling is null");
            return (Criteria) this;
        }

        public Criteria andHandlingIsNotNull() {
            addCriterion("Handling is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingEqualTo(String value) {
            addCriterion("Handling =", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingNotEqualTo(String value) {
            addCriterion("Handling <>", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingGreaterThan(String value) {
            addCriterion("Handling >", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingGreaterThanOrEqualTo(String value) {
            addCriterion("Handling >=", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingLessThan(String value) {
            addCriterion("Handling <", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingLessThanOrEqualTo(String value) {
            addCriterion("Handling <=", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingLike(String value) {
            addCriterion("Handling like", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingNotLike(String value) {
            addCriterion("Handling not like", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingIn(List<String> values) {
            addCriterion("Handling in", values, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingNotIn(List<String> values) {
            addCriterion("Handling not in", values, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingBetween(String value1, String value2) {
            addCriterion("Handling between", value1, value2, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingNotBetween(String value1, String value2) {
            addCriterion("Handling not between", value1, value2, "handling");
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