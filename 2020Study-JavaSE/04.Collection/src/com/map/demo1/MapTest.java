package com.map.demo1;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.map.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-25 20:30
 * @Description:
 */
public class MapTest {
    /**
     *  Map接口：双列数据
     *      HashMap:主要实现类，线程不安全，效率高。存储null的key和value
     *          LinkedHashMap 保证在遍历map元素时，可以按照添加的顺序实现遍历
     *          原因：在原有的HashMap底层结构基础上，添加一一对指针，指向前一个
     *          和后一对。对于频繁的遍历操作，执行效率高于HashMap
     *      TreeMap:保证按照添加的key-value进行排序，实现排序遍历。此时考虑key
     *      的自然排序和定制排序。底层使用红黑树
     *      Hashtable:古老实现类，线程安全。效率低。不能存储null的key和value
     *          Properties：常用来处理配置文件，key-value都是String类型
     *
     *  HashMap底层：数组+链表（jdk7以前）
     *              数组+链表+红黑树（jdk8）
     *  Map的key使用Set存储 --> key所在的类要重写equals()和hashCode()（以HashMap为例）
     *  Map的value使用Collection存储 --> value所在的类要重写equals()
     *  Map的key-value用Entry存储
     *
     *  jdk7中的HashMap底层实现原理：
     *  HashMap map=new HashMap(),在实例化以后，底层创建了长度是16的以为数组Entry[] table
     *  map.put(key1,value1)首先调用key1所在类的hashCode()计算key1哈希值，此哈希值经过散列算法之后，
     *  得到在Entry[]中的位置：
     *      如果此位置上为空，添加成功
     *      如果此位置上不为空，（此位置上存在一个或多个数据），比较key1和其他数据的key的哈希值：
     *          如果哈希值与已存在的哈希值都不相同，添加成功
     *          如果哈希值和已存在的某一个哈希值相同，调用key1所在类的equals()
     *              如果equals()返回false，添加成功
     *              如果equals()返回true，使用value1替换相同key的value值
     *  jdk7中默认扩容：当超出临界值，且要存放的位置非空时，扩容为原来的2倍
     *
     *  jdk8相较于jdk7在底层实现的不同：
     *  1. new HashMap()：底层没有创建一个长度为16的数组
     *  2. jdk8底层的数组是Node[]，而非Entry[]，Node是Entry的实现类
     *  3. 首次调用put犯法时，底层创建长度为16的数组
     *  4. 数组+链表（jdk7以前）数组+链表+红黑树（jdk8）
     *  当数组某一个索引位置上的元素以链表形式存在的数据个数>8 且当前数组的长度>64时，
     *  此时次索引位置上的所有数据改为使用红黑树存储
     *
     *  DEFAULT_LOAD_FACTOR = 0.75f 默认加载因子
     *  TREEIFY_THRESHOLD = 8 Bucket中链表长度大于该默认值，转换为红黑树
     *  threshold 扩容的临界值，容量*加载因子16*0.75=12
     *  MIN_TREEIFY_CAPACITY = 64 桶中的Node被树化最小的hash表容量
     *
     *
     *  LinkedHashMap底层实现原理
     *  static class Entry<K,V> extends HashMap.Node<K,V> {
     *         Entry<K,V> before, after;
     *         Entry(int hash, K key, V value, Node<K,V> next) {
     *             super(hash, key, value, next);
     *         }
     *     }
     *
     *
     *  Map中的常用方法
     *  增删改
     *      put()
     *      putAll()
     *      remove()
     *      clear()
     *  查
     *      get()
     *      containsKey()
     *      containsValue()
     *      size()
     *      isEmpty()
     *      equals()
     *  遍历
     *      entrySet()
     *      keySet()
     *      values()
     *
     */
    @Test
    public void test1(){
        Map map=new HashMap ( 16 );
//        java.lang.NullPointerException
//        Hashtable<Object, Object> map = new Hashtable<> ();
        map.put ( null,123 );
        map.put ( null,null );
        map.put ( "aaa","bbbb" );
        map.put ( 123,456 );
        System.out.println (map);
        Set entrySet = map.entrySet ();
        for (Object o : entrySet) {
            System.out.println ("Entry:"+o);
        }
        System.out.println ("----");
        Set keySet = map.keySet ();
        for (Object o : keySet) {
            System.out.println ("key:"+o);
        }
        System.out.println ("----");
        Collection values = map.values ();
        for (Object value : values) {
            System.out.println ("value:"+value);
        }
        System.out.println ("----");

    }


    /**
     * TreeMap中添加key-value，要求key必须是同一个类创建的对象
     * 因为要按照key进行排序；自然排序，定制排序
     *
     * 类似于TreeSet，故略
     *
     * Properties
     */
    @Test
    public void test2() throws IOException {
        Properties properties=new Properties (  );
        FileInputStream fis = new FileInputStream ( "E:\\idea_workspace\\2020Study-JavaSE\\04.Collection\\resources\\jdbc.properties" );

        properties.load ( fis );
        String jdbcName = properties.getProperty ( "jdbc.name" );
        String jdbcUsername = properties.getProperty ( "jdbc.username" );
        String jdbcPassword = properties.getProperty ( "jdbc.password" );
        System.out.println (jdbcName+" "+jdbcUsername+" "+jdbcPassword);
        fis.close ();
    }
}
