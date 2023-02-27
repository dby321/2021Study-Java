package day15.java8;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day15.java8
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-25 10:45
 * @Description:
 */
public interface CompareA {
    public static void method1(){
        System.out.println ("CompareA:北京");
    }
    public default void method2(){
        System.out.println ("CompareA:上海");
    }
    default void method3(){
        System.out.println ("CompareA:上海");
    }

}
