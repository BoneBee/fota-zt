package com.intest.dao.entity.task;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

/**
 * @作者:dl
 * @描述:任务参数实体
 * @创建时间: 2020/9/10 13:20
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@Getter
@Setter
public class TaskParaEntity{

    public int pi;

    public int ps;


    /**
     * 请求类型 0:发布任务 1:关闭任务
     */
    public int reqType;
    /**
     * 任务ID
     */
    public String taskId;
    /**
     * 车辆任务ID
     */
    public String taskCarId;
    /**
     * 任务状态Code
     */
    public String taskCode;
    /**
     * 任务审核状态Code
     */
    public String taskReviewCode;
    /**
     * 车辆任务状态Code
     */
    public String taskCarCode;
    /**
     * 用户ID
     */
    public String userId;
    /**
     * 更新者
     */
    @JsonIgnore
    public String updateBy;

}
