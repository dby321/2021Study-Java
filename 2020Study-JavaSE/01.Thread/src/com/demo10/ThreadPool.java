package com.demo10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 使用线程池
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo10
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-23 13:56
 * @Description:
 */

class NumberThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=100 ; i++) {
            if(i%2==0){
                System.out.println (Thread.currentThread ().getName ()+":"+i);
            }
        }
    }
}
class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=100 ; i++) {
            if(i%2==0){
                System.out.println (Thread.currentThread ().getName ()+":"+i);
            }
        }
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool ( 10 );
        ThreadPoolExecutor executor=(ThreadPoolExecutor)executorService;
//        便于线程管理
        executor.setCorePoolSize ( 15 );
//        适合使用于Callable
//        executorService.submit (  );
//        适合使用于Runnable
        executorService.execute ( new NumberThread () );
        executorService.execute ( new NumberThread1 () );
//        关闭线程池
        executorService.shutdown ();
    }
}
