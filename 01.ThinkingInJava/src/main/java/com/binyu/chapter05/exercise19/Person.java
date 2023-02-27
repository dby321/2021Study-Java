package com.binyu.chapter05.exercise19;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise19
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-27 14:52
 * @Description:
 */
public class Person {
    Person(String... strings){
        for(String s:strings){
            System.out.print (s+" ");
        }
        System.out.println ();
    }
}
