package com.intest.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarBtoExample {
    /**
     * F_CAR
     */
    protected String orderByClause;

    /**
     * F_CAR
     */
    protected boolean distinct;

    /**
     * F_CAR
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public CarBtoExample() {
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
     * F_CAR null
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

        public Criteria andCarIdIsNull() {
            addCriterion("CAR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("CAR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(String value) {
            addCriterion("CAR_ID =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(String value) {
            addCriterion("CAR_ID <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(String value) {
            addCriterion("CAR_ID >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_ID >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(String value) {
            addCriterion("CAR_ID <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(String value) {
            addCriterion("CAR_ID <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(String value) {
            addCriterion("CAR_ID like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(String value) {
            addCriterion("CAR_ID not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<String> values) {
            addCriterion("CAR_ID in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<String> values) {
            addCriterion("CAR_ID not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(String value1, String value2) {
            addCriterion("CAR_ID between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(String value1, String value2) {
            addCriterion("CAR_ID not between", value1, value2, "carId");
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

        public Criteria andVinIsNull() {
            addCriterion("VIN is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("VIN is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("VIN =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("VIN <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("VIN >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("VIN >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("VIN <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("VIN <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("VIN like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("VIN not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("VIN in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("VIN not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("VIN between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("VIN not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andAddtypeIsNull() {
            addCriterion("ADDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAddtypeIsNotNull() {
            addCriterion("ADDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAddtypeEqualTo(Short value) {
            addCriterion("ADDTYPE =", value, "addtype");
            return (Criteria) this;
        }

        public Criteria andAddtypeNotEqualTo(Short value) {
            addCriterion("ADDTYPE <>", value, "addtype");
            return (Criteria) this;
        }

        public Criteria andAddtypeGreaterThan(Short value) {
            addCriterion("ADDTYPE >", value, "addtype");
            return (Criteria) this;
        }

        public Criteria andAddtypeGreaterThanOrEqualTo(Short value) {
            addCriterion("ADDTYPE >=", value, "addtype");
            return (Criteria) this;
        }

        public Criteria andAddtypeLessThan(Short value) {
            addCriterion("ADDTYPE <", value, "addtype");
            return (Criteria) this;
        }

        public Criteria andAddtypeLessThanOrEqualTo(Short value) {
            addCriterion("ADDTYPE <=", value, "addtype");
            return (Criteria) this;
        }

        public Criteria andAddtypeIn(List<Short> values) {
            addCriterion("ADDTYPE in", values, "addtype");
            return (Criteria) this;
        }

        public Criteria andAddtypeNotIn(List<Short> values) {
            addCriterion("ADDTYPE not in", values, "addtype");
            return (Criteria) this;
        }

        public Criteria andAddtypeBetween(Short value1, Short value2) {
            addCriterion("ADDTYPE between", value1, value2, "addtype");
            return (Criteria) this;
        }

        public Criteria andAddtypeNotBetween(Short value1, Short value2) {
            addCriterion("ADDTYPE not between", value1, value2, "addtype");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNull() {
            addCriterion("LICENSE is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("LICENSE is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("LICENSE =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("LICENSE <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("LICENSE >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("LICENSE >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("LICENSE <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("LICENSE <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("LICENSE like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("LICENSE not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("LICENSE in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("LICENSE not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("LICENSE between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("LICENSE not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeIsNull() {
            addCriterion("TERMINALCODE is null");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeIsNotNull() {
            addCriterion("TERMINALCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeEqualTo(String value) {
            addCriterion("TERMINALCODE =", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeNotEqualTo(String value) {
            addCriterion("TERMINALCODE <>", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeGreaterThan(String value) {
            addCriterion("TERMINALCODE >", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINALCODE >=", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeLessThan(String value) {
            addCriterion("TERMINALCODE <", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeLessThanOrEqualTo(String value) {
            addCriterion("TERMINALCODE <=", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeLike(String value) {
            addCriterion("TERMINALCODE like", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeNotLike(String value) {
            addCriterion("TERMINALCODE not like", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeIn(List<String> values) {
            addCriterion("TERMINALCODE in", values, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeNotIn(List<String> values) {
            addCriterion("TERMINALCODE not in", values, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeBetween(String value1, String value2) {
            addCriterion("TERMINALCODE between", value1, value2, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeNotBetween(String value1, String value2) {
            addCriterion("TERMINALCODE not between", value1, value2, "terminalcode");
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

        public Criteria andIccidIsNull() {
            addCriterion("ICCID is null");
            return (Criteria) this;
        }

        public Criteria andIccidIsNotNull() {
            addCriterion("ICCID is not null");
            return (Criteria) this;
        }

        public Criteria andIccidEqualTo(String value) {
            addCriterion("ICCID =", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotEqualTo(String value) {
            addCriterion("ICCID <>", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidGreaterThan(String value) {
            addCriterion("ICCID >", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidGreaterThanOrEqualTo(String value) {
            addCriterion("ICCID >=", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLessThan(String value) {
            addCriterion("ICCID <", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLessThanOrEqualTo(String value) {
            addCriterion("ICCID <=", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidLike(String value) {
            addCriterion("ICCID like", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotLike(String value) {
            addCriterion("ICCID not like", value, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidIn(List<String> values) {
            addCriterion("ICCID in", values, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotIn(List<String> values) {
            addCriterion("ICCID not in", values, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidBetween(String value1, String value2) {
            addCriterion("ICCID between", value1, value2, "iccid");
            return (Criteria) this;
        }

        public Criteria andIccidNotBetween(String value1, String value2) {
            addCriterion("ICCID not between", value1, value2, "iccid");
            return (Criteria) this;
        }

        public Criteria andSimnumberIsNull() {
            addCriterion("SIMNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSimnumberIsNotNull() {
            addCriterion("SIMNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSimnumberEqualTo(String value) {
            addCriterion("SIMNUMBER =", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberNotEqualTo(String value) {
            addCriterion("SIMNUMBER <>", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberGreaterThan(String value) {
            addCriterion("SIMNUMBER >", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SIMNUMBER >=", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberLessThan(String value) {
            addCriterion("SIMNUMBER <", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberLessThanOrEqualTo(String value) {
            addCriterion("SIMNUMBER <=", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberLike(String value) {
            addCriterion("SIMNUMBER like", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberNotLike(String value) {
            addCriterion("SIMNUMBER not like", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberIn(List<String> values) {
            addCriterion("SIMNUMBER in", values, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberNotIn(List<String> values) {
            addCriterion("SIMNUMBER not in", values, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberBetween(String value1, String value2) {
            addCriterion("SIMNUMBER between", value1, value2, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberNotBetween(String value1, String value2) {
            addCriterion("SIMNUMBER not between", value1, value2, "simnumber");
            return (Criteria) this;
        }

        public Criteria andTerminalproIsNull() {
            addCriterion("TERMINALPRO is null");
            return (Criteria) this;
        }

        public Criteria andTerminalproIsNotNull() {
            addCriterion("TERMINALPRO is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalproEqualTo(String value) {
            addCriterion("TERMINALPRO =", value, "terminalpro");
            return (Criteria) this;
        }

        public Criteria andTerminalproNotEqualTo(String value) {
            addCriterion("TERMINALPRO <>", value, "terminalpro");
            return (Criteria) this;
        }

        public Criteria andTerminalproGreaterThan(String value) {
            addCriterion("TERMINALPRO >", value, "terminalpro");
            return (Criteria) this;
        }

        public Criteria andTerminalproGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINALPRO >=", value, "terminalpro");
            return (Criteria) this;
        }

        public Criteria andTerminalproLessThan(String value) {
            addCriterion("TERMINALPRO <", value, "terminalpro");
            return (Criteria) this;
        }

        public Criteria andTerminalproLessThanOrEqualTo(String value) {
            addCriterion("TERMINALPRO <=", value, "terminalpro");
            return (Criteria) this;
        }

        public Criteria andTerminalproLike(String value) {
            addCriterion("TERMINALPRO like", value, "terminalpro");
            return (Criteria) this;
        }

        public Criteria andTerminalproNotLike(String value) {
            addCriterion("TERMINALPRO not like", value, "terminalpro");
            return (Criteria) this;
        }

        public Criteria andTerminalproIn(List<String> values) {
            addCriterion("TERMINALPRO in", values, "terminalpro");
            return (Criteria) this;
        }

        public Criteria andTerminalproNotIn(List<String> values) {
            addCriterion("TERMINALPRO not in", values, "terminalpro");
            return (Criteria) this;
        }

        public Criteria andTerminalproBetween(String value1, String value2) {
            addCriterion("TERMINALPRO between", value1, value2, "terminalpro");
            return (Criteria) this;
        }

        public Criteria andTerminalproNotBetween(String value1, String value2) {
            addCriterion("TERMINALPRO not between", value1, value2, "terminalpro");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
            return (Criteria) this;
        }
    }

    /**
     * F_CAR
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_CAR null
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