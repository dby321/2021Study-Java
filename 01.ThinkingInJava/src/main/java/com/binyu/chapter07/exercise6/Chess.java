package com.binyu.chapter07.exercise6;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter07.exercise6
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-31 12:15
 * @Description:
 */
public class Chess extends BroadGame {
    Chess(){
// !       System.out.println ( "Chess.Chess" );
// !      super(11);
        super(11);
        System.out.println ( "Chess.Chess" );
    }

    public static void main(String[] args) {
        Chess x=new Chess();
    }
}
