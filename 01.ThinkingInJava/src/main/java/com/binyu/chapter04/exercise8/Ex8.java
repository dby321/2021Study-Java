package com.binyu.chapter04.exercise8;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter04.exercise8
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-26 13:51
 * @Description:
 */
public class Ex8 {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            switch(i){
                case 0:
                    System.out.println ("this is 0");
                    break;
                case 1:
                case 2:
                    System.out.println ("this is 1 or 2");
                    break;
                default:
                    System.out.println ("too large");
            }
        }
    }
}
