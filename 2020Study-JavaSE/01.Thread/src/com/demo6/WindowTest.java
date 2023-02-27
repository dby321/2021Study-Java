package com.demo6;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo6
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-22 14:55
 * @Description:
 */
public class WindowTest {
    public static void main(String[] args) {
        Window1 window1=new Window1 ();
        Thread t1=new Thread(window1);
        Thread t2=new Thread(window1);
        Thread t3=new Thread(window1);

        t1.setName ( "窗口1" );
        t2.setName ( "窗口2" );
        t3.setName ( "窗口3" );

        t1.start ();
        t2.start ();
        t3.start ();
    }


}
