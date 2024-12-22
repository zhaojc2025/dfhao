package com.dfhao.common.exception;

import lombok.Data;

/**
 * 所有业务异常的基类
 * <p>
 * 在抛出异常时候，务必带上AbstractExceptionEnum枚举
 * <p>
 * 业务异常分为三种
 * <p>
 * 第一种是用户端操作的异常，例如用户输入参数为空，用户输入账号密码不正确
 * <p>
 * 第二种是当前系统业务逻辑出错，例如系统执行出错，磁盘空间不足
 * <p>
 * 第三种是第三方系统调用出错，例如文件服务调用失败，RPC调用超时
 */
@Data
public class CommonException extends RuntimeException {

    /**
     * 错误码
     */
    private String code;

    /**
     * 返回给用户的提示信息
     */
    private String msg;

    /**
     * 数据
     */
    private Object data;

    /**
     * 根据错误码，用户提示直接抛出异常
     */
    public CommonException(String code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    /**
     * 携带数据的异常构造函数
     */
    public CommonException(String code, String msg, Object data) {
        super(msg);
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 如果要直接抛出CommonException，可以用这个构造函数
     */
    public CommonException(AbstractExceptionEnum exception) {
        super(exception.getMsg());
        this.code = exception.getCode();
        this.msg = exception.getMsg();
    }
}
