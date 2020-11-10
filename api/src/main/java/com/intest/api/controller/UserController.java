package com.intest.api.controller;


import com.intest.basicservice.table.common.ResponseBean;
import com.intest.basicservice.user.request.*;
import com.intest.basicservice.user.response.ResetPassworldResponse;
import com.intest.basicservice.user.response.UserPage;
import com.intest.basicservice.user.service.impl.UserServiceImpl;
import com.intest.basicservice.user.vo.LoginVO;
import com.intest.common.jwt.JwtUtil;
import com.intest.common.jwt.constant.JwtConstant;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.result.Result;
import com.intest.common.result.ResultT;

import com.intest.common.webcore.BaseController;

import com.intest.dao.entity.table.MenuExtend;
import com.intest.partsservice.part.response.DateResponse;
import com.intest.systemservice.impl.service.impl.PermissionImpl;
import com.intest.systemservice.impl.service.impl.RoleImpl;
import com.intest.systemservice.impl.service.impl.RolePermissionImpl;
import com.intest.systemservice.impl.service.impl.UserRoleImpl;
import com.intest.util.ModelName;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

@RestController
@Api(tags = {"用户登陆/登出/注册接口"})
public class UserController extends BaseController {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    UserRoleImpl userRoleService;

    @Autowired
    RoleImpl roleImpl;

    @Autowired
    PermissionImpl permissionImpl;

    @Autowired
    RolePermissionImpl rolePermissionImpl;


    /**
     * 用户登录
     *
     * @param userRequest
     * @return
     */
    @ResponseBody
    @ApiOperation("用户登录接口")
    @RequestMapping(value = "/api/account/login", method = RequestMethod.POST)
    public ResultT<LoginVO> inLogin(@Validated @RequestBody UserRequest userRequest, BindingResult bindingResult) {
        validData(bindingResult);
        ResultT<LoginVO> result = new ResultT<LoginVO>();
        try {
            LoginVO loginVO = userService.checkLogin(getIpAddr(), "getBrowser()", userRequest.getUserName(), userRequest.getPassword());
            result.setResult(loginVO);
        } catch (Exception ex) {
            result.setFail();
        }

        return result;
    }

    /**
     * create by: zhanghui
     * description: 带Token的用户登录
     * create time: 2020/8/24 21:33
     *
     * @param
     * @return com.intest.common.result.ResultT<com.intest.basicservice.user.vo.LoginVO>
     */
    @ResponseBody
    @ApiOperation("带Token的用户登录接口")
    @RequestMapping(value = "/api/account/logininfo", method = RequestMethod.GET)
    public ResultT<LoginVO> inLogin() {
        String token = this.getAuthorizationToken();
        String account = JwtUtil.getClaim(token, JwtConstant.ACCOUNT);

        //String token = request.getHeader("token");
        //String userId = JedisUtil.getJson(Constant.PREFIX_SHIRO_ACCESS_TOKEN + token);
        ResultT<LoginVO> resultT = new ResultT<>();
        resultT.setResult(userService.getUserLoginInfo(account));
        return resultT;
    }

    /**
     * 用户登出
     *
     * @return
     */
    @ApiOperation("用户登出接口")
    @ResponseBody
    @RequestMapping(value = "/api/account/logout", method = RequestMethod.GET)
    public Result exitLogin(HttpServletRequest request) {
        String token = this.getAuthorizationToken();
        Result result = new Result();
        try {
            String account = JwtUtil.getClaim(token, JwtConstant.ACCOUNT);
            boolean isOK = userService.logout(account);
            if (!isOK) {
                result.setFail();
            }
        } catch (Exception ex) {
            logger.error(ex);
            result.setFail();
        }
        return result;
    }


    /**
     * 用户注册
     *
     * @param request
     * @return
     */
    @ApiOperation("用户注册接口")
    @ResponseBody
    @RequestMapping(value = "/api/infota/product/inRegister", method = RequestMethod.POST)
    public ResponseBean inRegister(@RequestBody AddUserRequest request) {
        int success = userService.inRegister(request, getAccount());
        addOperateLog(ModelName.MODEL_SYSTEM_USER, ModelName.ACTION_CREATE, ModelName.actionRemark("新建", getAccount().getRealName(), success));
        return new ResponseBean(success, "注册成功", null);
    }


    /**
     * 修改用户
     *
     * @param request
     * @return
     */
    @ApiOperation("修改用户接口")
    @ResponseBody
    @RequestMapping(value = "/api/infota/product/updateUser", method = RequestMethod.POST)
    public ResponseBean updateUser(@RequestBody UpdateUserRequest request) {
        int success = userService.updateUser(request);
        addOperateLog(ModelName.MODEL_SYSTEM_USER, ModelName.ACTION_UPDATE, ModelName.actionRemark("编辑", getAccount().getRealName(), success));
        return new ResponseBean(success, "修改成功", null);

    }

    /**
     * 删除用户
     *
     * @param request
     * @return
     */
    @ApiOperation("删除用户接口")
    @ResponseBody
    @RequestMapping(value = "/api/infota/product/deleteUser", method = RequestMethod.POST)
    public ResponseBean deleteUser(@RequestBody List<DeleteUserRequest> request) {
        int success = userService.deleteUser(request);
        addOperateLog(ModelName.MODEL_SYSTEM_USER, ModelName.ACTION_DELETE, ModelName.actionRemark("删除", getAccount().getRealName(), success));
        return new ResponseBean(success, "删除成功", null);
    }


    /**
     * 重置密码
     *
     * @param userId
     * @return
     */
    @ApiOperation("重置密码接口")
    @ResponseBody
    @RequestMapping(value = "/api/infota/product/resetPassworld", method = RequestMethod.GET)
    public ResponseBean resetPassworld(@ApiParam String userId) {
        int success = userService.resetPassworld(userId);
        addOperateLog(ModelName.MODEL_SYSTEM_USER, ModelName.ACTION_SYSTEM_USER_REPLE, ModelName.actionRemark("重置密码", getAccount().getRealName(), success));
        return new ResponseBean(success, "重置密码成功", new ResetPassworldResponse("abCD12"));
    }

    /**
     * 修改密码
     *
     * @param request
     * @return
     */
    @ApiOperation("修改密码")
    @ResponseBody
    @RequestMapping(value = "/api/infota/product/updatePassworld", method = RequestMethod.POST)
    public ResponseBean updatePassworld(@RequestBody UpdatePassworldRequest request) {
        return new ResponseBean(userService.updatePassworld(request), "密码修改成功", null);
    }


    /**
     * 获取用户列表信息
     *
     * @return
     */
    public PagerDataBaseVO ResetPassworld() {
        return userService.getUserInfo(new UserPage());
    }


    /**
     * 查看用户权限
     *
     * @param userId
     * @return
     */
    @ApiOperation("查看用户权限")
    @ResponseBody
    @RequestMapping(value = "/api/infota/product/getUserPermission", method = RequestMethod.GET)
    public ResponseBean getUserPermission(@ApiParam String userId) {
        List<MenuExtend> menuExtends = userService.getUserPermission(userId);
        addOperateLog(ModelName.MODEL_SYSTEM_USER, ModelName.ACTION_SYSTEM_USER_ROLE, ModelName.actionRemark("查看权限", getAccount().getRealName(), menuExtends == null ? 0 : 1));
        return new ResponseBean(1, "权限信息获取成功", menuExtends);
    }

    /**
     * 修改账户状态接口
     *
     * @param userId
     * @return
     */
    @ApiOperation("修改账户状态接口")
    @ResponseBody
    @RequestMapping(value = "/api/infota/product/updateUserState", method = RequestMethod.GET)
    public ResponseBean updateUserState(@ApiParam String userId, @ApiParam int state) {
        int success = userService.updateUserState(userId, state);
        addOperateLog(ModelName.MODEL_SYSTEM_USER, ModelName.ACTION_SYSTEM_USER_STATE, ModelName.actionRemark("删除", getAccount().getRealName(), success));
        return new ResponseBean(success, "修改成功", null);
    }

    /**
     * 检测登陆账户是否重复接口
     *
     * @param loginName
     * @return
     */
    @ApiOperation("检测登陆账户是否重复接口")
    @ResponseBody
    @RequestMapping(value = "/api/infota/product/selectLoginName", method = RequestMethod.GET)
    public ResponseBean selectLoginName(@ApiParam String loginName, @ApiParam String id) {
        return new ResponseBean(1, "查询成功", userService.selectLoginName(loginName, id));
    }

    /**
     * 检测手机号是否重复接口
     *
     * @param phone
     * @return
     */
    @ApiOperation("检测手机号是否重复接口")
    @ResponseBody
    @RequestMapping(value = "/api/infota/product/selectPhone", method = RequestMethod.GET)
    public ResponseBean selectPhone(@ApiParam String phone, @ApiParam String id) {
        return new ResponseBean(1, "查询成功", userService.selectPhone(phone, id));
    }

    /**
     * 检测邮箱是否重复接口
     *
     * @param mail
     * @return
     */
    @ApiOperation("检测邮箱是否重复接口")
    @ResponseBody
    @RequestMapping(value = "/api/infota/product/selectMail", method = RequestMethod.GET)
    public ResponseBean selectMail(@ApiParam String mail, @ApiParam String id) {
        return new ResponseBean(1, "查询成功", userService.selectMail(mail, id));
    }


}