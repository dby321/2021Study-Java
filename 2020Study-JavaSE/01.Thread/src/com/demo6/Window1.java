package com.demo6;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo6
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-22 14:51
 * @Description:
 */
public class Window1 implements Runnable {
    private int ticket = 100;
    private Object obj=new Object ();

    @Override
    public void run() {
        // 买票
        while (true) {
            synchronized(obj) {
                if (ticket >= 1) {
//                增加了出现重票和错票的概率
//                try {
//                    Thread.sleep ( 100 );
//                } catch (InterruptedException e) {
//                    e.printStackTrace ();
//                }
                    System.out.println ( Thread.currentThread ().getName () + ":" + ticket + "号票被卖出" );
                    ticket--;
                } else {
                    System.out.println ( "票卖完了" );
                    break;
                }
            }

        }
    }
}
