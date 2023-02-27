package com.demo5;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo5
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-21 20:19
 * @Description:
 */
public class PrimeRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <100; i++) {
            System.out.println (i);
        }
    }
}
