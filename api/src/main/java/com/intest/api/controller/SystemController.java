package com.intest.api.controller;

import com.intest.basicservice.table.common.ResponseBean;
import com.intest.basicservice.table.config.helper.ValidateHelper;
import com.intest.common.exception.CustomException;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.util.StringUtils;
import com.intest.dao.entity.TaskReviewTmpBto;
import com.intest.dao.entity.TaskReviewTmpDetileBto;
import com.intest.systemservice.impl.service.TaskReviewTmpPage;
import com.intest.systemservice.impl.service.impl.TaskReviewTmpDetileImpl;
import com.intest.systemservice.impl.service.impl.TaskReviewTmpImpl;
import com.intest.systemservice.request.AddTaskReviewTmpRequest;
import com.intest.systemservice.request.DeleteTaskReviewTmpRequest;
import com.intest.systemservice.request.UpdateTaskReviewTmpRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@Api(tags = {"系统管理"})
public class SystemController {
    @Autowired
    TaskReviewTmpImpl taskReviewTmpImpl;

    @Autowired
    TaskReviewTmpDetileImpl taskReviewTmpDetileImpl;


    /**
     * 新增审核流程
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/addTaskReviewTmp", method = RequestMethod.POST)
    public ResponseBean addTaskReviewTmp(@RequestBody AddTaskReviewTmpRequest request) {
        ValidateHelper.validateNull(request, new String[]{"taskReviewtmpName", "tmpType", "taskNum", "state", "taskUserIds"});
        TaskReviewTmpBto taskReviewTmpBto = new TaskReviewTmpBto();
        taskReviewTmpBto.setTaskreviewtmpId(UUID.randomUUID() + "");
        taskReviewTmpBto.setTaskReviewtmpName(request.getTaskReviewtmpName());
        taskReviewTmpBto.setState((short) request.getState());
        taskReviewTmpBto.setTmpType((short) request.getTmpType());
        taskReviewTmpBto.setIsdelete((short) 1);
        taskReviewTmpBto.setTasknum((short) request.getTaskNum());
        taskReviewTmpBto.setCreateat(new Date());
        taskReviewTmpBto.setCreateby("admin");
        if (taskReviewTmpImpl.addTaskReviewTmp(taskReviewTmpBto) != 1) {
            throw new CustomException("存储失败！");
        }

        for (AddTaskReviewTmpRequest.TaskUserBean taskUserBean : request.getTaskUserIds()) {
            TaskReviewTmpDetileBto taskReviewTmpDetileBto = new TaskReviewTmpDetileBto();
            taskReviewTmpDetileBto.setTaskreviewtmpdetaileId(UUID.randomUUID() + "");
            taskReviewTmpDetileBto.setFkTaskreviewtmpId(taskReviewTmpBto.getTaskreviewtmpId());
            taskReviewTmpDetileBto.setFkUserId(taskUserBean.getUserId());
            taskReviewTmpDetileBto.setReviewLevel((short) taskUserBean.getLevel());
            taskReviewTmpDetileBto.setIsdelete((short) 1);
            taskReviewTmpDetileBto.setCreateat(new Date());
            taskReviewTmpDetileBto.setCreateby("admin");
            if (taskReviewTmpDetileImpl.addTaskReviewTmpDetile(taskReviewTmpDetileBto) != 1) {
                throw new CustomException("存储失败");
            }
        }
        return new ResponseBean(1, "新增成功", null);
    }

    /**
     * 修改/编辑审核流程
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/updateTaskReviewTmp", method = RequestMethod.POST)
    public ResponseBean updateTaskReviewTmp(@RequestBody UpdateTaskReviewTmpRequest request) {
        ValidateHelper.validateNull(request, new String[]{"taskReviewtmpName", "taskReviewtmpId", "tmpType", "taskNum", "state", "taskUserIds"});
        TaskReviewTmpBto taskReviewTmpBto = taskReviewTmpImpl.getTaskReviewTmpById(request.getTaskReviewtmpId());
        if (taskReviewTmpBto == null) {
            throw new CustomException("找不到taskReviewTmpBto数据");
        }
        taskReviewTmpBto.setTaskReviewtmpName(request.getTaskReviewtmpName());
        taskReviewTmpBto.setTmpType((short) request.getTmpType());
        taskReviewTmpBto.setState((short) request.getState());
        taskReviewTmpBto.setTasknum((short) request.getTaskNum());
        taskReviewTmpBto.setUpdateat(new Date());
        taskReviewTmpBto.setUpdateby("admin");
        if (taskReviewTmpImpl.updateTaskReviewTmp(taskReviewTmpBto) != 1) {
            throw new CustomException("taskReviewTmpBto更新失败");
        }
        for (UpdateTaskReviewTmpRequest.TaskUserBean userBean : request.getTaskUserIds()) {
            TaskReviewTmpDetileBto taskReviewTmpDetileBto = taskReviewTmpDetileImpl.getTaskReviewTmpDetileById(userBean.getTaskReviewTmpDetileId());
            if (taskReviewTmpDetileBto == null) {
                throw new CustomException("找不到taskReviewTmpDetileBto数据");
            }
            taskReviewTmpDetileBto.setReviewLevel((short) userBean.getLevel());
            taskReviewTmpDetileBto.setFkUserId(userBean.getUserId());
            taskReviewTmpDetileBto.setUpdateat(new Date());
            taskReviewTmpDetileBto.setUpdateby("admin");
            if (taskReviewTmpDetileImpl.updateTaskReviewTmpDetile(taskReviewTmpDetileBto) != 1) {
                throw new CustomException("taskReviewTmpDetileBto更新失败");
            }
        }
        return new ResponseBean(1, "编辑成功", null);
    }

    /**
     * 删除审核流程
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/deleteTaskReviewTmp", method = RequestMethod.POST)
    public ResponseBean deleteTaskReviewTmp(@RequestBody DeleteTaskReviewTmpRequest request) {
        ValidateHelper.validateNull(request, new String[]{"deleteDates"});
        if (request.getDeleteDates().size() <= 0) {
            throw new CustomException("请输入要删除的ID数据");
        }
        for (DeleteTaskReviewTmpRequest.DeleteTaskReviewTmpIdBean deleteTaskReviewTmpIdBean : request.getDeleteDates()) {
            if (taskReviewTmpImpl.deleteTaskReviewTmp(deleteTaskReviewTmpIdBean.getTaskReviewtmpId()) != 1) {
                throw new CustomException("删除taskReviewTmpBto失败");
            }
            for (DeleteTaskReviewTmpRequest.DeleteTaskIdBean deleteTaskIdBean : deleteTaskReviewTmpIdBean.getDeleteDate()) {
                if (taskReviewTmpDetileImpl.deleteTaskReviewTmpDetile(deleteTaskIdBean.getTaskReviewTmpDetileId()) != 1) {
                    throw new CustomException("删除taskReviewTmpDetileBto失败");
                }
            }
        }
        return new ResponseBean(1, "删除成功", null);
    }

    public PagerDataBaseVO getTaskReviewTmpList() {
        return taskReviewTmpImpl.getTaskReviewTmpInfo(new TaskReviewTmpPage());
    }

    /**
     * 修改审核流程状态
     *
     * @param id
     * @param state
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/updateTaskReviewTmpState", method = RequestMethod.GET)
    public ResponseBean updateTaskReviewTmpState(@ApiParam String id, int state) {
        if (!StringUtils.isNotEmptyStr(id)) {
            throw new CustomException("id不能为空");
        }
        TaskReviewTmpBto taskReviewTmpBto = taskReviewTmpImpl.getTaskReviewTmpById(id);
        if (taskReviewTmpBto == null) {
            throw new CustomException("未找到对应ID数据");
        }
        taskReviewTmpBto.setState((short) state);
        if (state == 1) {
            List<TaskReviewTmpBto> tmpBtoList = taskReviewTmpImpl.getTaskReviewTmpByTmpType(1);
            if (tmpBtoList != null && tmpBtoList.size() > 0) {
                for (TaskReviewTmpBto bto : tmpBtoList) {
                    bto.setState((short) 0);
                    if (taskReviewTmpImpl.updateTaskReviewTmp(bto) != 1) {
                        throw new CustomException("修改bto失败！");
                    }
                }
            }
        }
        if (taskReviewTmpImpl.updateTaskReviewTmp(taskReviewTmpBto) != 1) {
            throw new CustomException("修改taskReviewTmpBto失败！");
        }
        return new ResponseBean(1, "修改状态成功", null);
    }
}
