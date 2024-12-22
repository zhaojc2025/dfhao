package com.dfhao.db.api.exception;

import cn.hutool.core.util.StrUtil;
import com.dfhao.common.exception.AbstractExceptionEnum;
import com.dfhao.common.exception.CommonException;

/**
 * 数据库操作异常
 */
public class DbException extends CommonException {

    public DbException(AbstractExceptionEnum exception) {
        super(exception);
    }

    public DbException(AbstractExceptionEnum exception, Object... params) {
        super(exception.getCode(), StrUtil.format(exception.getMsg(), params));
    }

}
