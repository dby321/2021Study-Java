package com.demo1;

import org.junit.Test;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-21 19:23
 * @Description:
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread thread=new MyThread ();
        // 1.start()启动当前线程，并调用当前线程的run()方法
        thread.start ();
        // 2.如果直接调用run()，并不会启动线程
//        thread.run ();
       // 3.不可以让已经start的线程再次执行，要多个线程，就造多个线程对象

        MyThread thread1=new MyThread ();
        thread1.start ();
        for (int i = 0; i <100 ; i++) {
            if(i%2!=0){
                System.out.println (Thread.currentThread ().getName ()+"***"+i);
            }
        }

    }

    /**
     * 匿名子类的方式实现线程
     */
    @Test
    public void test(){
        new Thread(){
            @Override
            public void run(){
                System.out.println("匿名子类的方式");
            }
        }.start();
    }

    /**
     * 线程的方法
     */
    @Test
    public void test2(){
        MyThread myThread=new MyThread();
        // 设置线程优先级,只是从概率上讲，高优先级的线程高概率执行
        myThread.setPriority ( Thread.MAX_PRIORITY );
        myThread.setName("myThread");
        System.out.println(myThread.getName());
    }
}
