package com.intest.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class TerminalBtoExample {
    /**
     * F_TERMINAL
     */
    protected String orderByClause;

    /**
     * F_TERMINAL
     */
    protected boolean distinct;

    /**
     * F_TERMINAL
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public TerminalBtoExample() {
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
     * F_TERMINAL null
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

        public Criteria andTerminalIdIsNull() {
            addCriterion("TERMINAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNotNull() {
            addCriterion("TERMINAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdEqualTo(String value) {
            addCriterion("TERMINAL_ID =", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotEqualTo(String value) {
            addCriterion("TERMINAL_ID <>", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThan(String value) {
            addCriterion("TERMINAL_ID >", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_ID >=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThan(String value) {
            addCriterion("TERMINAL_ID <", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_ID <=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLike(String value) {
            addCriterion("TERMINAL_ID like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotLike(String value) {
            addCriterion("TERMINAL_ID not like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIn(List<String> values) {
            addCriterion("TERMINAL_ID in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotIn(List<String> values) {
            addCriterion("TERMINAL_ID not in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdBetween(String value1, String value2) {
            addCriterion("TERMINAL_ID between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_ID not between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalnameIsNull() {
            addCriterion("TERMINALNAME is null");
            return (Criteria) this;
        }

        public Criteria andTerminalnameIsNotNull() {
            addCriterion("TERMINALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalnameEqualTo(String value) {
            addCriterion("TERMINALNAME =", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameNotEqualTo(String value) {
            addCriterion("TERMINALNAME <>", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameGreaterThan(String value) {
            addCriterion("TERMINALNAME >", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINALNAME >=", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameLessThan(String value) {
            addCriterion("TERMINALNAME <", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameLessThanOrEqualTo(String value) {
            addCriterion("TERMINALNAME <=", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameLike(String value) {
            addCriterion("TERMINALNAME like", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameNotLike(String value) {
            addCriterion("TERMINALNAME not like", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameIn(List<String> values) {
            addCriterion("TERMINALNAME in", values, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameNotIn(List<String> values) {
            addCriterion("TERMINALNAME not in", values, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameBetween(String value1, String value2) {
            addCriterion("TERMINALNAME between", value1, value2, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameNotBetween(String value1, String value2) {
            addCriterion("TERMINALNAME not between", value1, value2, "terminalname");
            return (Criteria) this;
        }

        public Criteria andPcompanyIsNull() {
            addCriterion("PCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andPcompanyIsNotNull() {
            addCriterion("PCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andPcompanyEqualTo(String value) {
            addCriterion("PCOMPANY =", value, "pcompany");
            return (Criteria) this;
        }

        public Criteria andPcompanyNotEqualTo(String value) {
            addCriterion("PCOMPANY <>", value, "pcompany");
            return (Criteria) this;
        }

        public Criteria andPcompanyGreaterThan(String value) {
            addCriterion("PCOMPANY >", value, "pcompany");
            return (Criteria) this;
        }

        public Criteria andPcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("PCOMPANY >=", value, "pcompany");
            return (Criteria) this;
        }

        public Criteria andPcompanyLessThan(String value) {
            addCriterion("PCOMPANY <", value, "pcompany");
            return (Criteria) this;
        }

        public Criteria andPcompanyLessThanOrEqualTo(String value) {
            addCriterion("PCOMPANY <=", value, "pcompany");
            return (Criteria) this;
        }

        public Criteria andPcompanyLike(String value) {
            addCriterion("PCOMPANY like", value, "pcompany");
            return (Criteria) this;
        }

        public Criteria andPcompanyNotLike(String value) {
            addCriterion("PCOMPANY not like", value, "pcompany");
            return (Criteria) this;
        }

        public Criteria andPcompanyIn(List<String> values) {
            addCriterion("PCOMPANY in", values, "pcompany");
            return (Criteria) this;
        }

        public Criteria andPcompanyNotIn(List<String> values) {
            addCriterion("PCOMPANY not in", values, "pcompany");
            return (Criteria) this;
        }

        public Criteria andPcompanyBetween(String value1, String value2) {
            addCriterion("PCOMPANY between", value1, value2, "pcompany");
            return (Criteria) this;
        }

        public Criteria andPcompanyNotBetween(String value1, String value2) {
            addCriterion("PCOMPANY not between", value1, value2, "pcompany");
            return (Criteria) this;
        }
    }

    /**
     * F_TERMINAL
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_TERMINAL null
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