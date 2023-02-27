package com.binyu.chapter03.exercise6;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter03.exercise6
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-24 16:30
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="spot";
        dog1.says="Ruff!";
        Dog dog3=new Dog();
        dog3.name="spot";
        dog3.says="Ruff!";
        System.out.println (dog1==dog3);
        System.out.println (dog1.equals (dog3 ));

    }
}
