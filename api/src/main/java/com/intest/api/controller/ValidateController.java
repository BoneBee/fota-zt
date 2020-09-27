package com.intest.api.controller;

import cn.hutool.json.JSONObject;
import com.intest.basicservice.code.request.UpdatePasswordRequest;
import com.intest.basicservice.code.vo.SmsCode;
import com.intest.basicservice.code.vo.UserVO;
import com.intest.common.redis.JedisUtil;
import com.intest.common.result.ResultT;
import com.intest.common.util.BCrypt;
import com.intest.common.util.StringUtils;
import com.intest.dao.entity.UserBto;
import com.intest.dao.entity.UserBtoExample;
import com.intest.dao.mapper.UserBtoMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author ：intest
 * @description：用户忘记密码，获取手机验证码重置密码
 * @date ：2020/9/18 16:17
 */
@Api(tags = {"忘记密码/手机"})
@RequestMapping("/api")
@RestController
public class ValidateController {
    @Autowired
    private JavaMailSender jms;

    @Value("${spring.mail.username}")
    private String from;

    @Autowired
    private UserBtoMapper userBtoMapper;

    /**
     * 检查平台是否存在该手机号的用户
     * @param phoneNumber
     * @return
     */
    @GetMapping("/code/checkmobile")
    public ResultT<Boolean> checkMobile(String phoneNumber){
        ResultT<Boolean> result = new ResultT<>();
        UserBtoExample example = new UserBtoExample();
        example.createCriteria().andMobileEqualTo(phoneNumber);
        List<UserBto> list = userBtoMapper.selectByExample(example);
        if(list == null || list.size() == 0){
            result.setFail();
        }
        else{
            result.setSuccess(1);
        }
        return result;
    }

    /**
     * 检查平台是否存在该邮箱的用户
     * @param email
     * @return
     */
    @ApiOperation("检查平台是否存在该邮箱的用户")
    @GetMapping("/code/checkemail")
    public ResultT<UserVO> checkEmail(String email){
        ResultT<UserVO> result = new ResultT<>();

        try{
            UserBtoExample example = new UserBtoExample();
            example.createCriteria().andCompanyEmailEqualTo(email);
            List<UserBto> list = userBtoMapper.selectByExample(example);
            if(list != null && list.size() > 0){
                UserBto bto = list.get(0);
                UserVO vo = new UserVO();
                vo.setUserId(bto.getUserId());
                vo.setLoginName(bto.getLoginName());
                result.setResult(vo);
            }
        }catch (Exception e){
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    /**
     * 获取验证码并发送到邮箱
     * @param request
     * @param response
     * @param email
     * @return
     */
    @ApiOperation("获取验证码并发送到邮箱")
    @GetMapping("/code/sms")
    public ResultT<String> createSmsCode(HttpServletRequest request, HttpServletResponse response, String email){
        ResultT<String> result = new ResultT<>();
        try{
            SmsCode smsCode = generateSmsCode();
            System.out.println("您的登录验证码为：" + smsCode.getCode() + "，有效时间为60秒");
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(from);
            message.setTo(email);
            message.setSubject("获取验证码");
            message.setText("您的登录验证码为：" + smsCode.getCode() + "，有效时间为60秒");
            jms.send(message);
            JedisUtil.setObject("smscode", smsCode);
        }catch (Exception e){
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    /**
     * 校验验证码
     * @param smsCode
     * @return
     */
    @ApiOperation("校验验证码")
    @GetMapping("/code/checksms")
    public ResultT<String> checkSmsCode(String smsCode){
        ResultT<String> result = new ResultT<>();
        if(StringUtils.isEmptyStr(smsCode)){
            result.setResult("验证码不能为空");
        }
        SmsCode code  = (SmsCode)JedisUtil.getObject("smscode");
        if(code == null || !smsCode.equals(code.getCode())){
            result.setResult("验证码不正确");
        }
        if(code.isExpire()){
            result.setResult("验证码过期");
        }
        return result;
    }

    /**
     * 生成验证码
     * @return
     */
    private SmsCode generateSmsCode(){
        String code = RandomStringUtils.randomNumeric(6);
        return new SmsCode(code, 60);
    }

    /**
     * 修改密码
     * @param request
     * @return
     */
    @ApiOperation("修改密码")
    @PostMapping("/code/updatepassword")
    public ResultT<Boolean> checkPassword(@RequestBody UpdatePasswordRequest request){
        ResultT<Boolean> result = new ResultT<>();
        // password：密码长度6-18位且包含大小写字母和数字
        UserBto bto = new UserBto();
        bto.setUserId(request.getUserId());
        String salt = BCrypt.gensalt();
        String hashd = BCrypt.hashpw(request.getPassword(), salt);
        bto.setLoginPassword(hashd);
        Boolean flag = userBtoMapper.updateByPrimaryKeySelective(bto) > 0 ? true : false;
        result.setResult(flag);
        return result;
    }
}
