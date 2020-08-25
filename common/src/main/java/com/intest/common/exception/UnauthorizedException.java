package com.intest.common.exception;

import com.intest.common.enums.ErrorCode;

/**
 * @author zhanghui
 * @create 2020-08-25 0:37
 */
public class UnauthorizedException extends RuntimeException {
    private String code = ErrorCode.ERROR.getCode();

}
