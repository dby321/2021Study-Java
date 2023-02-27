package com.demo3;


import org.junit.Test;

public class WeiYiTest {
    @Test
    public void test1(){
        int i=-4;
        System.out.println(Integer.toBinaryString(i));
        i>>=1;
        System.out.println(Integer.toBinaryString(i));
        i=-4;
        System.out.println(Integer.toBinaryString(i));
        i>>>=1;
        System.out.println(Integer.toBinaryString(i));
        short j=-4;
        System.out.println(Integer.toBinaryString(j));
        j>>>=1;
        System.out.println(Integer.toBinaryString(j));
    }

}
