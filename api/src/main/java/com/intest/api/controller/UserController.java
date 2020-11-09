package com.intest.api.controller;


import com.intest.basicservice.table.common.ResponseBean;
import com.intest.basicservice.table.config.helper.ValidateHelper;
import com.intest.basicservice.table.util.CheckPwd;
import com.intest.basicservice.user.request.*;
import com.intest.basicservice.user.response.ResetPassworldResponse;
import com.intest.basicservice.user.response.UserPage;
import com.intest.basicservice.user.service.impl.UserServiceImpl;
import com.intest.basicservice.user.vo.LoginVO;
import com.intest.common.exception.CustomException;
import com.intest.common.jwt.JwtUtil;
import com.intest.common.jwt.constant.JwtConstant;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.result.Result;
import com.intest.common.result.ResultT;
import com.intest.common.util.BCrypt;
import com.intest.common.util.StringUtils;
import com.intest.common.webcore.BaseController;
import com.intest.dao.entity.*;
import com.intest.partsservice.part.response.DateResponse;
import com.intest.systemservice.impl.service.impl.PermissionImpl;
import com.intest.systemservice.impl.service.impl.RoleImpl;
import com.intest.systemservice.impl.service.impl.RolePermissionImpl;
import com.intest.systemservice.impl.service.impl.UserRoleImpl;
import com.intest.systemservice.response.SystemMenuResponse;
import com.intest.util.ModelName;
import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.UserAgent;
import eu.bitwalker.useragentutils.Version;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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
    public ResultT inRegister(@RequestBody AddUserRequest request) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(userService.inRegister(request));
            addOperateLog(ModelName.MODEL_SYSTEM_USER, ModelName.ACTION_CREATE);
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
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
    public ResultT updateUser(@RequestBody UpdateUserRequest request) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(userService.updateUser(request));
            addOperateLog(ModelName.MODEL_SYSTEM_USER, ModelName.ACTION_UPDATE);
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;

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
    public ResultT deleteUser(@RequestBody List<DeleteUserRequest> request) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(userService.deleteUser(request));
            addOperateLog(ModelName.MODEL_SYSTEM_USER, ModelName.ACTION_DELETE);
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
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
    public ResultT resetPassworld(@ApiParam String userId) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(userService.resetPassworld(userId));
            addOperateLog(ModelName.MODEL_SYSTEM_USER, ModelName.ACTION_SYSTEM_USER_REPLE);
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
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
    public ResultT updatePassworld(@RequestBody UpdatePassworldRequest request) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(userService.updatePassworld(request));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
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
//        if (!StringUtils.isNotEmptyStr(userId)) {
//            throw new CustomException("用户ID不能为空");
//        }
//        UserRoleBto userRoleBto = userRoleService.getUserRoleByUserId(userId);
//        RoleBto roleBto = roleImpl.getRoleById(userRoleBto.getFkRoleId());
//        List<SystemMenuResponse> list = roleImpl.getRolePermissionList();
//        List<RolePermissionBto> rolePermissionBtoList = rolePermissionImpl.getRolePermissionListByRoleId(roleBto.getRoleId());
//        List<PermissionBto> permissionBtoList = new ArrayList<>();
//        for (RolePermissionBto rolePermissionBto : rolePermissionBtoList) {
//            PermissionBto permissionBto = permissionImpl.getPermissionById(rolePermissionBto.getFkPermissionId());
//            permissionBtoList.add(permissionBto);
//        }
//        List<SystemMenuResponse> one = new ArrayList<>();
//        for (SystemMenuResponse bto1 : list) {
//            SystemMenuResponse response1 = new SystemMenuResponse();
//            response1.setTitle(bto1.getTitle());
//            response1.setType(bto1.getType());
//            response1.setKey(bto1.getKey());
//            for (PermissionBto permissionBto : permissionBtoList) {
//                if (bto1.getKey().equals(permissionBto.getFkResourceId())) {
//                    response1.setChecked(true);
//                }
//            }
//            List<SystemMenuResponse> two = new ArrayList<>();
//            if (bto1.getChildren() != null && bto1.getChildren().size() != 0) {
//                for (SystemMenuResponse bto2 : bto1.getChildren()) {
//                    SystemMenuResponse response2 = new SystemMenuResponse();
//                    response2.setTitle(bto2.getTitle());
//                    response2.setType(bto2.getType());
//                    response2.setKey(bto2.getKey());
//                    for (PermissionBto permissionBto : permissionBtoList) {
//                        if (bto2.getKey().equals(permissionBto.getFkResourceId())) {
//                            response2.setChecked(true);
//                        }
//                    }
//                    List<SystemMenuResponse> three = new ArrayList<>();
//                    if (bto2.getChildren() != null && bto2.getChildren().size() != 0) {
//                        for (SystemMenuResponse bto3 : bto2.getChildren()) {
//                            SystemMenuResponse response3 = new SystemMenuResponse();
//                            response3.setTitle(bto3.getTitle());
//                            response3.setType(bto3.getType());
//                            response3.setKey(bto3.getKey());
//                            for (PermissionBto permissionBto : permissionBtoList) {
//                                if (bto3.getKey().equals(permissionBto.getFkResourceId())) {
//                                    response3.setChecked(true);
//                                }
//                            }
//                            List<SystemMenuResponse> four = new ArrayList<>();
//                            if (bto3.getChildren() != null && bto3.getChildren().size() != 0) {
//                                for (SystemMenuResponse bto4 : bto3.getChildren()) {
//                                    SystemMenuResponse response4 = new SystemMenuResponse();
//                                    response4.setTitle(bto4.getTitle());
//                                    response4.setType(bto4.getType());
//                                    response4.setKey(bto4.getKey());
//                                    for (PermissionBto permissionBto : permissionBtoList) {
//                                        if (bto4.getKey().equals(permissionBto.getFkResourceId())) {
//                                            response4.setChecked(true);
//                                        }
//                                    }
//                                    response4.setChildren(new ArrayList<>());
//                                    four.add(response4);
//                                }
//                            }
//                            response3.setChildren(four);
//                            three.add(response3);
//                        }
//                    }
//                    response2.setChildren(three);
//                    two.add(response2);
//                }
//            }
//            response1.setChildren(two);
//            one.add(response1);
//        }
//        addOperateLog(ModelName.MODEL_SYSTEM_USER, ModelName.ACTION_SYSTEM_USER_ROLE);
        return new ResponseBean(1, "", null);
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
        if (!StringUtils.isNotEmptyStr(userId)) {
            throw new CustomException("用户ID不能为空");
        }
        UserBto userBto = userService.getUserByUserId(userId);
        if (userBto == null) {
            throw new CustomException("该用户不存在");
        }
        userBto.setAccountStatus((short) state);
        if (userService.updateUser(userBto) != 1) {
            throw new CustomException("修改失败");
        }
        addOperateLog(ModelName.MODEL_SYSTEM_USER, ModelName.ACTION_SYSTEM_USER_STATE);
        return new ResponseBean(1, "修改成功", null);
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
        if (!StringUtils.isNotEmptyStr(loginName)) {
            throw new CustomException("登陆账户不能为空");
        }
        if (StringUtils.isNotEmptyStr(id)) {
            UserBto userBto = userService.getUserByUserId(id);
            if (userBto.getLoginName().equals(loginName)) {
                return new ResponseBean(1, "该账户名未注册", new DateResponse(0));
            }
        }
        UserBto userBto = userService.getUserByname(loginName);
        if (userBto == null) {
            return new ResponseBean(1, "该账户名未注册", new DateResponse(0));
        } else {
            return new ResponseBean(1, "该账户已注册，请重新输入", new DateResponse(1));
        }
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
        if (!StringUtils.isNotEmptyStr(phone)) {
            throw new CustomException("手机号不能为空");
        }
        if (StringUtils.isNotEmptyStr(id)) {
            UserBto userBto = userService.getUserByUserId(id);
            if (userBto.getMobile().equals(phone)) {
                return new ResponseBean(1, "该手机号未注册", new DateResponse(0));
            }
        }
        UserBto userBto = userService.getUserByPhone(phone);
        if (userBto == null) {
            return new ResponseBean(1, "该手机号未注册", new DateResponse(0));
        } else {
            return new ResponseBean(1, "该手机号已注册，请重新输入", new DateResponse(1));
        }
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
    public ResultT selectMail(@ApiParam String mail, @ApiParam String id) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(userService.selectMail(mail, id));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }


}