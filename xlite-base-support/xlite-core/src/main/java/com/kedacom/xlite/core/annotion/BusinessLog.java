package com.kedacom.xlite.core.annotion;

import com.kedacom.xlite.core.enums.LogAnnotionOpTypeEnum;

import java.lang.annotation.*;

/**
 * 标记需要做业务日志的方法
 *
 * @author nixiaohan
 * @date 2020/9/28 14:16
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface BusinessLog {

    /**
     * 业务的名称
     */
    String title() default "";

    /**
     * 业务操作类型枚举
     */
    LogAnnotionOpTypeEnum opType() default LogAnnotionOpTypeEnum.OTHER;
}
