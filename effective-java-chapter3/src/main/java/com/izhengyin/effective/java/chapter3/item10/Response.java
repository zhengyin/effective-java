package com.izhengyin.effective.java.chapter3.item10;

import com.alibaba.fastjson.JSON;

/**
 * Created by zhengyin on 2017/8/9 下午4:33.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Response {
    public boolean status;
    public int code;
    public String message;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
