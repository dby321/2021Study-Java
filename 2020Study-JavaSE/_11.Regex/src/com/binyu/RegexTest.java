package com.binyu;

import org.junit.Test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    @Test
    public  void test01() {
        String w3schools = "\\w";
        Pattern pattern = Pattern.compile(w3schools, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
        String text="google runoob taobao\n" +
                "runoob、runooob、runoooooob\n" +
                "color 或者 colour";
        String[] split = text.split("[\\s、]");
        Arrays.stream(split).forEach(System.out::println);
    }
    @Test
    public void test02(){
        String str="\\w{6} ";
        Pattern pattern = Pattern.compile(str, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("RegExr: Learn, Build, & Test RegEx  sdfsd124dvxf sdfkfdsjkfsdkj dfdfsdf");
        // group是针对（）来说的，group（0）就是指的整个串，group（1） 指的是第一个括号里的东西，group（2）指的第二个括号里的东西。
        while(matcher.find()){
            String group = matcher.group(0);
            System.out.println(group);
        }
    }
    @Test
    public void test03(){
        
    }
}
