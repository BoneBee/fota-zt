package com.intest.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OptionBtoExample {
    /**
     * F_OPTION
     */
    protected String orderByClause;

    /**
     * F_OPTION
     */
    protected boolean distinct;

    /**
     * F_OPTION
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public OptionBtoExample() {
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
     * F_OPTION null
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

        public Criteria andOptionIdIsNull() {
            addCriterion("OPTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andOptionIdIsNotNull() {
            addCriterion("OPTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOptionIdEqualTo(String value) {
            addCriterion("OPTION_ID =", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotEqualTo(String value) {
            addCriterion("OPTION_ID <>", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdGreaterThan(String value) {
            addCriterion("OPTION_ID >", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPTION_ID >=", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdLessThan(String value) {
            addCriterion("OPTION_ID <", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdLessThanOrEqualTo(String value) {
            addCriterion("OPTION_ID <=", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdLike(String value) {
            addCriterion("OPTION_ID like", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotLike(String value) {
            addCriterion("OPTION_ID not like", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdIn(List<String> values) {
            addCriterion("OPTION_ID in", values, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotIn(List<String> values) {
            addCriterion("OPTION_ID not in", values, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdBetween(String value1, String value2) {
            addCriterion("OPTION_ID between", value1, value2, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotBetween(String value1, String value2) {
            addCriterion("OPTION_ID not between", value1, value2, "optionId");
            return (Criteria) this;
        }

        public Criteria andKindIsNull() {
            addCriterion("KIND is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("KIND is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(Short value) {
            addCriterion("KIND =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(Short value) {
            addCriterion("KIND <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(Short value) {
            addCriterion("KIND >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(Short value) {
            addCriterion("KIND >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(Short value) {
            addCriterion("KIND <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(Short value) {
            addCriterion("KIND <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<Short> values) {
            addCriterion("KIND in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<Short> values) {
            addCriterion("KIND not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(Short value1, Short value2) {
            addCriterion("KIND between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(Short value1, Short value2) {
            addCriterion("KIND not between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andDateTypeIsNull() {
            addCriterion("DATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDateTypeIsNotNull() {
            addCriterion("DATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDateTypeEqualTo(Short value) {
            addCriterion("DATE_TYPE =", value, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeNotEqualTo(Short value) {
            addCriterion("DATE_TYPE <>", value, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeGreaterThan(Short value) {
            addCriterion("DATE_TYPE >", value, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("DATE_TYPE >=", value, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeLessThan(Short value) {
            addCriterion("DATE_TYPE <", value, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeLessThanOrEqualTo(Short value) {
            addCriterion("DATE_TYPE <=", value, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeIn(List<Short> values) {
            addCriterion("DATE_TYPE in", values, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeNotIn(List<Short> values) {
            addCriterion("DATE_TYPE not in", values, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeBetween(Short value1, Short value2) {
            addCriterion("DATE_TYPE between", value1, value2, "dateType");
            return (Criteria) this;
        }

        public Criteria andDateTypeNotBetween(Short value1, Short value2) {
            addCriterion("DATE_TYPE not between", value1, value2, "dateType");
            return (Criteria) this;
        }

        public Criteria andMaxLengthIsNull() {
            addCriterion("MAX_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andMaxLengthIsNotNull() {
            addCriterion("MAX_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andMaxLengthEqualTo(Integer value) {
            addCriterion("MAX_LENGTH =", value, "maxLength");
            return (Criteria) this;
        }

        public Criteria andMaxLengthNotEqualTo(Integer value) {
            addCriterion("MAX_LENGTH <>", value, "maxLength");
            return (Criteria) this;
        }

        public Criteria andMaxLengthGreaterThan(Integer value) {
            addCriterion("MAX_LENGTH >", value, "maxLength");
            return (Criteria) this;
        }

        public Criteria andMaxLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAX_LENGTH >=", value, "maxLength");
            return (Criteria) this;
        }

        public Criteria andMaxLengthLessThan(Integer value) {
            addCriterion("MAX_LENGTH <", value, "maxLength");
            return (Criteria) this;
        }

        public Criteria andMaxLengthLessThanOrEqualTo(Integer value) {
            addCriterion("MAX_LENGTH <=", value, "maxLength");
            return (Criteria) this;
        }

        public Criteria andMaxLengthIn(List<Integer> values) {
            addCriterion("MAX_LENGTH in", values, "maxLength");
            return (Criteria) this;
        }

        public Criteria andMaxLengthNotIn(List<Integer> values) {
            addCriterion("MAX_LENGTH not in", values, "maxLength");
            return (Criteria) this;
        }

        public Criteria andMaxLengthBetween(Integer value1, Integer value2) {
            addCriterion("MAX_LENGTH between", value1, value2, "maxLength");
            return (Criteria) this;
        }

        public Criteria andMaxLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("MAX_LENGTH not between", value1, value2, "maxLength");
            return (Criteria) this;
        }

        public Criteria andMinLengthIsNull() {
            addCriterion("MIN_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andMinLengthIsNotNull() {
            addCriterion("MIN_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andMinLengthEqualTo(Integer value) {
            addCriterion("MIN_LENGTH =", value, "minLength");
            return (Criteria) this;
        }

        public Criteria andMinLengthNotEqualTo(Integer value) {
            addCriterion("MIN_LENGTH <>", value, "minLength");
            return (Criteria) this;
        }

        public Criteria andMinLengthGreaterThan(Integer value) {
            addCriterion("MIN_LENGTH >", value, "minLength");
            return (Criteria) this;
        }

        public Criteria andMinLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("MIN_LENGTH >=", value, "minLength");
            return (Criteria) this;
        }

        public Criteria andMinLengthLessThan(Integer value) {
            addCriterion("MIN_LENGTH <", value, "minLength");
            return (Criteria) this;
        }

        public Criteria andMinLengthLessThanOrEqualTo(Integer value) {
            addCriterion("MIN_LENGTH <=", value, "minLength");
            return (Criteria) this;
        }

        public Criteria andMinLengthIn(List<Integer> values) {
            addCriterion("MIN_LENGTH in", values, "minLength");
            return (Criteria) this;
        }

        public Criteria andMinLengthNotIn(List<Integer> values) {
            addCriterion("MIN_LENGTH not in", values, "minLength");
            return (Criteria) this;
        }

        public Criteria andMinLengthBetween(Integer value1, Integer value2) {
            addCriterion("MIN_LENGTH between", value1, value2, "minLength");
            return (Criteria) this;
        }

        public Criteria andMinLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("MIN_LENGTH not between", value1, value2, "minLength");
            return (Criteria) this;
        }

        public Criteria andMaxNumIsNull() {
            addCriterion("MAX_NUM is null");
            return (Criteria) this;
        }

        public Criteria andMaxNumIsNotNull() {
            addCriterion("MAX_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNumEqualTo(Integer value) {
            addCriterion("MAX_NUM =", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotEqualTo(Integer value) {
            addCriterion("MAX_NUM <>", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumGreaterThan(Integer value) {
            addCriterion("MAX_NUM >", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAX_NUM >=", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumLessThan(Integer value) {
            addCriterion("MAX_NUM <", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumLessThanOrEqualTo(Integer value) {
            addCriterion("MAX_NUM <=", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumIn(List<Integer> values) {
            addCriterion("MAX_NUM in", values, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotIn(List<Integer> values) {
            addCriterion("MAX_NUM not in", values, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumBetween(Integer value1, Integer value2) {
            addCriterion("MAX_NUM between", value1, value2, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotBetween(Integer value1, Integer value2) {
            addCriterion("MAX_NUM not between", value1, value2, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMinNumIsNull() {
            addCriterion("MIN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andMinNumIsNotNull() {
            addCriterion("MIN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andMinNumEqualTo(Integer value) {
            addCriterion("MIN_NUM =", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumNotEqualTo(Integer value) {
            addCriterion("MIN_NUM <>", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumGreaterThan(Integer value) {
            addCriterion("MIN_NUM >", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("MIN_NUM >=", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumLessThan(Integer value) {
            addCriterion("MIN_NUM <", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumLessThanOrEqualTo(Integer value) {
            addCriterion("MIN_NUM <=", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumIn(List<Integer> values) {
            addCriterion("MIN_NUM in", values, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumNotIn(List<Integer> values) {
            addCriterion("MIN_NUM not in", values, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumBetween(Integer value1, Integer value2) {
            addCriterion("MIN_NUM between", value1, value2, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumNotBetween(Integer value1, Integer value2) {
            addCriterion("MIN_NUM not between", value1, value2, "minNum");
            return (Criteria) this;
        }

        public Criteria andRegularTextIsNull() {
            addCriterion("REGULAR_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andRegularTextIsNotNull() {
            addCriterion("REGULAR_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andRegularTextEqualTo(String value) {
            addCriterion("REGULAR_TEXT =", value, "regularText");
            return (Criteria) this;
        }

        public Criteria andRegularTextNotEqualTo(String value) {
            addCriterion("REGULAR_TEXT <>", value, "regularText");
            return (Criteria) this;
        }

        public Criteria andRegularTextGreaterThan(String value) {
            addCriterion("REGULAR_TEXT >", value, "regularText");
            return (Criteria) this;
        }

        public Criteria andRegularTextGreaterThanOrEqualTo(String value) {
            addCriterion("REGULAR_TEXT >=", value, "regularText");
            return (Criteria) this;
        }

        public Criteria andRegularTextLessThan(String value) {
            addCriterion("REGULAR_TEXT <", value, "regularText");
            return (Criteria) this;
        }

        public Criteria andRegularTextLessThanOrEqualTo(String value) {
            addCriterion("REGULAR_TEXT <=", value, "regularText");
            return (Criteria) this;
        }

        public Criteria andRegularTextLike(String value) {
            addCriterion("REGULAR_TEXT like", value, "regularText");
            return (Criteria) this;
        }

        public Criteria andRegularTextNotLike(String value) {
            addCriterion("REGULAR_TEXT not like", value, "regularText");
            return (Criteria) this;
        }

        public Criteria andRegularTextIn(List<String> values) {
            addCriterion("REGULAR_TEXT in", values, "regularText");
            return (Criteria) this;
        }

        public Criteria andRegularTextNotIn(List<String> values) {
            addCriterion("REGULAR_TEXT not in", values, "regularText");
            return (Criteria) this;
        }

        public Criteria andRegularTextBetween(String value1, String value2) {
            addCriterion("REGULAR_TEXT between", value1, value2, "regularText");
            return (Criteria) this;
        }

        public Criteria andRegularTextNotBetween(String value1, String value2) {
            addCriterion("REGULAR_TEXT not between", value1, value2, "regularText");
            return (Criteria) this;
        }

        public Criteria andDateFormatIsNull() {
            addCriterion("DATE_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andDateFormatIsNotNull() {
            addCriterion("DATE_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andDateFormatEqualTo(String value) {
            addCriterion("DATE_FORMAT =", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatNotEqualTo(String value) {
            addCriterion("DATE_FORMAT <>", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatGreaterThan(String value) {
            addCriterion("DATE_FORMAT >", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatGreaterThanOrEqualTo(String value) {
            addCriterion("DATE_FORMAT >=", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatLessThan(String value) {
            addCriterion("DATE_FORMAT <", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatLessThanOrEqualTo(String value) {
            addCriterion("DATE_FORMAT <=", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatLike(String value) {
            addCriterion("DATE_FORMAT like", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatNotLike(String value) {
            addCriterion("DATE_FORMAT not like", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatIn(List<String> values) {
            addCriterion("DATE_FORMAT in", values, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatNotIn(List<String> values) {
            addCriterion("DATE_FORMAT not in", values, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatBetween(String value1, String value2) {
            addCriterion("DATE_FORMAT between", value1, value2, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatNotBetween(String value1, String value2) {
            addCriterion("DATE_FORMAT not between", value1, value2, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsIsNull() {
            addCriterion("QUERY_FIELDS is null");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsIsNotNull() {
            addCriterion("QUERY_FIELDS is not null");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsEqualTo(String value) {
            addCriterion("QUERY_FIELDS =", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsNotEqualTo(String value) {
            addCriterion("QUERY_FIELDS <>", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsGreaterThan(String value) {
            addCriterion("QUERY_FIELDS >", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsGreaterThanOrEqualTo(String value) {
            addCriterion("QUERY_FIELDS >=", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsLessThan(String value) {
            addCriterion("QUERY_FIELDS <", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsLessThanOrEqualTo(String value) {
            addCriterion("QUERY_FIELDS <=", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsLike(String value) {
            addCriterion("QUERY_FIELDS like", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsNotLike(String value) {
            addCriterion("QUERY_FIELDS not like", value, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsIn(List<String> values) {
            addCriterion("QUERY_FIELDS in", values, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsNotIn(List<String> values) {
            addCriterion("QUERY_FIELDS not in", values, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsBetween(String value1, String value2) {
            addCriterion("QUERY_FIELDS between", value1, value2, "queryFields");
            return (Criteria) this;
        }

        public Criteria andQueryFieldsNotBetween(String value1, String value2) {
            addCriterion("QUERY_FIELDS not between", value1, value2, "queryFields");
            return (Criteria) this;
        }

        public Criteria andListoffilterIsNull() {
            addCriterion("LISTOFFILTER is null");
            return (Criteria) this;
        }

        public Criteria andListoffilterIsNotNull() {
            addCriterion("LISTOFFILTER is not null");
            return (Criteria) this;
        }

        public Criteria andListoffilterEqualTo(String value) {
            addCriterion("LISTOFFILTER =", value, "listoffilter");
            return (Criteria) this;
        }

        public Criteria andListoffilterNotEqualTo(String value) {
            addCriterion("LISTOFFILTER <>", value, "listoffilter");
            return (Criteria) this;
        }

        public Criteria andListoffilterGreaterThan(String value) {
            addCriterion("LISTOFFILTER >", value, "listoffilter");
            return (Criteria) this;
        }

        public Criteria andListoffilterGreaterThanOrEqualTo(String value) {
            addCriterion("LISTOFFILTER >=", value, "listoffilter");
            return (Criteria) this;
        }

        public Criteria andListoffilterLessThan(String value) {
            addCriterion("LISTOFFILTER <", value, "listoffilter");
            return (Criteria) this;
        }

        public Criteria andListoffilterLessThanOrEqualTo(String value) {
            addCriterion("LISTOFFILTER <=", value, "listoffilter");
            return (Criteria) this;
        }

        public Criteria andListoffilterLike(String value) {
            addCriterion("LISTOFFILTER like", value, "listoffilter");
            return (Criteria) this;
        }

        public Criteria andListoffilterNotLike(String value) {
            addCriterion("LISTOFFILTER not like", value, "listoffilter");
            return (Criteria) this;
        }

        public Criteria andListoffilterIn(List<String> values) {
            addCriterion("LISTOFFILTER in", values, "listoffilter");
            return (Criteria) this;
        }

        public Criteria andListoffilterNotIn(List<String> values) {
            addCriterion("LISTOFFILTER not in", values, "listoffilter");
            return (Criteria) this;
        }

        public Criteria andListoffilterBetween(String value1, String value2) {
            addCriterion("LISTOFFILTER between", value1, value2, "listoffilter");
            return (Criteria) this;
        }

        public Criteria andListoffilterNotBetween(String value1, String value2) {
            addCriterion("LISTOFFILTER not between", value1, value2, "listoffilter");
            return (Criteria) this;
        }

        public Criteria andDateSourceKindIsNull() {
            addCriterion("DATE_SOURCE_KIND is null");
            return (Criteria) this;
        }

        public Criteria andDateSourceKindIsNotNull() {
            addCriterion("DATE_SOURCE_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andDateSourceKindEqualTo(Short value) {
            addCriterion("DATE_SOURCE_KIND =", value, "dateSourceKind");
            return (Criteria) this;
        }

        public Criteria andDateSourceKindNotEqualTo(Short value) {
            addCriterion("DATE_SOURCE_KIND <>", value, "dateSourceKind");
            return (Criteria) this;
        }

        public Criteria andDateSourceKindGreaterThan(Short value) {
            addCriterion("DATE_SOURCE_KIND >", value, "dateSourceKind");
            return (Criteria) this;
        }

        public Criteria andDateSourceKindGreaterThanOrEqualTo(Short value) {
            addCriterion("DATE_SOURCE_KIND >=", value, "dateSourceKind");
            return (Criteria) this;
        }

        public Criteria andDateSourceKindLessThan(Short value) {
            addCriterion("DATE_SOURCE_KIND <", value, "dateSourceKind");
            return (Criteria) this;
        }

        public Criteria andDateSourceKindLessThanOrEqualTo(Short value) {
            addCriterion("DATE_SOURCE_KIND <=", value, "dateSourceKind");
            return (Criteria) this;
        }

        public Criteria andDateSourceKindIn(List<Short> values) {
            addCriterion("DATE_SOURCE_KIND in", values, "dateSourceKind");
            return (Criteria) this;
        }

        public Criteria andDateSourceKindNotIn(List<Short> values) {
            addCriterion("DATE_SOURCE_KIND not in", values, "dateSourceKind");
            return (Criteria) this;
        }

        public Criteria andDateSourceKindBetween(Short value1, Short value2) {
            addCriterion("DATE_SOURCE_KIND between", value1, value2, "dateSourceKind");
            return (Criteria) this;
        }

        public Criteria andDateSourceKindNotBetween(Short value1, Short value2) {
            addCriterion("DATE_SOURCE_KIND not between", value1, value2, "dateSourceKind");
            return (Criteria) this;
        }

        public Criteria andValueRangeIsNull() {
            addCriterion("VALUE_RANGE is null");
            return (Criteria) this;
        }

        public Criteria andValueRangeIsNotNull() {
            addCriterion("VALUE_RANGE is not null");
            return (Criteria) this;
        }

        public Criteria andValueRangeEqualTo(String value) {
            addCriterion("VALUE_RANGE =", value, "valueRange");
            return (Criteria) this;
        }

        public Criteria andValueRangeNotEqualTo(String value) {
            addCriterion("VALUE_RANGE <>", value, "valueRange");
            return (Criteria) this;
        }

        public Criteria andValueRangeGreaterThan(String value) {
            addCriterion("VALUE_RANGE >", value, "valueRange");
            return (Criteria) this;
        }

        public Criteria andValueRangeGreaterThanOrEqualTo(String value) {
            addCriterion("VALUE_RANGE >=", value, "valueRange");
            return (Criteria) this;
        }

        public Criteria andValueRangeLessThan(String value) {
            addCriterion("VALUE_RANGE <", value, "valueRange");
            return (Criteria) this;
        }

        public Criteria andValueRangeLessThanOrEqualTo(String value) {
            addCriterion("VALUE_RANGE <=", value, "valueRange");
            return (Criteria) this;
        }

        public Criteria andValueRangeLike(String value) {
            addCriterion("VALUE_RANGE like", value, "valueRange");
            return (Criteria) this;
        }

        public Criteria andValueRangeNotLike(String value) {
            addCriterion("VALUE_RANGE not like", value, "valueRange");
            return (Criteria) this;
        }

        public Criteria andValueRangeIn(List<String> values) {
            addCriterion("VALUE_RANGE in", values, "valueRange");
            return (Criteria) this;
        }

        public Criteria andValueRangeNotIn(List<String> values) {
            addCriterion("VALUE_RANGE not in", values, "valueRange");
            return (Criteria) this;
        }

        public Criteria andValueRangeBetween(String value1, String value2) {
            addCriterion("VALUE_RANGE between", value1, value2, "valueRange");
            return (Criteria) this;
        }

        public Criteria andValueRangeNotBetween(String value1, String value2) {
            addCriterion("VALUE_RANGE not between", value1, value2, "valueRange");
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

        public Criteria andFieldTextIsNull() {
            addCriterion("FIELD_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andFieldTextIsNotNull() {
            addCriterion("FIELD_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andFieldTextEqualTo(String value) {
            addCriterion("FIELD_TEXT =", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextNotEqualTo(String value) {
            addCriterion("FIELD_TEXT <>", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextGreaterThan(String value) {
            addCriterion("FIELD_TEXT >", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_TEXT >=", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextLessThan(String value) {
            addCriterion("FIELD_TEXT <", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextLessThanOrEqualTo(String value) {
            addCriterion("FIELD_TEXT <=", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextLike(String value) {
            addCriterion("FIELD_TEXT like", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextNotLike(String value) {
            addCriterion("FIELD_TEXT not like", value, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextIn(List<String> values) {
            addCriterion("FIELD_TEXT in", values, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextNotIn(List<String> values) {
            addCriterion("FIELD_TEXT not in", values, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextBetween(String value1, String value2) {
            addCriterion("FIELD_TEXT between", value1, value2, "fieldText");
            return (Criteria) this;
        }

        public Criteria andFieldTextNotBetween(String value1, String value2) {
            addCriterion("FIELD_TEXT not between", value1, value2, "fieldText");
            return (Criteria) this;
        }
    }

    /**
     * F_OPTION
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_OPTION null
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