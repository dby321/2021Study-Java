package com.binyu.chapter07.exercise8;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter07.exercise8
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-31 12:25
 * @Description:
 */
public class BaseSon extends Base {
    public BaseSon() {
        super();
        System.out.println ( "BaseSon.BaseSon" );
    }
    public BaseSon(int i){
        super();
        System.out.println ( "BaseSon.BaseSon" );
        System.out.println ( "i = " + i );
    }

    public static void main(String[] args) {
        BaseSon baseSon=new BaseSon ( 1 );
    }
}
