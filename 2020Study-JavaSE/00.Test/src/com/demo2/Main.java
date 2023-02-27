package com.demo2;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo2
 * @Author: Dong Binyu
 * @CreateTime: 2022-02-12 11:57
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        SmsService smsService=new SmsServiceSon ();
        SmsProxySon smsProxySon=new SmsProxySon ( smsService );
        smsProxySon.send ( "java" );

    }
}
