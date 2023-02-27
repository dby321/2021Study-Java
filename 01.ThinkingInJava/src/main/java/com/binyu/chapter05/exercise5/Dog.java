package com.binyu.chapter05.exercise5;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise5
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-26 15:52
 * @Description:
 */
public class Dog {
    void bark(int i, String word) {
        System.out.println ( "int dog name is "+i+" bark:" + word );
    }

    void bark(char ch, String word) {
        System.out.println ( "char dog name is "+ch+" bark:" + word );
    }
}
