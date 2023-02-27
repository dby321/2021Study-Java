package com.binyu.chapter03.exercise5;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter03.exercise5
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-24 16:25
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        dog1.name="spot";
        dog1.says="Ruff!";
        dog2.name="scruffy";
        dog2.says="Wurf!";
        dog1.showDogInfo ();
        dog2.showDogInfo ();
    }
}
