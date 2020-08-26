package com.intest.api.controller;


import com.intest.basicservice.table.common.ResponseBean;
import com.intest.basicservice.table.common.constant.Constant;
import com.intest.basicservice.table.config.helper.ValidateHelper;
import com.intest.basicservice.table.util.CheckPwd;
import com.intest.basicservice.user.response.LoginOutResponse;
import com.intest.basicservice.user.response.UserRequest;
import com.intest.basicservice.user.service.impl.UserServiceImpl;
import com.intest.basicservice.user.vo.LoginVO;
import com.intest.common.exception.CustomException;
import com.intest.common.jwt.AuthToken;
import com.intest.common.redis.JedisUtil;
import com.intest.common.result.ResultT;
import com.intest.common.util.BCrypt;
import com.intest.common.webcore.BaseController;
import com.intest.dao.entity.UserBto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
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

    @Autowired
    HttpServletRequest request;

    /**
     * create by: zhanghui
     * description: 带Token的用户登录
     * create time: 2020/8/24 21:33
     *
     * @param
     * @return com.intest.common.result.ResultT<com.intest.basicservice.user.vo.LoginVO>
     */
    @AuthToken
    @ResponseBody
    @ApiOperation("带Token的用户登录接口")
    @RequestMapping(value = "/api/account/login", method = RequestMethod.GET)
    public ResultT<LoginVO> inLogin() {
        String token = request.getHeader("token");
        String userId = JedisUtil.getJson(Constant.PREFIX_SHIRO_ACCESS_TOKEN + token);
        ResultT<LoginVO> resultT = new ResultT<>();
        resultT.setResult(userService.getUserLoginInfo(userId));
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
    public ResponseBean exitLogin(HttpServletRequest request) {
        String token = request.getHeader("token");
        if (JedisUtil.exists(Constant.PREFIX_SHIRO_ACCESS_TOKEN + token)) {
            Object userName = JedisUtil.getObject(Constant.PREFIX_SHIRO_ACCESS_TOKEN + token);
            JedisUtil.delKey(Constant.PREFIX_SHIRO_ACCESS_TOKEN + token);
            JedisUtil.delKey(Constant.PREFIX_SHIRO_CACHE + userName);
            return new ResponseBean(1, "成功退出登陆", new LoginOutResponse(1));
        } else {
            return new ResponseBean(0, "登出失败", new LoginOutResponse(2));
        }

    }

    /**
     * 用户注册
     *
     * @param userBto
     * @return
     */
    @ApiOperation("用户注册接口")
    @ResponseBody
    @RequestMapping(value = "/api/infota/product/inRegister", method = RequestMethod.POST)
    public ResponseBean inRegister(@RequestBody UserBto userBto) {
        String account = userBto.getLoginName();
        String passworld = userBto.getLoginPassword();
        ValidateHelper.validateNull(userBto, new String[]{"loginName", "loginPassword", "accountKind", "accountStatus", "isdelete", "createby"});
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
            UUID uuid = UUID.randomUUID();
            userBto.setUserId(uuid + "");
            String yan = BCrypt.gensalt();
            userBto.setCsprng(yan);
            String hashd = BCrypt.hashpw(passworld, yan);
            userBto.setLoginPassword(hashd);
            userBto.setCreateat(new Date());
            if (userService.addUser(userBto) == 1) {
                return new ResponseBean(1, "注册成功", null);
            } else {
                throw new CustomException("注册失败");
            }
        } else {
            throw new CustomException("密码必须由字母、数字、特殊符号组成");
        }
    }
}