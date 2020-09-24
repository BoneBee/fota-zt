package com.intest.dao.entity;

import java.util.Date;

public class TaskReviewTmpDetileBto {
    /**
     * 主键ID TASKREVIEWTMPDETAILE_ID
     */
    private String taskreviewtmpdetaileId;

    /**
     * 审批流程模块外键ID FK_TASKREVIEWTMP_ID
     */
    private String fkTaskreviewtmpId;

    /**
     * 用户ID FK_USER_ID
     */
    private String fkUserId;

    /**
     * 审批等级 1-一级审核，2-二级审核，3-三级审核； REVIEW_LEVEL
     */
    private Short reviewLevel;

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
     * 主键ID
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @return TASKREVIEWTMPDETAILE_ID 主键ID
     */
    public String getTaskreviewtmpdetaileId() {
        return taskreviewtmpdetaileId;
    }

    /**
     * 主键ID
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @param taskreviewtmpdetaileId 主键ID
     */
    public void setTaskreviewtmpdetaileId(String taskreviewtmpdetaileId) {
        this.taskreviewtmpdetaileId = taskreviewtmpdetaileId == null ? null : taskreviewtmpdetaileId.trim();
    }

    /**
     * 审批流程模块外键ID
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @return FK_TASKREVIEWTMP_ID 审批流程模块外键ID
     */
    public String getFkTaskreviewtmpId() {
        return fkTaskreviewtmpId;
    }

    /**
     * 审批流程模块外键ID
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @param fkTaskreviewtmpId 审批流程模块外键ID
     */
    public void setFkTaskreviewtmpId(String fkTaskreviewtmpId) {
        this.fkTaskreviewtmpId = fkTaskreviewtmpId == null ? null : fkTaskreviewtmpId.trim();
    }

    /**
     * 用户ID
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @return FK_USER_ID 用户ID
     */
    public String getFkUserId() {
        return fkUserId;
    }

    /**
     * 用户ID
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @param fkUserId 用户ID
     */
    public void setFkUserId(String fkUserId) {
        this.fkUserId = fkUserId == null ? null : fkUserId.trim();
    }

    /**
     * 审批等级 1-一级审核，2-二级审核，3-三级审核；
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @return REVIEW_LEVEL 审批等级 1-一级审核，2-二级审核，3-三级审核；
     */
    public Short getReviewLevel() {
        return reviewLevel;
    }

    /**
     * 审批等级 1-一级审核，2-二级审核，3-三级审核；
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @param reviewLevel 审批等级 1-一级审核，2-二级审核，3-三级审核；
     */
    public void setReviewLevel(Short reviewLevel) {
        this.reviewLevel = reviewLevel;
    }

    /**
     * 是否删除 1-未删除，0-已删除；
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @return ISDELETE 是否删除 1-未删除，0-已删除；
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除 1-未删除，0-已删除；
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @param isdelete 是否删除 1-未删除，0-已删除；
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-09-21 12:14:51
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }
}