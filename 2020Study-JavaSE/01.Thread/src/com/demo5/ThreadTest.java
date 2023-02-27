package com.demo5;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo5
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-21 20:22
 * @Description:
 */
public class ThreadTest {
    public static void main(String[] args) {
        PrimeRun primeRun=new PrimeRun ();
        Thread thread = new Thread ( primeRun );
        thread.start ();
    }
}

