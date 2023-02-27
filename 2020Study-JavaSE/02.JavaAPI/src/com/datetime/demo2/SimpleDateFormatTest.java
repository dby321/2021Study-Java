package com.datetime.demo2;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.datetime.demo2
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-23 16:30
 * @Description:
 */
public class SimpleDateFormatTest {
    /**
     * 使用默认的构造器
     *
     * @throws ParseException
     */
    @Test
    public void test1() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat ();
        Date date = new Date ();
        System.out.println ( date );
        String format = sdf.format ( date );
        System.out.println ( format );

        String str = "20-10-23 下午10:20";
        System.out.println ( sdf.parse ( str ) );
    }

    @Test
    public void test2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat ( "yyyy-MM-dd hh:mm:ss" );
        Date date = new Date ();
        String format = sdf.format ( date );// 2020-10-23 04:40:25
        System.out.println ( format );
        Date parse = sdf.parse ( format );
        System.out.println ( parse.toString () );// Fri Oct 23 04:41:01 CST 2020
    }
}
