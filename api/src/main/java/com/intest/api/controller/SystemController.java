package com.intest.api.controller;

import com.intest.basicservice.table.common.ResponseBean;
import com.intest.basicservice.table.config.helper.ValidateHelper;
import com.intest.basicservice.table.service.impl.*;
import com.intest.basicservice.user.service.impl.UserServiceImpl;
import com.intest.common.exception.CustomException;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.util.StringUtils;
import com.intest.common.webcore.BaseController;
import com.intest.dao.entity.*;
import com.intest.partsservice.part.response.DateResponse;
import com.intest.systemservice.impl.service.SystemPage;
import com.intest.systemservice.impl.service.impl.*;
import com.intest.systemservice.request.*;
import com.intest.systemservice.response.RoleListResponse;
import com.intest.systemservice.response.TaskUserResopnse;
import com.intest.util.ModelName;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@Api(tags = {"系统管理"})
public class SystemController extends BaseController {
    @Autowired
    EditSaveTableImpl editSaveTableImpl;

    @Autowired
    ToolbarImpl toolbarImpl;

    @Autowired
    ToolbarItemImpl toolbarItemImpl;

    @Autowired
    TaskReviewTmpImpl taskReviewTmpImpl;

    @Autowired
    TaskReviewTmpDetileImpl taskReviewTmpDetileImpl;

    @Autowired
    UserServiceImpl userService;

    @Autowired
    MeunImpl menuService;

    @Autowired
    ItemImpl itemImpl;

    @Autowired
    RoleImpl roleImpl;

    @Autowired
    PermissionImpl permissionImpl;
    @Autowired
    RolePermissionImpl rolePermissionImpl;

    /**
     * 新增审核流程
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/addTaskReviewTmp", method = RequestMethod.POST)
    public ResponseBean addTaskReviewTmp(@RequestBody AddTaskReviewTmpRequest request) {
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
        addOperateLog(ModelName.MODEL_TASKS_REVIEW, ModelName.ACTION_CREATE);
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
        ValidateHelper.validateNull(request, new String[]{"taskTmpName", "taskTmpId", "tmpType", "taskNum", "state", "taskUserIds"});
        TaskReviewTmpBto taskReviewTmpBto = taskReviewTmpImpl.getTaskReviewTmpById(request.getTaskTmpId());
        if (taskReviewTmpBto == null) {
            throw new CustomException("找不到taskReviewTmpBto数据");
        }
        UserBto userBto = getAccount();
        taskReviewTmpBto.setTaskReviewtmpName(request.getTaskTmpName());
        taskReviewTmpBto.setTmpType((short) request.getTmpType());
        taskReviewTmpBto.setState((short) request.getState());
        taskReviewTmpBto.setTasknum((short) request.getTaskNum());
        taskReviewTmpBto.setUpdateat(new Date());
        taskReviewTmpBto.setUpdateby(userBto.getRealName());
        if (taskReviewTmpImpl.updateTaskReviewTmp(taskReviewTmpBto) != 1) {
            throw new CustomException("taskReviewTmpBto更新失败");
        }
        taskReviewTmpDetileImpl.deleteTaskReviewTmpDetileById(request.getTaskTmpId());
        for (UpdateTaskReviewTmpRequest.TaskUserBean userBean : request.getTaskUserIds()) {
            TaskReviewTmpDetileBto taskReviewTmpDetileBto = new TaskReviewTmpDetileBto();
            taskReviewTmpDetileBto.setTaskreviewtmpdetaileId(UUID.randomUUID() + "");
            taskReviewTmpDetileBto.setFkTaskreviewtmpId(request.getTaskTmpId());
            taskReviewTmpDetileBto.setReviewLevel((short) userBean.getLevel());
            taskReviewTmpDetileBto.setFkUserId(userBean.getUserId());
            taskReviewTmpDetileBto.setCreateat(new Date());
            taskReviewTmpDetileBto.setCreateby("admin");
            taskReviewTmpDetileBto.setIsdelete((short) 1);
            taskReviewTmpDetileBto.setUpdateat(new Date());
            taskReviewTmpDetileBto.setUpdateby("admin");
            if (taskReviewTmpDetileImpl.addTaskReviewTmpDetile(taskReviewTmpDetileBto) != 1) {
                throw new CustomException("taskReviewTmpDetileBto更新失败");
            }
        }
        addOperateLog(ModelName.MODEL_TASKS_REVIEW, ModelName.ACTION_UPDATE);
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
            if (taskReviewTmpImpl.deleteTaskReviewTmp(deleteTaskReviewTmpIdBean.getTaskTmpId()) != 1) {
                throw new CustomException("删除taskReviewTmpBto失败");
            }
            for (DeleteTaskReviewTmpRequest.DeleteTaskIdBean deleteTaskIdBean : deleteTaskReviewTmpIdBean.getDeleteMessage()) {
                if (taskReviewTmpDetileImpl.deleteTaskReviewTmpDetile(deleteTaskIdBean.getId()) != 1) {
                    throw new CustomException("删除taskReviewTmpDetileBto失败");
                }
            }
        }
        addOperateLog(ModelName.MODEL_TASKS_REVIEW, ModelName.ACTION_DELETE);
        return new ResponseBean(1, "删除成功", null);
    }

    /**
     * 获取审核流程列表
     *
     * @return
     */
    public PagerDataBaseVO getTaskReviewTmpList() {
        return taskReviewTmpImpl.getTaskReviewTmpInfo(new SystemPage());
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

    /**
     * 检测审核名称接口
     *
     * @param taskTmpName
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/selectTaskTmpName", method = RequestMethod.GET)
    public ResponseBean selectTaskTmpName(@ApiParam String taskTmpName, @ApiParam String taskTmpId) {
        if (!StringUtils.isNotEmptyStr(taskTmpName)) {
            throw new CustomException("审核名称不能为空");
        }
        if (StringUtils.isNotEmptyStr(taskTmpId)) {
            TaskReviewTmpBto taskReviewTmpBto = taskReviewTmpImpl.getTaskReviewTmpById(taskTmpId);
            if (taskReviewTmpBto.getTaskReviewtmpName().equals(taskTmpName)) {
                return new ResponseBean(1, "该审核名称不存在", new DateResponse(0));
            }
        }
        TaskReviewTmpBto taskReviewTmpBto = taskReviewTmpImpl.getTaskReviewTmpByName(taskTmpName);
        if (taskReviewTmpBto != null) {
            return new ResponseBean(1, "该审核名称已存在", new DateResponse(1));
        } else {
            return new ResponseBean(1, "该审核名称不存在", new DateResponse(0));
        }
    }

    /**
     * 获取审核用户列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/getTaskUserList", method = RequestMethod.GET)
    public ResponseBean getTaskUserList() {
        List<UserBto> userBtos = userService.getUserList();
        List<TaskUserResopnse> taskUserResopnseList = new ArrayList<>();
        for (UserBto userBto : userBtos) {
            TaskUserResopnse taskUserResopnse = new TaskUserResopnse();
            taskUserResopnse.setUserId(userBto.getUserId());
            taskUserResopnse.setName(userBto.getLoginName());
            taskUserResopnse.setRealName(userBto.getRealName());
            taskUserResopnseList.add(taskUserResopnse);
        }
        return new ResponseBean(1, "", taskUserResopnseList);

    }

    /**
     * 菜单管理接口
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/getSystemMenuList", method = RequestMethod.GET)
    public ResponseBean getSystemMenuList() {
        return new ResponseBean(1, "", roleImpl.getRolePermissionList());
    }

    /**
     * 新增角色接口
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/addRole", method = RequestMethod.POST)
    public ResponseBean addRole(@RequestBody AddRoleRequet request) {
        ValidateHelper.validateNull(request, new String[]{"roleName", "roleType"});
        if (roleImpl.getRoleByName(request.getRoleName()) != null) {
            throw new CustomException("该角色名称已存在！");
        }
        RoleBto roleBto = new RoleBto();
        roleBto.setRoleId(UUID.randomUUID() + "");
        roleBto.setRoleName(request.getRoleName());
        roleBto.setRoleType((short) request.getRoleType());
        roleBto.setIsdelete((short) 1);
        roleBto.setCreateat(new Date());
        roleBto.setCreateby("admin");
        roleImpl.addAll(roleBto.getRoleId(), request.getList());

        if (roleImpl.addRole(roleBto) != 1) {
            throw new CustomException("新增角色失败！");
        }
        addOperateLog(ModelName.MODEL_SYSTEM_ROLE, ModelName.ACTION_CREATE);
        return new ResponseBean(1, "新增角色成功", null);
    }


    /**
     * 修改角色接口
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/updateRole", method = RequestMethod.POST)
    public ResponseBean updateRole(@RequestBody UpdateRoleRequet request) {
        ValidateHelper.validateNull(request, new String[]{"roleName", "roleType", "roleId"});
        List<RolePermissionBto> rolePermissionBtoList = rolePermissionImpl.getRolePermissionListByRoleId(request.getRoleId());
        roleImpl.deleteRole(request.getRoleId());
        for (RolePermissionBto bto : rolePermissionBtoList) {
            permissionImpl.deletePermission(bto.getFkPermissionId());
            rolePermissionImpl.deleteRolePermission(bto.getRolepermissionId());
        }
        RoleBto roleBto = roleImpl.getRoleById(request.getRoleId());
        UserBto userBto = getAccount();
        roleBto.setRoleId(UUID.randomUUID() + "");
        roleBto.setRoleName(request.getRoleName());
        roleBto.setRoleType((short) request.getRoleType());
        roleBto.setIsdelete((short) 1);
        roleBto.setUpdateat(new Date());
        roleBto.setRemark(request.getRemark());
        roleBto.setUpdateby(userBto.getRealName());
        roleImpl.addAll(roleBto.getRoleId(), request.getList());
        if (roleImpl.updateRole(roleBto) != 1) {
            throw new CustomException("修改角色失败！");
        }
        addOperateLog(ModelName.MODEL_SYSTEM_ROLE, ModelName.ACTION_UPDATE);
        return new ResponseBean(1, "修改角色成功", null);
    }

    /**
     * 删除角色接口
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/deleteRole", method = RequestMethod.POST)
    public ResponseBean deleteRole(@RequestBody List<DeleteRoleRequet> request) {
        if (request == null || request.size() == 0) {
            throw new CustomException("请输入需要删除的角色ID！");
        }
        for (DeleteRoleRequet deleteRoleRequet : request) {
            List<RolePermissionBto> rolePermissionBtoList = rolePermissionImpl.getRolePermissionListByRoleId(deleteRoleRequet.getRoleId());
            for (RolePermissionBto bto : rolePermissionBtoList) {
                permissionImpl.deletePermission(bto.getFkPermissionId());
                rolePermissionImpl.deleteRolePermission(bto.getRolepermissionId());
            }
            roleImpl.deleteRole(deleteRoleRequet.getRoleId());
        }
        addOperateLog(ModelName.MODEL_SYSTEM_ROLE, ModelName.ACTION_DELETE);
        return new ResponseBean(1, "删除角色成功", null);
    }

    /**
     * 获取角色权限详细列表接口
     *
     * @return
     */
    public PagerDataBaseVO getRoleTmpList() {
        return roleImpl.getRoleTmpInfo(new SystemPage());
    }


    /**
     * 检测角色名称是否重复接口
     *
     * @param roleName
     * @return
     */
    @ApiOperation("检测角色名称是否重复接口")
    @ResponseBody
    @RequestMapping(value = "/api/infota/product/selectRoleName", method = RequestMethod.GET)
    public ResponseBean selectLoginName(@ApiParam String roleName, @ApiParam String id) {
        if (!StringUtils.isNotEmptyStr(roleName)) {
            throw new CustomException("角色名称不能为空");
        }
        if (StringUtils.isNotEmptyStr(id)) {
            RoleBto roleBto = roleImpl.getRoleById(id);
            if (roleBto.getRoleName().equals(roleName)) {
                return new ResponseBean(1, "角色名称未注册", new DateResponse(0));
            }
        }
        RoleBto roleBto = roleImpl.getRoleByName(roleName);
        if (roleBto == null) {
            return new ResponseBean(1, "该角色名称未注册", new DateResponse(0));
        } else {
            return new ResponseBean(1, "该角色名称已注册，请重新输入", new DateResponse(1));
        }
    }


    /**
     * 获取角色列表接口
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/getRoleList", method = RequestMethod.GET)
    public ResponseBean deleteRole() {
        List<RoleBto> roleBtos = roleImpl.getAllRole();
        List<RoleListResponse> responseList = new ArrayList<>();
        for (RoleBto bto : roleBtos) {
            RoleListResponse response = new RoleListResponse();
            response.setRoleName(bto.getRoleName());
            response.setRoleId(bto.getRoleId());
            responseList.add(response);
        }
        return new ResponseBean(1, "成功", responseList);
    }

}
