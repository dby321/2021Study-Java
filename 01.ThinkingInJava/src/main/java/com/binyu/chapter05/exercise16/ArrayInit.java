package com.binyu.chapter05.exercise16;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise16
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-27 14:26
 * @Description:
 */
public class ArrayInit {
    public static void main(String[] args) {
        String[] strs=new String[]{
                new String("binyu1"),
                "binyu2",
        };
        for(String s:strs){
            System.out.println (s);
        }
    }
}
