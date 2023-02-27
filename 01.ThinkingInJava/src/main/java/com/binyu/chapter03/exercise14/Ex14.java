package com.binyu.chapter03.exercise14;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter03.exercise14
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-25 14:40
 * @Description:
 */
public class Ex14 {
    static void compare(String str1,String str2){
        System.out.println (str1.equals ( str2 ));
        System.out.println (str1==str2);
    }

    public static void main(String[] args) {
        String s1="董滨雨";
        String s2="董滨雨";
        compare ( s1,s2 );
        String s3=new String("李铭霞");
        String s4=new String("李铭霞");
        compare ( s3,s4 );
    }
}
