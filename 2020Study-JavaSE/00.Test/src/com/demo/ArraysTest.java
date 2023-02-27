package com.demo;

import java.util.Arrays;

public class ArraysTest {
    static class Person{
        String name;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        String[] strs=new String[10];
        for(int i=0;i<strs.length;i++){
            strs[i]=i+"";
        }
        System.out.println(Arrays.toString(strs));
        Person[] pers=new Person[10];
        for(int i=0;i< pers.length;i++){
            pers[i]=new Person();
            pers[i].name=i+"";
        }
        System.out.println(Arrays.toString(pers));
    }
}
