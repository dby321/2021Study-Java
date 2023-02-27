package com.datetime.demo3;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.datetime.demo3
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-23 16:41
 * @Description:
 */
public class CalendarTest {
    /**
     * Calendar日历类(抽象类的使用)
     */
    @Test
    public void test1(){
//        方式一：调用静态方法
        Calendar calendar=Calendar.getInstance ();
//        方式二：创建其子类的对象
        Calendar calendar1=new GregorianCalendar (  );
        // get
        System.out.println ( calendar.get ( Calendar.DAY_OF_MONTH ) );
        System.out.println ( calendar.get ( Calendar.DAY_OF_YEAR ) );
        // set
        // calendar 可变性
        calendar.set(Calendar.DAY_OF_MONTH,22);
        System.out.println (calendar.get ( Calendar.DAY_OF_MONTH ));
        // add
        calendar.add ( Calendar.DAY_OF_MONTH,3 );
        System.out.println (calendar.get ( Calendar.DAY_OF_MONTH ));
        calendar.add ( Calendar.DAY_OF_MONTH,-3 );
        System.out.println (calendar.get ( Calendar.DAY_OF_MONTH ));

        // getTime
        Date time = calendar.getTime ();
        System.out.println (time.toString ());

        // setTime
        calendar.setTime ( new Date (  ) );
        System.out.println (calendar.toString ());
    }
    @Test
    public void test2(){
        // 原有的Date有偏移量
        Date date=new Date ( 2020-1900,9-1,8 );
        System.out.println (date.toString ());
    }
}
