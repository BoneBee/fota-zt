package com.intest.api.controller;

import com.intest.basicservice.code.vo.SmsCode;
import com.intest.common.result.ResultT;
import com.intest.dao.entity.UserBto;
import com.intest.dao.entity.UserBtoExample;
import com.intest.dao.mapper.UserBtoMapper;
import io.swagger.annotations.Api;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/code/checkemail")
    public ResultT<String> checkEmail(String email){
        ResultT<String> result = new ResultT<>();
        UserBtoExample example = new UserBtoExample();
        example.createCriteria().andCompanyEmailEqualTo(email);
        List<UserBto> list = userBtoMapper.selectByExample(example);
        if(list == null || list.size() == 0){
            result.setFail();
        }
        else{
            result.setResult(list.get(0).getLoginName());
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
            result.setResult(smsCode.getCode());
        }catch (Exception e){
            e.printStackTrace();
            result.setFail();
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

    @GetMapping("/code/password")
    public ResultT<String> checkPassword(String password, String confirmPassword){
        ResultT<String> result = new ResultT<>();
        // password：密码长度6-18位且包含大小写字母和数字

        // confirmPassword 与 password 要一致
        return result;
    }
}
