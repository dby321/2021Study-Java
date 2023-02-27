package com.file.demo1;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.file.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-26 16:50
 * @Description:
 */
public class FileTest {
    /**
     * 1. 如何创建File类的实例
     * 2. 相对路径和绝对路径
     */
    @Test
    public void test1(){

        File file1=new File ( "hello.txt" );// 相对于当前module
        File file2=new File ("E:\\idea_workspace\\2021Study-Java\\2020Study-JavaSE\\06.IO");// 绝对路径
        System.out.println (file1);
        System.out.println (file2);

        File file3=new File (  "E:\\idea_workspace\\2021Study-Java\\2020Study-JavaSE","06.IO");
        System.out.println (file3);
        File file4=new File(file3,"h1.txt");
        System.out.println (file4);
    }

    @SuppressWarnings("Duplicates")
    @Test
    public void test2(){
        File file1=new File ( "hello.txt" );
        File file2=new File ( "E:\\idea_workspace\\2021Study-Java\\2020Study-JavaSE\\06.IO\\he.txt" );
        System.out.println ( file1.getAbsolutePath ());
        System.out.println ( file1.getPath ());
        System.out.println ( file1.getName ());
        System.out.println ( file1.getParent ());
        System.out.println ( file1.length ());
        System.out.println ( new Date ( file1.lastModified () ) );
        System.out.println ("----");
        System.out.println ( file2.getAbsolutePath ());
        System.out.println ( file2.getPath ());
        System.out.println ( file2.getName ());
        System.out.println ( file2.getParent ());
        System.out.println ( file2.length ());
        System.out.println ( new Date ( file2.lastModified () ));
    }

    @Test
    public void test3(){
        File file1=new File ( "E:\\idea_workspace\\2021Study-Java\\2020Study-JavaSE\\06.IO" );
        String[] list = file1.list ();
        for (String s : list) {
            System.out.println (s);
        }
        System.out.println ("----");
        File[] files = file1.listFiles ();
        for (File file : files) {
            System.out.println (file);
        }

    }

    /**
     * public boolean renameTo(File dest): 把文件重命名为指定的文件路径（剪切+重命名）
     * 比如file1.renameTo(file2)为例，要保证返回true，file1必须存在且file2必须不存在
     */
    @Test
    public void test4(){
        File file1=new File ( "he.txt" );
        File file2=new File ( "E:\\idea_workspace\\2021Study-Java\\2020Study-JavaSE\\06.IO\\hello.txt" );
        file1.renameTo ( file2 );
    }

    /**
     * File类的判断功能
     *
     * isDirectory()
     * isFile()
     * isHidden()
     * canWrite()
     * canRead()
     * exists()
     */
    @Test
    public void test5(){
        File file1=new File("hello.txt");
        System.out.println ( file1.isDirectory () );
        System.out.println ( file1.isFile () );
        System.out.println ( file1.isHidden () );
        System.out.println ( file1.canWrite () );
        System.out.println ( file1.canRead () );
        System.out.println ( file1.exists () );
    }

    /**
     * File类的创建和删除功能
     *
     * createNewFile():创建文件
     * delete():删除文件或文件夹，如果删除文件夹需要保证文件夹没有文件或文件夹，否则需采用递归删除才能成功
     * mkdir():创建文件目录
     * mkdirs():创建多级文件目录
     */
    @Test
    public void test6(){
        File file=new File("hello1.txt");
        file.delete ();
        try {
            file.createNewFile ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
        File file1=new File("aa//bb//cc");
        file1.mkdirs ();
    }

    /**
     * 回车符\r和换行符\n ：
     * 回车符：回到一行的开头（return）。
     * 换行符：下一行（newline）。
     * 系统中的换行：
     * Windows系统里，每行结尾是 回车+换行 ，即\r\n；
     * Unix系统里，每行结尾只有 换行 ，即\n；
     * Mac系统里，每行结尾是 回车 ，即\r。从 Mac OS X开始与Linux统一。
     * @throws IOException IO异常
     */
    @Test
    public void test7() throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");
        // 定义字节数组
        byte[] words = {97,98,99,100,101};
        // 遍历数组
        for (int i = 0; i < words.length; i++) {
            // 写出一个字节
            fos.write(words[i]);
            // 写出一个换行, 换行符号转成数组写出
            fos.write("\r\n".getBytes());
        }
        // 关闭资源
        fos.close();
    }

    public static void Recursion(File file){
        //1、判断传入的是否是目录
        if(!file.isDirectory()){
            //不是目录直接退出
            return;
        }
        //已经确保了传入的file是目录
        File[] files = file.listFiles();
        //遍历files
        for (File f: files) {
            //如果该目录下文件还是个文件夹就再进行递归遍历其子目录
            if(f.isDirectory()){
                //递归
                Recursion(f);
            }else {
                //如果该目录下文件是个文件，则打印对应的名字
                System.out.println(f.getName());
            }

        }
    }
}
