package com.kedacom.xlite.sys.modular.email.enums;

import com.kedacom.xlite.core.annotion.ExpEnumType;
import com.kedacom.xlite.core.exception.enums.abs.AbstractBaseExceptionEnum;
import com.kedacom.xlite.core.factory.ExpEnumCodeFactory;
import com.kedacom.xlite.sys.core.consts.SysExpEnumConstant;

/**
 * 系统应用相关异常枚举
 *
 * @author nixiaohan
 * @date 2020/3/26 10:11
 */
@ExpEnumType(module = SysExpEnumConstant.GUNS_SYS_MODULE_EXP_CODE, kind = SysExpEnumConstant.EMAIL_EXCEPTION_ENUM)
public enum SysEmailExceptionEnum implements AbstractBaseExceptionEnum {

    /**
     * 收件人为空
     */
    EMAIL_TO_EMPTY(1, "收件人为空，请检查to参数"),

    /**
     * 标题为空
     */
    EMAIL_TITLE_EMPTY(2, "标题为空，请检查title参数"),

    /**
     * 内容为空
     */
    EMAIL_CONTENT_EMPTY(3, "内容为空，请检查content参数"),

    /**
     * 邮件发送失败
     */
    EMAIL_SEND_ERROR(4, "邮件发送失败，请检查发送参数");

    private final Integer code;

    private final String message;

    SysEmailExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return ExpEnumCodeFactory.getExpEnumCode(this.getClass(), code);
    }

    @Override
    public String getMessage() {
        return message;
    }

}
