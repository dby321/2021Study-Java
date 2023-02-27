package com.binyu.chapter04.exercise9;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter04.exercise9
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-26 13:56
 * @Description:
 */
public class Ex9 {
    public static void main(String[] args) {
        fibonacci ( -1 );
        fibonacci ( 0 );
        fibonacci ( 1 );
        fibonacci ( 2 );
        fibonacci ( 5 );
        fibonacci ( 10 );
        fibonacci ( 20 );
    }

    /**
     * @param mount 显示的斐波拉契数列数字数量
     * 此方法之只能处理小于Integer.MAX_VALUE的整型
     */
    private static void fibonacci(int mount) {
        int num1 = 1, num2 = 1, nowNum;
        if (mount <= 0) {
            System.out.println ( "输入不合法，请输入一个大于0的数" );
        }else if(mount == 1){
            System.out.println ("1");
        }else if(mount == 2){
            System.out.println ("1 1");
        }else{
            System.out.print ("1 1");
            for(int i=2;i<mount;i++){
                nowNum=num1+num2;
                System.out.print (" "+nowNum);
                num1=num2;
                num2=nowNum;
            }
            System.out.println ();
        }
    }

}

