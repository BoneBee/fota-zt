package com.intest.taskbaseservice.service;


import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.ro.GetDataRO;
import com.intest.dao.entity.task.TaskCarBaseEntity;
import com.intest.taskbaseservice.service.entity.TaskReqParaEntity;

import java.util.List;


/**
 * @作者:dl
 * @描述:策略管理模块基础接口
 * @创建时间: 2020/8/31 13:52
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
public interface TaskBaseService {

    /**
     * 任务列表
     * @return
     */
    PagerDataBaseVO getTaskLst(TaskReqParaEntity taskParaEntity);

    /**
     * 获取任务车辆
     * @return
     */
    PagerDataBaseVO getTaskCar(GetDataRO taskParaEntity);

    /**
     * 任务审核  任务列表
     * @return
     */
    PagerDataBaseVO selectReviewedTaskLst(GetDataRO taskParaEntity);
    /**
     * 我的审核列表
     * @return
     */
    PagerDataBaseVO selectMyReviewTaskLst(GetDataRO taskParaEntity);

}
