package com.binyu.chapter02.exercise6;

/**
 * @BelongsProject: 2021Study-JavaSE
 * @BelongsPackage: com.binyu.chapter02.exercise6
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-22 18:23
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        StorageClassName2 scn2=new StorageClassName2 ();
        int len = scn2.storage ( "Java编程思想不好好学，怎么找工作" );
        System.out.println (len);
    }
}
