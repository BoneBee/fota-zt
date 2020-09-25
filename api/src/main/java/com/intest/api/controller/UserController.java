package com.intest.api.controller;


import com.intest.basicservice.table.common.ResponseBean;
import com.intest.basicservice.table.config.helper.ValidateHelper;
import com.intest.basicservice.table.util.CheckPwd;
import com.intest.basicservice.user.request.AddUserRequest;
import com.intest.basicservice.user.request.DeleteUserRequest;
import com.intest.basicservice.user.request.UpdateUserRequest;
import com.intest.basicservice.user.response.ResetPassworldResponse;
import com.intest.basicservice.user.request.UserRequest;
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
import com.intest.dao.entity.UserBto;
import com.intest.partsservice.part.response.PartPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@Api(tags = {"用户登陆/登出/注册接口"})
public class UserController extends BaseController {

    @Autowired
    UserServiceImpl userService;

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
            LoginVO loginVO = userService.checkLogin(userRequest.getUserName(), userRequest.getPassword());
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
        //String token = request.getHeader("token");
        //if (JedisUtil.exists(Constant.PREFIX_SHIRO_ACCESS_TOKEN + token)) {
        //    Object userName = JedisUtil.getObject(Constant.PREFIX_SHIRO_ACCESS_TOKEN + token);
        //    JedisUtil.delKey(Constant.PREFIX_SHIRO_ACCESS_TOKEN + token);
        //    JedisUtil.delKey(Constant.PREFIX_SHIRO_CACHE + userName);
        //    return new ResponseBean(1, "成功退出登陆", new LoginOutResponse(1));
        //} else {
        //    return new ResponseBean(0, "登出失败", new LoginOutResponse(2));
        //}
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
        ValidateHelper.validateNull(request, new String[]{"loginName", "loginPassword", "accountKind", "accountStatus"});
        String account = request.getLoginName();
        String passworld = request.getLoginPassword();
        if (account.equals(passworld)) {
            throw new CustomException("密码不可与用户名一致");
        }

        if (CheckPwd.checkLateralKeyboardSite(passworld) || CheckPwd.checkSequentialChars(passworld)) {
            throw new CustomException("密码不能连续3位或3位以上字母或数字");
        }

        if (CheckPwd.checkSequentialSameChars(passworld)) {
            throw new CustomException("密码不能相同连续3位或3位以上字母或数字");
        }

        if (!CheckPwd.checkPasswordLength(passworld)) {
            throw new CustomException("密码长度必须8-16位");
        }

        if (userService.getUserByname(account) != null) {
            throw new CustomException("已存在相同用户名，请重新修改用户名");
        }

        if (CheckPwd.checkContainDigit(passworld) && CheckPwd.checkContainCase(passworld) && CheckPwd.checkContainSpecialChar(passworld)) {
            UserBto userBto = new UserBto();
            UUID uuid = UUID.randomUUID();
            String yan = BCrypt.gensalt();
            String hashd = BCrypt.hashpw(passworld, yan);
            userBto.setUserId(uuid + "");
            userBto.setLoginName(request.getLoginName());
            userBto.setLoginPassword(hashd);
            userBto.setCsprng(yan);
            userBto.setRealName(request.getRealName());
            userBto.setJobNumber(request.getJobNumber());
            userBto.setMobile(request.getMobile());
            userBto.setCompanyEmail(request.getCompanyEmail());
            userBto.setSex((short) request.getSex());
            userBto.setNote(request.getNote());
            userBto.setAccountKind((short) request.getAccountKind());
            userBto.setPasswordRetryCount(5);
            userBto.setAccountStatus((short) request.getAccountStatus());
            userBto.setIsdelete((short) 1);
            userBto.setCreateat(new Date());
            userBto.setCreateby("admin");
            if (userService.addUser(userBto) == 1) {
                return new ResponseBean(1, "注册成功", null);
            } else {
                throw new CustomException("注册失败");
            }
        } else {
            throw new CustomException("密码必须由字母、数字、特殊符号组成");
        }
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
        ValidateHelper.validateNull(request, new String[]{"userId", "realName"});
        UserBto newUser = userService.getUserByUserId(request.getUserId());
        if (newUser == null) {
            throw new CustomException("您要修改的用户不存在");
        }
        newUser.setRealName(request.getRealName());
        newUser.setJobNumber(request.getJobNumber());
        newUser.setMobile(request.getMobile());
        newUser.setCompanyEmail(request.getCompanyEmail());
        newUser.setAccountStatus((short) request.getAccountStatus());
        if (userService.updateUser(newUser) == 1) {
            return new ResponseBean(1, "修改成功", null);
        } else {
            throw new CustomException("修改失败");
        }
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
        if (request.size() == 0) {
            throw new CustomException("请输入要删除的用户ID");
        }
        for (DeleteUserRequest userIdBean : request) {
            if (userService.deleteUser(userIdBean.getId()) != 1) {
                throw new CustomException(userIdBean.getId() + "删除失败");
            }
        }
        return new ResponseBean(1, "删除成功", null);
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
    public ResponseBean ResetPassworld(@ApiParam String userId) {
        if (!StringUtils.isNotEmptyStr(userId)) {
            throw new CustomException("用户ID不能为空");
        }
        UserBto userBto = userService.getUserByUserId(userId);
        if (userBto == null) {
            throw new CustomException("该用户不存在");
        }
        String yan = userBto.getCsprng();
        String hashd = BCrypt.hashpw("12ab34cd56ef@", yan);
        userBto.setLoginPassword(hashd);
        if (userService.updateUser(userBto) != 1) {
            throw new CustomException("重置密码失败");
        }
        return new ResponseBean(1, "重置密码成功", new ResetPassworldResponse("12ab34cd56ef@"));
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
        return new ResponseBean(1, "修改成功", null);

    }

}