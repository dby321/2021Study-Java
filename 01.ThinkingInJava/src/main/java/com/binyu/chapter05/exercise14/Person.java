package com.binyu.chapter05.exercise14;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise14
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-27 13:25
 * @Description:
 */
public class Person {
    static String firstname="dingyichuchushihua";
    static String lastname;
    static {
        lastname="jingtaikuaizhongchushihua";
    }
    static void f(){
        System.out.println (firstname);
        System.out.println (lastname);
    }
    public static void main(String[] args){
        Person.f ();
    }
}
