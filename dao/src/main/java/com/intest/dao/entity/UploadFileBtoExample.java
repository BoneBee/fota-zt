package com.intest.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UploadFileBtoExample {
    /**
     * F_UPLOADFILE
     */
    protected String orderByClause;

    /**
     * F_UPLOADFILE
     */
    protected boolean distinct;

    /**
     * F_UPLOADFILE
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public UploadFileBtoExample() {
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
     * F_UPLOADFILE null
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

        public Criteria andUploadfileIdIsNull() {
            addCriterion("UPLOADFILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUploadfileIdIsNotNull() {
            addCriterion("UPLOADFILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUploadfileIdEqualTo(String value) {
            addCriterion("UPLOADFILE_ID =", value, "uploadfileId");
            return (Criteria) this;
        }

        public Criteria andUploadfileIdNotEqualTo(String value) {
            addCriterion("UPLOADFILE_ID <>", value, "uploadfileId");
            return (Criteria) this;
        }

        public Criteria andUploadfileIdGreaterThan(String value) {
            addCriterion("UPLOADFILE_ID >", value, "uploadfileId");
            return (Criteria) this;
        }

        public Criteria andUploadfileIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOADFILE_ID >=", value, "uploadfileId");
            return (Criteria) this;
        }

        public Criteria andUploadfileIdLessThan(String value) {
            addCriterion("UPLOADFILE_ID <", value, "uploadfileId");
            return (Criteria) this;
        }

        public Criteria andUploadfileIdLessThanOrEqualTo(String value) {
            addCriterion("UPLOADFILE_ID <=", value, "uploadfileId");
            return (Criteria) this;
        }

        public Criteria andUploadfileIdLike(String value) {
            addCriterion("UPLOADFILE_ID like", value, "uploadfileId");
            return (Criteria) this;
        }

        public Criteria andUploadfileIdNotLike(String value) {
            addCriterion("UPLOADFILE_ID not like", value, "uploadfileId");
            return (Criteria) this;
        }

        public Criteria andUploadfileIdIn(List<String> values) {
            addCriterion("UPLOADFILE_ID in", values, "uploadfileId");
            return (Criteria) this;
        }

        public Criteria andUploadfileIdNotIn(List<String> values) {
            addCriterion("UPLOADFILE_ID not in", values, "uploadfileId");
            return (Criteria) this;
        }

        public Criteria andUploadfileIdBetween(String value1, String value2) {
            addCriterion("UPLOADFILE_ID between", value1, value2, "uploadfileId");
            return (Criteria) this;
        }

        public Criteria andUploadfileIdNotBetween(String value1, String value2) {
            addCriterion("UPLOADFILE_ID not between", value1, value2, "uploadfileId");
            return (Criteria) this;
        }

        public Criteria andOriginalnameIsNull() {
            addCriterion("ORIGINALNAME is null");
            return (Criteria) this;
        }

        public Criteria andOriginalnameIsNotNull() {
            addCriterion("ORIGINALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalnameEqualTo(String value) {
            addCriterion("ORIGINALNAME =", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameNotEqualTo(String value) {
            addCriterion("ORIGINALNAME <>", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameGreaterThan(String value) {
            addCriterion("ORIGINALNAME >", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINALNAME >=", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameLessThan(String value) {
            addCriterion("ORIGINALNAME <", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameLessThanOrEqualTo(String value) {
            addCriterion("ORIGINALNAME <=", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameLike(String value) {
            addCriterion("ORIGINALNAME like", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameNotLike(String value) {
            addCriterion("ORIGINALNAME not like", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameIn(List<String> values) {
            addCriterion("ORIGINALNAME in", values, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameNotIn(List<String> values) {
            addCriterion("ORIGINALNAME not in", values, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameBetween(String value1, String value2) {
            addCriterion("ORIGINALNAME between", value1, value2, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameNotBetween(String value1, String value2) {
            addCriterion("ORIGINALNAME not between", value1, value2, "originalname");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNull() {
            addCriterion("FILESIZE is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("FILESIZE is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(Long value) {
            addCriterion("FILESIZE =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(Long value) {
            addCriterion("FILESIZE <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(Long value) {
            addCriterion("FILESIZE >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(Long value) {
            addCriterion("FILESIZE >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(Long value) {
            addCriterion("FILESIZE <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(Long value) {
            addCriterion("FILESIZE <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<Long> values) {
            addCriterion("FILESIZE in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<Long> values) {
            addCriterion("FILESIZE not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(Long value1, Long value2) {
            addCriterion("FILESIZE between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(Long value1, Long value2) {
            addCriterion("FILESIZE not between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateIsNull() {
            addCriterion("LASTMODIFIEDDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateIsNotNull() {
            addCriterion("LASTMODIFIEDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateEqualTo(Date value) {
            addCriterion("LASTMODIFIEDDATE =", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateNotEqualTo(Date value) {
            addCriterion("LASTMODIFIEDDATE <>", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateGreaterThan(Date value) {
            addCriterion("LASTMODIFIEDDATE >", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFIEDDATE >=", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateLessThan(Date value) {
            addCriterion("LASTMODIFIEDDATE <", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateLessThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFIEDDATE <=", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateIn(List<Date> values) {
            addCriterion("LASTMODIFIEDDATE in", values, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateNotIn(List<Date> values) {
            addCriterion("LASTMODIFIEDDATE not in", values, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFIEDDATE between", value1, value2, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateNotBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFIEDDATE not between", value1, value2, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andUploadtypeIsNull() {
            addCriterion("UPLOADTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUploadtypeIsNotNull() {
            addCriterion("UPLOADTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtypeEqualTo(Short value) {
            addCriterion("UPLOADTYPE =", value, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeNotEqualTo(Short value) {
            addCriterion("UPLOADTYPE <>", value, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeGreaterThan(Short value) {
            addCriterion("UPLOADTYPE >", value, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeGreaterThanOrEqualTo(Short value) {
            addCriterion("UPLOADTYPE >=", value, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeLessThan(Short value) {
            addCriterion("UPLOADTYPE <", value, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeLessThanOrEqualTo(Short value) {
            addCriterion("UPLOADTYPE <=", value, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeIn(List<Short> values) {
            addCriterion("UPLOADTYPE in", values, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeNotIn(List<Short> values) {
            addCriterion("UPLOADTYPE not in", values, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeBetween(Short value1, Short value2) {
            addCriterion("UPLOADTYPE between", value1, value2, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andUploadtypeNotBetween(Short value1, Short value2) {
            addCriterion("UPLOADTYPE not between", value1, value2, "uploadtype");
            return (Criteria) this;
        }

        public Criteria andFkValuelistKeyIsNull() {
            addCriterion("FK_VALUELIST_KEY is null");
            return (Criteria) this;
        }

        public Criteria andFkValuelistKeyIsNotNull() {
            addCriterion("FK_VALUELIST_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andFkValuelistKeyEqualTo(String value) {
            addCriterion("FK_VALUELIST_KEY =", value, "fkValuelistKey");
            return (Criteria) this;
        }

        public Criteria andFkValuelistKeyNotEqualTo(String value) {
            addCriterion("FK_VALUELIST_KEY <>", value, "fkValuelistKey");
            return (Criteria) this;
        }

        public Criteria andFkValuelistKeyGreaterThan(String value) {
            addCriterion("FK_VALUELIST_KEY >", value, "fkValuelistKey");
            return (Criteria) this;
        }

        public Criteria andFkValuelistKeyGreaterThanOrEqualTo(String value) {
            addCriterion("FK_VALUELIST_KEY >=", value, "fkValuelistKey");
            return (Criteria) this;
        }

        public Criteria andFkValuelistKeyLessThan(String value) {
            addCriterion("FK_VALUELIST_KEY <", value, "fkValuelistKey");
            return (Criteria) this;
        }

        public Criteria andFkValuelistKeyLessThanOrEqualTo(String value) {
            addCriterion("FK_VALUELIST_KEY <=", value, "fkValuelistKey");
            return (Criteria) this;
        }

        public Criteria andFkValuelistKeyLike(String value) {
            addCriterion("FK_VALUELIST_KEY like", value, "fkValuelistKey");
            return (Criteria) this;
        }

        public Criteria andFkValuelistKeyNotLike(String value) {
            addCriterion("FK_VALUELIST_KEY not like", value, "fkValuelistKey");
            return (Criteria) this;
        }

        public Criteria andFkValuelistKeyIn(List<String> values) {
            addCriterion("FK_VALUELIST_KEY in", values, "fkValuelistKey");
            return (Criteria) this;
        }

        public Criteria andFkValuelistKeyNotIn(List<String> values) {
            addCriterion("FK_VALUELIST_KEY not in", values, "fkValuelistKey");
            return (Criteria) this;
        }

        public Criteria andFkValuelistKeyBetween(String value1, String value2) {
            addCriterion("FK_VALUELIST_KEY between", value1, value2, "fkValuelistKey");
            return (Criteria) this;
        }

        public Criteria andFkValuelistKeyNotBetween(String value1, String value2) {
            addCriterion("FK_VALUELIST_KEY not between", value1, value2, "fkValuelistKey");
            return (Criteria) this;
        }

        public Criteria andServersidepathIsNull() {
            addCriterion("SERVERSIDEPATH is null");
            return (Criteria) this;
        }

        public Criteria andServersidepathIsNotNull() {
            addCriterion("SERVERSIDEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andServersidepathEqualTo(String value) {
            addCriterion("SERVERSIDEPATH =", value, "serversidepath");
            return (Criteria) this;
        }

        public Criteria andServersidepathNotEqualTo(String value) {
            addCriterion("SERVERSIDEPATH <>", value, "serversidepath");
            return (Criteria) this;
        }

        public Criteria andServersidepathGreaterThan(String value) {
            addCriterion("SERVERSIDEPATH >", value, "serversidepath");
            return (Criteria) this;
        }

        public Criteria andServersidepathGreaterThanOrEqualTo(String value) {
            addCriterion("SERVERSIDEPATH >=", value, "serversidepath");
            return (Criteria) this;
        }

        public Criteria andServersidepathLessThan(String value) {
            addCriterion("SERVERSIDEPATH <", value, "serversidepath");
            return (Criteria) this;
        }

        public Criteria andServersidepathLessThanOrEqualTo(String value) {
            addCriterion("SERVERSIDEPATH <=", value, "serversidepath");
            return (Criteria) this;
        }

        public Criteria andServersidepathLike(String value) {
            addCriterion("SERVERSIDEPATH like", value, "serversidepath");
            return (Criteria) this;
        }

        public Criteria andServersidepathNotLike(String value) {
            addCriterion("SERVERSIDEPATH not like", value, "serversidepath");
            return (Criteria) this;
        }

        public Criteria andServersidepathIn(List<String> values) {
            addCriterion("SERVERSIDEPATH in", values, "serversidepath");
            return (Criteria) this;
        }

        public Criteria andServersidepathNotIn(List<String> values) {
            addCriterion("SERVERSIDEPATH not in", values, "serversidepath");
            return (Criteria) this;
        }

        public Criteria andServersidepathBetween(String value1, String value2) {
            addCriterion("SERVERSIDEPATH between", value1, value2, "serversidepath");
            return (Criteria) this;
        }

        public Criteria andServersidepathNotBetween(String value1, String value2) {
            addCriterion("SERVERSIDEPATH not between", value1, value2, "serversidepath");
            return (Criteria) this;
        }

        public Criteria andUploadedsuccessIsNull() {
            addCriterion("UPLOADEDSUCCESS is null");
            return (Criteria) this;
        }

        public Criteria andUploadedsuccessIsNotNull() {
            addCriterion("UPLOADEDSUCCESS is not null");
            return (Criteria) this;
        }

        public Criteria andUploadedsuccessEqualTo(Short value) {
            addCriterion("UPLOADEDSUCCESS =", value, "uploadedsuccess");
            return (Criteria) this;
        }

        public Criteria andUploadedsuccessNotEqualTo(Short value) {
            addCriterion("UPLOADEDSUCCESS <>", value, "uploadedsuccess");
            return (Criteria) this;
        }

        public Criteria andUploadedsuccessGreaterThan(Short value) {
            addCriterion("UPLOADEDSUCCESS >", value, "uploadedsuccess");
            return (Criteria) this;
        }

        public Criteria andUploadedsuccessGreaterThanOrEqualTo(Short value) {
            addCriterion("UPLOADEDSUCCESS >=", value, "uploadedsuccess");
            return (Criteria) this;
        }

        public Criteria andUploadedsuccessLessThan(Short value) {
            addCriterion("UPLOADEDSUCCESS <", value, "uploadedsuccess");
            return (Criteria) this;
        }

        public Criteria andUploadedsuccessLessThanOrEqualTo(Short value) {
            addCriterion("UPLOADEDSUCCESS <=", value, "uploadedsuccess");
            return (Criteria) this;
        }

        public Criteria andUploadedsuccessIn(List<Short> values) {
            addCriterion("UPLOADEDSUCCESS in", values, "uploadedsuccess");
            return (Criteria) this;
        }

        public Criteria andUploadedsuccessNotIn(List<Short> values) {
            addCriterion("UPLOADEDSUCCESS not in", values, "uploadedsuccess");
            return (Criteria) this;
        }

        public Criteria andUploadedsuccessBetween(Short value1, Short value2) {
            addCriterion("UPLOADEDSUCCESS between", value1, value2, "uploadedsuccess");
            return (Criteria) this;
        }

        public Criteria andUploadedsuccessNotBetween(Short value1, Short value2) {
            addCriterion("UPLOADEDSUCCESS not between", value1, value2, "uploadedsuccess");
            return (Criteria) this;
        }

        public Criteria andBeginuploadingtimeIsNull() {
            addCriterion("BEGINUPLOADINGTIME is null");
            return (Criteria) this;
        }

        public Criteria andBeginuploadingtimeIsNotNull() {
            addCriterion("BEGINUPLOADINGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBeginuploadingtimeEqualTo(Date value) {
            addCriterion("BEGINUPLOADINGTIME =", value, "beginuploadingtime");
            return (Criteria) this;
        }

        public Criteria andBeginuploadingtimeNotEqualTo(Date value) {
            addCriterion("BEGINUPLOADINGTIME <>", value, "beginuploadingtime");
            return (Criteria) this;
        }

        public Criteria andBeginuploadingtimeGreaterThan(Date value) {
            addCriterion("BEGINUPLOADINGTIME >", value, "beginuploadingtime");
            return (Criteria) this;
        }

        public Criteria andBeginuploadingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGINUPLOADINGTIME >=", value, "beginuploadingtime");
            return (Criteria) this;
        }

        public Criteria andBeginuploadingtimeLessThan(Date value) {
            addCriterion("BEGINUPLOADINGTIME <", value, "beginuploadingtime");
            return (Criteria) this;
        }

        public Criteria andBeginuploadingtimeLessThanOrEqualTo(Date value) {
            addCriterion("BEGINUPLOADINGTIME <=", value, "beginuploadingtime");
            return (Criteria) this;
        }

        public Criteria andBeginuploadingtimeIn(List<Date> values) {
            addCriterion("BEGINUPLOADINGTIME in", values, "beginuploadingtime");
            return (Criteria) this;
        }

        public Criteria andBeginuploadingtimeNotIn(List<Date> values) {
            addCriterion("BEGINUPLOADINGTIME not in", values, "beginuploadingtime");
            return (Criteria) this;
        }

        public Criteria andBeginuploadingtimeBetween(Date value1, Date value2) {
            addCriterion("BEGINUPLOADINGTIME between", value1, value2, "beginuploadingtime");
            return (Criteria) this;
        }

        public Criteria andBeginuploadingtimeNotBetween(Date value1, Date value2) {
            addCriterion("BEGINUPLOADINGTIME not between", value1, value2, "beginuploadingtime");
            return (Criteria) this;
        }

        public Criteria andEnduploadingtimeIsNull() {
            addCriterion("ENDUPLOADINGTIME is null");
            return (Criteria) this;
        }

        public Criteria andEnduploadingtimeIsNotNull() {
            addCriterion("ENDUPLOADINGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEnduploadingtimeEqualTo(Date value) {
            addCriterion("ENDUPLOADINGTIME =", value, "enduploadingtime");
            return (Criteria) this;
        }

        public Criteria andEnduploadingtimeNotEqualTo(Date value) {
            addCriterion("ENDUPLOADINGTIME <>", value, "enduploadingtime");
            return (Criteria) this;
        }

        public Criteria andEnduploadingtimeGreaterThan(Date value) {
            addCriterion("ENDUPLOADINGTIME >", value, "enduploadingtime");
            return (Criteria) this;
        }

        public Criteria andEnduploadingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ENDUPLOADINGTIME >=", value, "enduploadingtime");
            return (Criteria) this;
        }

        public Criteria andEnduploadingtimeLessThan(Date value) {
            addCriterion("ENDUPLOADINGTIME <", value, "enduploadingtime");
            return (Criteria) this;
        }

        public Criteria andEnduploadingtimeLessThanOrEqualTo(Date value) {
            addCriterion("ENDUPLOADINGTIME <=", value, "enduploadingtime");
            return (Criteria) this;
        }

        public Criteria andEnduploadingtimeIn(List<Date> values) {
            addCriterion("ENDUPLOADINGTIME in", values, "enduploadingtime");
            return (Criteria) this;
        }

        public Criteria andEnduploadingtimeNotIn(List<Date> values) {
            addCriterion("ENDUPLOADINGTIME not in", values, "enduploadingtime");
            return (Criteria) this;
        }

        public Criteria andEnduploadingtimeBetween(Date value1, Date value2) {
            addCriterion("ENDUPLOADINGTIME between", value1, value2, "enduploadingtime");
            return (Criteria) this;
        }

        public Criteria andEnduploadingtimeNotBetween(Date value1, Date value2) {
            addCriterion("ENDUPLOADINGTIME not between", value1, value2, "enduploadingtime");
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
     * F_UPLOADFILE
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * F_UPLOADFILE null
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