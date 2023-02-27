package com.binyu.chapter05.exercise15;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise15
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-27 13:37
 * @Description:
 */
public class Person {
    String name;
    {
        name="binyu";
    }

    @Override
    public String toString() {
        return "ArrayInit{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p=new Person();
        System.out.println ( p );
    }
}
