package com.binyu.chapter05.exercise9;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter05.exercise9
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-26 17:39
 * @Description:
 */
public class Ghost {
    static void staticMethod(Ghost ghost){
        ghost=new Ghost ();
        ghost.notStaticMethod ();
// !       notStaticMethod()
    }
    void notStaticMethod(){
        System.out.println ("notStaticMethod()");
    }
}
