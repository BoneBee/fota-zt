package com.intest.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartsConfigBtoExample {
    /**
     * F_PARTSCONFIG
     */
    protected String orderByClause;

    /**
     * F_PARTSCONFIG
     */
    protected boolean distinct;

    /**
     * F_PARTSCONFIG
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public PartsConfigBtoExample() {
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
     * F_PARTSCONFIG null
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

        public Criteria andPartsconfigIdIsNull() {
            addCriterion("PARTSCONFIG_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartsconfigIdIsNotNull() {
            addCriterion("PARTSCONFIG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartsconfigIdEqualTo(String value) {
            addCriterion("PARTSCONFIG_ID =", value, "partsconfigId");
            return (Criteria) this;
        }

        public Criteria andPartsconfigIdNotEqualTo(String value) {
            addCriterion("PARTSCONFIG_ID <>", value, "partsconfigId");
            return (Criteria) this;
        }

        public Criteria andPartsconfigIdGreaterThan(String value) {
            addCriterion("PARTSCONFIG_ID >", value, "partsconfigId");
            return (Criteria) this;
        }

        public Criteria andPartsconfigIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARTSCONFIG_ID >=", value, "partsconfigId");
            return (Criteria) this;
        }

        public Criteria andPartsconfigIdLessThan(String value) {
            addCriterion("PARTSCONFIG_ID <", value, "partsconfigId");
            return (Criteria) this;
        }

        public Criteria andPartsconfigIdLessThanOrEqualTo(String value) {
            addCriterion("PARTSCONFIG_ID <=", value, "partsconfigId");
            return (Criteria) this;
        }

        public Criteria andPartsconfigIdLike(String value) {
            addCriterion("PARTSCONFIG_ID like", value, "partsconfigId");
            return (Criteria) this;
        }

        public Criteria andPartsconfigIdNotLike(String value) {
            addCriterion("PARTSCONFIG_ID not like", value, "partsconfigId");
            return (Criteria) this;
        }

        public Criteria andPartsconfigIdIn(List<String> values) {
            addCriterion("PARTSCONFIG_ID in", values, "partsconfigId");
            return (Criteria) this;
        }

        public Criteria andPartsconfigIdNotIn(List<String> values) {
            addCriterion("PARTSCONFIG_ID not in", values, "partsconfigId");
            return (Criteria) this;
        }

        public Criteria andPartsconfigIdBetween(String value1, String value2) {
            addCriterion("PARTSCONFIG_ID between", value1, value2, "partsconfigId");
            return (Criteria) this;
        }

        public Criteria andPartsconfigIdNotBetween(String value1, String value2) {
            addCriterion("PARTSCONFIG_ID not between", value1, value2, "partsconfigId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdIsNull() {
            addCriterion("FK_PARTS_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdIsNotNull() {
            addCriterion("FK_PARTS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdEqualTo(String value) {
            addCriterion("FK_PARTS_ID =", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdNotEqualTo(String value) {
            addCriterion("FK_PARTS_ID <>", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdGreaterThan(String value) {
            addCriterion("FK_PARTS_ID >", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_PARTS_ID >=", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdLessThan(String value) {
            addCriterion("FK_PARTS_ID <", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdLessThanOrEqualTo(String value) {
            addCriterion("FK_PARTS_ID <=", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdLike(String value) {
            addCriterion("FK_PARTS_ID like", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdNotLike(String value) {
            addCriterion("FK_PARTS_ID not like", value, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdIn(List<String> values) {
            addCriterion("FK_PARTS_ID in", values, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdNotIn(List<String> values) {
            addCriterion("FK_PARTS_ID not in", values, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdBetween(String value1, String value2) {
            addCriterion("FK_PARTS_ID between", value1, value2, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andFkPartsIdNotBetween(String value1, String value2) {
            addCriterion("FK_PARTS_ID not between", value1, value2, "fkPartsId");
            return (Criteria) this;
        }

        public Criteria andVoltagemodelIsNull() {
            addCriterion("VOLTAGEMODEL is null");
            return (Criteria) this;
        }

        public Criteria andVoltagemodelIsNotNull() {
            addCriterion("VOLTAGEMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andVoltagemodelEqualTo(Short value) {
            addCriterion("VOLTAGEMODEL =", value, "voltagemodel");
            return (Criteria) this;
        }

        public Criteria andVoltagemodelNotEqualTo(Short value) {
            addCriterion("VOLTAGEMODEL <>", value, "voltagemodel");
            return (Criteria) this;
        }

        public Criteria andVoltagemodelGreaterThan(Short value) {
            addCriterion("VOLTAGEMODEL >", value, "voltagemodel");
            return (Criteria) this;
        }

        public Criteria andVoltagemodelGreaterThanOrEqualTo(Short value) {
            addCriterion("VOLTAGEMODEL >=", value, "voltagemodel");
            return (Criteria) this;
        }

        public Criteria andVoltagemodelLessThan(Short value) {
            addCriterion("VOLTAGEMODEL <", value, "voltagemodel");
            return (Criteria) this;
        }

        public Criteria andVoltagemodelLessThanOrEqualTo(Short value) {
            addCriterion("VOLTAGEMODEL <=", value, "voltagemodel");
            return (Criteria) this;
        }

        public Criteria andVoltagemodelIn(List<Short> values) {
            addCriterion("VOLTAGEMODEL in", values, "voltagemodel");
            return (Criteria) this;
        }

        public Criteria andVoltagemodelNotIn(List<Short> values) {
            addCriterion("VOLTAGEMODEL not in", values, "voltagemodel");
            return (Criteria) this;
        }

        public Criteria andVoltagemodelBetween(Short value1, Short value2) {
            addCriterion("VOLTAGEMODEL between", value1, value2, "voltagemodel");
            return (Criteria) this;
        }

        public Criteria andVoltagemodelNotBetween(Short value1, Short value2) {
            addCriterion("VOLTAGEMODEL not between", value1, value2, "voltagemodel");
            return (Criteria) this;
        }

        public Criteria andCantypeIsNull() {
            addCriterion("CANTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCantypeIsNotNull() {
            addCriterion("CANTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCantypeEqualTo(Short value) {
            addCriterion("CANTYPE =", value, "cantype");
            return (Criteria) this;
        }

        public Criteria andCantypeNotEqualTo(Short value) {
            addCriterion("CANTYPE <>", value, "cantype");
            return (Criteria) this;
        }

        public Criteria andCantypeGreaterThan(Short value) {
            addCriterion("CANTYPE >", value, "cantype");
            return (Criteria) this;
        }

        public Criteria andCantypeGreaterThanOrEqualTo(Short value) {
            addCriterion("CANTYPE >=", value, "cantype");
            return (Criteria) this;
        }

        public Criteria andCantypeLessThan(Short value) {
            addCriterion("CANTYPE <", value, "cantype");
            return (Criteria) this;
        }

        public Criteria andCantypeLessThanOrEqualTo(Short value) {
            addCriterion("CANTYPE <=", value, "cantype");
            return (Criteria) this;
        }

        public Criteria andCantypeIn(List<Short> values) {
            addCriterion("CANTYPE in", values, "cantype");
            return (Criteria) this;
        }

        public Criteria andCantypeNotIn(List<Short> values) {
            addCriterion("CANTYPE not in", values, "cantype");
            return (Criteria) this;
        }

        public Criteria andCantypeBetween(Short value1, Short value2) {
            addCriterion("CANTYPE between", value1, value2, "cantype");
            return (Criteria) this;
        }

        public Criteria andCantypeNotBetween(Short value1, Short value2) {
            addCriterion("CANTYPE not between", value1, value2, "cantype");
            return (Criteria) this;
        }

        public Criteria andTravelstateIsNull() {
            addCriterion("TRAVELSTATE is null");
            return (Criteria) this;
        }

        public Criteria andTravelstateIsNotNull() {
            addCriterion("TRAVELSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andTravelstateEqualTo(Short value) {
            addCriterion("TRAVELSTATE =", value, "travelstate");
            return (Criteria) this;
        }

        public Criteria andTravelstateNotEqualTo(Short value) {
            addCriterion("TRAVELSTATE <>", value, "travelstate");
            return (Criteria) this;
        }

        public Criteria andTravelstateGreaterThan(Short value) {
            addCriterion("TRAVELSTATE >", value, "travelstate");
            return (Criteria) this;
        }

        public Criteria andTravelstateGreaterThanOrEqualTo(Short value) {
            addCriterion("TRAVELSTATE >=", value, "travelstate");
            return (Criteria) this;
        }

        public Criteria andTravelstateLessThan(Short value) {
            addCriterion("TRAVELSTATE <", value, "travelstate");
            return (Criteria) this;
        }

        public Criteria andTravelstateLessThanOrEqualTo(Short value) {
            addCriterion("TRAVELSTATE <=", value, "travelstate");
            return (Criteria) this;
        }

        public Criteria andTravelstateIn(List<Short> values) {
            addCriterion("TRAVELSTATE in", values, "travelstate");
            return (Criteria) this;
        }

        public Criteria andTravelstateNotIn(List<Short> values) {
            addCriterion("TRAVELSTATE not in", values, "travelstate");
            return (Criteria) this;
        }

        public Criteria andTravelstateBetween(Short value1, Short value2) {
            addCriterion("TRAVELSTATE between", value1, value2, "travelstate");
            return (Criteria) this;
        }

        public Criteria andTravelstateNotBetween(Short value1, Short value2) {
            addCriterion("TRAVELSTATE not between", value1, value2, "travelstate");
            return (Criteria) this;
        }

        public Criteria andGearIsNull() {
            addCriterion("GEAR is null");
            return (Criteria) this;
        }

        public Criteria andGearIsNotNull() {
            addCriterion("GEAR is not null");
            return (Criteria) this;
        }

        public Criteria andGearEqualTo(Short value) {
            addCriterion("GEAR =", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearNotEqualTo(Short value) {
            addCriterion("GEAR <>", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearGreaterThan(Short value) {
            addCriterion("GEAR >", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearGreaterThanOrEqualTo(Short value) {
            addCriterion("GEAR >=", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearLessThan(Short value) {
            addCriterion("GEAR <", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearLessThanOrEqualTo(Short value) {
            addCriterion("GEAR <=", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearIn(List<Short> values) {
            addCriterion("GEAR in", values, "gear");
            return (Criteria) this;
        }

        public Criteria andGearNotIn(List<Short> values) {
            addCriterion("GEAR not in", values, "gear");
            return (Criteria) this;
        }

        public Criteria andGearBetween(Short value1, Short value2) {
            addCriterion("GEAR between", value1, value2, "gear");
            return (Criteria) this;
        }

        public Criteria andGearNotBetween(Short value1, Short value2) {
            addCriterion("GEAR not between", value1, value2, "gear");
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

        public Criteria andPreprogrammeIsNull() {
            addCriterion("PREPROGRAMME is null");
            return (Criteria) this;
        }

        public Criteria andPreprogrammeIsNotNull() {
            addCriterion("PREPROGRAMME is not null");
            return (Criteria) this;
        }

        public Criteria andPreprogrammeEqualTo(Short value) {
            addCriterion("PREPROGRAMME =", value, "preprogramme");
            return (Criteria) this;
        }

        public Criteria andPreprogrammeNotEqualTo(Short value) {
            addCriterion("PREPROGRAMME <>", value, "preprogramme");
            return (Criteria) this;
        }

        public Criteria andPreprogrammeGreaterThan(Short value) {
            addCriterion("PREPROGRAMME >", value, "preprogramme");
            return (Criteria) this;
        }

        public Criteria andPreprogrammeGreaterThanOrEqualTo(Short value) {
            addCriterion("PREPROGRAMME >=", value, "preprogramme");
            return (Criteria) this;
        }

        public Criteria andPreprogrammeLessThan(Short value) {
            addCriterion("PREPROGRAMME <", value, "preprogramme");
            return (Criteria) this;
        }

        public Criteria andPreprogrammeLessThanOrEqualTo(Short value) {
            addCriterion("PREPROGRAMME <=", value, "preprogramme");
            return (Criteria) this;
        }

        public Criteria andPreprogrammeIn(List<Short> values) {
            addCriterion("PREPROGRAMME in", values, "preprogramme");
            return (Criteria) this;
        }

        public Criteria andPreprogrammeNotIn(List<Short> values) {
            addCriterion("PREPROGRAMME not in", values, "preprogramme");
            return (Criteria) this;
        }

        public Criteria andPreprogrammeBetween(Short value1, Short value2) {
            addCriterion("PREPROGRAMME between", value1, value2, "preprogramme");
            return (Criteria) this;
        }

        public Criteria andPreprogrammeNotBetween(Short value1, Short value2) {
            addCriterion("PREPROGRAMME not between", value1, value2, "preprogramme");
            return (Criteria) this;
        }

        public Criteria andInprogrammeIsNull() {
            addCriterion("INPROGRAMME is null");
            return (Criteria) this;
        }

        public Criteria andInprogrammeIsNotNull() {
            addCriterion("INPROGRAMME is not null");
            return (Criteria) this;
        }

        public Criteria andInprogrammeEqualTo(Short value) {
            addCriterion("INPROGRAMME =", value, "inprogramme");
            return (Criteria) this;
        }

        public Criteria andInprogrammeNotEqualTo(Short value) {
            addCriterion("INPROGRAMME <>", value, "inprogramme");
            return (Criteria) this;
        }

        public Criteria andInprogrammeGreaterThan(Short value) {
            addCriterion("INPROGRAMME >", value, "inprogramme");
            return (Criteria) this;
        }

        public Criteria andInprogrammeGreaterThanOrEqualTo(Short value) {
            addCriterion("INPROGRAMME >=", value, "inprogramme");
            return (Criteria) this;
        }

        public Criteria andInprogrammeLessThan(Short value) {
            addCriterion("INPROGRAMME <", value, "inprogramme");
            return (Criteria) this;
        }

        public Criteria andInprogrammeLessThanOrEqualTo(Short value) {
            addCriterion("INPROGRAMME <=", value, "inprogramme");
            return (Criteria) this;
        }

        public Criteria andInprogrammeIn(List<Short> values) {
            addCriterion("INPROGRAMME in", values, "inprogramme");
            return (Criteria) this;
        }

        public Criteria andInprogrammeNotIn(List<Short> values) {
            addCriterion("INPROGRAMME not in", values, "inprogramme");
            return (Criteria) this;
        }

        public Criteria andInprogrammeBetween(Short value1, Short value2) {
            addCriterion("INPROGRAMME between", value1, value2, "inprogramme");
            return (Criteria) this;
        }

        public Criteria andInprogrammeNotBetween(Short value1, Short value2) {
            addCriterion("INPROGRAMME not between", value1, value2, "inprogramme");
            return (Criteria) this;
        }

        public Criteria andSafetylevelIsNull() {
            addCriterion("SAFETYLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSafetylevelIsNotNull() {
            addCriterion("SAFETYLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSafetylevelEqualTo(Short value) {
            addCriterion("SAFETYLEVEL =", value, "safetylevel");
            return (Criteria) this;
        }

        public Criteria andSafetylevelNotEqualTo(Short value) {
            addCriterion("SAFETYLEVEL <>", value, "safetylevel");
            return (Criteria) this;
        }

        public Criteria andSafetylevelGreaterThan(Short value) {
            addCriterion("SAFETYLEVEL >", value, "safetylevel");
            return (Criteria) this;
        }

        public Criteria andSafetylevelGreaterThanOrEqualTo(Short value) {
            addCriterion("SAFETYLEVEL >=", value, "safetylevel");
            return (Criteria) this;
        }

        public Criteria andSafetylevelLessThan(Short value) {
            addCriterion("SAFETYLEVEL <", value, "safetylevel");
            return (Criteria) this;
        }

        public Criteria andSafetylevelLessThanOrEqualTo(Short value) {
            addCriterion("SAFETYLEVEL <=", value, "safetylevel");
            return (Criteria) this;
        }

        public Criteria andSafetylevelIn(List<Short> values) {
            addCriterion("SAFETYLEVEL in", values, "safetylevel");
            return (Criteria) this;
        }

        public Criteria andSafetylevelNotIn(List<Short> values) {
            addCriterion("SAFETYLEVEL not in", values, "safetylevel");
            return (Criteria) this;
        }

        public Criteria andSafetylevelBetween(Short value1, Short value2) {
            addCriterion("SAFETYLEVEL between", value1, value2, "safetylevel");
            return (Criteria) this;
        }

        public Criteria andSafetylevelNotBetween(Short value1, Short value2) {
            addCriterion("SAFETYLEVEL not between", value1, value2, "safetylevel");
            return (Criteria) this;
        }

        public Criteria andAlgorithmmaskIsNull() {
            addCriterion("ALGORITHMMASK is null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmmaskIsNotNull() {
            addCriterion("ALGORITHMMASK is not null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmmaskEqualTo(String value) {
            addCriterion("ALGORITHMMASK =", value, "algorithmmask");
            return (Criteria) this;
        }

        public Criteria andAlgorithmmaskNotEqualTo(String value) {
            addCriterion("ALGORITHMMASK <>", value, "algorithmmask");
            return (Criteria) this;
        }

        public Criteria andAlgorithmmaskGreaterThan(String value) {
            addCriterion("ALGORITHMMASK >", value, "algorithmmask");
            return (Criteria) this;
        }

        public Criteria andAlgorithmmaskGreaterThanOrEqualTo(String value) {
            addCriterion("ALGORITHMMASK >=", value, "algorithmmask");
            return (Criteria) this;
        }

        public Criteria andAlgorithmmaskLessThan(String value) {
            addCriterion("ALGORITHMMASK <", value, "algorithmmask");
            return (Criteria) this;
        }

        public Criteria andAlgorithmmaskLessThanOrEqualTo(String value) {
            addCriterion("ALGORITHMMASK <=", value, "algorithmmask");
            return (Criteria) this;
        }

        public Criteria andAlgorithmmaskLike(String value) {
            addCriterion("ALGORITHMMASK like", value, "algorithmmask");
            return (Criteria) this;
        }

        public Criteria andAlgorithmmaskNotLike(String value) {
            addCriterion("ALGORITHMMASK not like", value, "algorithmmask");
            return (Criteria) this;
        }

        public Criteria andAlgorithmmaskIn(List<String> values) {
            addCriterion("ALGORITHMMASK in", values, "algorithmmask");
            return (Criteria) this;
        }

        public Criteria andAlgorithmmaskNotIn(List<String> values) {
            addCriterion("ALGORITHMMASK not in", values, "algorithmmask");
            return (Criteria) this;
        }

        public Criteria andAlgorithmmaskBetween(String value1, String value2) {
            addCriterion("ALGORITHMMASK between", value1, value2, "algorithmmask");
            return (Criteria) this;
        }

        public Criteria andAlgorithmmaskNotBetween(String value1, String value2) {
            addCriterion("ALGORITHMMASK not between", value1, value2, "algorithmmask");
            return (Criteria) this;
        }

        public Criteria andDelayIsNull() {
            addCriterion("DELAY is null");
            return (Criteria) this;
        }

        public Criteria andDelayIsNotNull() {
            addCriterion("DELAY is not null");
            return (Criteria) this;
        }

        public Criteria andDelayEqualTo(Short value) {
            addCriterion("DELAY =", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayNotEqualTo(Short value) {
            addCriterion("DELAY <>", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayGreaterThan(Short value) {
            addCriterion("DELAY >", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayGreaterThanOrEqualTo(Short value) {
            addCriterion("DELAY >=", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayLessThan(Short value) {
            addCriterion("DELAY <", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayLessThanOrEqualTo(Short value) {
            addCriterion("DELAY <=", value, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayIn(List<Short> values) {
            addCriterion("DELAY in", values, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayNotIn(List<Short> values) {
            addCriterion("DELAY not in", values, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayBetween(Short value1, Short value2) {
            addCriterion("DELAY between", value1, value2, "delay");
            return (Criteria) this;
        }

        public Criteria andDelayNotBetween(Short value1, Short value2) {
            addCriterion("DELAY not between", value1, value2, "delay");
            return (Criteria) this;
        }

        public Criteria andIsalignmentIsNull() {
            addCriterion("ISALIGNMENT is null");
            return (Criteria) this;
        }

        public Criteria andIsalignmentIsNotNull() {
            addCriterion("ISALIGNMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsalignmentEqualTo(Short value) {
            addCriterion("ISALIGNMENT =", value, "isalignment");
            return (Criteria) this;
        }

        public Criteria andIsalignmentNotEqualTo(Short value) {
            addCriterion("ISALIGNMENT <>", value, "isalignment");
            return (Criteria) this;
        }

        public Criteria andIsalignmentGreaterThan(Short value) {
            addCriterion("ISALIGNMENT >", value, "isalignment");
            return (Criteria) this;
        }

        public Criteria andIsalignmentGreaterThanOrEqualTo(Short value) {
            addCriterion("ISALIGNMENT >=", value, "isalignment");
            return (Criteria) this;
        }

        public Criteria andIsalignmentLessThan(Short value) {
            addCriterion("ISALIGNMENT <", value, "isalignment");
            return (Criteria) this;
        }

        public Criteria andIsalignmentLessThanOrEqualTo(Short value) {
            addCriterion("ISALIGNMENT <=", value, "isalignment");
            return (Criteria) this;
        }

        public Criteria andIsalignmentIn(List<Short> values) {
            addCriterion("ISALIGNMENT in", values, "isalignment");
            return (Criteria) this;
        }

        public Criteria andIsalignmentNotIn(List<Short> values) {
            addCriterion("ISALIGNMENT not in", values, "isalignment");
            return (Criteria) this;
        }

        public Criteria andIsalignmentBetween(Short value1, Short value2) {
            addCriterion("ISALIGNMENT between", value1, value2, "isalignment");
            return (Criteria) this;
        }

        public Criteria andIsalignmentNotBetween(Short value1, Short value2) {
            addCriterion("ISALIGNMENT not between", value1, value2, "isalignment");
            return (Criteria) this;
        }

        public Criteria andAlignmentcompanyIsNull() {
            addCriterion("ALIGNMENTCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andAlignmentcompanyIsNotNull() {
            addCriterion("ALIGNMENTCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andAlignmentcompanyEqualTo(Short value) {
            addCriterion("ALIGNMENTCOMPANY =", value, "alignmentcompany");
            return (Criteria) this;
        }

        public Criteria andAlignmentcompanyNotEqualTo(Short value) {
            addCriterion("ALIGNMENTCOMPANY <>", value, "alignmentcompany");
            return (Criteria) this;
        }

        public Criteria andAlignmentcompanyGreaterThan(Short value) {
            addCriterion("ALIGNMENTCOMPANY >", value, "alignmentcompany");
            return (Criteria) this;
        }

        public Criteria andAlignmentcompanyGreaterThanOrEqualTo(Short value) {
            addCriterion("ALIGNMENTCOMPANY >=", value, "alignmentcompany");
            return (Criteria) this;
        }

        public Criteria andAlignmentcompanyLessThan(Short value) {
            addCriterion("ALIGNMENTCOMPANY <", value, "alignmentcompany");
            return (Criteria) this;
        }

        public Criteria andAlignmentcompanyLessThanOrEqualTo(Short value) {
            addCriterion("ALIGNMENTCOMPANY <=", value, "alignmentcompany");
            return (Criteria) this;
        }

        public Criteria andAlignmentcompanyIn(List<Short> values) {
            addCriterion("ALIGNMENTCOMPANY in", values, "alignmentcompany");
            return (Criteria) this;
        }

        public Criteria andAlignmentcompanyNotIn(List<Short> values) {
            addCriterion("ALIGNMENTCOMPANY not in", values, "alignmentcompany");
            return (Criteria) this;
        }

        public Criteria andAlignmentcompanyBetween(Short value1, Short value2) {
            addCriterion("ALIGNMENTCOMPANY between", value1, value2, "alignmentcompany");
            return (Criteria) this;
        }

        public Criteria andAlignmentcompanyNotBetween(Short value1, Short value2) {
            addCriterion("ALIGNMENTCOMPANY not between", value1, value2, "alignmentcompany");
            return (Criteria) this;
        }

        public Criteria andEcuwaitresettimeIsNull() {
            addCriterion("ECUWAITRESETTIME is null");
            return (Criteria) this;
        }

        public Criteria andEcuwaitresettimeIsNotNull() {
            addCriterion("ECUWAITRESETTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEcuwaitresettimeEqualTo(Short value) {
            addCriterion("ECUWAITRESETTIME =", value, "ecuwaitresettime");
            return (Criteria) this;
        }

        public Criteria andEcuwaitresettimeNotEqualTo(Short value) {
            addCriterion("ECUWAITRESETTIME <>", value, "ecuwaitresettime");
            return (Criteria) this;
        }

        public Criteria andEcuwaitresettimeGreaterThan(Short value) {
            addCriterion("ECUWAITRESETTIME >", value, "ecuwaitresettime");
            return (Criteria) this;
        }

        public Criteria andEcuwaitresettimeGreaterThanOrEqualTo(Short value) {
            addCriterion("ECUWAITRESETTIME >=", value, "ecuwaitresettime");
            return (Criteria) this;
        }

        public Criteria andEcuwaitresettimeLessThan(Short value) {
            addCriterion("ECUWAITRESETTIME <", value, "ecuwaitresettime");
            return (Criteria) this;
        }

        public Criteria andEcuwaitresettimeLessThanOrEqualTo(Short value) {
            addCriterion("ECUWAITRESETTIME <=", value, "ecuwaitresettime");
            return (Criteria) this;
        }

        public Criteria andEcuwaitresettimeIn(List<Short> values) {
            addCriterion("ECUWAITRESETTIME in", values, "ecuwaitresettime");
            return (Criteria) this;
        }

        public Criteria andEcuwaitresettimeNotIn(List<Short> values) {
            addCriterion("ECUWAITRESETTIME not in", values, "ecuwaitresettime");
            return (Criteria) this;
        }

        public Criteria andEcuwaitresettimeBetween(Short value1, Short value2) {
            addCriterion("ECUWAITRESETTIME between", value1, value2, "ecuwaitresettime");
            return (Criteria) this;
        }

        public Criteria andEcuwaitresettimeNotBetween(Short value1, Short value2) {
            addCriterion("ECUWAITRESETTIME not between", value1, value2, "ecuwaitresettime");
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
     * F_PARTSCONFIG
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_PARTSCONFIG null
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