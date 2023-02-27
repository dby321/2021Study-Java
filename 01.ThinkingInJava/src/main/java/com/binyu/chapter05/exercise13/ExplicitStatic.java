package com.binyu.chapter05.exercise13;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise13
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-27 13:22
 * @Description:
 */
public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println ("Inside main()");
//        Cups.cup1.f ( 99 );
    }
    static Cups cups1=new Cups();
    static Cups cups2=new Cups();
}
