package com.demo;

import java.util.stream.IntStream;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo
 * @Author: Dong Binyu
 * @CreateTime: 2021-11-15 16:00
 * @Description:
 */
public class CodePointTest {
    public static void main(String[] args) {
        String s = new String ( "😊董滨雨" );
        System.out.println ( s.length () );
        IntStream intStream = s.codePoints ();
        int[] ints = intStream.toArray ();
        for(int i :ints){
            System.out.println (i);
        }
        String s2=new String(ints,0,1);
        System.out.println (s2);
    }
}
