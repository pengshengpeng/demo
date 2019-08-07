package com.example.demo.comm;

import com.example.demo.enums.ExceptionEnum;

public class MyException extends Exception {
    private int code;
    private String msg;
    private Throwable throwable;

    public MyException() {
    }

    public MyException(int code) {
        this.code = code;
    }

    public MyException(String msg) {
        this.msg = msg;
    }

    public MyException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public MyException(ExceptionEnum exceptionEnum) {
        this.code = exceptionEnum.getCode();
        this.msg = exceptionEnum.getMgs();
    }

    public MyException(Throwable throwable) {
        super(throwable);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
