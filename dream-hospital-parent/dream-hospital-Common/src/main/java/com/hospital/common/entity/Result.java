package com.hospital.common.entity;

import java.io.Serializable;

/**
 * 响应体
 *
 * @author DeZhe
 * @date 2020/4/7 - 16:04
 */
public class Result implements Serializable {

    private static final long serialVersionUID = -151145770140853660L;

    /**
     * 是否成功
     */
    private boolean flag;

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 响应的信息
     */
    private String message;

    /**
     * 响应的数据。 有可能有，有可能没有（增删改，就没有）
     */
    private Object data;

    /**
     * 无参
     */
    public Result() {
    }

    /**
     * 增删改
     * @param flag
     * @param code
     * @param message
     */
    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    /**
     * 查询
     * @param flag
     * @param code
     * @param message
     * @param data
     */
    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
