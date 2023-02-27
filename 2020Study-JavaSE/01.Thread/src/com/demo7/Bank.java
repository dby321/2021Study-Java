package com.demo7;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo7
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-22 15:41
 * @Description:
 */
public class Bank {
    private Bank(){}
    private static Bank instance=null;
    public static  Bank getInstance(){
//        方式一：效率稍差
//        synchronized (Bank.class){
//            if(instance == null){
//                instance=new Bank();
//            }
//            return instance;
//        }
//        方式二：效率稍高
        if(instance==null){
            synchronized (Bank.class){
                if(instance == null){
                    instance=new Bank();
                }

            }
        }
        return instance;

    }
}
