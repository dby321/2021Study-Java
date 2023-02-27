package com.demo1;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-28 18:02
 * @Description:
 */
public class ReflectionTest {

    /**
     * 用反射之前
     */
    @Test
    public void test1() {
        Person p1 = new Person ( "Tom", 12 );
        p1.age = 10;
        System.out.println ( p1 );


    }

    /**
     * 用反射之后
     */
    @Test
    public void test2() throws Exception {
        // 通过反射，创建Person类的对象
        Class clazz = Person.class;
        Constructor constructor = clazz.getConstructor ( String.class, Integer.class );
        Person person = (Person) constructor.newInstance ( "Tom", 12 );
        System.out.println ( person.toString () );
        // 通过反射，调用公有属性和方法
        Field age = clazz.getDeclaredField ( "age" );
        age.set ( person, 10 );
        System.out.println ( person.toString () );
        Method show = clazz.getDeclaredMethod ( "show" );
        show.invoke ( person );
        // 通过反射，调用私有构造器
        Constructor constructor1 = clazz.getDeclaredConstructor ( String.class );
        constructor1.setAccessible ( true );
        Person person1 = (Person) constructor1.newInstance ( "jerry" );
        System.out.println ( person1 );
        // 通过反射，调用私有属性
        Field name = clazz.getDeclaredField ( "name" );
        name.setAccessible ( true );
        name.set ( person1, "韩梅梅" );
        System.out.println ( person1 );
        // 通过反射，调用私有方法
        Method showNation = clazz.getDeclaredMethod ( "showNation", String.class );
        showNation.setAccessible ( true );
        showNation.invoke ( person1, "中国" );
    }


    /**
     * 封装 是建议你怎么调用
     * 反射 是留个后门来调用
     * <p>
     * 获取Class实例的方式
     */
    @Test
    public void test3() throws ClassNotFoundException {
        // 方式1
        Class<Person> personClass1 = Person.class;
        System.out.println ( personClass1 );

        // 方式2
        Person person = new Person ();
        Class<? extends Person> personClass2 = person.getClass ();
        System.out.println ( personClass2 );

        // 方式3
        Class<Person> personClass3 = (Class<Person>) Class.forName ( "com.demo1.Person" );
        System.out.println ( personClass3 );

        // 加载到内容中的运行时类，会缓存一段时间。在此时间之内，我们可以通过不同的方式来获取此运行时类
        System.out.println ( personClass1 == personClass2 );
        System.out.println ( personClass1 == personClass3 );

        // 方式4
        ClassLoader classLoader = ReflectionTest.class.getClassLoader ();
        Class<Person> personClass4 = (Class<Person>) classLoader.loadClass ( "com.demo1.Person" );
        System.out.println ( personClass4 );


    }

    /**
     * 哪些类型可以有Class对象
     * 1. class：外部类，成员（成员内部类，静态内部类），局部内部类，匿名内部类
     * 2. interface：接口
     * 3. []：数组
     * 4. enum：枚举
     * 5. annotation:注解@Interface
     * 6. primitive type:基本数据类型
     * 7. void
     * 8. Class本身
     */
    @Test
    public void test4() {
        //class：外部类，成员（成员内部类，静态内部类），局部内部类，匿名内部类
        Class<Object> objectClass = Object.class;
        //interface：接口
        Class<Comparable> comparableClass = Comparable.class;
        //[]：数组
        Class<String[]> aClass = String[].class;
        Class<int[][]> aClass1 = int[][].class;
        //enum：枚举
        Class<ElementType> elementTypeClass = ElementType.class;
        //annotation:注解@Interface
        Class<Override> overrideClass = Override.class;
        //primitive type:基本数据类型
        Class<Integer> integerClass = int.class;
        //void
        Class<Void> voidClass = void.class;
        // 我自己都是Class
        Class<Class> classClass = Class.class;

        // 同一维的数组是一个Class
        int[] a = new int[20];
        int[] b = new int[100];
        System.out.println ( a.getClass () == b.getClass () );
    }

    @Test
    public void test5() throws IOException {
        Long begin = System.currentTimeMillis ();
        System.out.println ( begin );
        Properties properties = new Properties ();
        FileInputStream fis = new FileInputStream ( "jdbc.properties" );
        InputStreamReader isr = new InputStreamReader ( fis );
        properties.load ( isr );
        String user = properties.getProperty ( "jdbc.username" );
        String password = properties.getProperty ( "jdbc.password" );
        System.out.println ( "user=" + user + ",password=" + password );
        Long end = System.currentTimeMillis ();
        System.out.println ( end );
        System.out.println ( "耗时：" + (end - begin) );// 1
    }

    @Test
    public void test6() throws IOException {
        Properties properties = new Properties ();
        ClassLoader classLoader = ReflectionTest.class.getClassLoader ();
        // getResourceAsStream("此处路径默认为编译后的根目录，并非源码目录，
        // IDEA可以放在res资源目录中编译后自动放在项目的根目录，这样就可以直接使用文件名访问了")；
        InputStream resourceAsStream = classLoader.getResourceAsStream ( "jdbc1.properties" );
        InputStreamReader isr = new InputStreamReader ( resourceAsStream );
        properties.load ( isr );

        String username = properties.getProperty ( "jdbc.username" );
        String password = properties.getProperty ( "jdbc.password" );
        System.out.println ( username + " " + password );
    }

    /**
     * 获取属性
     * getFields() 获取当前运行时类及其福诶中声明为public的属性
     * getDeclaredFields() 获取当前运行时类中声明的所有属性（不包含父类中的属性）
     * <p>
     * 属性的权限修饰符 数据类型 变量名 也可以通过Fields[] f获取到
     * <p>
     * 获取方法和获取构造器 类似 略
     * 获取方法后得到的Methods[] m还可以得到注解数组 m.getAnnotations()
     */
    @Test
    public void test7() {
        Class clazz = Person.class;
        // 获取运行时类的带泛型的父类
        Type genericSuperclass = clazz.getGenericSuperclass ();
        // 获取运行时类的父类
        Class superclass = clazz.getSuperclass ();
        // 获取运行时类的接口数组
        Class[] interfaces = clazz.getInterfaces ();
        // 获取运行时类的父类的接口数组
        Class[] interfaces1 = clazz.getSuperclass ().getInterfaces ();
        // 获取运行时类的所在包
        Package aPackage = clazz.getPackage ();
        // 获取运行时类的注解数组
        Annotation[] annotations = clazz.getAnnotations ();

    }

    /**
     * getField()只能获取public的属性
     * getDeclaredFiled() 获取属性（不限制访问修饰符）
     *
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSuchFieldException
     */
    @Test
    public void test8() {
        Class<Person> clazz = Person.class;
        Person p = null;
        try {
            p = clazz.newInstance ();
            System.out.println ( p );
            Field name = null;
            try {
                name = clazz.getField ( "name" );
                name.set ( p, "dongbinyu" );
                String name1 = (String) name.get ( p );
                System.out.println ( p );
            } catch (NoSuchFieldException e) {
                e.printStackTrace ();
            }
            try {
                Field age = clazz.getField ( "age" );
                age.set ( p, 123 );
                Integer age1 = (Integer) age.get ( p );
                System.out.println (p);
            } catch (NoSuchFieldException e) {
                e.printStackTrace ();
            }

        } catch (InstantiationException e) {
            e.printStackTrace ();
        } catch (IllegalAccessException e) {
            e.printStackTrace ();
        }
        System.out.println ("-----");
        // getDeclaredField()需要setAccessible(true)
        try {
            Field name = clazz.getDeclaredField ( "name" );
            Person p2 = clazz.newInstance ();
            name.setAccessible ( true );
            name.set ( p2,"dongbinyu" );
            System.out.println (p2);
        } catch (NoSuchFieldException e) {
            e.printStackTrace ();
        } catch (InstantiationException e) {
            e.printStackTrace ();
        } catch (IllegalAccessException e) {
            e.printStackTrace ();
        }
    }

    /**
     * getMethod()
     * getDeclaredMethod()
     */
    @Test
    public void test9(){
        try {
            Class<Person> pclass = Person.class;
            Person person = pclass.newInstance ();
            Method showNation = pclass.getDeclaredMethod ( "showNation", String.class );
            showNation.setAccessible ( true );
            Object invokeReturn = showNation.invoke ( person, "我们的大中国" );
            // 返回值
            System.out.println (invokeReturn);

            // 静态方法调用
            Method staticShow = pclass.getDeclaredMethod ( "staticShow" );
            staticShow.setAccessible ( true );
            Object invokeReturn2 = staticShow.invoke ( person );
            Object invokeReturn3 = staticShow.invoke ( Person.class );
            Object invokeReturn4 = staticShow.invoke ( null );
            System.out.println (invokeReturn2);
            System.out.println (invokeReturn3);
            System.out.println (invokeReturn4);
        } catch (NoSuchMethodException e) {
            e.printStackTrace ();
        } catch (IllegalAccessException e) {
            e.printStackTrace ();
        } catch (InvocationTargetException e) {
            e.printStackTrace ();
        } catch (InstantiationException e) {
            e.printStackTrace ();
        }
    }

    @Test
    public void test10(){
        try {
            Class<Person> personClass = Person.class;
            Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor ( String.class );
            declaredConstructor.setAccessible ( true );
            Person aaabbbccc = declaredConstructor.newInstance ( "aaabbbccc" );
            System.out.println (aaabbbccc);
        } catch (NoSuchMethodException e) {
            e.printStackTrace ();
        } catch (InstantiationException e) {
            e.printStackTrace ();
        } catch (IllegalAccessException e) {
            e.printStackTrace ();
        } catch (InvocationTargetException e) {
            e.printStackTrace ();
        }
    }
    @Test
    public void test11(){
        List<Double> list=new ArrayList<> ();
        list.add(1.0);
        list.add(2.0);
        Double aDouble = list.get ( 0 );
        Class<? extends Double> aClass = aDouble.getClass ();
        System.out.println (aClass);
        System.out.println (aClass.getName ());


    }

}
