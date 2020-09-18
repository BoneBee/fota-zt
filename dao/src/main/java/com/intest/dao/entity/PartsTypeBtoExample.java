package com.intest.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartsTypeBtoExample {
    /**
     * F_PARTSTYPE
     */
    protected String orderByClause;

    /**
     * F_PARTSTYPE
     */
    protected boolean distinct;

    /**
     * F_PARTSTYPE
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public PartsTypeBtoExample() {
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
     * F_PARTSTYPE null
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

        public Criteria andPartstypeIdIsNull() {
            addCriterion("PARTSTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartstypeIdIsNotNull() {
            addCriterion("PARTSTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartstypeIdEqualTo(String value) {
            addCriterion("PARTSTYPE_ID =", value, "partstypeId");
            return (Criteria) this;
        }

        public Criteria andPartstypeIdNotEqualTo(String value) {
            addCriterion("PARTSTYPE_ID <>", value, "partstypeId");
            return (Criteria) this;
        }

        public Criteria andPartstypeIdGreaterThan(String value) {
            addCriterion("PARTSTYPE_ID >", value, "partstypeId");
            return (Criteria) this;
        }

        public Criteria andPartstypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARTSTYPE_ID >=", value, "partstypeId");
            return (Criteria) this;
        }

        public Criteria andPartstypeIdLessThan(String value) {
            addCriterion("PARTSTYPE_ID <", value, "partstypeId");
            return (Criteria) this;
        }

        public Criteria andPartstypeIdLessThanOrEqualTo(String value) {
            addCriterion("PARTSTYPE_ID <=", value, "partstypeId");
            return (Criteria) this;
        }

        public Criteria andPartstypeIdLike(String value) {
            addCriterion("PARTSTYPE_ID like", value, "partstypeId");
            return (Criteria) this;
        }

        public Criteria andPartstypeIdNotLike(String value) {
            addCriterion("PARTSTYPE_ID not like", value, "partstypeId");
            return (Criteria) this;
        }

        public Criteria andPartstypeIdIn(List<String> values) {
            addCriterion("PARTSTYPE_ID in", values, "partstypeId");
            return (Criteria) this;
        }

        public Criteria andPartstypeIdNotIn(List<String> values) {
            addCriterion("PARTSTYPE_ID not in", values, "partstypeId");
            return (Criteria) this;
        }

        public Criteria andPartstypeIdBetween(String value1, String value2) {
            addCriterion("PARTSTYPE_ID between", value1, value2, "partstypeId");
            return (Criteria) this;
        }

        public Criteria andPartstypeIdNotBetween(String value1, String value2) {
            addCriterion("PARTSTYPE_ID not between", value1, value2, "partstypeId");
            return (Criteria) this;
        }

        public Criteria andPartstypenameIsNull() {
            addCriterion("PARTSTYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andPartstypenameIsNotNull() {
            addCriterion("PARTSTYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andPartstypenameEqualTo(String value) {
            addCriterion("PARTSTYPENAME =", value, "partstypename");
            return (Criteria) this;
        }

        public Criteria andPartstypenameNotEqualTo(String value) {
            addCriterion("PARTSTYPENAME <>", value, "partstypename");
            return (Criteria) this;
        }

        public Criteria andPartstypenameGreaterThan(String value) {
            addCriterion("PARTSTYPENAME >", value, "partstypename");
            return (Criteria) this;
        }

        public Criteria andPartstypenameGreaterThanOrEqualTo(String value) {
            addCriterion("PARTSTYPENAME >=", value, "partstypename");
            return (Criteria) this;
        }

        public Criteria andPartstypenameLessThan(String value) {
            addCriterion("PARTSTYPENAME <", value, "partstypename");
            return (Criteria) this;
        }

        public Criteria andPartstypenameLessThanOrEqualTo(String value) {
            addCriterion("PARTSTYPENAME <=", value, "partstypename");
            return (Criteria) this;
        }

        public Criteria andPartstypenameLike(String value) {
            addCriterion("PARTSTYPENAME like", value, "partstypename");
            return (Criteria) this;
        }

        public Criteria andPartstypenameNotLike(String value) {
            addCriterion("PARTSTYPENAME not like", value, "partstypename");
            return (Criteria) this;
        }

        public Criteria andPartstypenameIn(List<String> values) {
            addCriterion("PARTSTYPENAME in", values, "partstypename");
            return (Criteria) this;
        }

        public Criteria andPartstypenameNotIn(List<String> values) {
            addCriterion("PARTSTYPENAME not in", values, "partstypename");
            return (Criteria) this;
        }

        public Criteria andPartstypenameBetween(String value1, String value2) {
            addCriterion("PARTSTYPENAME between", value1, value2, "partstypename");
            return (Criteria) this;
        }

        public Criteria andPartstypenameNotBetween(String value1, String value2) {
            addCriterion("PARTSTYPENAME not between", value1, value2, "partstypename");
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
    }

    /**
     * F_PARTSTYPE
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_PARTSTYPE null
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