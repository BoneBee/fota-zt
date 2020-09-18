package com.intest.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskReviewTmpBtoExample {
    /**
     * F_TASKREVIEWTMP
     */
    protected String orderByClause;

    /**
     * F_TASKREVIEWTMP
     */
    protected boolean distinct;

    /**
     * F_TASKREVIEWTMP
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public TaskReviewTmpBtoExample() {
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
     * F_TASKREVIEWTMP null
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

        public Criteria andTaskreviewtmpIdIsNull() {
            addCriterion("TASKREVIEWTMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskreviewtmpIdIsNotNull() {
            addCriterion("TASKREVIEWTMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskreviewtmpIdEqualTo(String value) {
            addCriterion("TASKREVIEWTMP_ID =", value, "taskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andTaskreviewtmpIdNotEqualTo(String value) {
            addCriterion("TASKREVIEWTMP_ID <>", value, "taskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andTaskreviewtmpIdGreaterThan(String value) {
            addCriterion("TASKREVIEWTMP_ID >", value, "taskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andTaskreviewtmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASKREVIEWTMP_ID >=", value, "taskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andTaskreviewtmpIdLessThan(String value) {
            addCriterion("TASKREVIEWTMP_ID <", value, "taskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andTaskreviewtmpIdLessThanOrEqualTo(String value) {
            addCriterion("TASKREVIEWTMP_ID <=", value, "taskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andTaskreviewtmpIdLike(String value) {
            addCriterion("TASKREVIEWTMP_ID like", value, "taskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andTaskreviewtmpIdNotLike(String value) {
            addCriterion("TASKREVIEWTMP_ID not like", value, "taskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andTaskreviewtmpIdIn(List<String> values) {
            addCriterion("TASKREVIEWTMP_ID in", values, "taskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andTaskreviewtmpIdNotIn(List<String> values) {
            addCriterion("TASKREVIEWTMP_ID not in", values, "taskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andTaskreviewtmpIdBetween(String value1, String value2) {
            addCriterion("TASKREVIEWTMP_ID between", value1, value2, "taskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andTaskreviewtmpIdNotBetween(String value1, String value2) {
            addCriterion("TASKREVIEWTMP_ID not between", value1, value2, "taskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andTaskReviewtmpNameIsNull() {
            addCriterion("TASK_REVIEWTMP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskReviewtmpNameIsNotNull() {
            addCriterion("TASK_REVIEWTMP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskReviewtmpNameEqualTo(String value) {
            addCriterion("TASK_REVIEWTMP_NAME =", value, "taskReviewtmpName");
            return (Criteria) this;
        }

        public Criteria andTaskReviewtmpNameNotEqualTo(String value) {
            addCriterion("TASK_REVIEWTMP_NAME <>", value, "taskReviewtmpName");
            return (Criteria) this;
        }

        public Criteria andTaskReviewtmpNameGreaterThan(String value) {
            addCriterion("TASK_REVIEWTMP_NAME >", value, "taskReviewtmpName");
            return (Criteria) this;
        }

        public Criteria andTaskReviewtmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_REVIEWTMP_NAME >=", value, "taskReviewtmpName");
            return (Criteria) this;
        }

        public Criteria andTaskReviewtmpNameLessThan(String value) {
            addCriterion("TASK_REVIEWTMP_NAME <", value, "taskReviewtmpName");
            return (Criteria) this;
        }

        public Criteria andTaskReviewtmpNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_REVIEWTMP_NAME <=", value, "taskReviewtmpName");
            return (Criteria) this;
        }

        public Criteria andTaskReviewtmpNameLike(String value) {
            addCriterion("TASK_REVIEWTMP_NAME like", value, "taskReviewtmpName");
            return (Criteria) this;
        }

        public Criteria andTaskReviewtmpNameNotLike(String value) {
            addCriterion("TASK_REVIEWTMP_NAME not like", value, "taskReviewtmpName");
            return (Criteria) this;
        }

        public Criteria andTaskReviewtmpNameIn(List<String> values) {
            addCriterion("TASK_REVIEWTMP_NAME in", values, "taskReviewtmpName");
            return (Criteria) this;
        }

        public Criteria andTaskReviewtmpNameNotIn(List<String> values) {
            addCriterion("TASK_REVIEWTMP_NAME not in", values, "taskReviewtmpName");
            return (Criteria) this;
        }

        public Criteria andTaskReviewtmpNameBetween(String value1, String value2) {
            addCriterion("TASK_REVIEWTMP_NAME between", value1, value2, "taskReviewtmpName");
            return (Criteria) this;
        }

        public Criteria andTaskReviewtmpNameNotBetween(String value1, String value2) {
            addCriterion("TASK_REVIEWTMP_NAME not between", value1, value2, "taskReviewtmpName");
            return (Criteria) this;
        }

        public Criteria andTmpTypeIsNull() {
            addCriterion("TMP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTmpTypeIsNotNull() {
            addCriterion("TMP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTmpTypeEqualTo(Short value) {
            addCriterion("TMP_TYPE =", value, "tmpType");
            return (Criteria) this;
        }

        public Criteria andTmpTypeNotEqualTo(Short value) {
            addCriterion("TMP_TYPE <>", value, "tmpType");
            return (Criteria) this;
        }

        public Criteria andTmpTypeGreaterThan(Short value) {
            addCriterion("TMP_TYPE >", value, "tmpType");
            return (Criteria) this;
        }

        public Criteria andTmpTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TMP_TYPE >=", value, "tmpType");
            return (Criteria) this;
        }

        public Criteria andTmpTypeLessThan(Short value) {
            addCriterion("TMP_TYPE <", value, "tmpType");
            return (Criteria) this;
        }

        public Criteria andTmpTypeLessThanOrEqualTo(Short value) {
            addCriterion("TMP_TYPE <=", value, "tmpType");
            return (Criteria) this;
        }

        public Criteria andTmpTypeIn(List<Short> values) {
            addCriterion("TMP_TYPE in", values, "tmpType");
            return (Criteria) this;
        }

        public Criteria andTmpTypeNotIn(List<Short> values) {
            addCriterion("TMP_TYPE not in", values, "tmpType");
            return (Criteria) this;
        }

        public Criteria andTmpTypeBetween(Short value1, Short value2) {
            addCriterion("TMP_TYPE between", value1, value2, "tmpType");
            return (Criteria) this;
        }

        public Criteria andTmpTypeNotBetween(Short value1, Short value2) {
            addCriterion("TMP_TYPE not between", value1, value2, "tmpType");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("STATE not between", value1, value2, "state");
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

        public Criteria andTasknumIsNull() {
            addCriterion("TASKNUM is null");
            return (Criteria) this;
        }

        public Criteria andTasknumIsNotNull() {
            addCriterion("TASKNUM is not null");
            return (Criteria) this;
        }

        public Criteria andTasknumEqualTo(Short value) {
            addCriterion("TASKNUM =", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumNotEqualTo(Short value) {
            addCriterion("TASKNUM <>", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumGreaterThan(Short value) {
            addCriterion("TASKNUM >", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumGreaterThanOrEqualTo(Short value) {
            addCriterion("TASKNUM >=", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumLessThan(Short value) {
            addCriterion("TASKNUM <", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumLessThanOrEqualTo(Short value) {
            addCriterion("TASKNUM <=", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumIn(List<Short> values) {
            addCriterion("TASKNUM in", values, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumNotIn(List<Short> values) {
            addCriterion("TASKNUM not in", values, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumBetween(Short value1, Short value2) {
            addCriterion("TASKNUM between", value1, value2, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumNotBetween(Short value1, Short value2) {
            addCriterion("TASKNUM not between", value1, value2, "tasknum");
            return (Criteria) this;
        }
    }

    /**
     * F_TASKREVIEWTMP
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_TASKREVIEWTMP null
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