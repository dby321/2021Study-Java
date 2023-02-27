package com.binyu.chapter03.exercise3;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter03.exercise3
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-24 12:02
 * @Description:
 */
public class Test {
    static void function(ContainFloat containFloat){
        containFloat.money=25.0F;
    }
    public static void main(String[] args) {
        ContainFloat cf1=new ContainFloat ();
        cf1.money=10.0F;
        System.out.println (cf1);
        function ( cf1 );
        System.out.println (cf1);
    }
}
