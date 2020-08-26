package com.intest.common.exception;


import com.intest.common.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import java.util.Set;

@RestControllerAdvice
public class GlobalExceptionHandler {

    //日志操作
    private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 捕捉其他所有自定义异常
     *
     * @return
     */
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnauthorizedException.class)
    public String handle1(UnauthorizedException e) {
        logger.error("捕捉其他所有自定义异常:" + e.getMessage(), e);
        return "";
    }

    /**
     * 捕捉其他所有自定义异常
     *
     * @return
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(CustomException.class)
    public ResponseBean handle(CustomException e) {
        logger.error("捕捉其他所有自定义异常:" + e.getMessage(), e);
        return new ResponseBean(0, e.getMessage(), null);//new ResponseBean(0, e.getMessage(), null);
    }

    @ExceptionHandler(ValidationException.class)
    @ResponseStatus(HttpStatus.OK)
    public Result handle2(ValidationException exception) {
        Result result = new Result();
        result.setFail();
        if (exception instanceof ConstraintViolationException) {
            ConstraintViolationException exs = (ConstraintViolationException) exception;

            StringBuilder builder = new StringBuilder();
            Set<ConstraintViolation<?>> violations = exs.getConstraintViolations();
            for (ConstraintViolation<?> item : violations) {
                //打印验证不通过的信息
                logger.error(item.getMessage());
                builder.append(item.getMessage());
            }
            result.setMsg(builder.toString());
        } else if (exception instanceof ValidationException) {
            logger.error(exception.getMessage());
            result.setMsg(exception.getMessage());
        }
        return result;
    }
}
