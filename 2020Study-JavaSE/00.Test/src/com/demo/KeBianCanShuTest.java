package com.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-31 13:43
 * @Description:
 */
public class KeBianCanShuTest {
    @Test
    public void test1(){
        KeBianCanShuMethod ( "董滨雨",23,123,"456",new ArrayList<String>(), new HashMap<String,Object>(),new Date (),null );
    }
    private String KeBianCanShuMethod(String str,Integer i,Object... args){
        System.out.println (str);
        System.out.println (i);
        System.out.println (args.length);
        System.out.println (args.getClass ().toString ());
        for (Object arg : args) {
            System.out.print (arg+" ");
        }
        return "ok";
    }
}
