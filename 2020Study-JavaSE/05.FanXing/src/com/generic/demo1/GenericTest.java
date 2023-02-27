package com.generic.demo1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.generic.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-26 15:20
 * @Description:
 */
public class GenericTest {
    @Test
    public void test1(){
        ArrayList list =new ArrayList (  );
        list.add ( 78 );
        list.add ( 76 );
        list.add ( 89 );
        list.add ( 88 );
        list.add ( "Tom" );
        for (Object o : list) {
//            java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
            int student= (int) o;
            System.out.println (student);
        }
    }

    @Test
    public void test2(){
        ArrayList<Integer> list=new ArrayList<> (  );
//        使用泛型后，编译时就会进行类型检查，保证数据的安全
//        list.add ( "556" );
        list.add ( 56 );
        list.add ( 213 );
        for (Integer element : list) {
            // 避免了强制类型转换
            System.out.println (element);
        }
    }

    /**
     * 通配符?
     */
    @Test
    public void test3(){
//        List<Object> list1=null;
//        List<String> list2=null;
        // 此时list1和list2类型不具有父子关系


        // extends代表?<=Person
        List<? extends Person> list1=null;
        // super代表?>=Person
        List<? super Person> list2=null;

        List<Person> list3=null;
        List<StaticGeneric> list4=null;
        List<Object> list5=null;
        list1=list3;
        list1=list4;
//        list1=list5;

        list2=list3;
//        list2=list4;
        list2=list5;
    }

}
