package com.binyu.chapter02.exercise7;

/**
 * @BelongsProject: 2021Study-JavaSE
 * @BelongsPackage: com.binyu.chapter02.exercise7
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-22 18:29
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        System.out.println (StaticTest.i);
//        Ghost.i++
        Incrementable.increment ();
        System.out.println (StaticTest.i);
//        Ghost.i--
        Incrementable.decrease ();
        System.out.println (StaticTest.i);
    }
}
