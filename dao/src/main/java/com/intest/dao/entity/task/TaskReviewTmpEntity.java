package com.intest.dao.entity.task;

import lombok.Getter;
import lombok.Setter;

/**
 * @作者:
 * @描述:
 * @创建时间: 2020/9/16 11:33
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@Getter
@Setter
public class TaskReviewTmpEntity {
    /**
     * 审核记录ID
     */
    public String taskReviewTmpId;
    /**
     * 审批流程名称
     */
    public String taskReviewTmpName;

    /**
     * 类型 0-任务审批，1-升级包审批，2-原始包审批；（目前仅有任务审批）
     */
    public int tmpType;

    /**
     * 状态 0-默认，1-非默认
     */
    public int state;

}
