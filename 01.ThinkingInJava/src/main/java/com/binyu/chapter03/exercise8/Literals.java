package com.binyu.chapter03.exercise8;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter03.exercise8
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-25 12:59
 * @Description:
 */
public class Literals {
    public static void main(String[] args) {
        int i1=0x2f;
        System.out.println("i1:"+Integer.toBinaryString ( i1 ));
        int i2=0X2F;
        System.out.println("i2:"+Integer.toBinaryString ( i2 ));
        int i3=0177;
        System.out.println("i3:"+Integer.toBinaryString ( i3 ));
        char c=0xffff;
        System.out.println("c:"+Integer.toBinaryString ( c ));
        byte b=0x7f;
        System.out.println ("b:"+Integer.toBinaryString ( b ));
        short s=0x7fff;
        System.out.println ("s:"+Integer.toBinaryString ( s ));
        System.out.println ("----测试short取值----");
        System.out.println (Short.MAX_VALUE);
        System.out.println (Short.MIN_VALUE);
        System.out.println ("----测试Byte取值----");
        System.out.println (Byte.MAX_VALUE);
        System.out.println (Byte.MIN_VALUE);
        
    }
}
