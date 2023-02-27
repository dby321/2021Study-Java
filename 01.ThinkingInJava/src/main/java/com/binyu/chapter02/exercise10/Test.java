package com.binyu.chapter02.exercise10;

/**
 * @BelongsProject: 2021Study-JavaSE
 * @BelongsPackage: com.binyu.chapter02.exercise10
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-22 19:10
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
      /*
      Exception in thread "Ex9" java.lang.ArrayIndexOutOfBoundsException: 0
	  at com.binyu.chapter02.exercise10.Ex7.Ex9(Ex7.java:12)
      */
      /*
      * 重载方法 void println()   void println(boolean)   void println(char)   void println(int)   void println(long)   void println(float)   void println(double)   void println(char[])   void println(String)   void println(Object)
      * 重写方法 子类重写父类（超类）的方法
       * */
        System.out.println (args[0]);
        System.out.println (args[1]);
        System.out.println (args[2]);
    }
}
