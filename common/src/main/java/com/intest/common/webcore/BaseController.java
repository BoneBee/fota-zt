package com.intest.common.webcore;

import com.intest.common.jwt.JwtUtil;
import com.intest.common.jwt.constant.JwtConstant;
import com.intest.dao.entity.OperateLogBto;
import com.intest.dao.entity.UserBto;
import com.intest.dao.entity.UserBtoExample;
import com.intest.dao.mapper.OperateLogBtoMapper;
import com.intest.dao.mapper.UserBtoMapper;
import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.UserAgent;
import eu.bitwalker.useragentutils.Version;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authc.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ValidationException;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.UUID;

/**
 * @author zhanghui
 * @create 2020-08-26 14:35
 */
public class BaseController {

    protected Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    protected HttpServletRequest request;

    /**
     * 获取当前请求
     */
    public HttpServletRequest getRequest() {
        return request;
    }

    /**
     * create by: zhanghui
     * description: 校验方法
     * create time: 2020/8/26 14:28
     *
     * @param bindingResult
     * @return void
     */
    public void validData(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            StringBuffer sb = new StringBuffer();
            for (ObjectError error : bindingResult.getAllErrors()) {
                sb.append(error.getDefaultMessage());
            }
            throw new ValidationException(sb.toString());
        }
    }

    public String getIpAddr() {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    public String getBrowser() {
        if (request.getHeader("User-Agent").indexOf("Postman") == -1) {
            Browser browser = UserAgent.parseUserAgentString(request.getHeader("User-Agent")).getBrowser();
            Version version = browser.getVersion(request.getHeader("User-Agent"));
            String browserName = browser.getName() + "/" + version.getVersion();
            return browserName;
        }
        return "PostmanRuntime/7.26.3";

    }


    /**
     * create by: zhanghui
     * description: 获取Authorization值
     * create time: 2020/8/27 15:05
     *
     * @param
     * @return java.lang.String
     */
    protected String getAuthorizationToken() {
        String token = "";
        // 获取头部信息
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            if ("Authorization".equalsIgnoreCase(key)) {
                token = value;
            }
        }

        return token;
    }

    @Autowired
    private UserBtoMapper userMapper;

    @Autowired
    OperateLogBtoMapper operateLogBtoMapper;

    /**
     * create by: zhanghui
     * description: 获取当前登录用户的信息
     * create time: 2020/9/15 16:46
     *
     * @param
     * @return com.intest.dao.entity.UserBto
     */
    public UserBto getAccount() {
        UserBto userBto = null;
        try {
            String token = getAuthorizationToken();
            // 解密获得account，用于和数据库进行查询
            String account = JwtUtil.getClaim(token, JwtConstant.ACCOUNT);
            // 帐号为空
            if (StringUtils.isBlank(account)) {
                throw new AuthenticationException("token中帐号为空(The account in Token is empty.)");
            }
            // 查询用户是否存在
            UserBtoExample userBtoExample = new UserBtoExample();
            UserBtoExample.Criteria criteria = userBtoExample.createCriteria();
            criteria.andIsdeleteEqualTo((short) 1);
            criteria.andAccountStatusEqualTo((short) 1);
            criteria.andUserIdEqualTo(account);
            List<UserBto> userBtoList = userMapper.selectByExample(userBtoExample);
            if (userBtoList.size() > 0) {
                userBto = userBtoList.get(0);
            }
        } catch (Exception ex) {
            logger.error(ex);
        }
        return userBto;
    }


    public void addOperateLog(String Model, String Action) {
        UserBto userBto = getAccount();
        if (userBto != null) {
            OperateLogBto operateLogBto = new OperateLogBto();
            operateLogBto.setOperateId(UUID.randomUUID() + "");
            operateLogBto.setFkUserId(userBto.getUserId());
            operateLogBto.setOperateMode(Model);
            operateLogBto.setOperateAction(Action);
            operateLogBto.setLoginIp(getIpAddr());
            operateLogBto.setBrowser(getBrowser());
            operateLogBto.setIsdelete((short) 1);
            operateLogBto.setCreateat(new Date());
            operateLogBto.setCreateby(userBto.getUserId());
            operateLogBtoMapper.insert(operateLogBto);
        }

    }

}
