package com.intest.dao.entity.task;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @作者:dl
 * @描述:任务基类
 * @创建时间: 2020/9/8 15:17
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@Getter
@Setter
public class TaskBaseEntity {
    /**
     * 序号
     */
    public int index;
    /**
     * 任务ID
     */
    public String taskId;

    /**
     * 任务名称
     */
    public String taskName;

    /**
     * 升级时间
     */
    public Date upgradeTime;

    /**
     * 计划开始时间
     */
    public Date planStartTime;

    /**
     * 计划结束时间
     */
    public Date planEndTime;

    /**
     * 任务描述
     */
    public String taskNote;

    /**
     * 任务策略 0-标准升级；1-静默升级；2-强制升级；
     */
    public Short taskStrategy;

    /**
     * 任务策略描述 0-标准升级；1-静默升级；2-强制升级；
     */
    public String  taskStrategyName;

    /**
     * 任务状态cede
     */
    public String taskStatusValueCode;
    /**
     * 任务状态描述
     */
    public String taskStatusValueName;

    /**
     * 升级包ID
     */
    public String packageTaskId;

    /**
     * 车型ID
     */
    public String carTypeId;

    /**
     * 车型名称
     */
    public String carTypeName;

    /**
     * 创建时间
     */
    public Date createAt;

    /**
     * 创建人
     */
    @JsonIgnore
    public String createBy;

    /**
     * 任务审批状态 FK_TASKREVIEWSTATUSVALUE_CODE
     */
    public String taskReviewStatusValueCode;


    /**
     * 任务审批状态 FK_TASKREVIEWSTATUSVALUE_CODE
     */
    public String taskReviewStatusValueName;

    /**
     * 任务审批流程ID FK_TASKREVIEWTMP_ID
     */
    public String taskReviewTmpId;

    /**
     * 审核等级code
     */
    public String reviewLevelCode;
    /**
     * 审核等级
     */
    public String reviewLevel;
    /**
     * 任务发布时间
     */
    public Date taskUpTime;
    /**
     * 发布人
     */
    public String taskUpBy;
    /**
     * 任务关闭时间
     */
    public Date taskCloseTime;
    /**
     * 任务关闭人
     */
    public String taskCloseBy;
    /**
     * 任务车辆列表
     */
    public List<TaskCarBaseEntity> vinLst;
    /**
     * 终端型号
     */
    public String terminalName;

    /**
     * 任务车辆数量
     */
    public TaskCarInfoNumsEntity taskCars;
    /**
     * 审核人用户ID
     */
    public String reviewUserId;
    /**
     * 审核人账户
     */
    public String reviewLoginName;
    /**
     * 审核人姓名
     */
    public String reviewRealName;

    /**
     * 任务车辆总数（任务列表使用）
     */
    public int carCountNum;

    public TaskBaseEntity(){
        vinLst=new ArrayList<>();
    }
}
