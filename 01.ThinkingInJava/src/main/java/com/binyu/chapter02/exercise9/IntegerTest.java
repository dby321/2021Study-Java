package com.binyu.chapter02.exercise9;

/**
 * @BelongsProject: 2021Study-JavaSE
 * @BelongsPackage: com.binyu.chapter02.exercise9
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-22 18:40
 * @Description:
 */
public class IntegerTest {
    public static void main(String[] args) {
//        正常赋值
        int i1=3;
        System.out.println ("i1="+i1);
//        手动装箱
        Integer i2=new Integer ( 3 );
        System.out.println ("i2="+i2);

//        自动装箱
        Integer i3=3;
        System.out.println ("i3="+i3);

        int i4=i2;
        System.out.println ("i4="+i4);

        int i5=i3;
        System.out.println ("i5="+i5);
    }
}
