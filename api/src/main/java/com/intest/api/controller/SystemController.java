package com.intest.api.controller;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.result.ResultT;
import com.intest.common.webcore.BaseController;
import com.intest.systemservice.impl.service.SystemPage;
import com.intest.systemservice.impl.service.impl.*;
import com.intest.systemservice.request.*;
import com.intest.util.ModelName;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = {"系统管理"})
public class SystemController extends BaseController {

    @Autowired
    TaskReviewTmpImpl taskReviewTmpImpl;
    @Autowired
    RoleImpl roleImpl;

    /**
     * 新增审核流程
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/addTaskReviewTmp", method = RequestMethod.POST)
    public ResultT addTaskReviewTmp(@RequestBody AddTaskReviewTmpRequest request) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(taskReviewTmpImpl.addTaskReviewTmp(request, getAccount()));
            addOperateLog(ModelName.MODEL_TASKS_REVIEW, ModelName.ACTION_CREATE,ModelName.actionRemark("新建", getAccount().getRealName(), 1));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    /**
     * 修改/编辑审核流程
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/updateTaskReviewTmp", method = RequestMethod.POST)
    public ResultT updateTaskReviewTmp(@RequestBody UpdateTaskReviewTmpRequest request) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(taskReviewTmpImpl.updateTaskReviewTmp(request, getAccount()));
            addOperateLog(ModelName.MODEL_TASKS_REVIEW, ModelName.ACTION_UPDATE,ModelName.actionRemark("编辑", getAccount().getRealName(), 1));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    /**
     * 删除审核流程
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/deleteTaskReviewTmp", method = RequestMethod.POST)
    public ResultT deleteTaskReviewTmp(@RequestBody DeleteTaskReviewTmpRequest request) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(taskReviewTmpImpl.deleteTaskReviewTmps(request));
            addOperateLog(ModelName.MODEL_TASKS_REVIEW, ModelName.ACTION_DELETE,ModelName.actionRemark("删除", getAccount().getRealName(), 1));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
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
    public ResultT updateTaskReviewTmpState(@ApiParam String id, int state) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(taskReviewTmpImpl.updateTaskReviewTmpState(id, state));
            addOperateLog(ModelName.MODEL_TASKS_REVIEW, ModelName.ACTION_TASKS_REVIEW_STATE,ModelName.actionRemark("编辑", getAccount().getRealName(), 1));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    /**
     * 检测审核名称接口
     *
     * @param taskTmpName
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/selectTaskTmpName", method = RequestMethod.GET)
    public ResultT selectTaskTmpName(@ApiParam String taskTmpName, @ApiParam String taskTmpId) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(taskReviewTmpImpl.selectTaskTmpName(taskTmpName, taskTmpId));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    /**
     * 获取审核用户列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/getTaskUserList", method = RequestMethod.GET)
    public ResultT getTaskUserList() {
        ResultT result = new ResultT<>();
        try {
            result.setResult(taskReviewTmpImpl.getTaskUserList());
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    /**
     * 获取权限菜单数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/getSystemMenuList", method = RequestMethod.GET)
    public ResultT getSystemMenuList() {
        ResultT result = new ResultT<>();
        try {
            result.setResult(roleImpl.getRolePermissionList());
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }


    /**
     * 新增角色接口
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/addRole", method = RequestMethod.POST)
    public ResultT addRole(@RequestBody AddRoleRequet request) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(roleImpl.addRole(request));
            addOperateLog(ModelName.MODEL_SYSTEM_ROLE, ModelName.ACTION_CREATE,ModelName.actionRemark("新建", getAccount().getRealName(), 1));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }


    /**
     * 修改角色接口
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/updateRole", method = RequestMethod.POST)
    public ResultT updateRole(@RequestBody UpdateRoleRequet request) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(roleImpl.updateRole(request, getAccount()));
            addOperateLog(ModelName.MODEL_SYSTEM_ROLE, ModelName.ACTION_UPDATE,ModelName.actionRemark("编辑", getAccount().getRealName(), 1));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    /**
     * 删除角色接口
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/deleteRole", method = RequestMethod.POST)
    public ResultT deleteRole(@RequestBody List<DeleteRoleRequet> request) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(roleImpl.deleteRole(request));
            addOperateLog(ModelName.MODEL_SYSTEM_ROLE, ModelName.ACTION_DELETE,ModelName.actionRemark("删除", getAccount().getRealName(), 1));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
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
    public ResultT selectLoginName(@ApiParam String roleName, @ApiParam String id) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(roleImpl.selectLoginName(roleName, id));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }


    /**
     * 获取角色列表接口
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/system/getRoleList", method = RequestMethod.GET)
    public ResultT getRoleList() {
        ResultT result = new ResultT<>();
        try {
            result.setResult(roleImpl.getRoleList());
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

}
