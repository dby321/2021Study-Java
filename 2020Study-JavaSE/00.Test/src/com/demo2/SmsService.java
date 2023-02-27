package com.demo2;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo2
 * @Author: Dong Binyu
 * @CreateTime: 2022-02-12 11:53
 * @Description:
 */
public class SmsService {
    public String send(String message){
        System.out.println("SmsService message:" + message);
        return "SmsService..."+message;
    }
}
