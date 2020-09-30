package com.kedacom.xlite.sys.modular.sms.enums;

import com.kedacom.xlite.core.annotion.ExpEnumType;
import com.kedacom.xlite.core.exception.enums.abs.AbstractBaseExceptionEnum;
import com.kedacom.xlite.core.factory.ExpEnumCodeFactory;
import com.kedacom.xlite.sys.core.consts.SysExpEnumConstant;

/**
 * 短信发送相关异常枚举
 *
 * @author nixiaohan
 * @date 2020/7/7 11:30
 */
@ExpEnumType(module = SysExpEnumConstant.GUNS_SYS_MODULE_EXP_CODE, kind = SysExpEnumConstant.SMS_EXCEPTION_ENUM)
public enum SmsSendExceptionEnum implements AbstractBaseExceptionEnum {

    /**
     * 手机号码不能为空
     */
    PHONE_NUMBER_EMPTY(1, "手机号码不能为空，请检查phoneNumbers参数"),

    /**
     * 验证码不能为空
     */
    VALIDATE_CODE_EMPTY(2, "验证码不能为空，请检查validateCode参数"),

    /**
     * 模板号不能为空
     */
    TEMPLATE_CODE_EMPTY(3, "模板号不能为空，请检查templateCode参数");

    private final Integer code;

    private final String message;

    SmsSendExceptionEnum(Integer code, String message) {
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
