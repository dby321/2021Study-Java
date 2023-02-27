package com.binyu.chapter06.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dong Binyu
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person ();



//        IDEA模板测试
        System.out.println ( "args = [" + args + "]" );
        System.out.println ( "Test.main" );
        System.out.println ( "p = " + p );
        System.out.println ( p );
        String[] arr=new String[]{"Terry","Hanmeimei"};
        List<String> list=new ArrayList<> (  );
        list.add ( "Terry" );
        list.add ( "Terry1" );
        list.add ( "Terry2" );
        for (int i = 0; i < list.size (); i++) {
            System.out.println ( list.get ( i ) );
        }
    }
}