package com.sky.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MedicineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicineExample() {
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

        public Criteria andMedicinenameIsNull() {
            addCriterion("MedicineName is null");
            return (Criteria) this;
        }

        public Criteria andMedicinenameIsNotNull() {
            addCriterion("MedicineName is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinenameEqualTo(String value) {
            addCriterion("MedicineName =", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameNotEqualTo(String value) {
            addCriterion("MedicineName <>", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameGreaterThan(String value) {
            addCriterion("MedicineName >", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameGreaterThanOrEqualTo(String value) {
            addCriterion("MedicineName >=", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameLessThan(String value) {
            addCriterion("MedicineName <", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameLessThanOrEqualTo(String value) {
            addCriterion("MedicineName <=", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameLike(String value) {
            addCriterion("MedicineName like", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameNotLike(String value) {
            addCriterion("MedicineName not like", value, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameIn(List<String> values) {
            addCriterion("MedicineName in", values, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameNotIn(List<String> values) {
            addCriterion("MedicineName not in", values, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameBetween(String value1, String value2) {
            addCriterion("MedicineName between", value1, value2, "medicinename");
            return (Criteria) this;
        }

        public Criteria andMedicinenameNotBetween(String value1, String value2) {
            addCriterion("MedicineName not between", value1, value2, "medicinename");
            return (Criteria) this;
        }

        public Criteria andCommonnameIsNull() {
            addCriterion("CommonName is null");
            return (Criteria) this;
        }

        public Criteria andCommonnameIsNotNull() {
            addCriterion("CommonName is not null");
            return (Criteria) this;
        }

        public Criteria andCommonnameEqualTo(String value) {
            addCriterion("CommonName =", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameNotEqualTo(String value) {
            addCriterion("CommonName <>", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameGreaterThan(String value) {
            addCriterion("CommonName >", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameGreaterThanOrEqualTo(String value) {
            addCriterion("CommonName >=", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameLessThan(String value) {
            addCriterion("CommonName <", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameLessThanOrEqualTo(String value) {
            addCriterion("CommonName <=", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameLike(String value) {
            addCriterion("CommonName like", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameNotLike(String value) {
            addCriterion("CommonName not like", value, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameIn(List<String> values) {
            addCriterion("CommonName in", values, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameNotIn(List<String> values) {
            addCriterion("CommonName not in", values, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameBetween(String value1, String value2) {
            addCriterion("CommonName between", value1, value2, "commonname");
            return (Criteria) this;
        }

        public Criteria andCommonnameNotBetween(String value1, String value2) {
            addCriterion("CommonName not between", value1, value2, "commonname");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("Specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("Specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("Specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("Specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("Specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("Specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("Specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("Specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("Specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("Specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("Specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("Specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("Specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("Specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andManufactureridIsNull() {
            addCriterion("ManufacturerID is null");
            return (Criteria) this;
        }

        public Criteria andManufactureridIsNotNull() {
            addCriterion("ManufacturerID is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureridEqualTo(Integer value) {
            addCriterion("ManufacturerID =", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridNotEqualTo(Integer value) {
            addCriterion("ManufacturerID <>", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridGreaterThan(Integer value) {
            addCriterion("ManufacturerID >", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ManufacturerID >=", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridLessThan(Integer value) {
            addCriterion("ManufacturerID <", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridLessThanOrEqualTo(Integer value) {
            addCriterion("ManufacturerID <=", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridIn(List<Integer> values) {
            addCriterion("ManufacturerID in", values, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridNotIn(List<Integer> values) {
            addCriterion("ManufacturerID not in", values, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridBetween(Integer value1, Integer value2) {
            addCriterion("ManufacturerID between", value1, value2, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridNotBetween(Integer value1, Integer value2) {
            addCriterion("ManufacturerID not between", value1, value2, "manufacturerid");
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

        public Criteria andDosageformsidIsNull() {
            addCriterion("DosageFormsID is null");
            return (Criteria) this;
        }

        public Criteria andDosageformsidIsNotNull() {
            addCriterion("DosageFormsID is not null");
            return (Criteria) this;
        }

        public Criteria andDosageformsidEqualTo(Integer value) {
            addCriterion("DosageFormsID =", value, "dosageformsid");
            return (Criteria) this;
        }

        public Criteria andDosageformsidNotEqualTo(Integer value) {
            addCriterion("DosageFormsID <>", value, "dosageformsid");
            return (Criteria) this;
        }

        public Criteria andDosageformsidGreaterThan(Integer value) {
            addCriterion("DosageFormsID >", value, "dosageformsid");
            return (Criteria) this;
        }

        public Criteria andDosageformsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DosageFormsID >=", value, "dosageformsid");
            return (Criteria) this;
        }

        public Criteria andDosageformsidLessThan(Integer value) {
            addCriterion("DosageFormsID <", value, "dosageformsid");
            return (Criteria) this;
        }

        public Criteria andDosageformsidLessThanOrEqualTo(Integer value) {
            addCriterion("DosageFormsID <=", value, "dosageformsid");
            return (Criteria) this;
        }

        public Criteria andDosageformsidIn(List<Integer> values) {
            addCriterion("DosageFormsID in", values, "dosageformsid");
            return (Criteria) this;
        }

        public Criteria andDosageformsidNotIn(List<Integer> values) {
            addCriterion("DosageFormsID not in", values, "dosageformsid");
            return (Criteria) this;
        }

        public Criteria andDosageformsidBetween(Integer value1, Integer value2) {
            addCriterion("DosageFormsID between", value1, value2, "dosageformsid");
            return (Criteria) this;
        }

        public Criteria andDosageformsidNotBetween(Integer value1, Integer value2) {
            addCriterion("DosageFormsID not between", value1, value2, "dosageformsid");
            return (Criteria) this;
        }

        public Criteria andGoodskindidIsNull() {
            addCriterion("GoodsKindID is null");
            return (Criteria) this;
        }

        public Criteria andGoodskindidIsNotNull() {
            addCriterion("GoodsKindID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodskindidEqualTo(Integer value) {
            addCriterion("GoodsKindID =", value, "goodskindid");
            return (Criteria) this;
        }

        public Criteria andGoodskindidNotEqualTo(Integer value) {
            addCriterion("GoodsKindID <>", value, "goodskindid");
            return (Criteria) this;
        }

        public Criteria andGoodskindidGreaterThan(Integer value) {
            addCriterion("GoodsKindID >", value, "goodskindid");
            return (Criteria) this;
        }

        public Criteria andGoodskindidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsKindID >=", value, "goodskindid");
            return (Criteria) this;
        }

        public Criteria andGoodskindidLessThan(Integer value) {
            addCriterion("GoodsKindID <", value, "goodskindid");
            return (Criteria) this;
        }

        public Criteria andGoodskindidLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsKindID <=", value, "goodskindid");
            return (Criteria) this;
        }

        public Criteria andGoodskindidIn(List<Integer> values) {
            addCriterion("GoodsKindID in", values, "goodskindid");
            return (Criteria) this;
        }

        public Criteria andGoodskindidNotIn(List<Integer> values) {
            addCriterion("GoodsKindID not in", values, "goodskindid");
            return (Criteria) this;
        }

        public Criteria andGoodskindidBetween(Integer value1, Integer value2) {
            addCriterion("GoodsKindID between", value1, value2, "goodskindid");
            return (Criteria) this;
        }

        public Criteria andGoodskindidNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsKindID not between", value1, value2, "goodskindid");
            return (Criteria) this;
        }

        public Criteria andMckidIsNull() {
            addCriterion("MCKID is null");
            return (Criteria) this;
        }

        public Criteria andMckidIsNotNull() {
            addCriterion("MCKID is not null");
            return (Criteria) this;
        }

        public Criteria andMckidEqualTo(Integer value) {
            addCriterion("MCKID =", value, "mckid");
            return (Criteria) this;
        }

        public Criteria andMckidNotEqualTo(Integer value) {
            addCriterion("MCKID <>", value, "mckid");
            return (Criteria) this;
        }

        public Criteria andMckidGreaterThan(Integer value) {
            addCriterion("MCKID >", value, "mckid");
            return (Criteria) this;
        }

        public Criteria andMckidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MCKID >=", value, "mckid");
            return (Criteria) this;
        }

        public Criteria andMckidLessThan(Integer value) {
            addCriterion("MCKID <", value, "mckid");
            return (Criteria) this;
        }

        public Criteria andMckidLessThanOrEqualTo(Integer value) {
            addCriterion("MCKID <=", value, "mckid");
            return (Criteria) this;
        }

        public Criteria andMckidIn(List<Integer> values) {
            addCriterion("MCKID in", values, "mckid");
            return (Criteria) this;
        }

        public Criteria andMckidNotIn(List<Integer> values) {
            addCriterion("MCKID not in", values, "mckid");
            return (Criteria) this;
        }

        public Criteria andMckidBetween(Integer value1, Integer value2) {
            addCriterion("MCKID between", value1, value2, "mckid");
            return (Criteria) this;
        }

        public Criteria andMckidNotBetween(Integer value1, Integer value2) {
            addCriterion("MCKID not between", value1, value2, "mckid");
            return (Criteria) this;
        }

        public Criteria andTinyunitidIsNull() {
            addCriterion("TinyUnitId is null");
            return (Criteria) this;
        }

        public Criteria andTinyunitidIsNotNull() {
            addCriterion("TinyUnitId is not null");
            return (Criteria) this;
        }

        public Criteria andTinyunitidEqualTo(Integer value) {
            addCriterion("TinyUnitId =", value, "tinyunitid");
            return (Criteria) this;
        }

        public Criteria andTinyunitidNotEqualTo(Integer value) {
            addCriterion("TinyUnitId <>", value, "tinyunitid");
            return (Criteria) this;
        }

        public Criteria andTinyunitidGreaterThan(Integer value) {
            addCriterion("TinyUnitId >", value, "tinyunitid");
            return (Criteria) this;
        }

        public Criteria andTinyunitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TinyUnitId >=", value, "tinyunitid");
            return (Criteria) this;
        }

        public Criteria andTinyunitidLessThan(Integer value) {
            addCriterion("TinyUnitId <", value, "tinyunitid");
            return (Criteria) this;
        }

        public Criteria andTinyunitidLessThanOrEqualTo(Integer value) {
            addCriterion("TinyUnitId <=", value, "tinyunitid");
            return (Criteria) this;
        }

        public Criteria andTinyunitidIn(List<Integer> values) {
            addCriterion("TinyUnitId in", values, "tinyunitid");
            return (Criteria) this;
        }

        public Criteria andTinyunitidNotIn(List<Integer> values) {
            addCriterion("TinyUnitId not in", values, "tinyunitid");
            return (Criteria) this;
        }

        public Criteria andTinyunitidBetween(Integer value1, Integer value2) {
            addCriterion("TinyUnitId between", value1, value2, "tinyunitid");
            return (Criteria) this;
        }

        public Criteria andTinyunitidNotBetween(Integer value1, Integer value2) {
            addCriterion("TinyUnitId not between", value1, value2, "tinyunitid");
            return (Criteria) this;
        }

        public Criteria andModifieridIsNull() {
            addCriterion("ModifierId is null");
            return (Criteria) this;
        }

        public Criteria andModifieridIsNotNull() {
            addCriterion("ModifierId is not null");
            return (Criteria) this;
        }

        public Criteria andModifieridEqualTo(String value) {
            addCriterion("ModifierId =", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotEqualTo(String value) {
            addCriterion("ModifierId <>", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridGreaterThan(String value) {
            addCriterion("ModifierId >", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridGreaterThanOrEqualTo(String value) {
            addCriterion("ModifierId >=", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridLessThan(String value) {
            addCriterion("ModifierId <", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridLessThanOrEqualTo(String value) {
            addCriterion("ModifierId <=", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridLike(String value) {
            addCriterion("ModifierId like", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotLike(String value) {
            addCriterion("ModifierId not like", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridIn(List<String> values) {
            addCriterion("ModifierId in", values, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotIn(List<String> values) {
            addCriterion("ModifierId not in", values, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridBetween(String value1, String value2) {
            addCriterion("ModifierId between", value1, value2, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotBetween(String value1, String value2) {
            addCriterion("ModifierId not between", value1, value2, "modifierid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidIsNull() {
            addCriterion("MedicineKindID is null");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidIsNotNull() {
            addCriterion("MedicineKindID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidEqualTo(Integer value) {
            addCriterion("MedicineKindID =", value, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidNotEqualTo(Integer value) {
            addCriterion("MedicineKindID <>", value, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidGreaterThan(Integer value) {
            addCriterion("MedicineKindID >", value, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MedicineKindID >=", value, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidLessThan(Integer value) {
            addCriterion("MedicineKindID <", value, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidLessThanOrEqualTo(Integer value) {
            addCriterion("MedicineKindID <=", value, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidIn(List<Integer> values) {
            addCriterion("MedicineKindID in", values, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidNotIn(List<Integer> values) {
            addCriterion("MedicineKindID not in", values, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidBetween(Integer value1, Integer value2) {
            addCriterion("MedicineKindID between", value1, value2, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andMedicinekindidNotBetween(Integer value1, Integer value2) {
            addCriterion("MedicineKindID not between", value1, value2, "medicinekindid");
            return (Criteria) this;
        }

        public Criteria andTinynumberIsNull() {
            addCriterion("TinyNumber is null");
            return (Criteria) this;
        }

        public Criteria andTinynumberIsNotNull() {
            addCriterion("TinyNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTinynumberEqualTo(Integer value) {
            addCriterion("TinyNumber =", value, "tinynumber");
            return (Criteria) this;
        }

        public Criteria andTinynumberNotEqualTo(Integer value) {
            addCriterion("TinyNumber <>", value, "tinynumber");
            return (Criteria) this;
        }

        public Criteria andTinynumberGreaterThan(Integer value) {
            addCriterion("TinyNumber >", value, "tinynumber");
            return (Criteria) this;
        }

        public Criteria andTinynumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("TinyNumber >=", value, "tinynumber");
            return (Criteria) this;
        }

        public Criteria andTinynumberLessThan(Integer value) {
            addCriterion("TinyNumber <", value, "tinynumber");
            return (Criteria) this;
        }

        public Criteria andTinynumberLessThanOrEqualTo(Integer value) {
            addCriterion("TinyNumber <=", value, "tinynumber");
            return (Criteria) this;
        }

        public Criteria andTinynumberIn(List<Integer> values) {
            addCriterion("TinyNumber in", values, "tinynumber");
            return (Criteria) this;
        }

        public Criteria andTinynumberNotIn(List<Integer> values) {
            addCriterion("TinyNumber not in", values, "tinynumber");
            return (Criteria) this;
        }

        public Criteria andTinynumberBetween(Integer value1, Integer value2) {
            addCriterion("TinyNumber between", value1, value2, "tinynumber");
            return (Criteria) this;
        }

        public Criteria andTinynumberNotBetween(Integer value1, Integer value2) {
            addCriterion("TinyNumber not between", value1, value2, "tinynumber");
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

        public Criteria andBarcodeIsNull() {
            addCriterion("BarCode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("BarCode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("BarCode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("BarCode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("BarCode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BarCode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("BarCode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("BarCode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("BarCode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("BarCode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("BarCode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("BarCode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("BarCode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("BarCode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andRetailstdpriceIsNull() {
            addCriterion("RetailStdPrice is null");
            return (Criteria) this;
        }

        public Criteria andRetailstdpriceIsNotNull() {
            addCriterion("RetailStdPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRetailstdpriceEqualTo(BigDecimal value) {
            addCriterion("RetailStdPrice =", value, "retailstdprice");
            return (Criteria) this;
        }

        public Criteria andRetailstdpriceNotEqualTo(BigDecimal value) {
            addCriterion("RetailStdPrice <>", value, "retailstdprice");
            return (Criteria) this;
        }

        public Criteria andRetailstdpriceGreaterThan(BigDecimal value) {
            addCriterion("RetailStdPrice >", value, "retailstdprice");
            return (Criteria) this;
        }

        public Criteria andRetailstdpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailStdPrice >=", value, "retailstdprice");
            return (Criteria) this;
        }

        public Criteria andRetailstdpriceLessThan(BigDecimal value) {
            addCriterion("RetailStdPrice <", value, "retailstdprice");
            return (Criteria) this;
        }

        public Criteria andRetailstdpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailStdPrice <=", value, "retailstdprice");
            return (Criteria) this;
        }

        public Criteria andRetailstdpriceIn(List<BigDecimal> values) {
            addCriterion("RetailStdPrice in", values, "retailstdprice");
            return (Criteria) this;
        }

        public Criteria andRetailstdpriceNotIn(List<BigDecimal> values) {
            addCriterion("RetailStdPrice not in", values, "retailstdprice");
            return (Criteria) this;
        }

        public Criteria andRetailstdpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailStdPrice between", value1, value2, "retailstdprice");
            return (Criteria) this;
        }

        public Criteria andRetailstdpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailStdPrice not between", value1, value2, "retailstdprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceIsNull() {
            addCriterion("PurchasePrice is null");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceIsNotNull() {
            addCriterion("PurchasePrice is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice =", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceNotEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice <>", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceGreaterThan(BigDecimal value) {
            addCriterion("PurchasePrice >", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice >=", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceLessThan(BigDecimal value) {
            addCriterion("PurchasePrice <", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice <=", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceIn(List<BigDecimal> values) {
            addCriterion("PurchasePrice in", values, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceNotIn(List<BigDecimal> values) {
            addCriterion("PurchasePrice not in", values, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchasePrice between", value1, value2, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchasePrice not between", value1, value2, "purchaseprice");
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

        public Criteria andStandardcodeIsNull() {
            addCriterion("StandardCode is null");
            return (Criteria) this;
        }

        public Criteria andStandardcodeIsNotNull() {
            addCriterion("StandardCode is not null");
            return (Criteria) this;
        }

        public Criteria andStandardcodeEqualTo(String value) {
            addCriterion("StandardCode =", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeNotEqualTo(String value) {
            addCriterion("StandardCode <>", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeGreaterThan(String value) {
            addCriterion("StandardCode >", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeGreaterThanOrEqualTo(String value) {
            addCriterion("StandardCode >=", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeLessThan(String value) {
            addCriterion("StandardCode <", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeLessThanOrEqualTo(String value) {
            addCriterion("StandardCode <=", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeLike(String value) {
            addCriterion("StandardCode like", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeNotLike(String value) {
            addCriterion("StandardCode not like", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeIn(List<String> values) {
            addCriterion("StandardCode in", values, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeNotIn(List<String> values) {
            addCriterion("StandardCode not in", values, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeBetween(String value1, String value2) {
            addCriterion("StandardCode between", value1, value2, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeNotBetween(String value1, String value2) {
            addCriterion("StandardCode not between", value1, value2, "standardcode");
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