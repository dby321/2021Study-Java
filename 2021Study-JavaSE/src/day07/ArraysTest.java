package day07;

import java.util.Arrays;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day07
 * @Author: Dong Binyu
 * @CreateTime: 2021-02-15 08:54
 * @Description:
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,2,3,4};
        int[] arr2=new int[]{1,2,3,4};
        boolean isEquals = Arrays.equals ( arr1, arr2 );
        System.out.println (isEquals);
        System.out.println ( Arrays.toString ( arr1 ) );
        Arrays.fill(arr1,10);
        System.out.println ( Arrays.toString ( arr1 ) );
    }
}
