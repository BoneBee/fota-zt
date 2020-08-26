package com.intest.common.webcore;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;

/**
 * @author zhanghui
 * @create 2020-08-26 14:35
 */
public class BaseController {

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
}
