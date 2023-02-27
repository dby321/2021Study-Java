package com.binyu.chapter03.exercise4;

import java.util.Random;


/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter03.exercise4
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-24 16:03
 * @Description:
 */
public class MathOps {
    public static void main(String[] args) {
//
        Random rand=new Random ( 47 );
        int i,j,k;
//        choose value from 1 to 100
        j=rand.nextInt ( 100 )+1;
        System.out.println ("j:"+j);
        k=rand.nextInt ( 100 )+1;
        System.out.println ("k:"+k);
//        加减乘除and取余的过程略去
        float u,v,w;
        v=rand.nextFloat ();
        System.out.println ("v:"+v);
        w=rand.nextFloat();
        System.out.println ("w:"+w);

    }
}
