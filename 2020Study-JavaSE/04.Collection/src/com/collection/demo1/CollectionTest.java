package com.collection.demo1;

import org.junit.Test;

import java.util.*;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.collection.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-25 15:17
 * @Description:
 */
public class CollectionTest {

    /**
     * Collection接口
     * List接口：存储有序的，可重复的数据 --> “动态”数组
     * ArrayList LinkedList Vector
     * Set接口：存储无序的，不可重复的数据 --> 高中讲的“集合”
     * HashSet LinkedHashSet TreeSet
     */
    @Test
    public void test1() {
        Collection coll = new ArrayList ();
        // add()
        coll.add ( "AA" );
        coll.add ( "BB" );
        coll.add ( "123" );
        coll.add ( new Date () );
        // size()
        System.out.println ( coll.size () );
        Collection coll1 = new ArrayList ();
        // addAll()
        coll1.addAll ( coll );
        System.out.println ( coll1.size () );
        System.out.println ( coll1 );

        // isEmpty()
        System.out.println ( coll.isEmpty () );

        // clear()
        coll.clear ();
        System.out.println ( coll );

        // contains()
        // 如果contains()内是对象，就会调用该对象的类的equals()方法比较对象是否相同
        boolean flag1 = coll1.contains ( "AA" );
        boolean flag2 = coll1.contains ( "AB" );
        System.out.println ( flag1 );
        System.out.println ( flag2 );

        // containsAll()
        Collection coll2 = new ArrayList ();
        coll2.add ( "AA" );
        coll2.add ( "AA" );
        coll2.add ( "BB" );
        boolean flag3 = coll1.containsAll ( coll2 );
        System.out.println ( flag3 );
        System.out.println ( "-----" );

        // remove()
        // 如果remove()内是对象，就会调用该对象的类的equals()方法比较对象是否相同
        System.out.println ( coll2.size () );
        coll2.remove ( "AA" );
//        coll2.remove ( "AA" );
        System.out.println ( coll2.size () );

        // removeAll() 做差集

        // retainAll() 做交集

        // equals() ArrayList元素一样，顺序不一样时 equals()也为false

        // hashcode() 返回当前对象的哈希值

        // toArray() 集合转换为数组
        // 拓展 Arrays.asList() 数组转换为集合

        // iterator() 用于遍历集合元素
    }

    @Test
    public void test2() {
        Collection coll = new ArrayList ();
        // add()
        coll.add ( "AA" );
        coll.add ( "BB" );
        coll.add ( "123" );
        coll.add ( new Date () );
        Iterator iterator = coll.iterator ();
        // 迭代器遍历集合
        while (true) {
            if (iterator.hasNext ()) {
                System.out.println ( iterator.next () );
            } else {
                break;
            }
        }
        System.out.println ( "-----" );
        Iterator iterator1 = coll.iterator ();
        while (iterator1.hasNext ()) {
            System.out.println ( iterator1.next () );
        }
        // Iterator中的remove()用来移除当前迭代器指向的元素

        System.out.println ( "-----" );
        // 增强for遍历集合
        for (Object o : coll) {
            System.out.println ( o );
        }
        System.out.println ( "-----" );
        coll.forEach ( co -> System.out.println ( co ) );
    }

    /**
     * ArrayList 主要实现类，线程不安全，效率高，底层使用Object[]，查找快，插入删除慢
     * 底层源码分析（jdk1.7和jdk1.8略有不同）:容量不够就扩容，建议使用指定大小的构造器new ArrayList(大小)
     * LinkedList 底层使用链表，查找慢，插入删除快
     * 底层源码分析:是一个双向链表。新增add()时，实际是向链表尾插入了一个Node。不涉及到扩容。
     * Vector 古老实现类，线程安全，效率低，底层使用Object[]
     * 底层源码分析:扩容方式和ArrayList不同，ArrayList默认扩容为原来的1.5倍，而Vector默认扩容为原来的2倍
     * 就算为了线程安全也不会用Vector,而会使用Collections.synchronizedList()。
     */
    @Test
    public void test3() {

        ArrayList<String> arrayList = new ArrayList<> ();
        // 将线程不安全的ArrayList转换为线程安全的SynchronizedList
        List<String> stringList = Collections.synchronizedList ( arrayList );

        System.out.println ( "-----" );
        ArrayList<String> arrayList1 = new ArrayList<> ();
        arrayList1.add ( "123" );
        arrayList1.add ( "123" );
        arrayList1.add ( "123" );
        arrayList1.add ( "123" );
        arrayList1.add ( "123" );
        System.out.println ( arrayList1 );
        arrayList1.add ( 2, "456" );
        System.out.println ( arrayList1 );


        String[] strings = {"789", "789"};
        List<String> stringList1 = Arrays.asList ( strings );
        arrayList1.addAll ( stringList1 );
        System.out.println ( arrayList1 );

        // indexOf() 首次出现的位置
        int i = arrayList1.indexOf ( "789" );
        System.out.println ( i );
        int i1 = arrayList1.lastIndexOf ( "789" );
        System.out.println ( i1 );

        // remove() 重载OverLoad
        String remove = arrayList1.remove ( 2 );
        System.out.println ( remove );
        System.out.println ( arrayList1 );

        // set()
        arrayList1.set ( 0, "321" );
        System.out.println ( arrayList1 );

        // subList() 原来的ArrayList不变，返回新的subList
        List<String> subList = arrayList1.subList ( 2, 4 );
        System.out.println ( arrayList1 );
        System.out.println ( subList );
        // size()
        System.out.println ( "size()测试：" + arrayList1.size () );

        // 遍历
        System.out.println ( "----迭代器遍历" );
        Iterator<String> iterator = arrayList1.iterator ();
        while (iterator.hasNext ()) {
            System.out.println ( iterator.next () );
        }
        System.out.println ( "----普通for遍历" );
        for (i = 0; i < arrayList1.size (); i++) {
            System.out.println ( arrayList1.get ( i ) );
        }
        System.out.println ( "----增强for遍历" );
        for (String s : arrayList1) {
            System.out.println ( s );
        }
        System.out.println ( "-----forEach遍历" );
        arrayList1.forEach ( s -> System.out.println ( s ) );
    }

    /**
     * Set的无序性： 不是随机性，存储的数据在底层数组中并非按照数组索引的顺序添加，
     * 而是根据数据的哈希值而后散列进行添加的。
     * 所以遍历Set可能看起来像是按添加元素的顺序输出，看起来是有序的。但底层并不有序。
     * Set的不可重复性：如果某类没有重写hashcode()，每次 new 对象 的哈希值是不一样的。
     * 故通常都要重写hashcode()
     * <p>
     * <p>
     * <p>
     * HashSet 主要实现类，线程不安全，可以存储null值
     * LinkedHashSet 作为HashSet的子类，遍历其内部数据时，可以按照添加的顺序遍历
     * TreeSet 可以按照添加元素的指定数据，进行排序
     * <p>
     * <p>
     * <p>
     * <p>
     * HashSet添加元素的步骤：
     * 若向HashSet中添加元素a,首先调用元素a所在类的hashCode()方法， 计算a的哈希值，
     * 此哈希值接着通过某种散列算法计算出在HashSet底层数组中的存放索引位置，判断数组
     * 此位置上是否已经有元素：
     * 1. 如果此位置上没有其他元素，则元素a添加成功
     * 2. 如果此位置上有其他元素b(或以链表形式存在的多个元素)，则比较元素a和元素b的
     * 哈希值：
     * 1.如果哈希值不相同，则元素a添加成功
     * 2.如果哈希值相同，进而需要调用元素a所在类的equals()方法：
     * 1. equals()返回true，元素a添加失败
     * 2.equals()返回false，元素a添加成功
     * （至于添加新元素的位置，jdk1.7和jdk1.8不同，记住七上八下）
     * <p>
     * 向Set中添加的数据，其所在的类一定要重写hashCode()和equals()
     * <p>
     * LinkedHashSet
     * 作为HashSet的子类，在添加数据点同时，每个数据还维护了两个引用，记录数据的前后关系
     * 优点：频繁遍历的效率高于HashSet
     * TreeSet
     * 1.向TreeSet中添加的数据，要求是相同类的对象
     * 2.如果TreeSet中的元素是某种自定义类，而又要进行遍历，
     * 该类要实现排序接口Comparable或Comparator，也就是有
     * 两种排序方式：自然排序和定制排序。
     * 否则会报java.lang.ClassCastException: com.collection.demo1.Person cannot be cast to java.lang.Comparable
     * 3.TreeSet元素不可重复不是依靠equals()，而是依靠compareTo()
     * compareTo()返回0即判断为元素相同
     */
    @Test
    public void test4() {
        HashSet<String> hashSet = new HashSet<> ();
        hashSet.add ( "123" );
        hashSet.add ( "123" );
        hashSet.add ( "123" );
        hashSet.add ( "321" );
        hashSet.add ( "456" );
        hashSet.add ( "321" );
        System.out.println ( hashSet );
        for (String s : hashSet) {
            System.out.println ( s );
        }

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<> ();
        linkedHashSet.add ( "123" );
        linkedHashSet.add ( "123" );
        linkedHashSet.add ( "123" );
        linkedHashSet.add ( "321" );
        linkedHashSet.add ( "456" );
        linkedHashSet.add ( "321" );


        TreeSet treeSet = new TreeSet ();
        treeSet.add ( new Person ( "Jack", 23 ) );
        treeSet.add ( new Person ( "Mark", 45 ) );
        treeSet.add ( new Person ( "Green", 20 ) );
        treeSet.add ( new Person ( "Blue", 21 ) );
        treeSet.add ( new Person ( "Fuck", 18 ) );
        treeSet.add ( new Person ( "Fuck", 22 ) );

//        Iterator iterator = treeSet.iterator ();
//        while(iterator.hasNext ()){
//            System.out.println (iterator.next ());
//        }
        for (Object o : treeSet) {
            System.out.println ( o );
        }

        // 定制排序
        Comparator comparator = new Comparator () {
            @Override
            public int compare(Object o1, Object o2) {
                // 书写排序逻辑
                return 0;
            }
        };
        TreeSet treeSet1 = new TreeSet ( comparator );
    }


}
