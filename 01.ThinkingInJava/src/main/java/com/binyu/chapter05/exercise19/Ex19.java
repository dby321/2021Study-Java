package com.binyu.chapter05.exercise19;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise19
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-27 14:54
 * @Description:
 */
public class Ex19 {
    public static void main(String[] args) {
        Person p=new Person("123","456","789");
        String[] strings=new String[]{"321","654","987"};
        Person p2=new Person(strings);
    }
}
