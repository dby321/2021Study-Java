package com.binyu.chapter05.exercise15;

import java.util.Random;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise15
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-27 13:58
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Random rand=new Random ();
        int i=rand.nextInt(20);
        System.out.println (i);

        System.out.println ("-----");
// 因为我们指定了Random的seed,和我的世界中用种子生成世界的形式一样
        Random rand2=new Random(47);
        int i2=rand2.nextInt (20);
        System.out.println (i2);
    }
}
