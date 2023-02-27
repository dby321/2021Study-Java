package com.binyu.chapter03.exercise12;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter03.exercise12
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-26 11:02
 * @Description:
 */
public class Ex12 {
    public static void main(String[] args) {
        int i=0x7fffffff;
        System.out.println (Integer.toBinaryString ( i ));
        i<<=1;
        System.out.println (Integer.toBinaryString ( i ));
        int j=0xffffffff;
        System.out.println (j);
        System.out.println (Integer.toBinaryString ( j ));
        j<<=3;
        System.out.println (Integer.toBinaryString ( j ));
        while(j!=0){
            j>>>=1;
            System.out.println (Integer.toBinaryString ( j ));
        }
    }
}
