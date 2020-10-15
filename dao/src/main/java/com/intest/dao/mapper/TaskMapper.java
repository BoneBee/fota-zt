package com.intest.dao.mapper;


import com.intest.dao.entity.task.*;


import java.util.List;

/**
 * @作者:dl
 * @描述:策略管理模块 API接口
 * @创建时间: 2020/8/31 16:04
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
public interface TaskMapper {

    /**
     * 任务列表
     * @return
     */
    List<TaskBaseEntity> selectTaskLst();

    /**
     * 创建任务
     * @return
     */
    int addTask(TaskBaseEntity taskBaseEntity);
    /**
     * 添加车辆任务
     * @return
     */
    int addTaskCar(List<TaskCarBaseEntity> taskCarBaseEntities);

    /**
     * 更新任务（发布关闭任务）
     * @return
     */
    int operationTask(TaskParaEntity taskParaEntity);
    /**
     * 关闭任务时，同步关闭车辆升级任务
     * @return
     */
    int operationTaskCar(TaskParaEntity taskParaEntity);

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
     * 获取任务车辆
     * @return
     */
    List<ReviewTaskLogsEntity>  getTaskReviewLogs(String taskId);

    /**
     * 任务审核  任务列表
     * @return
     */
    List<TaskBaseEntity> selectReviewedTaskLst();

    /**
     * 我的审核列表
     * @param userId
     * @return
     */
    List<TaskBaseEntity> selectMyReviewTaskLst(String userId);

    /**
     * 车辆升级日志
     * @param taskCarId
     * @return
     */
    List<TaskCarLogsEntity> selectTaskCarLog(String taskCarId);

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