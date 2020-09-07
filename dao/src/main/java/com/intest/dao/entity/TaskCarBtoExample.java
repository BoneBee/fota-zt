package com.intest.dao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskCarBtoExample {
    /**
     * F_TASKCAR
     */
    protected String orderByClause;

    /**
     * F_TASKCAR
     */
    protected boolean distinct;

    /**
     * F_TASKCAR
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public TaskCarBtoExample() {
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
     * F_TASKCAR null
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

        public Criteria andTaskcarIdIsNull() {
            addCriterion("TASKCAR_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskcarIdIsNotNull() {
            addCriterion("TASKCAR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskcarIdEqualTo(String value) {
            addCriterion("TASKCAR_ID =", value, "taskcarId");
            return (Criteria) this;
        }

        public Criteria andTaskcarIdNotEqualTo(String value) {
            addCriterion("TASKCAR_ID <>", value, "taskcarId");
            return (Criteria) this;
        }

        public Criteria andTaskcarIdGreaterThan(String value) {
            addCriterion("TASKCAR_ID >", value, "taskcarId");
            return (Criteria) this;
        }

        public Criteria andTaskcarIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASKCAR_ID >=", value, "taskcarId");
            return (Criteria) this;
        }

        public Criteria andTaskcarIdLessThan(String value) {
            addCriterion("TASKCAR_ID <", value, "taskcarId");
            return (Criteria) this;
        }

        public Criteria andTaskcarIdLessThanOrEqualTo(String value) {
            addCriterion("TASKCAR_ID <=", value, "taskcarId");
            return (Criteria) this;
        }

        public Criteria andTaskcarIdLike(String value) {
            addCriterion("TASKCAR_ID like", value, "taskcarId");
            return (Criteria) this;
        }

        public Criteria andTaskcarIdNotLike(String value) {
            addCriterion("TASKCAR_ID not like", value, "taskcarId");
            return (Criteria) this;
        }

        public Criteria andTaskcarIdIn(List<String> values) {
            addCriterion("TASKCAR_ID in", values, "taskcarId");
            return (Criteria) this;
        }

        public Criteria andTaskcarIdNotIn(List<String> values) {
            addCriterion("TASKCAR_ID not in", values, "taskcarId");
            return (Criteria) this;
        }

        public Criteria andTaskcarIdBetween(String value1, String value2) {
            addCriterion("TASKCAR_ID between", value1, value2, "taskcarId");
            return (Criteria) this;
        }

        public Criteria andTaskcarIdNotBetween(String value1, String value2) {
            addCriterion("TASKCAR_ID not between", value1, value2, "taskcarId");
            return (Criteria) this;
        }

        public Criteria andFkTaskIdIsNull() {
            addCriterion("FK_TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkTaskIdIsNotNull() {
            addCriterion("FK_TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkTaskIdEqualTo(String value) {
            addCriterion("FK_TASK_ID =", value, "fkTaskId");
            return (Criteria) this;
        }

        public Criteria andFkTaskIdNotEqualTo(String value) {
            addCriterion("FK_TASK_ID <>", value, "fkTaskId");
            return (Criteria) this;
        }

        public Criteria andFkTaskIdGreaterThan(String value) {
            addCriterion("FK_TASK_ID >", value, "fkTaskId");
            return (Criteria) this;
        }

        public Criteria andFkTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_TASK_ID >=", value, "fkTaskId");
            return (Criteria) this;
        }

        public Criteria andFkTaskIdLessThan(String value) {
            addCriterion("FK_TASK_ID <", value, "fkTaskId");
            return (Criteria) this;
        }

        public Criteria andFkTaskIdLessThanOrEqualTo(String value) {
            addCriterion("FK_TASK_ID <=", value, "fkTaskId");
            return (Criteria) this;
        }

        public Criteria andFkTaskIdLike(String value) {
            addCriterion("FK_TASK_ID like", value, "fkTaskId");
            return (Criteria) this;
        }

        public Criteria andFkTaskIdNotLike(String value) {
            addCriterion("FK_TASK_ID not like", value, "fkTaskId");
            return (Criteria) this;
        }

        public Criteria andFkTaskIdIn(List<String> values) {
            addCriterion("FK_TASK_ID in", values, "fkTaskId");
            return (Criteria) this;
        }

        public Criteria andFkTaskIdNotIn(List<String> values) {
            addCriterion("FK_TASK_ID not in", values, "fkTaskId");
            return (Criteria) this;
        }

        public Criteria andFkTaskIdBetween(String value1, String value2) {
            addCriterion("FK_TASK_ID between", value1, value2, "fkTaskId");
            return (Criteria) this;
        }

        public Criteria andFkTaskIdNotBetween(String value1, String value2) {
            addCriterion("FK_TASK_ID not between", value1, value2, "fkTaskId");
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

        public Criteria andFkTaskcarstatusvalueCodeIsNull() {
            addCriterion("FK_TASKCARSTATUSVALUE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarstatusvalueCodeIsNotNull() {
            addCriterion("FK_TASKCARSTATUSVALUE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarstatusvalueCodeEqualTo(String value) {
            addCriterion("FK_TASKCARSTATUSVALUE_CODE =", value, "fkTaskcarstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarstatusvalueCodeNotEqualTo(String value) {
            addCriterion("FK_TASKCARSTATUSVALUE_CODE <>", value, "fkTaskcarstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarstatusvalueCodeGreaterThan(String value) {
            addCriterion("FK_TASKCARSTATUSVALUE_CODE >", value, "fkTaskcarstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarstatusvalueCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FK_TASKCARSTATUSVALUE_CODE >=", value, "fkTaskcarstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarstatusvalueCodeLessThan(String value) {
            addCriterion("FK_TASKCARSTATUSVALUE_CODE <", value, "fkTaskcarstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarstatusvalueCodeLessThanOrEqualTo(String value) {
            addCriterion("FK_TASKCARSTATUSVALUE_CODE <=", value, "fkTaskcarstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarstatusvalueCodeLike(String value) {
            addCriterion("FK_TASKCARSTATUSVALUE_CODE like", value, "fkTaskcarstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarstatusvalueCodeNotLike(String value) {
            addCriterion("FK_TASKCARSTATUSVALUE_CODE not like", value, "fkTaskcarstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarstatusvalueCodeIn(List<String> values) {
            addCriterion("FK_TASKCARSTATUSVALUE_CODE in", values, "fkTaskcarstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarstatusvalueCodeNotIn(List<String> values) {
            addCriterion("FK_TASKCARSTATUSVALUE_CODE not in", values, "fkTaskcarstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarstatusvalueCodeBetween(String value1, String value2) {
            addCriterion("FK_TASKCARSTATUSVALUE_CODE between", value1, value2, "fkTaskcarstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarstatusvalueCodeNotBetween(String value1, String value2) {
            addCriterion("FK_TASKCARSTATUSVALUE_CODE not between", value1, value2, "fkTaskcarstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andProgressIsNull() {
            addCriterion("PROGRESS is null");
            return (Criteria) this;
        }

        public Criteria andProgressIsNotNull() {
            addCriterion("PROGRESS is not null");
            return (Criteria) this;
        }

        public Criteria andProgressEqualTo(BigDecimal value) {
            addCriterion("PROGRESS =", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotEqualTo(BigDecimal value) {
            addCriterion("PROGRESS <>", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThan(BigDecimal value) {
            addCriterion("PROGRESS >", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROGRESS >=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThan(BigDecimal value) {
            addCriterion("PROGRESS <", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROGRESS <=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressIn(List<BigDecimal> values) {
            addCriterion("PROGRESS in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotIn(List<BigDecimal> values) {
            addCriterion("PROGRESS not in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROGRESS between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROGRESS not between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeIsNull() {
            addCriterion("UPGRADETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeIsNotNull() {
            addCriterion("UPGRADETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeEqualTo(String value) {
            addCriterion("UPGRADETIME =", value, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeNotEqualTo(String value) {
            addCriterion("UPGRADETIME <>", value, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeGreaterThan(String value) {
            addCriterion("UPGRADETIME >", value, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPGRADETIME >=", value, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeLessThan(String value) {
            addCriterion("UPGRADETIME <", value, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeLessThanOrEqualTo(String value) {
            addCriterion("UPGRADETIME <=", value, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeLike(String value) {
            addCriterion("UPGRADETIME like", value, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeNotLike(String value) {
            addCriterion("UPGRADETIME not like", value, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeIn(List<String> values) {
            addCriterion("UPGRADETIME in", values, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeNotIn(List<String> values) {
            addCriterion("UPGRADETIME not in", values, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeBetween(String value1, String value2) {
            addCriterion("UPGRADETIME between", value1, value2, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeNotBetween(String value1, String value2) {
            addCriterion("UPGRADETIME not between", value1, value2, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
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
     * F_TASKCAR
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_TASKCAR null
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