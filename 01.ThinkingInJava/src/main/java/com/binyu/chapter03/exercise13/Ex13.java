package com.binyu.chapter03.exercise13;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter03.exercise13
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-26 11:15
 * @Description:
 */
public class Ex13 {
    public static void main(String[] args) {
        char[] chs="abcdefghijklmnopqrstuvwxyz`!@#$%^&*()_+`1234567890-={}[]|\\:'<.,>/?".toCharArray ();
        for(int i=0;i<chs.length;i++){
            System.out.println (chs[i]+":"+transform(chs[i]));
        }
    }

    private static int transform(int ch) {
        int temp,result;
        if(ch==1) {
            return 1;
        }
        temp=ch/2;
        result=(ch%2)+transform(temp)*10;
        return result;

    }
}
