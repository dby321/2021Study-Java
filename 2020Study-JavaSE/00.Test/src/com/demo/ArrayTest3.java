package com.demo;

import java.util.Random;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo
 * @Author: Dong Binyu
 * @CreateTime: 2021-02-10 11:59
 * @Description:
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        produceSomeDifferentNumberWithinACertainRange(10,30,6);
    }

    /**
     * @param numberBegin
     * @param numberEnd
     * @param arrLength
     * @return
     * 创造一个长度为arrLength的int型数组，要求数组元素的值都在numberBegin和numberEnd之间，且是随机赋值。同时要求元素的值各不相同
     */
    private static int[] produceSomeDifferentNumberWithinACertainRange(int numberBegin,int numberEnd,int arrLength){
        int[] arr=new int[arrLength];
        Random rand=new Random (  );
        System.out.println ("--测试Random--");
        for(int i=1;i<1000;i++){
            System.out.print ( (rand.nextInt ( numberEnd-numberBegin+1 )+numberBegin)+" " );
        }
        System.out.print ("\n");
        System.out.println ("--完成业务--");
        arr[0]=rand.nextInt ( numberEnd-numberBegin+1 )+numberBegin;
        int i=1;
        while(i<arrLength){
            int x=rand.nextInt ( numberEnd-numberBegin+1 )+numberBegin;
            for(int j=0;j<i;j++){
                if(x==arr[j]){
                    break;
                }
                if(j+1==i){
                    arr[i]=x;
                    i++;
                }
            }
        }
        for(int i2=0;i2<arr.length;i2++){
            System.out.print (arr[i2]+" ");
        }
        System.out.println ();
        return arr;
    }
}
