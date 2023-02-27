package com.binyu.chapter03.exercise10;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter03.exercise10
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-25 13:37
 * @Description:
 */
public class Ex10 {
    public static void main(String[] args) {
        int i1=0xaaaa;
        int i2=0x5555;
        System.out.println (Integer.toBinaryString ( i1 )+" "+Integer.toBinaryString ( i2 ));
        System.out.println ("&:"+Integer.toBinaryString ( i1&i2 ));
        System.out.println ("|:"+Integer.toBinaryString ( i1|i2 ));
        System.out.println ("^:"+Integer.toBinaryString ( i1^i2 ));
        System.out.println ("~:"+Integer.toBinaryString ( ~i1 ));
    }
}
