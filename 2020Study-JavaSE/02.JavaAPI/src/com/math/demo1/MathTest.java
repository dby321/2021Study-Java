package com.math.demo1;

import org.junit.Test;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.math.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-23 19:54
 * @Description:
 */
public class MathTest {
    @Test
    public void test1(){

        System.out.println (Math.max ( 1,3 ));
        System.out.println ( Math.sqrt ( 10 ) );
        System.out.println ( Math.log ( 100 ) );
        System.out.println ( Math.sin ( Math.PI / 2 ) );
        System.out.println ( Math.asin ( 1 ) );
        // toDegress转换成角度值
        System.out.println ( Math.toDegrees ( Math.PI / 2 ) );
        // toRadians转换成弧度值
        System.out.println ( Math.toRadians ( 90 ) );
    }
}
