package com.demo;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo
 * @Author: Dong Binyu
 * @CreateTime: 2021-02-10 19:18
 * @Description:
 */
public class GenerateRandom {
    public static void main(String[] args) {
        System.out.println ("--[0,1)--");
        for(int i=0;i<100;i++){
            System.out.print (Math.random ()+"\t");
        }
        System.out.println ("\n--[0,Num)--");
        int num=10;
        for(int i=0;i<100;i++){
            System.out.print (Math.random ()*num+"\t");
        }
        System.out.println ("\n--[Min,Max)--");
        int min=10,max=99;
        for(int i=0;i<100;i++){
            System.out.print (Math.random ()*(max-min)+min+"\t");
        }
        System.out.println ("\n--[Min,Max]--");
        for(int i=0;i<100;i++){
            System.out.print (Math.random ()*(max-min+1)+min+"\t");
        }
    }
}
