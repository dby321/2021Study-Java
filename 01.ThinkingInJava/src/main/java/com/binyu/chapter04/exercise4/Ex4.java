package com.binyu.chapter04.exercise4;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter04.exercise4
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-26 12:11
 * @Description:
 */
public class Ex4 {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){
            int count=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
                System.out.println (i);
            }
        }
    }
}
