package com.demo2;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo2
 * @Author: Dong Binyu
 * @CreateTime: 2022-02-12 11:54
 * @Description:
 */
public class SmsServiceSon extends SmsService{
    @Override
    public String send(String message){
        System.out.println("SmsServiceSon message:" + message);
        return "SmsServiceSon..."+message;
    }
}
