package com.binyu.chapter05.exercise13;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise13
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-27 13:21
 * @Description:
 */
public class Cups {
    static Cup cup1;
    static Cup cup2;
//    静态初始化
    static {
        cup1=new Cup(1);
        cup2=new Cup(2);
    }
    Cups(){
        System.out.println ("Cups()");
    }
}
