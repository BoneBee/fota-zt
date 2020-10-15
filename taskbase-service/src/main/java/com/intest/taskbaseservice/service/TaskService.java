package com.intest.taskbaseservice.service;


import com.intest.dao.entity.task.*;

import java.util.List;

/**
 * @作者:dl
 * @描述:策略管理模块业务接口
 * @创建时间: 2020/8/31 13:52
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
public interface TaskService {

    /**
     * 创建任务 ,添加车辆任务
     * @return
     */
    int addTask(TaskBaseEntity taskBaseEntity,List<TaskCarBaseEntity> taskCarBaseEntities);

    /**
     * 发布，关闭任务操作
     * @return
     */
    int operationTask(TaskParaEntity taskParaEntity);


    /**
     * 获取任务车辆
     * @return
     */
    List<TaskCarBaseEntity> getTaskCar(String taskId);

    /**
     * 取消车辆任务
     * @return
     */
    int cancelTaskCar(TaskParaEntity taskParaEntity);

    /**
     * 添加审核记录
     * @return
     */
    int addReviewTask(ReviewTaskLogsEntity reviewTaskLogsEntity);

    /**
     * 获取审核记录
     * @param taskId
     * @return
     */
    List<ReviewTaskLogsEntity> getTaskReviewLogs(String taskId);

    /**
     * 任务审核  任务列表
     * @return
     */
    List<TaskBaseEntity> selectReviewedTaskLst();

    /**
     * 我的审核列表
     * @param taskParaEntity
     * @return
     */
    List<TaskBaseEntity> selectMyReviewTaskLst(TaskParaEntity taskParaEntity);

    /**
     * 车辆升级日志
     * @param taskId
     * @return
     */
    List<TaskCarLogsEntity> selectTaskCarLog(String taskId);

    /**
     * 任务详情 基础信息tab页
     * @param taskId
     * @return
     */
    TaskBaseEntity getTaskDetaile(String taskId);

    /**
     * 获取任务车辆数量数
     * @param taskId
     * @return
     */
    TaskCarInfoNumsEntity selectTaskCarNum(String taskId);

    /**
     * 创建任务时，根据车型ID获取对应的升级包
     * @param carTypeId
     * @return
     */
    List<PackageByCarTypeEntity>  getPackageByCarType(String carTypeId);

    /**
     * 创建任务时，根据车型ID获取对应的vin集合
     * @param carTypeId
     * @return
     */
    List<VinListByCarTypeEntity>  getVinByCarType(String carTypeId);

    /**
     * 检查VIN是否有任务执行
     * @param vin
     * @return
     */
    int  getVinIsTasking(String vin);

    /**
     * 获取默认的任务审批模板信息
     * @param
     * @return
     */
    List<TaskReviewTmpEntity>  getTaskReviewTmp();
}
