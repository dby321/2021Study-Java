package com.binyu.chapter05.exercise8;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise8
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-26 17:20
 * @Description:
 */
public class Person {
    public void fun1(){
        System.out.println ("fun1");
    }
    public void fun2(){
        fun1();
        this.fun1();// 只是验证它起作用，并不推荐使用
    }
}
