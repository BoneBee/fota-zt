package com.intest.dao.entity;

import java.util.Date;

public class TaskReviewTmpBto {
    /**
     * 主键ID TASKREVIEWTMP_ID
     */
    private String taskreviewtmpId;

    /**
     * 审批流程名称 TASK_REVIEWTMP_NAME
     */
    private String taskReviewtmpName;

    /**
     * 类型 0-任务审批，1-升级包审批，2-原始包审批；（目前仅有任务审批） TMP_TYPE
     */
    private Short tmpType;

    /**
     * 状态 0-默认，1-非默认 STATE
     */
    private Short state;

    /**
     * 是否删除 1-未删除，0-已删除； ISDELETE
     */
    private Short isdelete;

    /**
     * 创建时间 CREATEAT
     */
    private Date createat;

    /**
     * 创建人 CREATEBY
     */
    private String createby;

    /**
     * 修改时间 UPDATEAT
     */
    private Date updateat;

    /**
     * 修改人 UPDATEBY
     */
    private String updateby;

    /**
     * 审核次数 TASKNUM
     */
    private Short tasknum;

    /**
     * 主键ID
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @return TASKREVIEWTMP_ID 主键ID
     */
    public String getTaskreviewtmpId() {
        return taskreviewtmpId;
    }

    /**
     * 主键ID
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @param taskreviewtmpId 主键ID
     */
    public void setTaskreviewtmpId(String taskreviewtmpId) {
        this.taskreviewtmpId = taskreviewtmpId == null ? null : taskreviewtmpId.trim();
    }

    /**
     * 审批流程名称
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @return TASK_REVIEWTMP_NAME 审批流程名称
     */
    public String getTaskReviewtmpName() {
        return taskReviewtmpName;
    }

    /**
     * 审批流程名称
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @param taskReviewtmpName 审批流程名称
     */
    public void setTaskReviewtmpName(String taskReviewtmpName) {
        this.taskReviewtmpName = taskReviewtmpName == null ? null : taskReviewtmpName.trim();
    }

    /**
     * 类型 0-任务审批，1-升级包审批，2-原始包审批；（目前仅有任务审批）
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @return TMP_TYPE 类型 0-任务审批，1-升级包审批，2-原始包审批；（目前仅有任务审批）
     */
    public Short getTmpType() {
        return tmpType;
    }

    /**
     * 类型 0-任务审批，1-升级包审批，2-原始包审批；（目前仅有任务审批）
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @param tmpType 类型 0-任务审批，1-升级包审批，2-原始包审批；（目前仅有任务审批）
     */
    public void setTmpType(Short tmpType) {
        this.tmpType = tmpType;
    }

    /**
     * 状态 0-默认，1-非默认
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @return STATE 状态 0-默认，1-非默认
     */
    public Short getState() {
        return state;
    }

    /**
     * 状态 0-默认，1-非默认
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @param state 状态 0-默认，1-非默认
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * 是否删除 1-未删除，0-已删除；
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @return ISDELETE 是否删除 1-未删除，0-已删除；
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除 1-未删除，0-已删除；
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @param isdelete 是否删除 1-未删除，0-已删除；
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    /**
     * 审核次数
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @return TASKNUM 审核次数
     */
    public Short getTasknum() {
        return tasknum;
    }

    /**
     * 审核次数
     * @author xialiang
     * @date 2020-09-09 11:31:59
     * @param tasknum 审核次数
     */
    public void setTasknum(Short tasknum) {
        this.tasknum = tasknum;
    }
}