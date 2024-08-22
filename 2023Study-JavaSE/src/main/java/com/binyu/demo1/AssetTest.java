package com.binyu.demo1;


import java.io.Console;

public class AssetTest {

    public static void main(String args[]) {
        String[] weekends = {"Friday", "Saturday", "Sunday"};
        assert weekends.length == 2;
        assert weekends.length == 2:"这个星期有 " + weekends.length + " 个周末";
        System.out.println("这个星期有 " + weekends.length + " 个周末");
    }

}