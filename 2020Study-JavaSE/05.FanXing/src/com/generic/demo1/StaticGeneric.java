package com.generic.demo1;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.generic.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-26 16:44
 * @Description:
 */
public class StaticGeneric extends Person{
    public static <E> void printArray(E[] inputArray){
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        printArray( intArray  );
        printArray( stringArray  );
    }
}
