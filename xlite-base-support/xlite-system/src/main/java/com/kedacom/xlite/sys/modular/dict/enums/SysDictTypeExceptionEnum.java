package com.kedacom.xlite.sys.modular.dict.enums;

import com.kedacom.xlite.core.annotion.ExpEnumType;
import com.kedacom.xlite.core.exception.enums.abs.AbstractBaseExceptionEnum;
import com.kedacom.xlite.core.factory.ExpEnumCodeFactory;
import com.kedacom.xlite.sys.core.consts.SysExpEnumConstant;

/**
 * 系统字典类型相关异常枚举
 *
 * @author nixiaohan
 * @date 2020/3/31 20:44
 */
@ExpEnumType(module = SysExpEnumConstant.GUNS_SYS_MODULE_EXP_CODE, kind = SysExpEnumConstant.SYS_DICT_TYPE_EXCEPTION_ENUM)
public enum SysDictTypeExceptionEnum implements AbstractBaseExceptionEnum {

    /**
     * 字典类型不存在
     */
    DICT_TYPE_NOT_EXIST(1, "字典类型不存在"),

    /**
     * 字典类型编码重复
     */
    DICT_TYPE_CODE_REPEAT(2, "字典类型编码重复，请检查code参数"),

    /**
     * 字典类型名称重复
     */
    DICT_TYPE_NAME_REPEAT(3, "字典类型名称重复，请检查name参数");

    private final Integer code;

    private final String message;

    SysDictTypeExceptionEnum(Integer code, String message) {
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
