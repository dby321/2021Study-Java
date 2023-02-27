package com.io.demo2;

import org.junit.Test;

import java.io.*;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.io.demo2
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-27 20:45
 * @Description:
 */
public class OtherIOTest {
    /**
     * 标准的输入输出流
     * 1. System.in标准的输入流
     *    System.out标准的输出流
     * 2. System.setIn/System.setOut重新制定输入和输出的流
     * 3. 练习
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader ( System.in );
        BufferedReader br=new BufferedReader ( isr );
        while(true){
            String data=br.readLine ();
            if(data.equalsIgnoreCase ( "e" )||data.equalsIgnoreCase ( "exit" )){
                System.out.println ("程序结束");
                break;
            }
            String upperCase=data.toUpperCase ();
            System.out.println (upperCase);
        }
        br.close ();
    }

    /**
     * 打印流PrintStream PrintWriter
     * 提供了一系列重载的print()和println()
     */
    @Test
    public void test1(){

    }

    /**
     * 数据流(特殊流) DataInputStream DataOutputStream
     * 读取不同类型数据的顺序要和保存时的顺序一致
     * 真尼玛不好用！！
     * flush()会把内存中的内容写入到文件中
     */
    @Test
    public void test2(){

    }

    /**
     * 对象流 ObjectInputStream ObjectOutputStream
     * 用于存储和读取基本数据类型或对象的处理流
     *
     * 序列化的对象需要：
     * 1、 实现Serializable接口，
     * 2、并显示的提供全局变量serialVersionUID
     * 3、并且要保证对象中的成员变量都是可序列化的（基本数据类型和String本来就是可序列化的）
     *
     * static和transient修饰的成员变量是不会序列化的
     */
    @Test
    public void test3(){

    }



}
