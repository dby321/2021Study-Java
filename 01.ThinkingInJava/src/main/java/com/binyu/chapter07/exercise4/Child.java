package com.binyu.chapter07.exercise4;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter07.exercise4
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-31 11:58
 * @Description:
 */
public class Child extends Father {
    Child(){
        System.out.println ("child()");
    }

    public static void main(String[] args) {
        Child c=new Child();
    }
}
class Father{
    Father(){
        System.out.println ("father()");
    }
}
