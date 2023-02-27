package com.demo1;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-21 19:21
 * @Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            if(i%2==0){
                System.out.println (Thread.currentThread ().getName ()+":"+i);
            }
        }
    }
}
