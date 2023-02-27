package com.datetime.demo1;

import org.junit.Test;

import java.util.Date;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.date.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-23 16:18
 * @Description:
 */
public class DateTimeTest {
    @Test
    public void test1(){
        // 时间戳
        System.out.println (System.currentTimeMillis ());
    }

    /**
     * java.util.Date类的方法和构造器
     * java.sql.Date类的方法和构造器
     */
    @Test
    public void test2(){
        Date date = new Date();
        System.out.println (date.toString ());// Fri Oct 23 16:22:13 CST 2020
        System.out.println ( date.getTime () );

        Date date1=new Date ( 1603441377924L );
        System.out.println (date.toString ());
        java.sql.Date date2 = new java.sql.Date ( 1603441377924L );
        System.out.println (date2.toString ());// 2020-10-23
    }

}
