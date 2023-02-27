package com.demo2;

public class OuterClass {
    public static class StaticInternalClass{
    }
    public class NotStaticInternalClass{
    }

    public static void main(String[] args) {
        OuterClass.StaticInternalClass staticInternalClass=new OuterClass.StaticInternalClass();
        OuterClass outerClass=new OuterClass();
        OuterClass.NotStaticInternalClass notStaticInternalClass=outerClass.new NotStaticInternalClass();

    }
}
