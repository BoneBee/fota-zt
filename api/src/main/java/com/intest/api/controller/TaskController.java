package com.intest.api.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.basicservice.table.common.ResponseBean;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.result.ResultT;
import com.intest.common.webcore.BaseController;
import com.intest.dao.entity.UserBto;
import com.intest.dao.entity.task.*;
import com.intest.taskbaseservice.service.ExcpUtil;
import com.intest.taskbaseservice.service.entity.TaskReqParaEntity;
import com.intest.taskbaseservice.service.impl.TaskBaseServiceImpl;
import com.intest.taskbaseservice.service.impl.TaskServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.UUID;


/**
 * @作者:dl
 * @描述:任务管理模块 API接口
 * @创建时间: 2020/8/31 16:04
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@RestController
@Api(tags = {"任务管理"})
public class TaskController extends BaseController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TaskBaseServiceImpl taskBaseService;
    @Autowired
    TaskServiceImpl taskService;


    @ApiOperation("添加任务")
    @RequestMapping(value = "/api/basic/task/addTask", method = RequestMethod.POST)
    public ResponseBean updatePartsConfig(@RequestBody TaskBaseEntity taskBaseEntity) {
        logger.info("接收到创建任务请求，请求信息：" + JSON.toJSONString(taskBaseEntity));
        try {
            UserBto userBto= getAccount();
            if(userBto!=null){
                String userId= userBto.getUserId();
                logger.info("用户Id："+userId);
                taskBaseEntity.setCreateBy(userId);
            }else {
                return new ResponseBean(0, "创建任务创建失败，未获取到当前登录用户信息，请重新登录创建", null);
            }
            //taskBaseEntity.setCreateBy("");
            taskBaseEntity.setTaskId(UUID.randomUUID().toString());
            //获取任务审核模板ID
            List<TaskReviewTmpEntity> taskReviewTmpEntities=taskService.getTaskReviewTmp();
            if(taskReviewTmpEntities==null||taskReviewTmpEntities.size()==0){
                return new ResponseBean(-1, "创建任务失败，未获取到任务审批模板，请检查是否维护该信息。", null);
            }else if(taskReviewTmpEntities.size()>1){
                return new ResponseBean(-1, "创建任务失败，获取到多条任务审批模板信息，请检查数据是否正确。", null);
            }
            //赋值任务审批模板信息
            taskBaseEntity.setTaskReviewTmpId(taskReviewTmpEntities.get(0).getTaskReviewTmpId());

            //赋值任务车辆信息
            if (taskBaseEntity.getVinLst().size() == 0 || taskBaseEntity.getVinLst() == null) {
                return new ResponseBean(-1, "创建任务失败，升级车辆为空，不允创建", null);
            }

            for (TaskCarBaseEntity item : taskBaseEntity.getVinLst()) {
                item.setTaskCarId(UUID.randomUUID().toString());
                item.setTaskId(taskBaseEntity.getTaskId());
                item.setDescription(taskBaseEntity.getTaskNote());
                item.setUpgradeTime(taskBaseEntity.getUpgradeTime());
                //item.setCreateBy("任务管理模块");
            }
            int n = taskService.addTask(taskBaseEntity, taskBaseEntity.getVinLst());

            if (n > 0) {
                return new ResponseBean(1, "创建任务创建成功", null);
            } else {
                logger.info("创建任务创建失败,影响行数为：0");
                return new ResponseBean(0, "创建任务创建失败，影响行数：0", null);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.info("创建任务失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
            return new ResponseBean(0, "创建任务失败", null);
        }
    }

    /**
     * 获取零部件类型列表
     *
     * @return
     */
    public PagerDataBaseVO get() {
        taskBaseService.getTaskLst(new TaskReqParaEntity());
        return null;
    }

    @ApiOperation("发布、关闭任务")
    @RequestMapping(value = "/api/basic/task/operationTask", method = RequestMethod.POST)
    public ResponseBean operationTask(@RequestBody TaskParaEntity taskParaEntity) {
        logger.info("接收到发布、关闭任务请求，请求信息：" + JSON.toJSONString(taskParaEntity));
        String str = "";
        try {
            if (taskParaEntity.getReqType() == 0) {
                //发布任务
                str = "发布任务";
                taskParaEntity.setTaskCode("105");
            } else if(taskParaEntity.getReqType() == 1) {
                //关闭任务
                str = "关闭任务";
                taskParaEntity.setTaskCode("301");
                taskParaEntity.setTaskCarCode("1070");
                //查询改任务下是否有执行中的任务（暂不做限制，已实际车辆状态为准）
            }else if(taskParaEntity.getReqType() == 2){
                //取消发布
                str = "取消发布";
                taskParaEntity.setTaskCode("106");
            }else {
                return new ResponseBean(-1, str + "失败，参数输入错误：reqType 0:发布任务，1:关闭任务，2:取消发布；当前值为："+taskParaEntity.getReqType(), null);
            }

            UserBto userBto= getAccount();
            if(userBto!=null){
                String userId= userBto.getUserId();
                taskParaEntity.setUserId(userId);
            }else {
                return new ResponseBean(0, str+"失败，未获取到当前登录用户信息，请重新登录", null);
            }
//            taskParaEntity.setUserId("test");
            int n = taskService.operationTask(taskParaEntity);

            if (n > 0) {
                return new ResponseBean(1, str + "成功", null);
            } else {
                logger.info(str + "失败,影响行数为：0");
                return new ResponseBean(-1, str + "失败，影响行数：0", null);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.info(str + "失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
            return new ResponseBean(-1, str + "失败", null);
        }
    }
        //    使用表格方式查询
    @ApiOperation("获取任务车辆")
    @RequestMapping(value = "/api/basic/task/getTaskCarLst", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getTaskCarLst(@RequestBody TaskReqParaEntity taskReqParaEntity) {
        ResultT<PagerDataBaseVO> result = new ResultT<>();

        logger.info("接收到获取任务车辆请求，请求信息：" + JSON.toJSONString(taskReqParaEntity));

        try {
            PagerDataBaseVO type = new PagerDataBaseVO();
            PageHelper.startPage(taskReqParaEntity.getPi(), taskReqParaEntity.getPs());
            List<TaskCarBaseEntity> lst = taskService.getTaskCar(taskReqParaEntity.getTaskId());
            PageInfo<TaskCarBaseEntity> pageInfo = new PageInfo<>(lst);
            int index = pageInfo.getStartRow() - 1;
            for (TaskCarBaseEntity item : lst) {
                item.setIndex(index += 1);
            }
            type.setTotal(pageInfo.getTotal());
            type.setData(lst);
            result.setResult(type);
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.info("获取任务车辆失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
            result.setSuccess(-1);
            return result;
        }
    }


    @ApiOperation("取消车辆任务")
    @RequestMapping(value = "/api/basic/task/cancelTaskCar", method = RequestMethod.POST)
    public ResponseBean cancelTaskCar(@RequestBody TaskParaEntity taskParaEntity) {
        logger.info("接收到取消车辆任务请求，请求信息：" + JSON.toJSONString(taskParaEntity));
        try {
            UserBto userBto= getAccount();
            if(userBto!=null){
                String userId= userBto.getUserId();
                taskParaEntity.setUpdateBy(userId);
            }else {
                return new ResponseBean(0, "取消车辆任务失败，未获取到当前登录用户信息，请重新登录", null);
            }
            taskParaEntity.setTaskCarCode("1070");
            int n = taskService.cancelTaskCar(taskParaEntity);

            if (n > 0) {
                return new ResponseBean(1, "取消任务成功", null);
            } else {
                logger.info("取消任务失败,影响行数为：0");
                return new ResponseBean(0, "取消任务失败，影响行数：0", null);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.info("取消任务失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
            return new ResponseBean(0, "取消任务失败", null);
        }
    }

    @ApiOperation("添加审核记录")
    @RequestMapping(value = "/api/basic/task/addReviewTask", method = RequestMethod.POST)
    public ResponseBean addReviewTask(@RequestBody ReviewTaskLogsEntity reviewTaskLogsEntity) {
        logger.info("接收到添加审核记录请求，请求信息：" + JSON.toJSONString(reviewTaskLogsEntity));
        try {
            int n = taskService.addReviewTask(reviewTaskLogsEntity);
            if (n > 0) {
                return new ResponseBean(1, "添加审核记录成功", null);
            } else {
                logger.info("添加审核记录失败,影响行数为：0");
                return new ResponseBean(0, "添加审核记录失败，影响行数：0", null);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.info("添加审核记录失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
            return new ResponseBean(0, "添加审核记录失败", null);
        }
    }


    @ApiOperation("获取审核记录")
    @RequestMapping(value = "/api/basic/task/getTaskReviewLogs", method = RequestMethod.GET)
    public ResponseBean getTaskReviewLogs(String taskId) {
        logger.info("接收到发布、关闭任务请求，请求信息：" + taskId);
        try {
            List<ReviewTaskLogsEntity> lst=taskService.getTaskReviewLogs(taskId);


            if (lst!=null && lst.size()>0) {
                return new ResponseBean(1, "获取审核记录成功", lst);
            } else {
                logger.info("获取审核记录成功,无数据");
                return new ResponseBean(1, "获取审核记录成功，无数据", null);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.info("取消任务失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
            return new ResponseBean(0, "取消任务失败", null);
        }
    }
    //    使用表格方式查询
    @ApiOperation("任务审核  任务列表")
    @RequestMapping(value = "/api/basic/task/getReviewedTaskLst", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getReviewedTaskLst(@RequestBody TaskReqParaEntity taskReqParaEntity) {
        ResultT<PagerDataBaseVO> result = new ResultT<>();

        logger.info("接收到任务审核-任务列表请求，请求信息：" + JSON.toJSONString(taskReqParaEntity));

        try {
            PagerDataBaseVO type = new PagerDataBaseVO();
            PageHelper.startPage(taskReqParaEntity.getPi(), taskReqParaEntity.getPs());
            List<TaskBaseEntity> lst = taskService.selectReviewedTaskLst();

            for (TaskBaseEntity item:lst){
                //获取任务车辆数量
                TaskCarInfoNumsEntity taskCarInfoNumsEntity=taskService.selectTaskCarNum(item.getTaskId());

                item.setCarCountNum(taskCarInfoNumsEntity.getCarTotalNum());
            }
            PageInfo<TaskBaseEntity> pageInfo = new PageInfo<>(lst);
            int index = pageInfo.getStartRow() - 1;
            for (TaskBaseEntity item : lst) {
                item.setIndex(index += 1);
            }
            type.setTotal(pageInfo.getTotal());
            type.setData(lst);
            result.setResult(type);
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.info("获取任务审核-任务列表失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
            result.setSuccess(-1);
            return result;
        }
    }

    //    使用表格方式查询
    @ApiOperation("我的审核列表")
    @RequestMapping(value = "/api/basic/task/getMyReviewTaskLst", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getReviewedTaskLst(@RequestBody TaskParaEntity taskParaEntity) {
        ResultT<PagerDataBaseVO> result = new ResultT<>();

        logger.info("接收到我的审核列表请求，请求信息：" + JSON.toJSONString(taskParaEntity));

        try {
            PagerDataBaseVO type = new PagerDataBaseVO();
            PageHelper.startPage(taskParaEntity.getPi(), taskParaEntity.getPs());
            List<TaskBaseEntity> lst = taskService.selectMyReviewTaskLst(taskParaEntity);

            for (TaskBaseEntity item:lst){
                //获取任务车辆数量
                TaskCarInfoNumsEntity taskCarInfoNumsEntity=taskService.selectTaskCarNum(item.getTaskId());

                item.setCarCountNum(taskCarInfoNumsEntity.getCarTotalNum());
            }

            PageInfo<TaskBaseEntity> pageInfo = new PageInfo<>(lst);
            int index = pageInfo.getStartRow() - 1;
            for (TaskBaseEntity item : lst) {
                item.setIndex(index += 1);
            }
            type.setTotal(pageInfo.getTotal());
            type.setData(lst);
            result.setResult(type);
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.info("获取我的审核列表失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
            result.setSuccess(-1);
            return result;
        }
    }
    @ApiOperation("获取车辆升级日志")
    @RequestMapping(value = "/api/basic/task/getTaskCarLogs", method = RequestMethod.GET)
    public ResponseBean updatePartsConfig(String taskCarId) {
        logger.info("接收到获取车辆升级日志请求，请求信息：" + taskCarId);
        try {
            List<TaskCarLogsEntity> lst = taskService.selectTaskCarLog(taskCarId);
            if (lst!=null&&lst.size()>0) {
                return new ResponseBean(1, "获取车辆升级日志成功", lst);
            } else {
                logger.info("获取车辆升级日志成功,无日志数据");
                return new ResponseBean(0, "获取车辆升级日志成功,无日志数据", null);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.info("获取车辆升级日志失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
            return new ResponseBean(0, "获取车辆升级日志失败", null);
        }
    }

    @ApiOperation("获取车辆详情-基础信息tab页")
    @RequestMapping(value = "/api/basic/task/getTaskDetaile", method = RequestMethod.GET)
    public ResponseBean getTaskDetaile(String taskId) {
        logger.info("接收到获取车辆详情-基础信息tab页请求，请求信息：" + taskId);
        try {

            TaskBaseEntity taskBaseEntity = taskService.getTaskDetaile(taskId);
            //获取任务车辆数量
            TaskCarInfoNumsEntity taskCarInfoNumsEntity=taskService.selectTaskCarNum(taskId);

            taskBaseEntity.setTaskCars(taskCarInfoNumsEntity);
            if (taskBaseEntity!=null) {
                return new ResponseBean(1, "获取车辆详情-基础信息tab页成功", taskBaseEntity);
            } else {
                logger.info("获取车辆详情-基础信息tab页成功,无日志数据");
                return new ResponseBean(0, "获取车辆详情-基础信息tab页成功,无日志数据", null);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.info("获取车辆详情-基础信息tab页失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
            return new ResponseBean(0, "获取车辆详情-基础信息tab页志失败", null);
        }
    }


    @ApiOperation("创建任务时，根据车型获取升级包信息")
    @RequestMapping(value = "/api/basic/task/getPackageByCarType", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getPackageByCarType(@RequestBody TaskReqParaEntity taskReqParaEntity) {
        ResultT<PagerDataBaseVO> result = new ResultT<>();

        logger.info("接收到创建任务时，根据车型获取升级包信息请求，请求信息：" + JSON.toJSONString(taskReqParaEntity));

        try {
            PagerDataBaseVO type = new PagerDataBaseVO();
            PageHelper.startPage(taskReqParaEntity.getPi(), taskReqParaEntity.getPs());
            List<PackageByCarTypeEntity> lst = taskService.getPackageByCarType(taskReqParaEntity.getCarTypeId());
            PageInfo<PackageByCarTypeEntity> pageInfo = new PageInfo<>(lst);
            int index = pageInfo.getStartRow() - 1;
            for (PackageByCarTypeEntity item : lst) {
                item.setIndex(index += 1);
            }
            type.setTotal(pageInfo.getTotal());
            type.setData(lst);
            result.setResult(type);
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.info("创建任务时，根据车型获取升级包信息失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
            result.setSuccess(-1);
            return result;
        }
    }

    @ApiOperation("创建任务时，根据车型获取vin集合信息")
    @RequestMapping(value = "/api/basic/task/getVinByCarType", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getVinByCarType(@RequestBody TaskReqParaEntity taskReqParaEntity) {
        ResultT<PagerDataBaseVO> result = new ResultT<>();

        logger.info("接收到创建任务时，根据车型获取vin集合信息请求，请求信息：" + JSON.toJSONString(taskReqParaEntity));

        try {
            PagerDataBaseVO type = new PagerDataBaseVO();
            PageHelper.startPage(taskReqParaEntity.getPi(), taskReqParaEntity.getPs());
            List<VinListByCarTypeEntity> lst = taskService.getVinByCarType(taskReqParaEntity.getCarTypeId());
            PageInfo<VinListByCarTypeEntity> pageInfo = new PageInfo<>(lst);
            int index = pageInfo.getStartRow() - 1;
            for (VinListByCarTypeEntity item : lst) {
                item.setIndex(index += 1);
                //判断该车是否有任务
                int countNum=taskService.getVinIsTasking(item.getVin());
                if(countNum>0){
                    item.setIsTasking(1);//有任务
                }else {
                    item.setIsTasking(0);//无任务
                }
            }
            type.setTotal(pageInfo.getTotal());
            type.setData(lst);
            result.setResult(type);
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.info("创建任务时，根据车型获取vin集合信息失败：失败信息：" + ExcpUtil.getStackTraceString(ex));
            result.setSuccess(-1);
            return result;
        }
    }
}
