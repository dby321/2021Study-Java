package com.datetime.demo4;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * Java8抄Joda-Time的精华
 *
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.datetime.demo4
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-23 16:57
 * @Description:
 */
public class Java8TimeTest {
    /**
     * LocalDateTime用的频率最高
     */
    @Test
    public void test1() {
        LocalDate localDate = LocalDate.now ();
        LocalTime localTime = LocalTime.now ();
        LocalDateTime localDateTime = LocalDateTime.now ();
        System.out.println ( localDate );// 2020-10-23
        System.out.println ( localTime ); // 17:01:46.987
        System.out.println ( localDateTime ); // 2020-10-23T17:01:46.987
        // of():设置指定的年月日时分秒，没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of ( 2020, 10, 6, 5, 30, 15 );
        System.out.println (localDateTime1);
        // getXxx()
        System.out.println (localDateTime1.getDayOfMonth ());
        System.out.println (localDateTime1.getMonth ());
        // withXxx() 体现不可变性，类似String
        LocalDateTime localDateTime2 = localDateTime1.withDayOfMonth ( 22 );
        System.out.println (localDateTime1);
        System.out.println (localDateTime2);

        // plusXxx()  体现不可变性，类似String
        LocalDateTime localDateTime3 = localDateTime1.plusDays ( 3 );
        System.out.println (localDateTime1);
        System.out.println (localDateTime3);
    }

    /**
     * Instant的使用
     * 类似于java.util.Date
     */
    @Test
    public void test2(){
        Instant instant=Instant.now ();
        // 输出的时间是格林威治时间
        System.out.println (instant);// 2020-10-23T10:52:16.285Z
        OffsetDateTime offsetDateTime = instant.atOffset ( ZoneOffset.ofHours ( 8 ) );
        System.out.println (offsetDateTime);
        // 获取自1970.1.1.0.0.0对应的毫秒数
        long l = instant.toEpochMilli ();
        System.out.println (l);
        Instant instant1 = Instant.ofEpochMilli ( l );
        System.out.println (instant1);

    }

    /**
     * DateTimeFormatter:格式化或解析日期，时间
     * 类似于SimpleDateFormat
     */
    @Test
    public void test3(){
//        方式一 DateTimeFormatter.ISO_LOCAL_DATE_TIME
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        // 格式化
        LocalDateTime localDateTime = LocalDateTime.now ();
        String str1 = formatter.format ( localDateTime );
        System.out.println (localDateTime);
        System.out.println (str1);
        // 解析
        TemporalAccessor ta1 = formatter.parse ( str1 );
        System.out.println (ta1);

//        方式二  DateTimeFormatter.ofLocalizedDateTime ( FormatStyle.SHORT )
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime ( FormatStyle.SHORT );
        String str2 = formatter1.format ( localDateTime );
        System.out.println (str2);

//        方式三 自定义
        DateTimeFormatter formatter2=DateTimeFormatter.ofPattern ( "yyyy-MM-dd HH:mm:ss" );
        String str3 = formatter2.format ( localDateTime );
        System.out.println (str3);
        TemporalAccessor ta2 = formatter2.parse ( str3 );
        System.out.println (ta2);
    }


}
