package com.binyu.chapter05.exercise5;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise5
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-26 15:55
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.bark ( 123,"barking" );
        dog.bark ( 456,"howling" );
        dog.bark ( 'a',"howling" );
        dog.bark ( 'b',"howling" );
    }
}
