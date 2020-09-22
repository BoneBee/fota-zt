package com.intest.taskbaseservice.service.impl;

import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.task.*;
import com.intest.dao.mapper.TaskMapper;
import com.intest.taskbaseservice.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @作者:dl
 * @描述:任务管理模块
 * @创建时间: 2020/9/8 15:39
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@Service
@TableDataAnnotation
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskMapper taskMapper;


    /**
     * 任务创建
     * @param taskBaseEntity
     * @return
     */
    @Override
    @Transactional
    public int addTask(TaskBaseEntity taskBaseEntity,List<TaskCarBaseEntity> taskCarBaseEntities) {

        int n=taskMapper.addTask(taskBaseEntity);

        int n1=taskMapper.addTaskCar(taskCarBaseEntities);
        if(n>0&&n1>0){
            return n;
        }else {
            return 0;
        }
    }
    /**
     * 发布关闭任务
     * @param taskParaEntity
     * @return
     */
    @Override
    @Transactional
    public int operationTask(TaskParaEntity taskParaEntity) {
        //关闭任务时，需同步操作车辆任务
        if(taskParaEntity.getReqType()==1){

            int n = taskMapper.operationTask(taskParaEntity);

            int n1 = taskMapper.operationTaskCar(taskParaEntity);
            if (n > 0 && n1 > 0) {
                return n;
            } else {
                return 0;
            }
        }else {
            //发布、取消发布任务
            return taskMapper.operationTask(taskParaEntity);
        }
    }
    /**
     * 获取任务车辆
     * @param taskId
     * @return
     */
    @Override
    public List<TaskCarBaseEntity> getTaskCar(String taskId) {
        return taskMapper.getTaskCar(taskId);
    }

    /**
     * 取消车辆任务升级
     * @param taskParaEntity
     * @return
     */
    @Override
    public int cancelTaskCar(TaskParaEntity taskParaEntity) {
        return taskMapper.cancelTaskCar(taskParaEntity);
    }

    /**
     * 添加审核记录
     * @param reviewTaskLogsEntity
     * @return
     */
    @Override
    @Transactional
    public int addReviewTask(ReviewTaskLogsEntity reviewTaskLogsEntity) {

        //添加审核记录
        int n=taskMapper.addReviewTask(reviewTaskLogsEntity);
        //更新任务状态
        TaskParaEntity taskParaEntity=new TaskParaEntity();
        taskParaEntity.setTaskId(reviewTaskLogsEntity.getTaskId());
        if(reviewTaskLogsEntity.getIsAdopt()==0){
            //审核通过
            if(reviewTaskLogsEntity.getReviewLevel()==reviewTaskLogsEntity.getTaskNum()){
                //最后一次审核
                taskParaEntity.setTaskReviewCode("102");//审核状态为 审核通过
                taskParaEntity.setTaskCode("104");//任务状态为 未发布
            }else {
                //最后一次审核
                taskParaEntity.setTaskReviewCode("00"+(reviewTaskLogsEntity.getReviewLevel()+1));//审核状态为 下一级别审核
                taskParaEntity.setTaskCode("101");//任务状态为 审核中
            }

        }else {
            //审核未通过
            taskParaEntity.setTaskReviewCode("103");//审核状态为 审核通过
            taskParaEntity.setTaskCode("103");//任务状态为 未发布
        }
        int n1=taskMapper.operationTask(taskParaEntity);
        if(n>0&&n1>0){
            return n;
        }else {
            return 0;
        }
    }
    /**
     * 获取审核记录
     * @param taskId
     * @return
     */
    @Override
    public List<ReviewTaskLogsEntity> getTaskReviewLogs(String taskId) {
        return taskMapper.getTaskReviewLogs(taskId);
    }
    /**
     * 任务审核  任务列表
     * @param
     * @return
     */
    @Override
    public List<TaskBaseEntity> selectReviewedTaskLst() {
        return taskMapper.selectReviewedTaskLst();
    }
    /**
     * 我的审核列表
     * @param taskParaEntity
     * @return
     */
    @Override
    public List<TaskBaseEntity> selectMyReviewTaskLst(TaskParaEntity taskParaEntity) {
        return taskMapper.selectMyReviewTaskLst(taskParaEntity);
    }
    /**
     * 获取车辆升级列表
     * @param taskCarId
     * @return
     */
    @Override
    public List<TaskCarLogsEntity> selectTaskCarLog(String taskCarId) {
        return taskMapper.selectTaskCarLog(taskCarId);
    }
    /**
     * 任务详情 基础信息tab页
     * @param taskId
     * @return
     */
    @Override
    public TaskBaseEntity getTaskDetaile(String taskId) {
        return taskMapper.getTaskDetaile(taskId);
    }
    /**
     * 获取任务车辆数量数
     * @param taskId
     * @return
     */
    @Override
    public TaskCarInfoNumsEntity selectTaskCarNum(String taskId) {
        return taskMapper.selectTaskCarNum(taskId);
    }

    @Override
    public List<PackageByCarTypeEntity> getPackageByCarType(String carTypeId) {
        return taskMapper.getPackageByCarType(carTypeId);
    }
    /**
     * 创建任务时，根据车型ID获取对应的vin集合
     * @param carTypeId
     * @return
     */
    @Override
    public List<VinListByCarTypeEntity> getVinByCarType(String carTypeId) {
        return taskMapper.getVinByCarType(carTypeId);
    }
    /**
     * 检查VIN是否有任务执行
     * @param vin
     * @return
     */
    @Override
    public int getVinIsTasking(String vin) {
        return taskMapper.getVinIsTasking(vin);
    }
    /**
     * 获取默认的任务审批模板信息
     * @param
     * @return
     */
    @Override
    public List<TaskReviewTmpEntity> getTaskReviewTmp() {
        return taskMapper.getTaskReviewTmp();
    }
}
