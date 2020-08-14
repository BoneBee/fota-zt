package com.intest.common.tableData;

import java.lang.annotation.*;

/**
 * @author zhanghui
 * @create 2020-08-13 12:58
 */
@Documented
@Target({ ElementType.METHOD ,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TableDataAnnotation {
    String tableId() default "";
}
