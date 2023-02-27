package com.binyu.chapter07.exercise1;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter07.exercise1
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-30 19:16
 * @Description:
 */
public class Complicate {
    private Simple simple;
    @Override
    public String toString(){
        if (simple == null) {
            simple=new Simple();
        }
        return "Complicate:"+simple;
    }
}
