package com.demo;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> words=new ArrayList<>();
        words.add("123123");
        words.add("123123");
        words.add("11122");
        System.out.println(words.parallelStream().filter(w -> w.length() > 2).count());
    }
}
