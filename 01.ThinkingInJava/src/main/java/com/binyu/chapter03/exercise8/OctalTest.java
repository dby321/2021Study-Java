package com.binyu.chapter03.exercise8;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter03.exercise8
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-25 13:12
 * @Description:
 */
public class OctalTest {
    public static void main(String[] args) {
        long g1=0xffffff;
        long g2=050;
        long g3=50;
        System.out.println (Long.toBinaryString ( g1 )+" "+Long.toBinaryString ( g2 )+" "+Long.toBinaryString ( g3 )+" ");
    }
}
