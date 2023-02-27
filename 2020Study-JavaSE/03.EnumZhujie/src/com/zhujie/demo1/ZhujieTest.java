package com.zhujie.demo1;

import org.junit.Test;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.zhujie.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-25 13:35
 * @Description:
 */
public class ZhujieTest {
    /**
     * JDK提供了三个注解
     * @Override 用于重写父类的方法 或者是写接口实现类时用到该注解。
     * @Deprecated 用于表示该方法是一个过期的方法。
     * @SuppressWarnings 表示该方法在编译时自动忽略警告。
     */
    @Test
    public void test1(){

    }

    /**
     * 如何自定义注解
     */
    @Test
    public void test2(){
        @MyAnnotation ( value="aa")
        int a=10;
    }

    /**
     * 四种元注解
     * @Retention
     * @Target
     * @Documented
     * @Inherited
     */
    @Test
    public void test3(){

    }

    /**
     * jdk1.8新增注解
     * @Repeatable 可重复注解
     * @Target 的类型参数ElementType新增两个值 ElementType.TYPE_PARAMETER ElementType.TYPE_USE
     *
     */
    @Test
    public void test4(){

    }
}
