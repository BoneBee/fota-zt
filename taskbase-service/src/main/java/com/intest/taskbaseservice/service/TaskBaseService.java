package com.intest.taskbaseservice.service;


import com.intest.common.result.PagerDataBaseVO;
import com.intest.taskbaseservice.service.entity.TaskReqParaEntity;



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



}
