package com.example.demo.comm;

import java.util.Objects;

public class ReturnObj {
    private int code;
    private String msg = "";
    private Object data = null;

    @Override
    public String toString() {
        return "ReturnObj{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReturnObj returnObj = (ReturnObj) o;
        return code == returnObj.code &&
                Objects.equals(msg, returnObj.msg) &&
                Objects.equals(data, returnObj.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg, data);
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
