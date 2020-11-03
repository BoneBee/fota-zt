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
import com.intest.dao.mapper.TaskMapper;
import com.intest.dao.mapper.UserBtoMapper;
import com.intest.taskbaseservice.service.ExcpUtil;
import com.intest.taskbaseservice.service.TaskBaseService;
import com.intest.taskbaseservice.service.entity.TaskReqParaEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.util.Date;


import java.text.SimpleDateFormat;
import java.util.Date;
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
public class TaskBaseServiceImpl extends BaseController implements TaskBaseService  {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TaskMapper taskMapper;

    @Autowired
    UserBtoMapper userMapper;

    /**
     * 任务列表
     */
    @Override
    @TableDataAnnotation(tableId = "46a780be-ac16-4634-80ae-a40d9b101575")
    public PagerDataBaseVO getTaskLst(TaskReqParaEntity taskParaEntity) {

        logger.info("接收到到查询任务列表请求");
        PagerDataBaseVO type = new PagerDataBaseVO();

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            PageHelper.startPage(taskParaEntity.getPi(), taskParaEntity.getPs());

            List<TaskBaseEntity> taskLst = taskMapper.selectTaskLst();

            for (TaskBaseEntity item:taskLst){
                //获取任务车辆数量
                TaskCarInfoNumsEntity taskCarInfoNumsEntity=taskMapper.selectTaskCarNum(item.getTaskId());

                item.setCarCountNum(taskCarInfoNumsEntity.getCarTotalNum());

                //String strDate=ft.format(item.getCreateAt());
                //item.setCreateAt(strDate);

                //Date tmpDate= df.parse(strDate);

//                String result1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(item.getCreateAt() * 1000));
//                String tmpDate=ft.format(item.getCreateAt());
//
////一般网上的转换是没有中间new Long（timeStamp）,因为他们都是精确到毫秒的时间戳，不用再乘以1000进行转换
//                long longTimeStamp = new Long(new Long(timeStamp) * 1000);
//                Date date = new Date(longTimeStamp);
//                item.setCreateAt(tmpDate);
                String CreateBy = getUserRealName(userMapper, item.getCreateBy());
                item.setCreateBy(CreateBy);
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
//            item.setCarCountNum(taskCarInfoNumsEntity.getCarTotalNum());
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

            for (TaskBaseEntity item : taskLst) {
                //获取任务车辆数量
                TaskCarInfoNumsEntity taskCarInfoNumsEntity = taskMapper.selectTaskCarNum(item.getTaskId());

                item.setCarCountNum(taskCarInfoNumsEntity.getCarTotalNum());
                String CreateBy = getUserRealName(userMapper, item.getCreateBy());
                item.setCreateBy(CreateBy);
            }

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
        UserBto userBto= getAccount();

        PagerDataBaseVO type = new PagerDataBaseVO();
        if(userBto==null){
            logger.info("查询我的审核列表请求前获取登录用户信息为空，查询失败");
            return type;
        }else {

            try {
                logger.info("当前登录用户Id："+userBto.getUserId());
                PageHelper.startPage(taskParaEntity.getPi(), taskParaEntity.getPs());
                List<TaskBaseEntity> taskLst =  taskMapper.selectMyReviewTaskLst(userBto.getUserId());

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
                logger.info("查询我的审核列表请求处理成功");
                return type;
            }catch (Exception ex){
                ex.printStackTrace();
                logger.info("查询我的审核列表失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
                return type;
            }
        }
    }

    public static String getUserRealName(UserBtoMapper userMapper, String UserId){

        UserBto usbto=new UserBto();
        usbto = userMapper.selectByPrimaryKey(UserId);
        String UserName="";
        if(usbto!=null&&!usbto.getRealName().equals("")){
            UserName=usbto.getLoginName();
        }
        return UserName;
    }
}
