package day16.java;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day16.java
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-25 16:20
 * @Description:
 */
public class ExceptionTest {
    @Test
    public void test1(){
//        int[] arr =null;
//        System.out.println (arr[3]);

        String str ="abc";
        str=null;
        System.out.println (str.charAt ( 0 ));
    }
    @Test
    public void test2(){
//        int[] arr=new int[10];
//        System.out.println (arr[10]);
        String str="abc";
        System.out.println (str.charAt ( 3 ));
    }
    @Test
    public void test3(){
        Object o=new Integer ( 13 );
        Date d=(Date)o;
    }
    @Test
    public void test4(){
        String str="abc";
        int abc = Integer.parseInt ( "abc" );
    }

    /**
     * JUnit下无法测试InputMismatchException
     */
    @Test
    public void test5(){
        Scanner scan=new Scanner ( System.in );
        int i = scan.nextInt ();
        System.out.println (i);
        scan.close ();
    }
    @Test
    public void test6(){
        int a=10;
        int b=a/0;
        System.out.println (a);
    }
}
