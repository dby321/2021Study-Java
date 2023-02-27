package com.binyu.chapter02.exercise9;

/**
 * @BelongsProject: 2021Study-JavaSE
 * @BelongsPackage: com.binyu.chapter02.exercise9
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-22 18:48
 * @Description:
 */
@SuppressWarnings ( "All" )
public class OtherBoxingTest {
    public static void main(String[] args) {
        System.out.println ("--------------------------------------");
        Boolean b=true;
        Character c='a';
        Short s=123;
        Integer i=456;
        Long l=789L;
        Float f=123.456F;
        Double d=456.789;
        Void v = null;
        Void v2;
//        Void v=void;这句是错的！！！
        System.out.println (b+"---"+c+"---"+s+"---"+i+"---"+l+"---"+f+"---"+d+"---");
        System.out.println (v);
        System.out.println ("--------------------------------------");
        Boolean b2=new Boolean ( true );
        Character c2=new Character ( 'a' );
        Short s2=new Short( (short) 123 );
        Integer i2=new Integer ( 456 );
        Long l2=new Long(789L);
        Float f2=new Float ( 123.456F );
        Double d2=new Double(456.789);
        System.out.println (b2+"---"+c2+"---"+s2+"---"+i2+"---"+l2+"---"+f2+"---"+d2+"---");
    }
}
