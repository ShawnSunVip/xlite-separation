package com.kedacom.xlite.core.annotion;

import java.lang.annotation.*;

/**
 * 数据权限注解
 *
 * @author nixiaohan
 * @date 2020/9/28 17:16
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface DataScope {
}
