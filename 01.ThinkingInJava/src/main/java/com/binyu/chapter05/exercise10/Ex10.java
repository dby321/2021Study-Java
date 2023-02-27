package com.binyu.chapter05.exercise10;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise10
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-27 11:59
 * @Description:
 */
public class Ex10 {
    public static void main(String[] args) {
        Person p=new Person("董滨雨");
        System.gc ();
        System.out.println ("----");
        new Person("董滨雨");
        System.gc ();
    }
}
