package com.binyu.chapter02.exercise6;

/**
 * @BelongsProject: 2021Study-JavaSE
 * @BelongsPackage: com.binyu.chapter02.exercise6
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-22 18:17
 * @Description:
 */
public class StorageClassName {
    static int storage(String s){
        return s.length ()*2;
    }

    public static void main(String[] args) {
        int len = storage ( "Java编程思想要好好学" );
        System.out.println (len);
    }
}
