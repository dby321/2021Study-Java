package com.binyu.chapter03.exercise7;

import com.binyu.chapter03.exercise4.Ex4;

import java.util.Random;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter03.exercise7
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-24 16:48
 * @Description:
 */
public class Ex7 {
    /**
     * @return 抛硬币的结果：true or false
     */
    private static boolean throwACoin() {
        Random rand = new Random ();
        int i = rand.nextInt ( 100 ) + 1;
        if (i <= 50) {
            return false;
        } else {
            return true;
        }
    }

    private static void throwCoins(int times) {
        boolean b;
        for (int i = 0; i < times; i++) {
            b = Ex7.throwACoin ();
            System.out.println (b);
        }
    }

    public static void main(String[] args) {
        throwCoins ( 100 );
    }

}
