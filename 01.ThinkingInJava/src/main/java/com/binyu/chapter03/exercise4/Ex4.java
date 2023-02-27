package com.binyu.chapter03.exercise4;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter03.exercise4
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-24 16:15
 * @Description:
 */
public class Ex4 {
    private static double calSpeed(double distance,double time){
        return distance/time;
    }

    public static void main(String[] args) {
        double dis=50.0;
        double tim=10.0;
        double speed=Ex4.calSpeed ( dis,tim );
        System.out.println (speed);
    }
}
