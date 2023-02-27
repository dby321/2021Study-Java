package com.binyu.chapter07.exercise10;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter07.exercise9
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-31 12:32
 * @Description:
 */
public class Stem extends Root {
    Stem(String s){
        super("调用Root的有参构造器");
        System.out.println ( "Stem.Stem(String s)"+s );
    }
    public static void main(String[] args) {
        Stem stem=new Stem ("调用Stem的有参构造器");
    }
}
