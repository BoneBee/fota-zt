package com.intest.systemservice.impl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.exception.ResponseBean;
import com.intest.basicservice.table.config.helper.ValidateHelper;
import com.intest.common.exception.CustomException;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.common.util.StringUtils;
import com.intest.dao.entity.*;
import com.intest.dao.entity.system.TaskReviewTmpExtend;
import com.intest.dao.mapper.*;
import com.intest.partsservice.part.response.DateResponse;
import com.intest.systemservice.impl.service.SystemPage;
import com.intest.systemservice.impl.service.TaskReviewTmpService;
import com.intest.systemservice.request.AddTaskReviewTmpRequest;
import com.intest.systemservice.request.DeleteTaskReviewTmpRequest;
import com.intest.systemservice.request.UpdateTaskReviewTmpRequest;
import com.intest.systemservice.response.TaskReviewTmpResponse;
import com.intest.systemservice.response.TaskUserResopnse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
@TableDataAnnotation
public class TaskReviewTmpImpl implements TaskReviewTmpService {

    @Autowired
    TaskReviewTmpBtoMapper mapper;
    @Autowired
    TaskReviewTmpDetileExtendMapper taskReviewTmpDetileExtendMapper;
    @Autowired
    TaskReviewTmpExtendMapper taskReviewTmpExtendMapper;
    @Autowired
    TaskReviewTmpDetileBtoMapper detileBtoMapper;
    @Autowired
    UserBtoMapper userBtoMapper;

    @Override
    @Transactional
    public ResponseBean addTaskReviewTmp(AddTaskReviewTmpRequest request, UserBto userBto) {
        ValidateHelper.validateNull(request, new String[]{"taskTmpName", "tmpType", "taskNum", "state", "taskUserIds"});
        TaskReviewTmpBto taskReviewTmpBto = new TaskReviewTmpBto();
        taskReviewTmpBto.setTaskreviewtmpId(UUID.randomUUID() + "");
        taskReviewTmpBto.setTaskReviewtmpName(request.getTaskTmpName());
        taskReviewTmpBto.setState((short) request.getState());
        taskReviewTmpBto.setTmpType((short) request.getTmpType());
        taskReviewTmpBto.setIsdelete((short) 1);
        taskReviewTmpBto.setTasknum((short) request.getTaskNum());
        taskReviewTmpBto.setCreateat(new Date());
        taskReviewTmpBto.setCreateby("admin");
        if (mapper.insert(taskReviewTmpBto) != 1) {
            throw new CustomException("存储失败！");
        }
        List<TaskReviewTmpDetileBto> btos = new ArrayList<>();
        for (AddTaskReviewTmpRequest.TaskUserBean taskUserBean : request.getTaskUserIds()) {
            TaskReviewTmpDetileBto taskReviewTmpDetileBto = new TaskReviewTmpDetileBto();
            taskReviewTmpDetileBto.setTaskreviewtmpdetaileId(UUID.randomUUID() + "");
            taskReviewTmpDetileBto.setFkTaskreviewtmpId(taskReviewTmpBto.getTaskreviewtmpId());
            taskReviewTmpDetileBto.setFkUserId(taskUserBean.getUserId());
            taskReviewTmpDetileBto.setReviewLevel((short) taskUserBean.getLevel());
            taskReviewTmpDetileBto.setIsdelete((short) 1);
            taskReviewTmpDetileBto.setCreateat(new Date());
            taskReviewTmpDetileBto.setCreateby(userBto.getRealName());
            btos.add(taskReviewTmpDetileBto);
        }
        taskReviewTmpDetileExtendMapper.insertTaskReviewTmpDetile(btos);

        return new ResponseBean(1, "新增成功", null);
    }

    @Override
    @Transactional
    public ResponseBean updateTaskReviewTmp(UpdateTaskReviewTmpRequest request, UserBto userBto) {
        ValidateHelper.validateNull(request, new String[]{"taskTmpName", "taskTmpId", "tmpType", "taskNum", "state", "taskUserIds"});
        TaskReviewTmpBto taskReviewTmpBto = mapper.selectByPrimaryKey(request.getTaskTmpId());
        if (taskReviewTmpBto == null) {
            throw new CustomException("找不到taskReviewTmpBto数据");
        }
        taskReviewTmpBto.setTaskReviewtmpName(request.getTaskTmpName());
        taskReviewTmpBto.setTmpType((short) request.getTmpType());
        taskReviewTmpBto.setState((short) request.getState());
        taskReviewTmpBto.setTasknum((short) request.getTaskNum());
        taskReviewTmpBto.setUpdateat(new Date());
        taskReviewTmpBto.setUpdateby(userBto.getRealName());
        if (mapper.updateByPrimaryKey(taskReviewTmpBto) != 1) {
            throw new CustomException("taskReviewTmpBto更新失败");
        }
        TaskReviewTmpDetileBtoExample example = new TaskReviewTmpDetileBtoExample();
        TaskReviewTmpDetileBtoExample.Criteria criteria = example.createCriteria();
        criteria.andFkTaskreviewtmpIdEqualTo(request.getTaskTmpId());
        detileBtoMapper.deleteByExample(example);
        List<TaskReviewTmpDetileBto> btos = new ArrayList<>();
        for (UpdateTaskReviewTmpRequest.TaskUserBean userBean : request.getTaskUserIds()) {
            TaskReviewTmpDetileBto taskReviewTmpDetileBto = new TaskReviewTmpDetileBto();
            taskReviewTmpDetileBto.setTaskreviewtmpdetaileId(UUID.randomUUID() + "");
            taskReviewTmpDetileBto.setFkTaskreviewtmpId(request.getTaskTmpId());
            taskReviewTmpDetileBto.setReviewLevel((short) userBean.getLevel());
            taskReviewTmpDetileBto.setFkUserId(userBean.getUserId());
            taskReviewTmpDetileBto.setCreateat(new Date());
            taskReviewTmpDetileBto.setCreateby(userBto.getRealName());
            taskReviewTmpDetileBto.setIsdelete((short) 1);
            taskReviewTmpDetileBto.setUpdateat(new Date());
            taskReviewTmpDetileBto.setUpdateby(userBto.getRealName());
            btos.add(taskReviewTmpDetileBto);
        }
        taskReviewTmpDetileExtendMapper.insertTaskReviewTmpDetile(btos);
        return new ResponseBean(1, "编辑成功", null);
    }

    @Override
    @Transactional
    public ResponseBean deleteTaskReviewTmps(DeleteTaskReviewTmpRequest request) {
        ValidateHelper.validateNull(request, new String[]{"deleteDates"});
        if (request.getDeleteDates().size() <= 0) {
            throw new CustomException("请输入要删除的ID数据");
        }
        List<String> taskTmpIds = new ArrayList<>();
        List<String> deleteMessages = new ArrayList<>();
        for (DeleteTaskReviewTmpRequest.DeleteTaskReviewTmpIdBean deleteTaskReviewTmpIdBean : request.getDeleteDates()) {
            taskTmpIds.add(deleteTaskReviewTmpIdBean.getTaskTmpId());
            for (DeleteTaskReviewTmpRequest.DeleteTaskIdBean deleteTaskIdBean : deleteTaskReviewTmpIdBean.getDeleteMessage()) {
                deleteMessages.add(deleteTaskIdBean.getId());
            }
        }
        taskReviewTmpDetileExtendMapper.deleteTaskReviewTmpDetile(deleteMessages);
        taskReviewTmpExtendMapper.deleteTaskReviewTmp(taskTmpIds);

        return new ResponseBean(1, "删除成功", null);
    }

    @Override
    @TableDataAnnotation(tableId = "49ffe733-9cc6-4cda-ad35-b06b631d2b74")
    public PagerDataBaseVO getTaskReviewTmpInfo(SystemPage model) {
        PagerDataBaseVO task = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<TaskReviewTmpExtend> taskReviewTmpExtends = taskReviewTmpExtendMapper.getTaskReviewTmpInfo();
        List<TaskReviewTmpExtend> taskType = taskReviewTmpExtends.stream().filter(distinctByKey(TaskReviewTmpExtend::getTaskTmpId)).collect(Collectors.toList());
        PageInfo<TaskReviewTmpExtend> pageInfo = new PageInfo<TaskReviewTmpExtend>(taskType);
        List<TaskReviewTmpResponse> taskReviewTmpResponses = new ArrayList<>();
        int index = pageInfo.getStartRow() - 1;
        for (TaskReviewTmpExtend e : taskType) {
            List<TaskReviewTmpResponse.DetailBean> detailBeans = new ArrayList<>();
            for (TaskReviewTmpExtend b : taskReviewTmpExtends) {
                if (e.getTaskTmpId().equals(b.getTaskTmpId())) {
                    TaskReviewTmpResponse.DetailBean bean = new TaskReviewTmpResponse.DetailBean(b.getDetailID(), b.getUserId(), b.getNamed(), b.getRealName(), b.getLevels());
                    detailBeans.add(bean);
                }
            }
            TaskReviewTmpResponse response = new TaskReviewTmpResponse(index += 1, e.getTaskTmpId(), detailBeans, e.getTaskTmpName(), e.getTmpType(), e.getState(), e.getTaskNum(), e.getCreateAt(), e.getCreateBy(), e.getUpdateAt(), e.getUpdateBy());
            taskReviewTmpResponses.add(response);
        }

        task.setTotal(pageInfo.getTotal());
        task.setData(taskReviewTmpResponses);

        return task;
    }

    @Override
    public ResponseBean updateTaskReviewTmpState(String id, int state) {
        if (!StringUtils.isNotEmptyStr(id)) {
            throw new CustomException("id不能为空");
        }
        TaskReviewTmpBto taskReviewTmpBto = mapper.selectByPrimaryKey(id);
        if (taskReviewTmpBto == null) {
            throw new CustomException("未找到对应ID数据");
        }
        taskReviewTmpBto.setState((short) state);
        if (state == 1) {
            TaskReviewTmpBtoExample example = new TaskReviewTmpBtoExample();
            TaskReviewTmpBtoExample.Criteria criteria = example.createCriteria();
            criteria.andTmpTypeEqualTo((short) state);
            criteria.andStateEqualTo((short) 1);
            List<TaskReviewTmpBto> tmpBtoList = mapper.selectByExample(example);
            if (tmpBtoList != null && tmpBtoList.size() > 0) {
                for (TaskReviewTmpBto bto : tmpBtoList) {
                    bto.setState((short) 0);
                    if (mapper.updateByPrimaryKey(bto) != 1) {
                        throw new CustomException("修改bto失败！");
                    }
                }
            }
        }
        if (mapper.updateByPrimaryKey(taskReviewTmpBto) != 1) {
            throw new CustomException("修改taskReviewTmpBto失败！");
        }
        return new ResponseBean(1, "修改状态成功", null);
    }

    @Override
    public ResponseBean selectTaskTmpName(String taskTmpName, String taskTmpId) {

        if (!StringUtils.isNotEmptyStr(taskTmpName)) {
            throw new CustomException("审核名称不能为空");
        }
        if (StringUtils.isNotEmptyStr(taskTmpId)) {
            TaskReviewTmpBto taskReviewTmpBto = mapper.selectByPrimaryKey(taskTmpId);
            if (taskReviewTmpBto.getTaskReviewtmpName().equals(taskTmpName)) {
                return new ResponseBean(1, "该审核名称不存在", new DateResponse(0));
            }
        }
        TaskReviewTmpBtoExample example = new TaskReviewTmpBtoExample();
        TaskReviewTmpBtoExample.Criteria criteria = example.createCriteria();
        criteria.andTaskReviewtmpNameEqualTo(taskTmpName);
        List<TaskReviewTmpBto> tmpBtoList = mapper.selectByExample(example);
        if (tmpBtoList != null && tmpBtoList.size() > 0) {
            return new ResponseBean(1, "该审核名称已存在", new DateResponse(1));
        } else {
            return new ResponseBean(1, "该审核名称不存在", new DateResponse(0));
        }
    }

    @Override
    public List<TaskUserResopnse> getTaskUserList() {
        List<UserBto> userBtoList = userBtoMapper.selectByExample(null);
        List<TaskUserResopnse> taskUserResopnseList = new ArrayList<>();
        for (UserBto userBto : userBtoList) {
            TaskUserResopnse taskUserResopnse = new TaskUserResopnse();
            taskUserResopnse.setUserId(userBto.getUserId());
            taskUserResopnse.setName(userBto.getLoginName());
            taskUserResopnse.setRealName(userBto.getRealName());
            taskUserResopnseList.add(taskUserResopnse);
        }
        return taskUserResopnseList;
    }



    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        ConcurrentHashMap<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }


}
