package com.example.demo.comm;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class WebExceptionHandler {
    public static final String ERROR_VIEW = "error";

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ReturnObj errorHandler(Exception ex) {
        ReturnObj returnObj = new ReturnObj();
        if (ex instanceof MyException) {
            returnObj.setCode(((MyException) ex).getCode());
            returnObj.setMsg(((MyException) ex).getMsg());
        }else{
            returnObj.setCode(9999);
            returnObj.setMsg(ex.getMessage());
        }
        return returnObj;
    }
}
