package com.dfhao.common.exception;

/**
 * 异常枚举格式规范，每个异常枚举都要实现这个接口
 * <p>
 * 为了在抛出ServiceException的时候规范抛出的内容
 * <p>
 * ServiceException抛出时必须为本接口的实现类
 */
public interface AbstractExceptionEnum {

    /**
     * 获取错误码
     *
     * @return 错误码
     */
    String getCode();

    /**
     * 获取给用户提示信息
     *
     * @return 提示信息
     */
    String getMsg();
}
