package com.demo;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo
 * @Author: Dong Binyu
 * @CreateTime: 2021-02-10 11:25
 * @Description:
 */
public class YanghuiTest {
    public static void main(String[] args) {
        yanghui(10);
        int[][] arr1=new int[4][];
    }

    private static void yanghui(int row) {
        int[][] yanghui=new int[row][];
        for(int i=0;i<row;i++) {
            yanghui[i]=new int[i+1];
            yanghui[i][0]=1;
            yanghui[i][i]=1;
            if(i>=2) {
                for(int j=1;j<yanghui[i].length-1;j++) {
                    yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
                }
            }
        }
        System.out.println ("--打印杨辉三角--");
        for (int[] ints : yanghui) {
            for (int anInt : ints) {
                System.out.print ( anInt + " " );
            }
            System.out.println ();
        }
    }

}
