package com.binyu.chapter05.exercise9;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise9
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-26 17:30
 * @Description:
 */
public class Person {
    Person(){
        this(1);
    }
    Person(int i){
        System.out.println ("ArrayInit(int i) 被调用了");
    }
}
