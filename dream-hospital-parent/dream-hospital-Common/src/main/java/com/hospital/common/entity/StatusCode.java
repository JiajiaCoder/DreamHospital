package com.hospital.common.entity;

import java.io.Serializable;

/**
 * 状态码实体
 *
 * @author DeZhe
 * @date 2020/4/7 - 16:01
 */
public class StatusCode implements Serializable {

    private static final long serialVersionUID = -1154437779900742428L;

    /**
     * 成功
     */
    public static final int OK = 20000;

    /**
     * 失败
     */
    public static final int ERROR = 20001;

    /**
     * 用户名或密码错误
     */
    public static final int LOGIN_ERROR = 20002;

    /**
     * 权限不足
     */
    public static final int ACCESS_ERROR = 20003;

    /**
     * 远程调用失败
     */
    public static final int REMOTE_ERROR = 20004;

    /**
     * 重复操作
     */
    public static final int REP_ERROR = 20005;

}
