package com.io.demo1;

import org.junit.Test;

import java.io.*;


/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.io.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-26 17:23
 * @Description:
 */
public class IOTest {

    /**
     * 一、流的分类
     * 1. 操作数据单位：字节流，字符流
     * 2. 数据的流向：输入流，输出流
     * 3. 流的角色：节点流，处理流
     * <p>
     * <p>
     * 二、流的体系结构
     * 抽象基类                 节点流           缓冲流
     * InputStream 字节输入流    FileXxx         BufferedXxx
     * OutputStream 字节输出流   FileXxx         BufferedXxx
     * Reader 字符输入流         FileXxx         BufferedXxx
     * Writer 字符输出流         FileXxx         BufferedXxx
     */
    @Test
    public void test1() {
        Reader reader = null;
        try {
            // 相较于当前module
            // 如果是main方法， 相较于当前项目
            File file1 = new File ( "hello.txt" );
            reader = new FileReader ( file1 );
            // 返回读入的一个字符，如果达到文件末尾，返回-1
            // 方式一
//        int data = reader.read ();
//        while(data!=-1){
//            System.out.println ((char)data);
//            data=reader.read ();
//        }
            int data;
            while ((data = reader.read ()) != -1) {
                System.out.println ( (char) data );
            }
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                if (reader != null) {
                    reader.close ();
                }
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }


    }

    @Test
    public void test2() {
        Reader reader = null;
        try {
            reader = new FileReader ( "hello.txt" );
            char[] cbuf = new char[5];
            int len;
            while ((len = reader.read ( cbuf )) != -1) {
                System.out.println ( len );
                for (int i = 0; i < len; i++) {
                    System.out.print ( cbuf[i] );
                }
                System.out.println ();
            }
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            if (reader != null) {
                try {
                    reader.close ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
        }
    }

    /**
     * 1. 输出操作时，如果文件不存在会自动创建
     * 2. 输出操作时，如果文件存在，就看append的值（默认是false）
     * 1. append为true，可以追加写入
     * 2. append为false，覆盖该文件
     */
    @Test
    public void test3() {
        FileWriter fileWriter = null;
        try {
            File file = new File ( "hello1.txt" );
            fileWriter = new FileWriter ( file, true );
            fileWriter.write ( "I have a.txt dream!\n" );
            fileWriter.write ( "you should have a.txt dream!" );
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
        }
    }


    /**
     * 读进来，并写出去
     * 不能用字符流处理图片
     */
    @Test
    @SuppressWarnings("all")
    public void test4() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            File file1 = new File ( "hello.txt" );
            File file2 = new File ( "hello1.txt" );

            fileReader = new FileReader ( file1 );
            fileWriter = new FileWriter ( file2 );
            // 字符数组
            char[] cbuf = new char[5];
            int len;
            while ((len = fileReader.read ( cbuf )) != -1) {
                fileWriter.write ( cbuf, 0, len );
            }
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {

            try {
                if (fileWriter != null) {

                    fileWriter.close ();
                }
            } catch (IOException e) {
                e.printStackTrace ();
            }
            try {
                if (fileReader != null) {

                    fileReader.close ();
                }
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
    }

    @Test
    @SuppressWarnings("all")
    public void test5() {
        Long begin = System.currentTimeMillis ();
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            File file1 = new File ( "alanwake1.jpg" );
            File file2 = new File ( "alanwake2.jpg" );

            fileInputStream = new FileInputStream ( file1 );
            fileOutputStream = new FileOutputStream ( file2 );
            // 字节数组
            byte[] cbuf = new byte[5];
            int len;
            while ((len = fileInputStream.read ( cbuf )) != -1) {
                fileOutputStream.write ( cbuf, 0, len );
            }
            Long end = System.currentTimeMillis ();
            System.out.println ( "耗时：" + (end - begin) );// 14292
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {

            try {
                if (fileOutputStream != null) {

                    fileOutputStream.close ();
                }
            } catch (IOException e) {
                e.printStackTrace ();
            }
            try {
                if (fileInputStream != null) {

                    fileInputStream.close ();
                }
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
    }


    /**
     * 结论：
     * 1. 对于文本文件(.txt,.java,.c,.cpp)使用字符流处理
     * 2. 对于非文本文件(.jpg,.mp3,.avi,.doc,.ppt)使用字节流处理
     *
     * 处理流之一：缓冲流 是为了提高效率的 感觉快了100倍左右
     */
    @Test
    @SuppressWarnings("all")
    public void test6() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            Long begin = System.currentTimeMillis ();
            FileInputStream fileInputStream = null;
            FileOutputStream fileOutputStream = null;

            File file1 = new File ( "alanwake1.jpg" );
            File file2 = new File ( "alanwake2.jpg" );

            fileInputStream = new FileInputStream ( file1 );
            fileOutputStream = new FileOutputStream ( file2 );
            bis = new BufferedInputStream ( fileInputStream );
            bos = new BufferedOutputStream ( fileOutputStream );
            // 字节数组
            byte[] cbuf = new byte[5];
            int len;
            while ((len = bis.read ( cbuf )) != -1) {
                bos.write ( cbuf, 0, len );
            }
            Long end = System.currentTimeMillis ();
            System.out.println ( "耗时：" + (end - begin) );// 47
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            // 流的关闭顺序是先开的后关，后开的先关。和穿衣服一样
           if(bos!=null){
               try {
                   bos.close ();
               } catch (IOException e) {
                   e.printStackTrace ();
               }
           }
           if (bis!=null){
               try {
                   bis.close ();
               } catch (IOException e) {
                   e.printStackTrace ();
               }
           }
            // 外层流关闭后，内层流自动关闭了
//        fileInputStream.close ();
//        fileOutputStream.close ();
        }
    }

    /**
     * 处理流之二：转换流
     * 1. 转换流 属于字符流
     * InputStreamReader 将一个字节输入流转换为一个字符输入流
     * OutputStreamWriter 将一个字节输出流转换为一个字符输出流
     */
    @Test
    public void test7() throws IOException {
        FileInputStream fis=new FileInputStream ( "dbcp.txt" );
        // 具体使用哪个字符集，取决于文件dbcp.txt保存时的字符集
        InputStreamReader isr=new InputStreamReader ( fis,"UTF-8" );
        char[] cbuf=new char[20];
        int len;
        while((len=isr.read (cbuf))!=-1){
            String str=new String ( cbuf,0,len );
            System.out.print (str);
        }
        isr.close ();
    }

    /**
     * 解码的正是String，查看new String()的源码，String构造方法有解码功能，并且默认编码是utf-8，代码如下：
     * this.value = StringCoding.decode(bytes, offset, length);
     * 尽管字节流也能有办法决绝乱码问题，但是还是比较麻烦，于是java就有了字符流
     * @throws IOException IO异常
     */
    @Test
    public  void test8() throws IOException {

        FileInputStream inputStream = new FileInputStream("dbcp.txt");
        byte[] bytes = new byte[1024];
        int len;
        while ((len=inputStream.read(bytes))!=-1){
            System.out.print(new String(bytes,0,len));
        }

    }

    /**
     * 关闭资源时,与FileOutputStream不同。 如果不关闭,数据只是保存到缓冲区，并未保存到文件
     * flush()这个函数是清空的意思，用于清空缓冲区的数据流，进行流的操作时，数据先被读到内存中，然后再用数据写到文件中，那么当你数据读完时，我们如果这时调用close()方法关闭读写流，这时就可能造成数据丢失，
     * 为什么呢？因为，读入数据完成时不代表写入数据完成，一部分数据可能会留在缓存区中，这个时候flush()方法就格外重要了。
     * @throws IOException IO异常
     */
    @Test
    public  void test9() throws IOException {
        //源   也就是输入流【读取流】 读取a.txt文件
        FileReader fr=new FileReader("a.txt");  //必须要存在a.txt文件，否则报FileNotFoundException异常
        //目的地  也就是输出流
        FileWriter fw=new FileWriter("b.txt");  //系统会自动创建b.txt，因为它是输出流！
        int len;
        while((len=fr.read())!=-1){
            fw.write(len);
        }
        // 如果没有下边的关闭资源，b.txt没有任何内容
        // fr.close ();
        // fw.flush();
        // fw.close ();

    }



}
