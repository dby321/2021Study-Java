package com.binyu.chapter04.exercise3;

import java.util.Random;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter04.exercise3
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-26 12:01
 * @Description:
 */
public class Ex3 {
    public static void main(String[] args) {
        Random rand=new Random (  );
        int i,j,temp;
        temp=rand.nextInt ();
        while(true){
            i=temp;
            j=rand.nextInt ();
            if(i<j){
                System.out.print (i+"<"+j+",");
            }else if(i>j){
                System.out.print (i+">"+j+",");
            }else{
                System.out.print (i+"="+j+",");
            }
            temp=j;
        }
    }
}
