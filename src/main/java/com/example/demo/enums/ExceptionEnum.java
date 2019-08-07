package com.example.demo.enums;

public enum ExceptionEnum {

    ERROR(1000,"未登入");



    private int code;
    private String mgs;

    ExceptionEnum(int code, String mgs) {
        this.code = code;
        this.mgs = mgs;
    }

    public int getCode() {
        return code;
    }

    public String getMgs() {
        return mgs;
    }
}
