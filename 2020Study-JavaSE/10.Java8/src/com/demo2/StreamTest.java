package com.demo2;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo2
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-29 20:37
 * @Description:
 */
public class StreamTest {
    /**
     * 1. Stream关注的是对数据的运算，与CPU打交道
     * 集合关注的是数据的存储，与内存打交道
     * <p>
     * 2. Stream的特点
     * 2.1 Stream自己不会存储元素
     * 2.2 Stream不会改变源对象，而会返回一个持有结果的新Stream（不可变性）
     * 2.3 Stream的操作是延迟执行的，这意味着会等到需要结果时才执行
     * <p>
     * 3. Stream的执行流程
     * 3.1 Stream的实例化
     * 3.2 中间操作
     * 3.3 终止操作（一旦执行终止操作，就执行中间操作链，并产生结果，之后不会再被使用）
     */
    @Test
    public void test1() {
        List<String> list = new ArrayList<> ();
        list.add ( "AAA" );
        list.add ( "ccc" );
        list.add ( "董滨雨" );
        list.add ( "123" );
        // 创建Stream的方式一：通过集合
        Stream<String> stream1 = list.stream ();
        Stream<String> stream2 = list.parallelStream ();

        // 创建Stream的方式二：通过数组
        int[] arr = new int[]{1, 2, 3, 4, 56, 454, 76};
        IntStream stream3 = Arrays.stream ( arr );
        Person person1 = new Person ( "dongbinyu", 23 );
        Person person2 = new Person ( "mywife", 22 );
        Person[] people = {person1, person2};
        Stream<Person> stream4 = Arrays.stream ( people );

        // 创建Stream的方式三：通过Stream的of()
        Stream<Integer> stream5 = Stream.of ( 12, 34, 56, 321, 123 );

        // 创建Stream的方式四：创建无限流
        // 遍历前10个偶数
        Stream.iterate ( 0, t -> t + 2 ).limit ( 10 ).forEach ( System.out::println );

    }

    /**
     * 中间操作
     * 1. 筛选与切片
     * filter()
     * limit()
     * skip()
     */
    @Test
    @SuppressWarnings("all")
    public void test2() {
        Person person1 = new Person ( "dongbinyu", 23 );
        Person person2 = new Person ( "mywife", 22 );
        Person person3 = new Person ( "no you dont have wife", -1 );
        Person person4 = new Person ( "no you dont have wife", -1 );
        Person[] people = {person1, person2, person3, person4};
        Arrays.stream ( people ).filter ( e -> e.getAge () > 22 ).forEach ( System.out::println );
        System.out.println ( "----" );
        Arrays.stream ( people ).limit ( 2 ).forEach ( System.out::println );
        System.out.println ( "----" );
        Arrays.stream ( people ).skip ( 2 ).forEach ( System.out::println );
        System.out.println ( "----" );
        // 去重要重写equals()
        Arrays.stream ( people ).distinct ().forEach ( System.out::println );
    }

    /**
     * 中间操作
     * 2.映射
     * map()
     * flatmap()
     */
    @Test
    @SuppressWarnings("all")
    public void test3() {
        List<String> list = Arrays.asList ( "aa", "bb", "cc", "dd" );
        Stream<String> stream = list.stream ();
        stream.map ( s -> s.toUpperCase () ).forEach ( System.out::println );
        System.out.println ( "----" );

        Person person1 = new Person ( "dongbinyu", 23 );
        Person person2 = new Person ( "mywife", 22 );
        Person person3 = new Person ( "no you dont have wife", -1 );
        Person person4 = new Person ( "no you dont have wife", -1 );
        Person[] people = {person1, person2, person3, person4};

        Arrays.stream ( people ).map ( person -> person.getName () ).forEach ( System.out::println );
        System.out.println ( "----" );
        Arrays.stream ( people ).map ( Person::getName ).forEach ( System.out::println );
        System.out.println ( "----" );
        Arrays.stream ( people ).map ( Person::getName ).filter ( name -> name.length () > 6 ).forEach ( System.out::println );
    }

    /**
     * 为了解释flatmap()的小例子
     */
    @Test
    public void test4() {
        List list1 = new ArrayList ();
        list1.add ( 1 );
        list1.add ( 2 );
        list1.add ( 3 );
        List list2 = new ArrayList ();
        list2.add ( 4 );
        list2.add ( 5 );
        list2.add ( 6 );
//        list1.add ( list2 );
        list1.addAll ( list2 );
        System.out.println ( list1 );
    }

    /**
     * 中间操作
     * 3.排序
     * sorted()自然排序
     * sorted(Comparator com)定制排序
     */
    @Test
    @SuppressWarnings("all")
    public void test5() {
        List<Integer> list = Arrays.asList ( 12, 345, 67543, 123, 3215, 62, 1 );
        list.stream ().sorted ().forEach ( System.out::println );


        Person person1 = new Person ( "dongbinyu", 23 );
        Person person2 = new Person ( "mywife", 22 );
        Person person3 = new Person ( "no you dont have wife", -1 );
        Person person4 = new Person ( "no you dont have wife", -1 );
        Person[] people = {person1, person2, person3, person4};
        Arrays.stream ( people ).sorted ().forEach ( System.out::println );

    }

    /**
     * 终止操作
     * 1.匹配与查找
     * allMatch(Predicate p) 检查是否匹配所有元素
     * anyMatch(Predicate p)
     * noneMatch(Predicate p)
     * findFirst()
     * findAny()
     * count()
     * max()
     * min()
     * forEach()
     */
    @Test
    @SuppressWarnings("all")
    public void test6() {
        Person person1 = new Person ( "dongbinyu", 23 );
        Person person2 = new Person ( "mywife", 22 );
        Person person3 = new Person ( "no you dont have wife", -1 );
        Person person4 = new Person ( "no you dont have wife", -1 );
        Person[] people = {person1, person2, person3, person4};

        boolean b = Arrays.stream ( people ).map ( person -> person.getAge () ).allMatch ( age -> age > 18 );
        System.out.println ( b );
        boolean b1 = Arrays.stream ( people ).anyMatch ( person -> person.getAge () > 22 );
        System.out.println ( b1 );
        boolean b2 = Arrays.stream ( people ).noneMatch ( person -> person.getName ().startsWith ( "dong" ) );
        System.out.println ( b2 );

        Optional<Person> firstPerson = Arrays.stream ( people ).findFirst ();
        System.out.println ( firstPerson );
        // findAny()--返回当前流中的任意元素（我怎么觉得不太好用）
        Optional<Person> anyPerson = Arrays.stream ( people ).findAny ();
        System.out.println ( anyPerson );



        long count = Arrays.stream ( people ).count ();
        System.out.println ( count );
        Optional<Integer> max = Arrays.stream ( people ).map ( person -> person.getAge () ).max ( Integer::compareTo );
        System.out.println ( max );
        Optional<Person> minAgePerson = Arrays.stream ( people ).min ( (p1, p2) -> Integer.compare ( p1.getAge (), p2.getAge () ) );
        System.out.println ( minAgePerson );
        System.out.println ( "----" );
        Arrays.stream ( people ).forEach ( System.out::println );
    }

    /**
     * 终止操作
     * 2.规约
     * T reduce(T identity, BinaryOperator<T> accumulator)
     * Optional<T> reduce(BinaryOperator<T> accumulator)
     */
    @Test
    @SuppressWarnings("all")
    public void test7() {
        List<Integer> list = Arrays.asList ( 1, 2, 3, 7, 5, 8, 10, 6 );
        Integer reduce = list.stream ().reduce ( 0, Integer::sum );
        System.out.println ( reduce );
        Person person1 = new Person ( "dongbinyu", 23 );
        Person person2 = new Person ( "mywife", 22 );
        Person person3 = new Person ( "no you dont have wife", -1 );
        Person person4 = new Person ( "no you dont have wife", -1 );
        Person[] people = {person1, person2, person3, person4};
        Optional<Integer> reduce1 = Arrays.stream ( people ).map ( Person::getAge ).reduce ( Integer::sum );
        System.out.println ( reduce1 );
    }

    /**
     * 终止操作
     * 3.收集
     * collect
     */
    @Test
    @SuppressWarnings("all")
    public void test8() {
        Person person1 = new Person ( "dongbinyu", 23 );
        Person person2 = new Person ( "mywife", 22 );
        Person person3 = new Person ( "no you dont have wife", -1 );
        Person person4 = new Person ( "no you dont have wife", -1 );
        Person[] people = {person1, person2, person3, person4};

        List<Person> personList = Arrays.stream ( people ).filter ( p ->
                p.getAge () > 21

        ).collect ( Collectors.toList () );
        System.out.println (personList);
        Set<Person> personSet = Arrays.stream ( people ).filter ( p ->
                p.getAge () > 21

        ).collect ( Collectors.toSet () );
        System.out.println (personSet);
    }


    /**
     * Optional类
     */
    @Test
    public void test9(){
        Person person1 = new Person ();
        Person person2=null;
        Optional<Person> optionalPerson1 = Optional.of ( person1 );

        Optional<Person> optionalPerson2 = Optional.ofNullable ( person2 );
    }
}
