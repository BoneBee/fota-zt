package com.intest.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskCarStatusLogBtoExample {
    /**
     * F_TASKCARSTATUSLOG
     */
    protected String orderByClause;

    /**
     * F_TASKCARSTATUSLOG
     */
    protected boolean distinct;

    /**
     * F_TASKCARSTATUSLOG
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public TaskCarStatusLogBtoExample() {
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
     * F_TASKCARSTATUSLOG null
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

        public Criteria andTaskcarstatuslogIdIsNull() {
            addCriterion("TASKCARSTATUSLOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskcarstatuslogIdIsNotNull() {
            addCriterion("TASKCARSTATUSLOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskcarstatuslogIdEqualTo(String value) {
            addCriterion("TASKCARSTATUSLOG_ID =", value, "taskcarstatuslogId");
            return (Criteria) this;
        }

        public Criteria andTaskcarstatuslogIdNotEqualTo(String value) {
            addCriterion("TASKCARSTATUSLOG_ID <>", value, "taskcarstatuslogId");
            return (Criteria) this;
        }

        public Criteria andTaskcarstatuslogIdGreaterThan(String value) {
            addCriterion("TASKCARSTATUSLOG_ID >", value, "taskcarstatuslogId");
            return (Criteria) this;
        }

        public Criteria andTaskcarstatuslogIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASKCARSTATUSLOG_ID >=", value, "taskcarstatuslogId");
            return (Criteria) this;
        }

        public Criteria andTaskcarstatuslogIdLessThan(String value) {
            addCriterion("TASKCARSTATUSLOG_ID <", value, "taskcarstatuslogId");
            return (Criteria) this;
        }

        public Criteria andTaskcarstatuslogIdLessThanOrEqualTo(String value) {
            addCriterion("TASKCARSTATUSLOG_ID <=", value, "taskcarstatuslogId");
            return (Criteria) this;
        }

        public Criteria andTaskcarstatuslogIdLike(String value) {
            addCriterion("TASKCARSTATUSLOG_ID like", value, "taskcarstatuslogId");
            return (Criteria) this;
        }

        public Criteria andTaskcarstatuslogIdNotLike(String value) {
            addCriterion("TASKCARSTATUSLOG_ID not like", value, "taskcarstatuslogId");
            return (Criteria) this;
        }

        public Criteria andTaskcarstatuslogIdIn(List<String> values) {
            addCriterion("TASKCARSTATUSLOG_ID in", values, "taskcarstatuslogId");
            return (Criteria) this;
        }

        public Criteria andTaskcarstatuslogIdNotIn(List<String> values) {
            addCriterion("TASKCARSTATUSLOG_ID not in", values, "taskcarstatuslogId");
            return (Criteria) this;
        }

        public Criteria andTaskcarstatuslogIdBetween(String value1, String value2) {
            addCriterion("TASKCARSTATUSLOG_ID between", value1, value2, "taskcarstatuslogId");
            return (Criteria) this;
        }

        public Criteria andTaskcarstatuslogIdNotBetween(String value1, String value2) {
            addCriterion("TASKCARSTATUSLOG_ID not between", value1, value2, "taskcarstatuslogId");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarIdIsNull() {
            addCriterion("FK_TASKCAR_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarIdIsNotNull() {
            addCriterion("FK_TASKCAR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarIdEqualTo(String value) {
            addCriterion("FK_TASKCAR_ID =", value, "fkTaskcarId");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarIdNotEqualTo(String value) {
            addCriterion("FK_TASKCAR_ID <>", value, "fkTaskcarId");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarIdGreaterThan(String value) {
            addCriterion("FK_TASKCAR_ID >", value, "fkTaskcarId");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_TASKCAR_ID >=", value, "fkTaskcarId");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarIdLessThan(String value) {
            addCriterion("FK_TASKCAR_ID <", value, "fkTaskcarId");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarIdLessThanOrEqualTo(String value) {
            addCriterion("FK_TASKCAR_ID <=", value, "fkTaskcarId");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarIdLike(String value) {
            addCriterion("FK_TASKCAR_ID like", value, "fkTaskcarId");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarIdNotLike(String value) {
            addCriterion("FK_TASKCAR_ID not like", value, "fkTaskcarId");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarIdIn(List<String> values) {
            addCriterion("FK_TASKCAR_ID in", values, "fkTaskcarId");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarIdNotIn(List<String> values) {
            addCriterion("FK_TASKCAR_ID not in", values, "fkTaskcarId");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarIdBetween(String value1, String value2) {
            addCriterion("FK_TASKCAR_ID between", value1, value2, "fkTaskcarId");
            return (Criteria) this;
        }

        public Criteria andFkTaskcarIdNotBetween(String value1, String value2) {
            addCriterion("FK_TASKCAR_ID not between", value1, value2, "fkTaskcarId");
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

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andTuploadatIsNull() {
            addCriterion("TUPLOADAT is null");
            return (Criteria) this;
        }

        public Criteria andTuploadatIsNotNull() {
            addCriterion("TUPLOADAT is not null");
            return (Criteria) this;
        }

        public Criteria andTuploadatEqualTo(Date value) {
            addCriterion("TUPLOADAT =", value, "tuploadat");
            return (Criteria) this;
        }

        public Criteria andTuploadatNotEqualTo(Date value) {
            addCriterion("TUPLOADAT <>", value, "tuploadat");
            return (Criteria) this;
        }

        public Criteria andTuploadatGreaterThan(Date value) {
            addCriterion("TUPLOADAT >", value, "tuploadat");
            return (Criteria) this;
        }

        public Criteria andTuploadatGreaterThanOrEqualTo(Date value) {
            addCriterion("TUPLOADAT >=", value, "tuploadat");
            return (Criteria) this;
        }

        public Criteria andTuploadatLessThan(Date value) {
            addCriterion("TUPLOADAT <", value, "tuploadat");
            return (Criteria) this;
        }

        public Criteria andTuploadatLessThanOrEqualTo(Date value) {
            addCriterion("TUPLOADAT <=", value, "tuploadat");
            return (Criteria) this;
        }

        public Criteria andTuploadatIn(List<Date> values) {
            addCriterion("TUPLOADAT in", values, "tuploadat");
            return (Criteria) this;
        }

        public Criteria andTuploadatNotIn(List<Date> values) {
            addCriterion("TUPLOADAT not in", values, "tuploadat");
            return (Criteria) this;
        }

        public Criteria andTuploadatBetween(Date value1, Date value2) {
            addCriterion("TUPLOADAT between", value1, value2, "tuploadat");
            return (Criteria) this;
        }

        public Criteria andTuploadatNotBetween(Date value1, Date value2) {
            addCriterion("TUPLOADAT not between", value1, value2, "tuploadat");
            return (Criteria) this;
        }

        public Criteria andFkPlatformapilogIdIsNull() {
            addCriterion("FK_PLATFORMAPILOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkPlatformapilogIdIsNotNull() {
            addCriterion("FK_PLATFORMAPILOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkPlatformapilogIdEqualTo(String value) {
            addCriterion("FK_PLATFORMAPILOG_ID =", value, "fkPlatformapilogId");
            return (Criteria) this;
        }

        public Criteria andFkPlatformapilogIdNotEqualTo(String value) {
            addCriterion("FK_PLATFORMAPILOG_ID <>", value, "fkPlatformapilogId");
            return (Criteria) this;
        }

        public Criteria andFkPlatformapilogIdGreaterThan(String value) {
            addCriterion("FK_PLATFORMAPILOG_ID >", value, "fkPlatformapilogId");
            return (Criteria) this;
        }

        public Criteria andFkPlatformapilogIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_PLATFORMAPILOG_ID >=", value, "fkPlatformapilogId");
            return (Criteria) this;
        }

        public Criteria andFkPlatformapilogIdLessThan(String value) {
            addCriterion("FK_PLATFORMAPILOG_ID <", value, "fkPlatformapilogId");
            return (Criteria) this;
        }

        public Criteria andFkPlatformapilogIdLessThanOrEqualTo(String value) {
            addCriterion("FK_PLATFORMAPILOG_ID <=", value, "fkPlatformapilogId");
            return (Criteria) this;
        }

        public Criteria andFkPlatformapilogIdLike(String value) {
            addCriterion("FK_PLATFORMAPILOG_ID like", value, "fkPlatformapilogId");
            return (Criteria) this;
        }

        public Criteria andFkPlatformapilogIdNotLike(String value) {
            addCriterion("FK_PLATFORMAPILOG_ID not like", value, "fkPlatformapilogId");
            return (Criteria) this;
        }

        public Criteria andFkPlatformapilogIdIn(List<String> values) {
            addCriterion("FK_PLATFORMAPILOG_ID in", values, "fkPlatformapilogId");
            return (Criteria) this;
        }

        public Criteria andFkPlatformapilogIdNotIn(List<String> values) {
            addCriterion("FK_PLATFORMAPILOG_ID not in", values, "fkPlatformapilogId");
            return (Criteria) this;
        }

        public Criteria andFkPlatformapilogIdBetween(String value1, String value2) {
            addCriterion("FK_PLATFORMAPILOG_ID between", value1, value2, "fkPlatformapilogId");
            return (Criteria) this;
        }

        public Criteria andFkPlatformapilogIdNotBetween(String value1, String value2) {
            addCriterion("FK_PLATFORMAPILOG_ID not between", value1, value2, "fkPlatformapilogId");
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
    }

    /**
     * F_TASKCARSTATUSLOG
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_TASKCARSTATUSLOG null
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