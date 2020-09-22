package com.intest.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RolePermissionBtoExample {
    /**
     * F_ROLEPERMISSION
     */
    protected String orderByClause;

    /**
     * F_ROLEPERMISSION
     */
    protected boolean distinct;

    /**
     * F_ROLEPERMISSION
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public RolePermissionBtoExample() {
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
     * F_ROLEPERMISSION null
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

        public Criteria andRolepermissionIdIsNull() {
            addCriterion("ROLEPERMISSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andRolepermissionIdIsNotNull() {
            addCriterion("ROLEPERMISSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRolepermissionIdEqualTo(String value) {
            addCriterion("ROLEPERMISSION_ID =", value, "rolepermissionId");
            return (Criteria) this;
        }

        public Criteria andRolepermissionIdNotEqualTo(String value) {
            addCriterion("ROLEPERMISSION_ID <>", value, "rolepermissionId");
            return (Criteria) this;
        }

        public Criteria andRolepermissionIdGreaterThan(String value) {
            addCriterion("ROLEPERMISSION_ID >", value, "rolepermissionId");
            return (Criteria) this;
        }

        public Criteria andRolepermissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEPERMISSION_ID >=", value, "rolepermissionId");
            return (Criteria) this;
        }

        public Criteria andRolepermissionIdLessThan(String value) {
            addCriterion("ROLEPERMISSION_ID <", value, "rolepermissionId");
            return (Criteria) this;
        }

        public Criteria andRolepermissionIdLessThanOrEqualTo(String value) {
            addCriterion("ROLEPERMISSION_ID <=", value, "rolepermissionId");
            return (Criteria) this;
        }

        public Criteria andRolepermissionIdLike(String value) {
            addCriterion("ROLEPERMISSION_ID like", value, "rolepermissionId");
            return (Criteria) this;
        }

        public Criteria andRolepermissionIdNotLike(String value) {
            addCriterion("ROLEPERMISSION_ID not like", value, "rolepermissionId");
            return (Criteria) this;
        }

        public Criteria andRolepermissionIdIn(List<String> values) {
            addCriterion("ROLEPERMISSION_ID in", values, "rolepermissionId");
            return (Criteria) this;
        }

        public Criteria andRolepermissionIdNotIn(List<String> values) {
            addCriterion("ROLEPERMISSION_ID not in", values, "rolepermissionId");
            return (Criteria) this;
        }

        public Criteria andRolepermissionIdBetween(String value1, String value2) {
            addCriterion("ROLEPERMISSION_ID between", value1, value2, "rolepermissionId");
            return (Criteria) this;
        }

        public Criteria andRolepermissionIdNotBetween(String value1, String value2) {
            addCriterion("ROLEPERMISSION_ID not between", value1, value2, "rolepermissionId");
            return (Criteria) this;
        }

        public Criteria andFkRoleIdIsNull() {
            addCriterion("FK_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkRoleIdIsNotNull() {
            addCriterion("FK_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkRoleIdEqualTo(String value) {
            addCriterion("FK_ROLE_ID =", value, "fkRoleId");
            return (Criteria) this;
        }

        public Criteria andFkRoleIdNotEqualTo(String value) {
            addCriterion("FK_ROLE_ID <>", value, "fkRoleId");
            return (Criteria) this;
        }

        public Criteria andFkRoleIdGreaterThan(String value) {
            addCriterion("FK_ROLE_ID >", value, "fkRoleId");
            return (Criteria) this;
        }

        public Criteria andFkRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_ROLE_ID >=", value, "fkRoleId");
            return (Criteria) this;
        }

        public Criteria andFkRoleIdLessThan(String value) {
            addCriterion("FK_ROLE_ID <", value, "fkRoleId");
            return (Criteria) this;
        }

        public Criteria andFkRoleIdLessThanOrEqualTo(String value) {
            addCriterion("FK_ROLE_ID <=", value, "fkRoleId");
            return (Criteria) this;
        }

        public Criteria andFkRoleIdLike(String value) {
            addCriterion("FK_ROLE_ID like", value, "fkRoleId");
            return (Criteria) this;
        }

        public Criteria andFkRoleIdNotLike(String value) {
            addCriterion("FK_ROLE_ID not like", value, "fkRoleId");
            return (Criteria) this;
        }

        public Criteria andFkRoleIdIn(List<String> values) {
            addCriterion("FK_ROLE_ID in", values, "fkRoleId");
            return (Criteria) this;
        }

        public Criteria andFkRoleIdNotIn(List<String> values) {
            addCriterion("FK_ROLE_ID not in", values, "fkRoleId");
            return (Criteria) this;
        }

        public Criteria andFkRoleIdBetween(String value1, String value2) {
            addCriterion("FK_ROLE_ID between", value1, value2, "fkRoleId");
            return (Criteria) this;
        }

        public Criteria andFkRoleIdNotBetween(String value1, String value2) {
            addCriterion("FK_ROLE_ID not between", value1, value2, "fkRoleId");
            return (Criteria) this;
        }

        public Criteria andFkPermissionIdIsNull() {
            addCriterion("FK_PERMISSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andFkPermissionIdIsNotNull() {
            addCriterion("FK_PERMISSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFkPermissionIdEqualTo(String value) {
            addCriterion("FK_PERMISSION_ID =", value, "fkPermissionId");
            return (Criteria) this;
        }

        public Criteria andFkPermissionIdNotEqualTo(String value) {
            addCriterion("FK_PERMISSION_ID <>", value, "fkPermissionId");
            return (Criteria) this;
        }

        public Criteria andFkPermissionIdGreaterThan(String value) {
            addCriterion("FK_PERMISSION_ID >", value, "fkPermissionId");
            return (Criteria) this;
        }

        public Criteria andFkPermissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("FK_PERMISSION_ID >=", value, "fkPermissionId");
            return (Criteria) this;
        }

        public Criteria andFkPermissionIdLessThan(String value) {
            addCriterion("FK_PERMISSION_ID <", value, "fkPermissionId");
            return (Criteria) this;
        }

        public Criteria andFkPermissionIdLessThanOrEqualTo(String value) {
            addCriterion("FK_PERMISSION_ID <=", value, "fkPermissionId");
            return (Criteria) this;
        }

        public Criteria andFkPermissionIdLike(String value) {
            addCriterion("FK_PERMISSION_ID like", value, "fkPermissionId");
            return (Criteria) this;
        }

        public Criteria andFkPermissionIdNotLike(String value) {
            addCriterion("FK_PERMISSION_ID not like", value, "fkPermissionId");
            return (Criteria) this;
        }

        public Criteria andFkPermissionIdIn(List<String> values) {
            addCriterion("FK_PERMISSION_ID in", values, "fkPermissionId");
            return (Criteria) this;
        }

        public Criteria andFkPermissionIdNotIn(List<String> values) {
            addCriterion("FK_PERMISSION_ID not in", values, "fkPermissionId");
            return (Criteria) this;
        }

        public Criteria andFkPermissionIdBetween(String value1, String value2) {
            addCriterion("FK_PERMISSION_ID between", value1, value2, "fkPermissionId");
            return (Criteria) this;
        }

        public Criteria andFkPermissionIdNotBetween(String value1, String value2) {
            addCriterion("FK_PERMISSION_ID not between", value1, value2, "fkPermissionId");
            return (Criteria) this;
        }

        public Criteria andDefaultCheckedIsNull() {
            addCriterion("DEFAULT_CHECKED is null");
            return (Criteria) this;
        }

        public Criteria andDefaultCheckedIsNotNull() {
            addCriterion("DEFAULT_CHECKED is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultCheckedEqualTo(Short value) {
            addCriterion("DEFAULT_CHECKED =", value, "defaultChecked");
            return (Criteria) this;
        }

        public Criteria andDefaultCheckedNotEqualTo(Short value) {
            addCriterion("DEFAULT_CHECKED <>", value, "defaultChecked");
            return (Criteria) this;
        }

        public Criteria andDefaultCheckedGreaterThan(Short value) {
            addCriterion("DEFAULT_CHECKED >", value, "defaultChecked");
            return (Criteria) this;
        }

        public Criteria andDefaultCheckedGreaterThanOrEqualTo(Short value) {
            addCriterion("DEFAULT_CHECKED >=", value, "defaultChecked");
            return (Criteria) this;
        }

        public Criteria andDefaultCheckedLessThan(Short value) {
            addCriterion("DEFAULT_CHECKED <", value, "defaultChecked");
            return (Criteria) this;
        }

        public Criteria andDefaultCheckedLessThanOrEqualTo(Short value) {
            addCriterion("DEFAULT_CHECKED <=", value, "defaultChecked");
            return (Criteria) this;
        }

        public Criteria andDefaultCheckedIn(List<Short> values) {
            addCriterion("DEFAULT_CHECKED in", values, "defaultChecked");
            return (Criteria) this;
        }

        public Criteria andDefaultCheckedNotIn(List<Short> values) {
            addCriterion("DEFAULT_CHECKED not in", values, "defaultChecked");
            return (Criteria) this;
        }

        public Criteria andDefaultCheckedBetween(Short value1, Short value2) {
            addCriterion("DEFAULT_CHECKED between", value1, value2, "defaultChecked");
            return (Criteria) this;
        }

        public Criteria andDefaultCheckedNotBetween(Short value1, Short value2) {
            addCriterion("DEFAULT_CHECKED not between", value1, value2, "defaultChecked");
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
     * F_ROLEPERMISSION
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_ROLEPERMISSION null
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