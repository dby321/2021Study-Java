package com.biginteger;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.big.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-23 19:56
 * @Description:
 */
public class BigTest {
    @Test
    public void test1(){
        BigInteger bi=new BigInteger ( "12312312312312312312312312412414124" );
        BigDecimal bd1=new BigDecimal ( "123123.123" );
        BigDecimal bd2=new BigDecimal ( "11" );
        System.out.println (bi);
        System.out.println (bd1.divide ( bd2, BigDecimal.ROUND_HALF_UP ));
        System.out.println (bd1.divide ( bd2,25,BigDecimal.ROUND_HALF_UP ));
    }
}
