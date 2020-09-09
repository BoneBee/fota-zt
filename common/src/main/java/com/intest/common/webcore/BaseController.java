package com.intest.common.webcore;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ValidationException;
import java.util.Enumeration;

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

    /**
     * create by: zhanghui
     * description: 获取Authorization值
     * create time: 2020/8/27 15:05
     *
     * @param
     * @return java.lang.String
     */
    protected String getAuthorizationToken(){
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
}
