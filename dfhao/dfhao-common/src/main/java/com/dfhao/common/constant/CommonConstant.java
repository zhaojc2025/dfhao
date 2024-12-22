package com.dfhao.common.constant;

/**
 * 通用常量
 */
public interface CommonConstant {

    /**
     * 用户端操作异常的错误码分类编号
     */
    String USER_OPERATION_ERROR_TYPE_CODE = "U";

    /**
     * 业务执行异常的错误码分类编号
     */
    String BUSINESS_ERROR_TYPE_CODE = "B";

    /**
     * 第三方调用异常的错误码分类编号
     */
    String THIRD_ERROR_TYPE_CODE = "T";

    /**
     * 一级宏观码标识，宏观码标识代表一类错误码的统称
     */
    String FIRST_LEVEL_WIDE_CODE = "0001";

    /**
     * 请求成功的返回码
     */
    String SUCCESS_CODE = "01";

    /**
     * 请求成功的返回信息
     */
    String SUCCESS_MESSAGE = "操作成功";

    /**
     * 异常枚举的步进值
     */
    String RULE_EXCEPTION_STEP_CODE = "02";

    /**
     * 一级公司的父级id
     */
    Long TREE_ROOT_ID = -1L;

    /**
     * 中文的多语言类型编码
     */
    String CHINESE_TRAN_LANGUAGE_CODE = "chinese";

    /**
     * base64图片前缀，用在给<img src=""/>使用
     */
    String BASE64_IMG_PREFIX = "data:image/png;base64,";

    /**
     * 系统配置初始化的标识的常量名称，用在sys_config表作为config_code
     */
    String SYSTEM_CONFIG_INIT_FLAG_NAME = "SYS_CONFIG_INIT_FLAG";

    /**
     * 默认分批插入mysql数据的大小
     */
    int DEFAULT_BATCH_INSERT_SIZE = 1000;

    /**
     * 服务默认部署的环境地址，不要改这个常量，改系统配置表中的配置 SYS_SERVER_DEPLOY_HOST
     */
    String DEFAULT_SERVER_DEPLOY_HOST = "http://localhost:8080";

}
