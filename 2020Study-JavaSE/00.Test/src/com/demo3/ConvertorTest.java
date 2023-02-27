package com.demo3;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertorTest {
    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        byte[] bytes = new byte[]{'1','2','3','4'};

        String s = new String(bytes, Charset.forName("UTF-8"));
        long l = Long.parseLong(s);
        System.out.println(l);
        Class<? extends String> aClass = s.getClass();
//        Collections.max();


        ArrayList<String> list1 = new ArrayList(); //第一种 情况

        ArrayList list2 = new ArrayList<String>(); //第二种 情况

        // 反射+stream表达式
        Method split = String.class.getMethod("split", String.class);
        String[] invoke = (String[]) split.invoke("1-2-3", "-");
        Arrays.stream(invoke).forEach(System.out::println);
        System.out.println("----");
        for (String s1 : Arrays.stream(invoke).map(x -> x + 3).collect(Collectors.toList())) {
            System.out.println(s1);
        }



    }
}
