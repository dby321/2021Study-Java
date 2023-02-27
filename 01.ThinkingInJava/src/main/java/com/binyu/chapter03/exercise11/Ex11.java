package com.binyu.chapter03.exercise11;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter03.exercise11
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-26 10:55
 * @Description:
 */
public class Ex11 {

    public static void main(String[] args) {
        int i=0x7fffffff;
        System.out.println (Integer.toBinaryString ( i ));
        while(i!=0){
            i>>=1;
            System.out.println (Integer.toBinaryString ( i ));
        }
    }
}
