package com.intest.taskbaseservice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.ro.GetDataRO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.common.webcore.BaseController;
import com.intest.dao.entity.UserBto;
import com.intest.dao.entity.task.TaskBaseEntity;
import com.intest.dao.entity.task.TaskCarBaseEntity;
import com.intest.dao.entity.task.TaskCarInfoNumsEntity;
import com.intest.dao.entity.task.TaskParaEntity;
import com.intest.dao.mapper.TaskMapper;
import com.intest.taskbaseservice.service.ExcpUtil;
import com.intest.taskbaseservice.service.TaskBaseService;
import com.intest.taskbaseservice.service.entity.TaskReqParaEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
public class TaskBaseServiceImpl implements TaskBaseService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TaskMapper taskMapper;

    /**
     * 任务列表
     */
    @Override
    @TableDataAnnotation(tableId = "46a780be-ac16-4634-80ae-a40d9b101575")
    public PagerDataBaseVO getTaskLst(TaskReqParaEntity taskParaEntity) {

        logger.info("接收到到查询任务列表请求");
        PagerDataBaseVO type = new PagerDataBaseVO();
        try {
            PageHelper.startPage(taskParaEntity.getPi(), taskParaEntity.getPs());

            List<TaskBaseEntity> taskLst = taskMapper.selectTaskLst();

            for (TaskBaseEntity item:taskLst){
                //获取任务车辆数量
                TaskCarInfoNumsEntity taskCarInfoNumsEntity=taskMapper.selectTaskCarNum(item.getTaskId());

                item.setCarCountNum(taskCarInfoNumsEntity.getCarTotalNum());
            }

            PageInfo<TaskBaseEntity> pageInfo = new PageInfo<>(taskLst);
            int index = pageInfo.getStartRow() - 1;

            for (TaskBaseEntity item : taskLst) {
                item.setIndex(index+=1);
            }
            type.setTotal(pageInfo.getTotal());
            type.setData(taskLst);
            logger.info("查询任务列表请求处理成功");
            return type;
        }catch (Exception ex){
            ex.printStackTrace();
            logger.info("查询任务列表：失败信息：" + ExcpUtil.getStackTraceString(ex));
            return type;
        }
    }


    /**
     * 获取任务车辆
     * @param taskParaEntity
     * @return
     */
    @Override
    @TableDataAnnotation(tableId = "340b390d-c197-4b70-81fb-7cf9451401ba")
    public PagerDataBaseVO getTaskCar(GetDataRO taskParaEntity) {
      //  return taskMapper.getTaskCar(taskParaEntity.getTaskId());
        logger.info("接收到到获取任务车辆列表请求：taskId:"+taskParaEntity.getTaskId());

        PagerDataBaseVO type = new PagerDataBaseVO();
        try {
            PageHelper.startPage(taskParaEntity.getPi(), taskParaEntity.getPs());
            List<TaskCarBaseEntity>  taskCarLst = taskMapper.getTaskCar(taskParaEntity.getTaskId());
//        for (TaskCarBaseEntity item:taskCarLst){
//            //获取任务车辆数量
//            TaskCarInfoNumsEntity taskCarInfoNumsEntity=taskMapper.selectTaskCarNum(item.getTaskId());
//
//            //item.setCarCountNum(taskCarInfoNumsEntity.getCarTotalNum());
//        }
            PageInfo<TaskCarBaseEntity> pageInfo = new PageInfo<>(taskCarLst);
            int index = pageInfo.getStartRow() - 1;
            for (TaskCarBaseEntity item : taskCarLst) {
                item.setIndex(index+=1);
            }
            type.setTotal(pageInfo.getTotal());
            type.setData(taskCarLst);
            return type;
        }catch (Exception ex){
            ex.printStackTrace();
            logger.info("获取任务车辆列表失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
            return type;
        }

    }
    /**
     * 任务审核  任务列表
     * @param
     * @return
     */
    @Override
    @TableDataAnnotation(tableId = "5c8efda6-e304-4997-bedc-eec2ca95cb62")
    public PagerDataBaseVO selectReviewedTaskLst(GetDataRO taskParaEntity) {
        logger.info("接收到查询审核任务列表请求");
        PagerDataBaseVO type = new PagerDataBaseVO();
        try {
            PageHelper.startPage(taskParaEntity.getPi(), taskParaEntity.getPs());
            List<TaskBaseEntity> taskLst =  taskMapper.selectReviewedTaskLst();
            PageInfo<TaskBaseEntity> pageInfo = new PageInfo<>(taskLst);
            int index = pageInfo.getStartRow() - 1;
            for (TaskBaseEntity item : taskLst) {
                item.setIndex(index+=1);
            }
            type.setTotal(pageInfo.getTotal());
            type.setData(taskLst);
            logger.info("查询审核任务列表请求处理成功");
            return type;
        }catch (Exception ex){
            ex.printStackTrace();
            logger.info("查询审核任务列表失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
            return type;
        }
    }
    /**
     * 我的审核列表
     * @param taskParaEntity
     * @return
     */
    @Override
    @TableDataAnnotation(tableId = "c745c0fe-82dd-41f5-9299-5534cbf5c0c7")
    public PagerDataBaseVO selectMyReviewTaskLst(GetDataRO taskParaEntity) {
        logger.info("接收到查询我的审核列表请求");
        //获取当前登录用户信息
        BaseController baseController=new BaseController();
        UserBto userBto= baseController.getAccount();

        PagerDataBaseVO type = new PagerDataBaseVO();
        if(userBto==null){
            logger.info("查询我的审核列表请求前获取登录用户信息为空，查询失败");
            return type;
        }else {

            try {
                logger.info("当前登录用户Id："+userBto.getUserId());
                PageHelper.startPage(taskParaEntity.getPi(), taskParaEntity.getPs());
                List<TaskBaseEntity> taskLst =  taskMapper.selectMyReviewTaskLst(userBto.getUserId());
                PageInfo<TaskBaseEntity> pageInfo = new PageInfo<>(taskLst);
                int index = pageInfo.getStartRow() - 1;
                for (TaskBaseEntity item : taskLst) {
                    item.setIndex(index+=1);
                }
                type.setTotal(pageInfo.getTotal());
                type.setData(taskLst);
                logger.info("查询我的审核列表请求处理成功");
                return type;
            }catch (Exception ex){
                ex.printStackTrace();
                logger.info("查询我的审核列表失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
                return type;
            }
        }
    }
}
