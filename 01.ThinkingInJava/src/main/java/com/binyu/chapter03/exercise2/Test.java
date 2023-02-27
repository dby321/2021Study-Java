package com.binyu.chapter03.exercise2;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter03.exercise2
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-24 11:55
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        System.out.println ( System.currentTimeMillis () );
        ContainFloat cf1=new ContainFloat ();
        ContainFloat cf2=new ContainFloat ();
        cf1.money=10.0F;
        cf2.money=20.0F;
        System.out.println (cf1+" "+cf2);
        cf1=cf2;
        System.out.println (cf1+" "+cf2);
        cf1.money=30.0F;
        System.out.println (cf1+" "+cf2);
        System.out.println ( System.currentTimeMillis () );

    }
}
