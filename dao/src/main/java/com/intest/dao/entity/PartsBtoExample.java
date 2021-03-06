package com.intest.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartsBtoExample {
    /**
     * F_PARTS
     */
    protected String orderByClause;

    /**
     * F_PARTS
     */
    protected boolean distinct;

    /**
     * F_PARTS
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public PartsBtoExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * F_PARTS null
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andPartsIdIsNull() {
            addCriterion("PARTS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartsIdIsNotNull() {
            addCriterion("PARTS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartsIdEqualTo(String value) {
            addCriterion("PARTS_ID =", value, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdNotEqualTo(String value) {
            addCriterion("PARTS_ID <>", value, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdGreaterThan(String value) {
            addCriterion("PARTS_ID >", value, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARTS_ID >=", value, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdLessThan(String value) {
            addCriterion("PARTS_ID <", value, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdLessThanOrEqualTo(String value) {
            addCriterion("PARTS_ID <=", value, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdLike(String value) {
            addCriterion("PARTS_ID like", value, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdNotLike(String value) {
            addCriterion("PARTS_ID not like", value, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdIn(List<String> values) {
            addCriterion("PARTS_ID in", values, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdNotIn(List<String> values) {
            addCriterion("PARTS_ID not in", values, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdBetween(String value1, String value2) {
            addCriterion("PARTS_ID between", value1, value2, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdNotBetween(String value1, String value2) {
            addCriterion("PARTS_ID not between", value1, value2, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsnameIsNull() {
            addCriterion("PARTSNAME is null");
            return (Criteria) this;
        }

        public Criteria andPartsnameIsNotNull() {
            addCriterion("PARTSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPartsnameEqualTo(String value) {
            addCriterion("PARTSNAME =", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameNotEqualTo(String value) {
            addCriterion("PARTSNAME <>", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameGreaterThan(String value) {
            addCriterion("PARTSNAME >", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameGreaterThanOrEqualTo(String value) {
            addCriterion("PARTSNAME >=", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameLessThan(String value) {
            addCriterion("PARTSNAME <", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameLessThanOrEqualTo(String value) {
            addCriterion("PARTSNAME <=", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameLike(String value) {
            addCriterion("PARTSNAME like", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameNotLike(String value) {
            addCriterion("PARTSNAME not like", value, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameIn(List<String> values) {
            addCriterion("PARTSNAME in", values, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameNotIn(List<String> values) {
            addCriterion("PARTSNAME not in", values, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameBetween(String value1, String value2) {
            addCriterion("PARTSNAME between", value1, value2, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartsnameNotBetween(String value1, String value2) {
            addCriterion("PARTSNAME not between", value1, value2, "partsname");
            return (Criteria) this;
        }

        public Criteria andPartscodeIsNull() {
            addCriterion("PARTSCODE is null");
            return (Criteria) this;
        }

        public Criteria andPartscodeIsNotNull() {
            addCriterion("PARTSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPartscodeEqualTo(String value) {
            addCriterion("PARTSCODE =", value, "partscode");
            return (Criteria) this;
        }

        public Criteria andPartscodeNotEqualTo(String value) {
            addCriterion("PARTSCODE <>", value, "partscode");
            return (Criteria) this;
        }

        public Criteria andPartscodeGreaterThan(String value) {
            addCriterion("PARTSCODE >", value, "partscode");
            return (Criteria) this;
        }

        public Criteria andPartscodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARTSCODE >=", value, "partscode");
            return (Criteria) this;
        }

        public Criteria andPartscodeLessThan(String value) {
            addCriterion("PARTSCODE <", value, "partscode");
            return (Criteria) this;
        }

        public Criteria andPartscodeLessThanOrEqualTo(String value) {
            addCriterion("PARTSCODE <=", value, "partscode");
            return (Criteria) this;
        }

        public Criteria andPartscodeLike(String value) {
            addCriterion("PARTSCODE like", value, "partscode");
            return (Criteria) this;
        }

        public Criteria andPartscodeNotLike(String value) {
            addCriterion("PARTSCODE not like", value, "partscode");
            return (Criteria) this;
        }

        public Criteria andPartscodeIn(List<String> values) {
            addCriterion("PARTSCODE in", values, "partscode");
            return (Criteria) this;
        }

        public Criteria andPartscodeNotIn(List<String> values) {
            addCriterion("PARTSCODE not in", values, "partscode");
            return (Criteria) this;
        }

        public Criteria andPartscodeBetween(String value1, String value2) {
            addCriterion("PARTSCODE between", value1, value2, "partscode");
            return (Criteria) this;
        }

        public Criteria andPartscodeNotBetween(String value1, String value2) {
            addCriterion("PARTSCODE not between", value1, value2, "partscode");
            return (Criteria) this;
        }

        public Criteria andFkPartstypeIdIsNull() {
            addCriterion("FK_PARTSTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkPartstypeIdIsNotNull() {
            addCriterion("FK_PARTSTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkPartstypeIdEqualTo(String value) {
            addCriterion("FK_PARTSTYPE_ID =", value, "fkPartstypeId");
            return (Criteria) this;
        }

        public Criteria andFkPartstypeIdNotEqualTo(String value) {
            addCriterion("FK_PARTSTYPE_ID <>", value, "fkPartstypeId");
            return (Criteria) this;
        }

        public Criteria andFkPartstypeIdGreaterThan(String value) {
            addCriterion("FK_PARTSTYPE_ID >", value, "fkPartstypeId");
            return (Criteria) this;
        }

        public Criteria andFkPartstypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_PARTSTYPE_ID >=", value, "fkPartstypeId");
            return (Criteria) this;
        }

        public Criteria andFkPartstypeIdLessThan(String value) {
            addCriterion("FK_PARTSTYPE_ID <", value, "fkPartstypeId");
            return (Criteria) this;
        }

        public Criteria andFkPartstypeIdLessThanOrEqualTo(String value) {
            addCriterion("FK_PARTSTYPE_ID <=", value, "fkPartstypeId");
            return (Criteria) this;
        }

        public Criteria andFkPartstypeIdLike(String value) {
            addCriterion("FK_PARTSTYPE_ID like", value, "fkPartstypeId");
            return (Criteria) this;
        }

        public Criteria andFkPartstypeIdNotLike(String value) {
            addCriterion("FK_PARTSTYPE_ID not like", value, "fkPartstypeId");
            return (Criteria) this;
        }

        public Criteria andFkPartstypeIdIn(List<String> values) {
            addCriterion("FK_PARTSTYPE_ID in", values, "fkPartstypeId");
            return (Criteria) this;
        }

        public Criteria andFkPartstypeIdNotIn(List<String> values) {
            addCriterion("FK_PARTSTYPE_ID not in", values, "fkPartstypeId");
            return (Criteria) this;
        }

        public Criteria andFkPartstypeIdBetween(String value1, String value2) {
            addCriterion("FK_PARTSTYPE_ID between", value1, value2, "fkPartstypeId");
            return (Criteria) this;
        }

        public Criteria andFkPartstypeIdNotBetween(String value1, String value2) {
            addCriterion("FK_PARTSTYPE_ID not between", value1, value2, "fkPartstypeId");
            return (Criteria) this;
        }

        public Criteria andFkCartypeIdIsNull() {
            addCriterion("FK_CARTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkCartypeIdIsNotNull() {
            addCriterion("FK_CARTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkCartypeIdEqualTo(String value) {
            addCriterion("FK_CARTYPE_ID =", value, "fkCartypeId");
            return (Criteria) this;
        }

        public Criteria andFkCartypeIdNotEqualTo(String value) {
            addCriterion("FK_CARTYPE_ID <>", value, "fkCartypeId");
            return (Criteria) this;
        }

        public Criteria andFkCartypeIdGreaterThan(String value) {
            addCriterion("FK_CARTYPE_ID >", value, "fkCartypeId");
            return (Criteria) this;
        }

        public Criteria andFkCartypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_CARTYPE_ID >=", value, "fkCartypeId");
            return (Criteria) this;
        }

        public Criteria andFkCartypeIdLessThan(String value) {
            addCriterion("FK_CARTYPE_ID <", value, "fkCartypeId");
            return (Criteria) this;
        }

        public Criteria andFkCartypeIdLessThanOrEqualTo(String value) {
            addCriterion("FK_CARTYPE_ID <=", value, "fkCartypeId");
            return (Criteria) this;
        }

        public Criteria andFkCartypeIdLike(String value) {
            addCriterion("FK_CARTYPE_ID like", value, "fkCartypeId");
            return (Criteria) this;
        }

        public Criteria andFkCartypeIdNotLike(String value) {
            addCriterion("FK_CARTYPE_ID not like", value, "fkCartypeId");
            return (Criteria) this;
        }

        public Criteria andFkCartypeIdIn(List<String> values) {
            addCriterion("FK_CARTYPE_ID in", values, "fkCartypeId");
            return (Criteria) this;
        }

        public Criteria andFkCartypeIdNotIn(List<String> values) {
            addCriterion("FK_CARTYPE_ID not in", values, "fkCartypeId");
            return (Criteria) this;
        }

        public Criteria andFkCartypeIdBetween(String value1, String value2) {
            addCriterion("FK_CARTYPE_ID between", value1, value2, "fkCartypeId");
            return (Criteria) this;
        }

        public Criteria andFkCartypeIdNotBetween(String value1, String value2) {
            addCriterion("FK_CARTYPE_ID not between", value1, value2, "fkCartypeId");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNull() {
            addCriterion("ORDERNUM is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("ORDERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(Short value) {
            addCriterion("ORDERNUM =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(Short value) {
            addCriterion("ORDERNUM <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(Short value) {
            addCriterion("ORDERNUM >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDERNUM >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(Short value) {
            addCriterion("ORDERNUM <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(Short value) {
            addCriterion("ORDERNUM <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<Short> values) {
            addCriterion("ORDERNUM in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<Short> values) {
            addCriterion("ORDERNUM not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(Short value1, Short value2) {
            addCriterion("ORDERNUM between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(Short value1, Short value2) {
            addCriterion("ORDERNUM not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andCalibrationIsNull() {
            addCriterion("CALIBRATION is null");
            return (Criteria) this;
        }

        public Criteria andCalibrationIsNotNull() {
            addCriterion("CALIBRATION is not null");
            return (Criteria) this;
        }

        public Criteria andCalibrationEqualTo(Short value) {
            addCriterion("CALIBRATION =", value, "calibration");
            return (Criteria) this;
        }

        public Criteria andCalibrationNotEqualTo(Short value) {
            addCriterion("CALIBRATION <>", value, "calibration");
            return (Criteria) this;
        }

        public Criteria andCalibrationGreaterThan(Short value) {
            addCriterion("CALIBRATION >", value, "calibration");
            return (Criteria) this;
        }

        public Criteria andCalibrationGreaterThanOrEqualTo(Short value) {
            addCriterion("CALIBRATION >=", value, "calibration");
            return (Criteria) this;
        }

        public Criteria andCalibrationLessThan(Short value) {
            addCriterion("CALIBRATION <", value, "calibration");
            return (Criteria) this;
        }

        public Criteria andCalibrationLessThanOrEqualTo(Short value) {
            addCriterion("CALIBRATION <=", value, "calibration");
            return (Criteria) this;
        }

        public Criteria andCalibrationIn(List<Short> values) {
            addCriterion("CALIBRATION in", values, "calibration");
            return (Criteria) this;
        }

        public Criteria andCalibrationNotIn(List<Short> values) {
            addCriterion("CALIBRATION not in", values, "calibration");
            return (Criteria) this;
        }

        public Criteria andCalibrationBetween(Short value1, Short value2) {
            addCriterion("CALIBRATION between", value1, value2, "calibration");
            return (Criteria) this;
        }

        public Criteria andCalibrationNotBetween(Short value1, Short value2) {
            addCriterion("CALIBRATION not between", value1, value2, "calibration");
            return (Criteria) this;
        }

        public Criteria andBrushwritemodeIsNull() {
            addCriterion("BRUSHWRITEMODE is null");
            return (Criteria) this;
        }

        public Criteria andBrushwritemodeIsNotNull() {
            addCriterion("BRUSHWRITEMODE is not null");
            return (Criteria) this;
        }

        public Criteria andBrushwritemodeEqualTo(Short value) {
            addCriterion("BRUSHWRITEMODE =", value, "brushwritemode");
            return (Criteria) this;
        }

        public Criteria andBrushwritemodeNotEqualTo(Short value) {
            addCriterion("BRUSHWRITEMODE <>", value, "brushwritemode");
            return (Criteria) this;
        }

        public Criteria andBrushwritemodeGreaterThan(Short value) {
            addCriterion("BRUSHWRITEMODE >", value, "brushwritemode");
            return (Criteria) this;
        }

        public Criteria andBrushwritemodeGreaterThanOrEqualTo(Short value) {
            addCriterion("BRUSHWRITEMODE >=", value, "brushwritemode");
            return (Criteria) this;
        }

        public Criteria andBrushwritemodeLessThan(Short value) {
            addCriterion("BRUSHWRITEMODE <", value, "brushwritemode");
            return (Criteria) this;
        }

        public Criteria andBrushwritemodeLessThanOrEqualTo(Short value) {
            addCriterion("BRUSHWRITEMODE <=", value, "brushwritemode");
            return (Criteria) this;
        }

        public Criteria andBrushwritemodeIn(List<Short> values) {
            addCriterion("BRUSHWRITEMODE in", values, "brushwritemode");
            return (Criteria) this;
        }

        public Criteria andBrushwritemodeNotIn(List<Short> values) {
            addCriterion("BRUSHWRITEMODE not in", values, "brushwritemode");
            return (Criteria) this;
        }

        public Criteria andBrushwritemodeBetween(Short value1, Short value2) {
            addCriterion("BRUSHWRITEMODE between", value1, value2, "brushwritemode");
            return (Criteria) this;
        }

        public Criteria andBrushwritemodeNotBetween(Short value1, Short value2) {
            addCriterion("BRUSHWRITEMODE not between", value1, value2, "brushwritemode");
            return (Criteria) this;
        }

        public Criteria andBaudrateIsNull() {
            addCriterion("BAUDRATE is null");
            return (Criteria) this;
        }

        public Criteria andBaudrateIsNotNull() {
            addCriterion("BAUDRATE is not null");
            return (Criteria) this;
        }

        public Criteria andBaudrateEqualTo(Short value) {
            addCriterion("BAUDRATE =", value, "baudrate");
            return (Criteria) this;
        }

        public Criteria andBaudrateNotEqualTo(Short value) {
            addCriterion("BAUDRATE <>", value, "baudrate");
            return (Criteria) this;
        }

        public Criteria andBaudrateGreaterThan(Short value) {
            addCriterion("BAUDRATE >", value, "baudrate");
            return (Criteria) this;
        }

        public Criteria andBaudrateGreaterThanOrEqualTo(Short value) {
            addCriterion("BAUDRATE >=", value, "baudrate");
            return (Criteria) this;
        }

        public Criteria andBaudrateLessThan(Short value) {
            addCriterion("BAUDRATE <", value, "baudrate");
            return (Criteria) this;
        }

        public Criteria andBaudrateLessThanOrEqualTo(Short value) {
            addCriterion("BAUDRATE <=", value, "baudrate");
            return (Criteria) this;
        }

        public Criteria andBaudrateIn(List<Short> values) {
            addCriterion("BAUDRATE in", values, "baudrate");
            return (Criteria) this;
        }

        public Criteria andBaudrateNotIn(List<Short> values) {
            addCriterion("BAUDRATE not in", values, "baudrate");
            return (Criteria) this;
        }

        public Criteria andBaudrateBetween(Short value1, Short value2) {
            addCriterion("BAUDRATE between", value1, value2, "baudrate");
            return (Criteria) this;
        }

        public Criteria andBaudrateNotBetween(Short value1, Short value2) {
            addCriterion("BAUDRATE not between", value1, value2, "baudrate");
            return (Criteria) this;
        }

        public Criteria andPhyicalidIsNull() {
            addCriterion("PHYICALID is null");
            return (Criteria) this;
        }

        public Criteria andPhyicalidIsNotNull() {
            addCriterion("PHYICALID is not null");
            return (Criteria) this;
        }

        public Criteria andPhyicalidEqualTo(String value) {
            addCriterion("PHYICALID =", value, "phyicalid");
            return (Criteria) this;
        }

        public Criteria andPhyicalidNotEqualTo(String value) {
            addCriterion("PHYICALID <>", value, "phyicalid");
            return (Criteria) this;
        }

        public Criteria andPhyicalidGreaterThan(String value) {
            addCriterion("PHYICALID >", value, "phyicalid");
            return (Criteria) this;
        }

        public Criteria andPhyicalidGreaterThanOrEqualTo(String value) {
            addCriterion("PHYICALID >=", value, "phyicalid");
            return (Criteria) this;
        }

        public Criteria andPhyicalidLessThan(String value) {
            addCriterion("PHYICALID <", value, "phyicalid");
            return (Criteria) this;
        }

        public Criteria andPhyicalidLessThanOrEqualTo(String value) {
            addCriterion("PHYICALID <=", value, "phyicalid");
            return (Criteria) this;
        }

        public Criteria andPhyicalidLike(String value) {
            addCriterion("PHYICALID like", value, "phyicalid");
            return (Criteria) this;
        }

        public Criteria andPhyicalidNotLike(String value) {
            addCriterion("PHYICALID not like", value, "phyicalid");
            return (Criteria) this;
        }

        public Criteria andPhyicalidIn(List<String> values) {
            addCriterion("PHYICALID in", values, "phyicalid");
            return (Criteria) this;
        }

        public Criteria andPhyicalidNotIn(List<String> values) {
            addCriterion("PHYICALID not in", values, "phyicalid");
            return (Criteria) this;
        }

        public Criteria andPhyicalidBetween(String value1, String value2) {
            addCriterion("PHYICALID between", value1, value2, "phyicalid");
            return (Criteria) this;
        }

        public Criteria andPhyicalidNotBetween(String value1, String value2) {
            addCriterion("PHYICALID not between", value1, value2, "phyicalid");
            return (Criteria) this;
        }

        public Criteria andFunctionidIsNull() {
            addCriterion("FUNCTIONID is null");
            return (Criteria) this;
        }

        public Criteria andFunctionidIsNotNull() {
            addCriterion("FUNCTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionidEqualTo(String value) {
            addCriterion("FUNCTIONID =", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotEqualTo(String value) {
            addCriterion("FUNCTIONID <>", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidGreaterThan(String value) {
            addCriterion("FUNCTIONID >", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTIONID >=", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidLessThan(String value) {
            addCriterion("FUNCTIONID <", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidLessThanOrEqualTo(String value) {
            addCriterion("FUNCTIONID <=", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidLike(String value) {
            addCriterion("FUNCTIONID like", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotLike(String value) {
            addCriterion("FUNCTIONID not like", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidIn(List<String> values) {
            addCriterion("FUNCTIONID in", values, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotIn(List<String> values) {
            addCriterion("FUNCTIONID not in", values, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidBetween(String value1, String value2) {
            addCriterion("FUNCTIONID between", value1, value2, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotBetween(String value1, String value2) {
            addCriterion("FUNCTIONID not between", value1, value2, "functionid");
            return (Criteria) this;
        }

        public Criteria andResponseidIsNull() {
            addCriterion("RESPONSEID is null");
            return (Criteria) this;
        }

        public Criteria andResponseidIsNotNull() {
            addCriterion("RESPONSEID is not null");
            return (Criteria) this;
        }

        public Criteria andResponseidEqualTo(String value) {
            addCriterion("RESPONSEID =", value, "responseid");
            return (Criteria) this;
        }

        public Criteria andResponseidNotEqualTo(String value) {
            addCriterion("RESPONSEID <>", value, "responseid");
            return (Criteria) this;
        }

        public Criteria andResponseidGreaterThan(String value) {
            addCriterion("RESPONSEID >", value, "responseid");
            return (Criteria) this;
        }

        public Criteria andResponseidGreaterThanOrEqualTo(String value) {
            addCriterion("RESPONSEID >=", value, "responseid");
            return (Criteria) this;
        }

        public Criteria andResponseidLessThan(String value) {
            addCriterion("RESPONSEID <", value, "responseid");
            return (Criteria) this;
        }

        public Criteria andResponseidLessThanOrEqualTo(String value) {
            addCriterion("RESPONSEID <=", value, "responseid");
            return (Criteria) this;
        }

        public Criteria andResponseidLike(String value) {
            addCriterion("RESPONSEID like", value, "responseid");
            return (Criteria) this;
        }

        public Criteria andResponseidNotLike(String value) {
            addCriterion("RESPONSEID not like", value, "responseid");
            return (Criteria) this;
        }

        public Criteria andResponseidIn(List<String> values) {
            addCriterion("RESPONSEID in", values, "responseid");
            return (Criteria) this;
        }

        public Criteria andResponseidNotIn(List<String> values) {
            addCriterion("RESPONSEID not in", values, "responseid");
            return (Criteria) this;
        }

        public Criteria andResponseidBetween(String value1, String value2) {
            addCriterion("RESPONSEID between", value1, value2, "responseid");
            return (Criteria) this;
        }

        public Criteria andResponseidNotBetween(String value1, String value2) {
            addCriterion("RESPONSEID not between", value1, value2, "responseid");
            return (Criteria) this;
        }

        public Criteria andIdtypeIsNull() {
            addCriterion("IDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdtypeIsNotNull() {
            addCriterion("IDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdtypeEqualTo(String value) {
            addCriterion("IDTYPE =", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotEqualTo(String value) {
            addCriterion("IDTYPE <>", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeGreaterThan(String value) {
            addCriterion("IDTYPE >", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeGreaterThanOrEqualTo(String value) {
            addCriterion("IDTYPE >=", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLessThan(String value) {
            addCriterion("IDTYPE <", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLessThanOrEqualTo(String value) {
            addCriterion("IDTYPE <=", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLike(String value) {
            addCriterion("IDTYPE like", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotLike(String value) {
            addCriterion("IDTYPE not like", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeIn(List<String> values) {
            addCriterion("IDTYPE in", values, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotIn(List<String> values) {
            addCriterion("IDTYPE not in", values, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeBetween(String value1, String value2) {
            addCriterion("IDTYPE between", value1, value2, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotBetween(String value1, String value2) {
            addCriterion("IDTYPE not between", value1, value2, "idtype");
            return (Criteria) this;
        }

        public Criteria andNetworksegmentnameIsNull() {
            addCriterion("NETWORKSEGMENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andNetworksegmentnameIsNotNull() {
            addCriterion("NETWORKSEGMENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNetworksegmentnameEqualTo(String value) {
            addCriterion("NETWORKSEGMENTNAME =", value, "networksegmentname");
            return (Criteria) this;
        }

        public Criteria andNetworksegmentnameNotEqualTo(String value) {
            addCriterion("NETWORKSEGMENTNAME <>", value, "networksegmentname");
            return (Criteria) this;
        }

        public Criteria andNetworksegmentnameGreaterThan(String value) {
            addCriterion("NETWORKSEGMENTNAME >", value, "networksegmentname");
            return (Criteria) this;
        }

        public Criteria andNetworksegmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORKSEGMENTNAME >=", value, "networksegmentname");
            return (Criteria) this;
        }

        public Criteria andNetworksegmentnameLessThan(String value) {
            addCriterion("NETWORKSEGMENTNAME <", value, "networksegmentname");
            return (Criteria) this;
        }

        public Criteria andNetworksegmentnameLessThanOrEqualTo(String value) {
            addCriterion("NETWORKSEGMENTNAME <=", value, "networksegmentname");
            return (Criteria) this;
        }

        public Criteria andNetworksegmentnameLike(String value) {
            addCriterion("NETWORKSEGMENTNAME like", value, "networksegmentname");
            return (Criteria) this;
        }

        public Criteria andNetworksegmentnameNotLike(String value) {
            addCriterion("NETWORKSEGMENTNAME not like", value, "networksegmentname");
            return (Criteria) this;
        }

        public Criteria andNetworksegmentnameIn(List<String> values) {
            addCriterion("NETWORKSEGMENTNAME in", values, "networksegmentname");
            return (Criteria) this;
        }

        public Criteria andNetworksegmentnameNotIn(List<String> values) {
            addCriterion("NETWORKSEGMENTNAME not in", values, "networksegmentname");
            return (Criteria) this;
        }

        public Criteria andNetworksegmentnameBetween(String value1, String value2) {
            addCriterion("NETWORKSEGMENTNAME between", value1, value2, "networksegmentname");
            return (Criteria) this;
        }

        public Criteria andNetworksegmentnameNotBetween(String value1, String value2) {
            addCriterion("NETWORKSEGMENTNAME not between", value1, value2, "networksegmentname");
            return (Criteria) this;
        }

        public Criteria andHardwareversionIsNull() {
            addCriterion("HARDWAREVERSION is null");
            return (Criteria) this;
        }

        public Criteria andHardwareversionIsNotNull() {
            addCriterion("HARDWAREVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andHardwareversionEqualTo(String value) {
            addCriterion("HARDWAREVERSION =", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionNotEqualTo(String value) {
            addCriterion("HARDWAREVERSION <>", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionGreaterThan(String value) {
            addCriterion("HARDWAREVERSION >", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionGreaterThanOrEqualTo(String value) {
            addCriterion("HARDWAREVERSION >=", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionLessThan(String value) {
            addCriterion("HARDWAREVERSION <", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionLessThanOrEqualTo(String value) {
            addCriterion("HARDWAREVERSION <=", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionLike(String value) {
            addCriterion("HARDWAREVERSION like", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionNotLike(String value) {
            addCriterion("HARDWAREVERSION not like", value, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionIn(List<String> values) {
            addCriterion("HARDWAREVERSION in", values, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionNotIn(List<String> values) {
            addCriterion("HARDWAREVERSION not in", values, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionBetween(String value1, String value2) {
            addCriterion("HARDWAREVERSION between", value1, value2, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andHardwareversionNotBetween(String value1, String value2) {
            addCriterion("HARDWAREVERSION not between", value1, value2, "hardwareversion");
            return (Criteria) this;
        }

        public Criteria andPartnumberIsNull() {
            addCriterion("PARTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPartnumberIsNotNull() {
            addCriterion("PARTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPartnumberEqualTo(String value) {
            addCriterion("PARTNUMBER =", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberNotEqualTo(String value) {
            addCriterion("PARTNUMBER <>", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberGreaterThan(String value) {
            addCriterion("PARTNUMBER >", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberGreaterThanOrEqualTo(String value) {
            addCriterion("PARTNUMBER >=", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberLessThan(String value) {
            addCriterion("PARTNUMBER <", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberLessThanOrEqualTo(String value) {
            addCriterion("PARTNUMBER <=", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberLike(String value) {
            addCriterion("PARTNUMBER like", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberNotLike(String value) {
            addCriterion("PARTNUMBER not like", value, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberIn(List<String> values) {
            addCriterion("PARTNUMBER in", values, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberNotIn(List<String> values) {
            addCriterion("PARTNUMBER not in", values, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberBetween(String value1, String value2) {
            addCriterion("PARTNUMBER between", value1, value2, "partnumber");
            return (Criteria) this;
        }

        public Criteria andPartnumberNotBetween(String value1, String value2) {
            addCriterion("PARTNUMBER not between", value1, value2, "partnumber");
            return (Criteria) this;
        }

        public Criteria andCanportIsNull() {
            addCriterion("CANPORT is null");
            return (Criteria) this;
        }

        public Criteria andCanportIsNotNull() {
            addCriterion("CANPORT is not null");
            return (Criteria) this;
        }

        public Criteria andCanportEqualTo(Short value) {
            addCriterion("CANPORT =", value, "canport");
            return (Criteria) this;
        }

        public Criteria andCanportNotEqualTo(Short value) {
            addCriterion("CANPORT <>", value, "canport");
            return (Criteria) this;
        }

        public Criteria andCanportGreaterThan(Short value) {
            addCriterion("CANPORT >", value, "canport");
            return (Criteria) this;
        }

        public Criteria andCanportGreaterThanOrEqualTo(Short value) {
            addCriterion("CANPORT >=", value, "canport");
            return (Criteria) this;
        }

        public Criteria andCanportLessThan(Short value) {
            addCriterion("CANPORT <", value, "canport");
            return (Criteria) this;
        }

        public Criteria andCanportLessThanOrEqualTo(Short value) {
            addCriterion("CANPORT <=", value, "canport");
            return (Criteria) this;
        }

        public Criteria andCanportIn(List<Short> values) {
            addCriterion("CANPORT in", values, "canport");
            return (Criteria) this;
        }

        public Criteria andCanportNotIn(List<Short> values) {
            addCriterion("CANPORT not in", values, "canport");
            return (Criteria) this;
        }

        public Criteria andCanportBetween(Short value1, Short value2) {
            addCriterion("CANPORT between", value1, value2, "canport");
            return (Criteria) this;
        }

        public Criteria andCanportNotBetween(Short value1, Short value2) {
            addCriterion("CANPORT not between", value1, value2, "canport");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("ISDELETE is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("ISDELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Short value) {
            addCriterion("ISDELETE =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Short value) {
            addCriterion("ISDELETE <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Short value) {
            addCriterion("ISDELETE >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Short value) {
            addCriterion("ISDELETE >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Short value) {
            addCriterion("ISDELETE <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Short value) {
            addCriterion("ISDELETE <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Short> values) {
            addCriterion("ISDELETE in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Short> values) {
            addCriterion("ISDELETE not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Short value1, Short value2) {
            addCriterion("ISDELETE between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Short value1, Short value2) {
            addCriterion("ISDELETE not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNull() {
            addCriterion("CREATEAT is null");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNotNull() {
            addCriterion("CREATEAT is not null");
            return (Criteria) this;
        }

        public Criteria andCreateatEqualTo(Date value) {
            addCriterion("CREATEAT =", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotEqualTo(Date value) {
            addCriterion("CREATEAT <>", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThan(Date value) {
            addCriterion("CREATEAT >", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEAT >=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThan(Date value) {
            addCriterion("CREATEAT <", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThanOrEqualTo(Date value) {
            addCriterion("CREATEAT <=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatIn(List<Date> values) {
            addCriterion("CREATEAT in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotIn(List<Date> values) {
            addCriterion("CREATEAT not in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatBetween(Date value1, Date value2) {
            addCriterion("CREATEAT between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotBetween(Date value1, Date value2) {
            addCriterion("CREATEAT not between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("CREATEBY is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("CREATEBY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("CREATEBY =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("CREATEBY <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("CREATEBY >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEBY >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("CREATEBY <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("CREATEBY <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("CREATEBY like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("CREATEBY not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("CREATEBY in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("CREATEBY not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("CREATEBY between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("CREATEBY not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andUpdateatIsNull() {
            addCriterion("UPDATEAT is null");
            return (Criteria) this;
        }

        public Criteria andUpdateatIsNotNull() {
            addCriterion("UPDATEAT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateatEqualTo(Date value) {
            addCriterion("UPDATEAT =", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotEqualTo(Date value) {
            addCriterion("UPDATEAT <>", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatGreaterThan(Date value) {
            addCriterion("UPDATEAT >", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATEAT >=", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLessThan(Date value) {
            addCriterion("UPDATEAT <", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLessThanOrEqualTo(Date value) {
            addCriterion("UPDATEAT <=", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatIn(List<Date> values) {
            addCriterion("UPDATEAT in", values, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotIn(List<Date> values) {
            addCriterion("UPDATEAT not in", values, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatBetween(Date value1, Date value2) {
            addCriterion("UPDATEAT between", value1, value2, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotBetween(Date value1, Date value2) {
            addCriterion("UPDATEAT not between", value1, value2, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNull() {
            addCriterion("UPDATEBY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("UPDATEBY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(String value) {
            addCriterion("UPDATEBY =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(String value) {
            addCriterion("UPDATEBY <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(String value) {
            addCriterion("UPDATEBY >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEBY >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(String value) {
            addCriterion("UPDATEBY <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(String value) {
            addCriterion("UPDATEBY <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLike(String value) {
            addCriterion("UPDATEBY like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotLike(String value) {
            addCriterion("UPDATEBY not like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<String> values) {
            addCriterion("UPDATEBY in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<String> values) {
            addCriterion("UPDATEBY not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(String value1, String value2) {
            addCriterion("UPDATEBY between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(String value1, String value2) {
            addCriterion("UPDATEBY not between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * F_PARTS
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_PARTS null
     */
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