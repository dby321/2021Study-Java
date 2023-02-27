package com.demo2;

public class JdkProxyTest{
		public static void main(String[] args){
      	SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
				smsService.send("java");
    }
}