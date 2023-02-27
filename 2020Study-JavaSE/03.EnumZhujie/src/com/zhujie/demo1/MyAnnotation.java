package com.zhujie.demo1;

import java.lang.annotation.*;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.zhujie.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-25 14:34
 * @Description:
 */
@Retention ( RetentionPolicy.RUNTIME )
@Target ( {ElementType.METHOD,ElementType.LOCAL_VARIABLE} )
@Documented
public @interface MyAnnotation {
    String value() default "hello";
}
