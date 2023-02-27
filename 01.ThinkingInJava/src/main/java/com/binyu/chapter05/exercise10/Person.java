package com.binyu.chapter05.exercise10;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise10
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-27 11:57
 * @Description:
 */
public class Person {
    String name;
    Person(String name){
        this.name=name;
    }
    @Override
    protected void finalize(){
        if("董滨雨".equals ( name )){
            System.out.println ("finalize()");
        }
    }
}
