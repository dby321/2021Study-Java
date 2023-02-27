package com.demo3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayCopyTest {
    public static void main(String[] args) {
        Object[] elementData=new Object[5];
        System.out.println(elementData.length);
        elementData= Arrays.copyOf(elementData,6);
        System.out.println(elementData.length);

        System.out.println("------");

        Object[] src=new Object[]{new Object(),new Object()};
        Object[] dest=new Object[]{new Object(),new Object()};
        Arrays.stream(src).forEach(System.out::print);
        System.out.println("----");
        Arrays.stream(dest).forEach(System.out::print);
        System.out.println("----");
        System.arraycopy(src,1,dest,1,1);
        Arrays.stream(dest).forEach(System.out::print);
        System.out.println("----");
        ArrayList a=new ArrayList();
        a.add(null);
        LinkedList l=new LinkedList();
        l.add(null);
        ArrayDeque ad=new ArrayDeque();// 它不能放null
        ad.add(null);
    }
}
