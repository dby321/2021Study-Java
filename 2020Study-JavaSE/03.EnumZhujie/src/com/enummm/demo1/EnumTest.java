package com.enummm.demo1;

import org.junit.Test;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.e.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-23 20:11
 * @Description:
 */
public class EnumTest {
    @Test
    public void test1(){
        Season season=Season.SPRING;
        System.out.println (season.toString ());
        System.out.println (season);
    }

    @Test
    public void test2(){
        SeasonEnum seasonEnum=SeasonEnum.SPRING;
        System.out.println (seasonEnum);
        System.out.println ( SeasonEnum.class.getSuperclass () ); // class java.lang.Enum
    }

    @Test
    public void test3(){
        SeasonEnum[] values = SeasonEnum.values ();
        for (SeasonEnum value : values) {
            System.out.println (value);
            value.show ();
        }
        System.out.println ("---------");
        Thread.State[] values1 = Thread.State.values ();
        for (Thread.State state : values1) {
            System.out.println (state);
        }

        System.out.println ("---------");
        SeasonEnum seasonEnum = SeasonEnum.valueOf ( "WINTER" );
        System.out.println (seasonEnum);
    }


}
