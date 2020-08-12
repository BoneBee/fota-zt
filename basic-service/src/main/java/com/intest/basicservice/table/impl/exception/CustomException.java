package com.intest.basicservice.table.impl.exception;


import com.intest.basicservice.table.impl.common.enums.ErrorCode;

public class CustomException extends RuntimeException{

    private String code = ErrorCode.ERROR.getCode();

    private String message;

    public CustomException(String msg){
        super(msg);
    }

    public CustomException() {
        super();
    }

    public CustomException(String code ,String message){
        super(message);
        this.code = code;
        this.message = message;
    }
}
