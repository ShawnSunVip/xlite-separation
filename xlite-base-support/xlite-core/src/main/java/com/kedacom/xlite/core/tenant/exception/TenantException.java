package com.kedacom.xlite.core.tenant.exception;

import com.kedacom.xlite.core.exception.ServiceException;
import com.kedacom.xlite.core.exception.enums.abs.AbstractBaseExceptionEnum;

/**
 * 多租户的异常
 *
 * @author nixiaohan
 * @date 2020/9/3
 */
public class TenantException extends ServiceException {

    public TenantException(AbstractBaseExceptionEnum exception) {
        super(exception);
    }

}
