package com.intest.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskBtoExample {
    /**
     * F_TASK
     */
    protected String orderByClause;

    /**
     * F_TASK
     */
    protected boolean distinct;

    /**
     * F_TASK
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public TaskBtoExample() {
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
     * F_TASK null
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

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNull() {
            addCriterion("TASKNAME is null");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNotNull() {
            addCriterion("TASKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTasknameEqualTo(String value) {
            addCriterion("TASKNAME =", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotEqualTo(String value) {
            addCriterion("TASKNAME <>", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThan(String value) {
            addCriterion("TASKNAME >", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThanOrEqualTo(String value) {
            addCriterion("TASKNAME >=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThan(String value) {
            addCriterion("TASKNAME <", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThanOrEqualTo(String value) {
            addCriterion("TASKNAME <=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLike(String value) {
            addCriterion("TASKNAME like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotLike(String value) {
            addCriterion("TASKNAME not like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameIn(List<String> values) {
            addCriterion("TASKNAME in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotIn(List<String> values) {
            addCriterion("TASKNAME not in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameBetween(String value1, String value2) {
            addCriterion("TASKNAME between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotBetween(String value1, String value2) {
            addCriterion("TASKNAME not between", value1, value2, "taskname");
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

        public Criteria andUpgradetimeEqualTo(Date value) {
            addCriterion("UPGRADETIME =", value, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeNotEqualTo(Date value) {
            addCriterion("UPGRADETIME <>", value, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeGreaterThan(Date value) {
            addCriterion("UPGRADETIME >", value, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPGRADETIME >=", value, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeLessThan(Date value) {
            addCriterion("UPGRADETIME <", value, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPGRADETIME <=", value, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeIn(List<Date> values) {
            addCriterion("UPGRADETIME in", values, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeNotIn(List<Date> values) {
            addCriterion("UPGRADETIME not in", values, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeBetween(Date value1, Date value2) {
            addCriterion("UPGRADETIME between", value1, value2, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andUpgradetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPGRADETIME not between", value1, value2, "upgradetime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeIsNull() {
            addCriterion("PLANSTARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeIsNotNull() {
            addCriterion("PLANSTARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeEqualTo(Date value) {
            addCriterion("PLANSTARTTIME =", value, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeNotEqualTo(Date value) {
            addCriterion("PLANSTARTTIME <>", value, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeGreaterThan(Date value) {
            addCriterion("PLANSTARTTIME >", value, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PLANSTARTTIME >=", value, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeLessThan(Date value) {
            addCriterion("PLANSTARTTIME <", value, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("PLANSTARTTIME <=", value, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeIn(List<Date> values) {
            addCriterion("PLANSTARTTIME in", values, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeNotIn(List<Date> values) {
            addCriterion("PLANSTARTTIME not in", values, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeBetween(Date value1, Date value2) {
            addCriterion("PLANSTARTTIME between", value1, value2, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("PLANSTARTTIME not between", value1, value2, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanendtimeIsNull() {
            addCriterion("PLANENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andPlanendtimeIsNotNull() {
            addCriterion("PLANENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanendtimeEqualTo(Date value) {
            addCriterion("PLANENDTIME =", value, "planendtime");
            return (Criteria) this;
        }

        public Criteria andPlanendtimeNotEqualTo(Date value) {
            addCriterion("PLANENDTIME <>", value, "planendtime");
            return (Criteria) this;
        }

        public Criteria andPlanendtimeGreaterThan(Date value) {
            addCriterion("PLANENDTIME >", value, "planendtime");
            return (Criteria) this;
        }

        public Criteria andPlanendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PLANENDTIME >=", value, "planendtime");
            return (Criteria) this;
        }

        public Criteria andPlanendtimeLessThan(Date value) {
            addCriterion("PLANENDTIME <", value, "planendtime");
            return (Criteria) this;
        }

        public Criteria andPlanendtimeLessThanOrEqualTo(Date value) {
            addCriterion("PLANENDTIME <=", value, "planendtime");
            return (Criteria) this;
        }

        public Criteria andPlanendtimeIn(List<Date> values) {
            addCriterion("PLANENDTIME in", values, "planendtime");
            return (Criteria) this;
        }

        public Criteria andPlanendtimeNotIn(List<Date> values) {
            addCriterion("PLANENDTIME not in", values, "planendtime");
            return (Criteria) this;
        }

        public Criteria andPlanendtimeBetween(Date value1, Date value2) {
            addCriterion("PLANENDTIME between", value1, value2, "planendtime");
            return (Criteria) this;
        }

        public Criteria andPlanendtimeNotBetween(Date value1, Date value2) {
            addCriterion("PLANENDTIME not between", value1, value2, "planendtime");
            return (Criteria) this;
        }

        public Criteria andTasknoteIsNull() {
            addCriterion("TASKNOTE is null");
            return (Criteria) this;
        }

        public Criteria andTasknoteIsNotNull() {
            addCriterion("TASKNOTE is not null");
            return (Criteria) this;
        }

        public Criteria andTasknoteEqualTo(String value) {
            addCriterion("TASKNOTE =", value, "tasknote");
            return (Criteria) this;
        }

        public Criteria andTasknoteNotEqualTo(String value) {
            addCriterion("TASKNOTE <>", value, "tasknote");
            return (Criteria) this;
        }

        public Criteria andTasknoteGreaterThan(String value) {
            addCriterion("TASKNOTE >", value, "tasknote");
            return (Criteria) this;
        }

        public Criteria andTasknoteGreaterThanOrEqualTo(String value) {
            addCriterion("TASKNOTE >=", value, "tasknote");
            return (Criteria) this;
        }

        public Criteria andTasknoteLessThan(String value) {
            addCriterion("TASKNOTE <", value, "tasknote");
            return (Criteria) this;
        }

        public Criteria andTasknoteLessThanOrEqualTo(String value) {
            addCriterion("TASKNOTE <=", value, "tasknote");
            return (Criteria) this;
        }

        public Criteria andTasknoteLike(String value) {
            addCriterion("TASKNOTE like", value, "tasknote");
            return (Criteria) this;
        }

        public Criteria andTasknoteNotLike(String value) {
            addCriterion("TASKNOTE not like", value, "tasknote");
            return (Criteria) this;
        }

        public Criteria andTasknoteIn(List<String> values) {
            addCriterion("TASKNOTE in", values, "tasknote");
            return (Criteria) this;
        }

        public Criteria andTasknoteNotIn(List<String> values) {
            addCriterion("TASKNOTE not in", values, "tasknote");
            return (Criteria) this;
        }

        public Criteria andTasknoteBetween(String value1, String value2) {
            addCriterion("TASKNOTE between", value1, value2, "tasknote");
            return (Criteria) this;
        }

        public Criteria andTasknoteNotBetween(String value1, String value2) {
            addCriterion("TASKNOTE not between", value1, value2, "tasknote");
            return (Criteria) this;
        }

        public Criteria andTaskstrategyIsNull() {
            addCriterion("TASKSTRATEGY is null");
            return (Criteria) this;
        }

        public Criteria andTaskstrategyIsNotNull() {
            addCriterion("TASKSTRATEGY is not null");
            return (Criteria) this;
        }

        public Criteria andTaskstrategyEqualTo(Short value) {
            addCriterion("TASKSTRATEGY =", value, "taskstrategy");
            return (Criteria) this;
        }

        public Criteria andTaskstrategyNotEqualTo(Short value) {
            addCriterion("TASKSTRATEGY <>", value, "taskstrategy");
            return (Criteria) this;
        }

        public Criteria andTaskstrategyGreaterThan(Short value) {
            addCriterion("TASKSTRATEGY >", value, "taskstrategy");
            return (Criteria) this;
        }

        public Criteria andTaskstrategyGreaterThanOrEqualTo(Short value) {
            addCriterion("TASKSTRATEGY >=", value, "taskstrategy");
            return (Criteria) this;
        }

        public Criteria andTaskstrategyLessThan(Short value) {
            addCriterion("TASKSTRATEGY <", value, "taskstrategy");
            return (Criteria) this;
        }

        public Criteria andTaskstrategyLessThanOrEqualTo(Short value) {
            addCriterion("TASKSTRATEGY <=", value, "taskstrategy");
            return (Criteria) this;
        }

        public Criteria andTaskstrategyIn(List<Short> values) {
            addCriterion("TASKSTRATEGY in", values, "taskstrategy");
            return (Criteria) this;
        }

        public Criteria andTaskstrategyNotIn(List<Short> values) {
            addCriterion("TASKSTRATEGY not in", values, "taskstrategy");
            return (Criteria) this;
        }

        public Criteria andTaskstrategyBetween(Short value1, Short value2) {
            addCriterion("TASKSTRATEGY between", value1, value2, "taskstrategy");
            return (Criteria) this;
        }

        public Criteria andTaskstrategyNotBetween(Short value1, Short value2) {
            addCriterion("TASKSTRATEGY not between", value1, value2, "taskstrategy");
            return (Criteria) this;
        }

        public Criteria andFkTaskstatusvalueCodeIsNull() {
            addCriterion("FK_TASKSTATUSVALUE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFkTaskstatusvalueCodeIsNotNull() {
            addCriterion("FK_TASKSTATUSVALUE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFkTaskstatusvalueCodeEqualTo(String value) {
            addCriterion("FK_TASKSTATUSVALUE_CODE =", value, "fkTaskstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskstatusvalueCodeNotEqualTo(String value) {
            addCriterion("FK_TASKSTATUSVALUE_CODE <>", value, "fkTaskstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskstatusvalueCodeGreaterThan(String value) {
            addCriterion("FK_TASKSTATUSVALUE_CODE >", value, "fkTaskstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskstatusvalueCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FK_TASKSTATUSVALUE_CODE >=", value, "fkTaskstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskstatusvalueCodeLessThan(String value) {
            addCriterion("FK_TASKSTATUSVALUE_CODE <", value, "fkTaskstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskstatusvalueCodeLessThanOrEqualTo(String value) {
            addCriterion("FK_TASKSTATUSVALUE_CODE <=", value, "fkTaskstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskstatusvalueCodeLike(String value) {
            addCriterion("FK_TASKSTATUSVALUE_CODE like", value, "fkTaskstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskstatusvalueCodeNotLike(String value) {
            addCriterion("FK_TASKSTATUSVALUE_CODE not like", value, "fkTaskstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskstatusvalueCodeIn(List<String> values) {
            addCriterion("FK_TASKSTATUSVALUE_CODE in", values, "fkTaskstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskstatusvalueCodeNotIn(List<String> values) {
            addCriterion("FK_TASKSTATUSVALUE_CODE not in", values, "fkTaskstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskstatusvalueCodeBetween(String value1, String value2) {
            addCriterion("FK_TASKSTATUSVALUE_CODE between", value1, value2, "fkTaskstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskstatusvalueCodeNotBetween(String value1, String value2) {
            addCriterion("FK_TASKSTATUSVALUE_CODE not between", value1, value2, "fkTaskstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkPackagetaskIdIsNull() {
            addCriterion("FK_PACKAGETASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkPackagetaskIdIsNotNull() {
            addCriterion("FK_PACKAGETASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkPackagetaskIdEqualTo(String value) {
            addCriterion("FK_PACKAGETASK_ID =", value, "fkPackagetaskId");
            return (Criteria) this;
        }

        public Criteria andFkPackagetaskIdNotEqualTo(String value) {
            addCriterion("FK_PACKAGETASK_ID <>", value, "fkPackagetaskId");
            return (Criteria) this;
        }

        public Criteria andFkPackagetaskIdGreaterThan(String value) {
            addCriterion("FK_PACKAGETASK_ID >", value, "fkPackagetaskId");
            return (Criteria) this;
        }

        public Criteria andFkPackagetaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_PACKAGETASK_ID >=", value, "fkPackagetaskId");
            return (Criteria) this;
        }

        public Criteria andFkPackagetaskIdLessThan(String value) {
            addCriterion("FK_PACKAGETASK_ID <", value, "fkPackagetaskId");
            return (Criteria) this;
        }

        public Criteria andFkPackagetaskIdLessThanOrEqualTo(String value) {
            addCriterion("FK_PACKAGETASK_ID <=", value, "fkPackagetaskId");
            return (Criteria) this;
        }

        public Criteria andFkPackagetaskIdLike(String value) {
            addCriterion("FK_PACKAGETASK_ID like", value, "fkPackagetaskId");
            return (Criteria) this;
        }

        public Criteria andFkPackagetaskIdNotLike(String value) {
            addCriterion("FK_PACKAGETASK_ID not like", value, "fkPackagetaskId");
            return (Criteria) this;
        }

        public Criteria andFkPackagetaskIdIn(List<String> values) {
            addCriterion("FK_PACKAGETASK_ID in", values, "fkPackagetaskId");
            return (Criteria) this;
        }

        public Criteria andFkPackagetaskIdNotIn(List<String> values) {
            addCriterion("FK_PACKAGETASK_ID not in", values, "fkPackagetaskId");
            return (Criteria) this;
        }

        public Criteria andFkPackagetaskIdBetween(String value1, String value2) {
            addCriterion("FK_PACKAGETASK_ID between", value1, value2, "fkPackagetaskId");
            return (Criteria) this;
        }

        public Criteria andFkPackagetaskIdNotBetween(String value1, String value2) {
            addCriterion("FK_PACKAGETASK_ID not between", value1, value2, "fkPackagetaskId");
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

        public Criteria andFkTaskreviewstatusvalueCodeIsNull() {
            addCriterion("FK_TASKREVIEWSTATUSVALUE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewstatusvalueCodeIsNotNull() {
            addCriterion("FK_TASKREVIEWSTATUSVALUE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewstatusvalueCodeEqualTo(String value) {
            addCriterion("FK_TASKREVIEWSTATUSVALUE_CODE =", value, "fkTaskreviewstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewstatusvalueCodeNotEqualTo(String value) {
            addCriterion("FK_TASKREVIEWSTATUSVALUE_CODE <>", value, "fkTaskreviewstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewstatusvalueCodeGreaterThan(String value) {
            addCriterion("FK_TASKREVIEWSTATUSVALUE_CODE >", value, "fkTaskreviewstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewstatusvalueCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FK_TASKREVIEWSTATUSVALUE_CODE >=", value, "fkTaskreviewstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewstatusvalueCodeLessThan(String value) {
            addCriterion("FK_TASKREVIEWSTATUSVALUE_CODE <", value, "fkTaskreviewstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewstatusvalueCodeLessThanOrEqualTo(String value) {
            addCriterion("FK_TASKREVIEWSTATUSVALUE_CODE <=", value, "fkTaskreviewstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewstatusvalueCodeLike(String value) {
            addCriterion("FK_TASKREVIEWSTATUSVALUE_CODE like", value, "fkTaskreviewstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewstatusvalueCodeNotLike(String value) {
            addCriterion("FK_TASKREVIEWSTATUSVALUE_CODE not like", value, "fkTaskreviewstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewstatusvalueCodeIn(List<String> values) {
            addCriterion("FK_TASKREVIEWSTATUSVALUE_CODE in", values, "fkTaskreviewstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewstatusvalueCodeNotIn(List<String> values) {
            addCriterion("FK_TASKREVIEWSTATUSVALUE_CODE not in", values, "fkTaskreviewstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewstatusvalueCodeBetween(String value1, String value2) {
            addCriterion("FK_TASKREVIEWSTATUSVALUE_CODE between", value1, value2, "fkTaskreviewstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewstatusvalueCodeNotBetween(String value1, String value2) {
            addCriterion("FK_TASKREVIEWSTATUSVALUE_CODE not between", value1, value2, "fkTaskreviewstatusvalueCode");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewtmpIdIsNull() {
            addCriterion("FK_TASKREVIEWTMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewtmpIdIsNotNull() {
            addCriterion("FK_TASKREVIEWTMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewtmpIdEqualTo(String value) {
            addCriterion("FK_TASKREVIEWTMP_ID =", value, "fkTaskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewtmpIdNotEqualTo(String value) {
            addCriterion("FK_TASKREVIEWTMP_ID <>", value, "fkTaskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewtmpIdGreaterThan(String value) {
            addCriterion("FK_TASKREVIEWTMP_ID >", value, "fkTaskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewtmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_TASKREVIEWTMP_ID >=", value, "fkTaskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewtmpIdLessThan(String value) {
            addCriterion("FK_TASKREVIEWTMP_ID <", value, "fkTaskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewtmpIdLessThanOrEqualTo(String value) {
            addCriterion("FK_TASKREVIEWTMP_ID <=", value, "fkTaskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewtmpIdLike(String value) {
            addCriterion("FK_TASKREVIEWTMP_ID like", value, "fkTaskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewtmpIdNotLike(String value) {
            addCriterion("FK_TASKREVIEWTMP_ID not like", value, "fkTaskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewtmpIdIn(List<String> values) {
            addCriterion("FK_TASKREVIEWTMP_ID in", values, "fkTaskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewtmpIdNotIn(List<String> values) {
            addCriterion("FK_TASKREVIEWTMP_ID not in", values, "fkTaskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewtmpIdBetween(String value1, String value2) {
            addCriterion("FK_TASKREVIEWTMP_ID between", value1, value2, "fkTaskreviewtmpId");
            return (Criteria) this;
        }

        public Criteria andFkTaskreviewtmpIdNotBetween(String value1, String value2) {
            addCriterion("FK_TASKREVIEWTMP_ID not between", value1, value2, "fkTaskreviewtmpId");
            return (Criteria) this;
        }
    }

    /**
     * F_TASK
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_TASK null
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