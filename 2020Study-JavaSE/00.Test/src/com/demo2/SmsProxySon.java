package com.demo2;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo2
 * @Author: Dong Binyu
 * @CreateTime: 2022-02-12 11:56
 * @Description:
 */
public class SmsProxySon extends SmsService{
    private final SmsService smsService;

    public SmsProxySon(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public String send(String message) {
        //调用方法之前，我们可以添加自己的操作
        System.out.println("before method send()");
        smsService.send(message);
        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("after method send()");
        return null;
    }

}
