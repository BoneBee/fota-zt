package com.intest.dao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ColumnOptionBtoExample {
    /**
     * F_COLUMNOPTION
     */
    protected String orderByClause;

    /**
     * F_COLUMNOPTION
     */
    protected boolean distinct;

    /**
     * F_COLUMNOPTION
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public ColumnOptionBtoExample() {
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
     * F_COLUMNOPTION null
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

        public Criteria andColumnoptionIdIsNull() {
            addCriterion("COLUMNOPTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andColumnoptionIdIsNotNull() {
            addCriterion("COLUMNOPTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andColumnoptionIdEqualTo(String value) {
            addCriterion("COLUMNOPTION_ID =", value, "columnoptionId");
            return (Criteria) this;
        }

        public Criteria andColumnoptionIdNotEqualTo(String value) {
            addCriterion("COLUMNOPTION_ID <>", value, "columnoptionId");
            return (Criteria) this;
        }

        public Criteria andColumnoptionIdGreaterThan(String value) {
            addCriterion("COLUMNOPTION_ID >", value, "columnoptionId");
            return (Criteria) this;
        }

        public Criteria andColumnoptionIdGreaterThanOrEqualTo(String value) {
            addCriterion("COLUMNOPTION_ID >=", value, "columnoptionId");
            return (Criteria) this;
        }

        public Criteria andColumnoptionIdLessThan(String value) {
            addCriterion("COLUMNOPTION_ID <", value, "columnoptionId");
            return (Criteria) this;
        }

        public Criteria andColumnoptionIdLessThanOrEqualTo(String value) {
            addCriterion("COLUMNOPTION_ID <=", value, "columnoptionId");
            return (Criteria) this;
        }

        public Criteria andColumnoptionIdLike(String value) {
            addCriterion("COLUMNOPTION_ID like", value, "columnoptionId");
            return (Criteria) this;
        }

        public Criteria andColumnoptionIdNotLike(String value) {
            addCriterion("COLUMNOPTION_ID not like", value, "columnoptionId");
            return (Criteria) this;
        }

        public Criteria andColumnoptionIdIn(List<String> values) {
            addCriterion("COLUMNOPTION_ID in", values, "columnoptionId");
            return (Criteria) this;
        }

        public Criteria andColumnoptionIdNotIn(List<String> values) {
            addCriterion("COLUMNOPTION_ID not in", values, "columnoptionId");
            return (Criteria) this;
        }

        public Criteria andColumnoptionIdBetween(String value1, String value2) {
            addCriterion("COLUMNOPTION_ID between", value1, value2, "columnoptionId");
            return (Criteria) this;
        }

        public Criteria andColumnoptionIdNotBetween(String value1, String value2) {
            addCriterion("COLUMNOPTION_ID not between", value1, value2, "columnoptionId");
            return (Criteria) this;
        }

        public Criteria andFkOptionIdIsNull() {
            addCriterion("FK_OPTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkOptionIdIsNotNull() {
            addCriterion("FK_OPTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkOptionIdEqualTo(String value) {
            addCriterion("FK_OPTION_ID =", value, "fkOptionId");
            return (Criteria) this;
        }

        public Criteria andFkOptionIdNotEqualTo(String value) {
            addCriterion("FK_OPTION_ID <>", value, "fkOptionId");
            return (Criteria) this;
        }

        public Criteria andFkOptionIdGreaterThan(String value) {
            addCriterion("FK_OPTION_ID >", value, "fkOptionId");
            return (Criteria) this;
        }

        public Criteria andFkOptionIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_OPTION_ID >=", value, "fkOptionId");
            return (Criteria) this;
        }

        public Criteria andFkOptionIdLessThan(String value) {
            addCriterion("FK_OPTION_ID <", value, "fkOptionId");
            return (Criteria) this;
        }

        public Criteria andFkOptionIdLessThanOrEqualTo(String value) {
            addCriterion("FK_OPTION_ID <=", value, "fkOptionId");
            return (Criteria) this;
        }

        public Criteria andFkOptionIdLike(String value) {
            addCriterion("FK_OPTION_ID like", value, "fkOptionId");
            return (Criteria) this;
        }

        public Criteria andFkOptionIdNotLike(String value) {
            addCriterion("FK_OPTION_ID not like", value, "fkOptionId");
            return (Criteria) this;
        }

        public Criteria andFkOptionIdIn(List<String> values) {
            addCriterion("FK_OPTION_ID in", values, "fkOptionId");
            return (Criteria) this;
        }

        public Criteria andFkOptionIdNotIn(List<String> values) {
            addCriterion("FK_OPTION_ID not in", values, "fkOptionId");
            return (Criteria) this;
        }

        public Criteria andFkOptionIdBetween(String value1, String value2) {
            addCriterion("FK_OPTION_ID between", value1, value2, "fkOptionId");
            return (Criteria) this;
        }

        public Criteria andFkOptionIdNotBetween(String value1, String value2) {
            addCriterion("FK_OPTION_ID not between", value1, value2, "fkOptionId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdIsNull() {
            addCriterion("FK_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdIsNotNull() {
            addCriterion("FK_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdEqualTo(String value) {
            addCriterion("FK_COLUMN_ID =", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdNotEqualTo(String value) {
            addCriterion("FK_COLUMN_ID <>", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdGreaterThan(String value) {
            addCriterion("FK_COLUMN_ID >", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_COLUMN_ID >=", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdLessThan(String value) {
            addCriterion("FK_COLUMN_ID <", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdLessThanOrEqualTo(String value) {
            addCriterion("FK_COLUMN_ID <=", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdLike(String value) {
            addCriterion("FK_COLUMN_ID like", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdNotLike(String value) {
            addCriterion("FK_COLUMN_ID not like", value, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdIn(List<String> values) {
            addCriterion("FK_COLUMN_ID in", values, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdNotIn(List<String> values) {
            addCriterion("FK_COLUMN_ID not in", values, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdBetween(String value1, String value2) {
            addCriterion("FK_COLUMN_ID between", value1, value2, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andFkColumnIdNotBetween(String value1, String value2) {
            addCriterion("FK_COLUMN_ID not between", value1, value2, "fkColumnId");
            return (Criteria) this;
        }

        public Criteria andIntdexIsNull() {
            addCriterion("INTDEX is null");
            return (Criteria) this;
        }

        public Criteria andIntdexIsNotNull() {
            addCriterion("INTDEX is not null");
            return (Criteria) this;
        }

        public Criteria andIntdexEqualTo(BigDecimal value) {
            addCriterion("INTDEX =", value, "intdex");
            return (Criteria) this;
        }

        public Criteria andIntdexNotEqualTo(BigDecimal value) {
            addCriterion("INTDEX <>", value, "intdex");
            return (Criteria) this;
        }

        public Criteria andIntdexGreaterThan(BigDecimal value) {
            addCriterion("INTDEX >", value, "intdex");
            return (Criteria) this;
        }

        public Criteria andIntdexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INTDEX >=", value, "intdex");
            return (Criteria) this;
        }

        public Criteria andIntdexLessThan(BigDecimal value) {
            addCriterion("INTDEX <", value, "intdex");
            return (Criteria) this;
        }

        public Criteria andIntdexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INTDEX <=", value, "intdex");
            return (Criteria) this;
        }

        public Criteria andIntdexIn(List<BigDecimal> values) {
            addCriterion("INTDEX in", values, "intdex");
            return (Criteria) this;
        }

        public Criteria andIntdexNotIn(List<BigDecimal> values) {
            addCriterion("INTDEX not in", values, "intdex");
            return (Criteria) this;
        }

        public Criteria andIntdexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTDEX between", value1, value2, "intdex");
            return (Criteria) this;
        }

        public Criteria andIntdexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTDEX not between", value1, value2, "intdex");
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

        public Criteria andIsdeleteEqualTo(BigDecimal value) {
            addCriterion("ISDELETE =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(BigDecimal value) {
            addCriterion("ISDELETE <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(BigDecimal value) {
            addCriterion("ISDELETE >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISDELETE >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(BigDecimal value) {
            addCriterion("ISDELETE <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISDELETE <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<BigDecimal> values) {
            addCriterion("ISDELETE in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<BigDecimal> values) {
            addCriterion("ISDELETE not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISDELETE between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(BigDecimal value1, BigDecimal value2) {
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
     * F_COLUMNOPTION
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_COLUMNOPTION null
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