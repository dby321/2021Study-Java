package com.demo1;

import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-29 15:33
 * @Description:
 */
public class LambdaTest {
    @Test
    public void test1(){
        Runnable r1=new Runnable () {
            @Override
            public void run() {
                System.out.println ("我爱北京天安门");
            }
        };
        r1.run ();

        Runnable r2= ()-> System.out.println ("我爱北京天安门");

        r2.run ();

    }
    @Test
    public void test2(){
        Comparator<Integer> com1=new Comparator<Integer> () {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare ( o1,o2 );
            }
        };
        int compare1 = com1.compare ( 12, 21 );
        System.out.println (compare1);
        // lambda表达式
        Comparator<Integer> com2=(o1,o2)->Integer.compare ( o1,o2 );
        int compare2 = com1.compare ( 12, 21 );
        System.out.println (compare2);
        // 方法引用
        Comparator<Integer> com3= Integer::compare;
        int compare3 = com1.compare ( 12, 21 );
        System.out.println (compare3);

    }

    /**
     * lambda操作符 ->
     * lambda形参列表 (xxx,yyy)
     * lambda方法体
     *
     * lamba表达式的本质是作为 函数式接口的实例
     */
    @Test
    public void test3(){
        Runnable runnable = () -> {
            System.out.println ("runnable()");
        };
        runnable.run ();
        Consumer<String> consumer= s -> System.out.println (s);
        consumer.accept ( "Consumer<String>" );
    }

    /**
     * java内置4大核心函数式接口
     *
     * 消费型接口 Consumer<T> void accept(T t)
     * 供给型接口 Supplier<T> T get()
     * 函数型接口 Function<T,R> R apply(T t)
     * 断定型接口 Predicate<T> boolean test(T t)
     */
    @Test
    public void test4(){
        happyTime ( 500, new Consumer<Double> () {
            @Override
            public void accept(Double aDouble) {
                System.out.println ("去天上人间"+aDouble);
            }
        } );
        happyTime ( 400,money-> System.out.println ("去天上人间"+money) );
    }

    public void happyTime(double money,Consumer<Double> con){
        con.accept ( money );
    }


    @Test
    public void test5(){
        List<String> list= Arrays.asList ("北京","南京","东京","天津");
        List<String> stringList = filterString ( list, s -> s.contains ( "京" ) );
        System.out.println (stringList);

    }
    public List<String> filterString(List<String> list, Predicate<String> pre){
        ArrayList<String> filterList=new ArrayList<> (  );
        for(String s :list){
            if(pre.test ( s )){
                filterList.add(s);
            }
        }
        return filterList;
    }


    /**
     * 1.方法引用，本质上就是Lambda表达式、
     * 方法引用也是函数式接口的实例
     * 若lambda体中内容有方法已经实现了，可以使用方法引用
     *
     * 2.具体分三种情况
     * 情况1  对象::非静态方法
     * 情况2  类::静态方法
     * 情况3  类::非静态方法
     *
     * 3.方法引用的使用要求：
     * 接口中的抽象方法的 形参列表 和 返回值类型 与
     * 方法引用的方法的 形参列表 和 返回值类型 相同（针对情况1和情况2）
     */
    @Test
    public void test6(){
        Consumer<String> con1= System.out::println;
        System.out.println ("---");
        PrintStream ps = System.out;
        Consumer<String> con2=ps::println;
        con2.accept ( "beijing" );

    }

}
