package com.io.demo3;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.io.demo3
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-27 21:35
 * @Description:
 */
public class RandomAccessFileTest {
    /**
     *
     * 1. RandomAccessFile直接继承与java.lang.Object类，实现了DataInput和DataOutput接口
     * 2. RandomAccessFile既能作为输入流，也能作为输出流
     *
     * 3. 如果RandomAccessFile作为输出流时:
     *      如果写出到的文件不存在，贼在执行过程中自动创建
     *      如果写出到的文件存在，则会覆盖一部分（既不是追加也不是覆盖文件）
     */
    @Test
    @SuppressWarnings ( "all" )
    public void test1() {
        RandomAccessFile raf1= null;
        RandomAccessFile raf2= null;
        try {
            raf1 = new RandomAccessFile ( "alanwake1.jpg","r" );
            raf2 = new RandomAccessFile ( "alanwake3.jpg","rw" );
            byte[] buffer=new byte[1024];
            int len;
            while((len=raf1.read (buffer))!=-1){
                raf2.write ( buffer,0,len );
            }
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            if(raf1!=null){
                try {
                    raf1.close ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
            if(raf2!=null){
                try {
                    raf2.close ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
        }
    }

    @Test
    @SuppressWarnings ( "all" )
    public void test2() throws IOException {
        RandomAccessFile raf=new RandomAccessFile ( "hello.txt","rw" );
        raf.seek ( 3 );// 指定覆盖开始的位置
        raf.write ( "xyz".getBytes () );// 覆盖操作
        raf.close ();
    }

    /**
     * 使用RandomAccessFile实现数据的插入效果
     * 其他的流只能追加或者文件覆盖，而RandomAccessFile可以指定位置插入（通过seek()）
     */
    @Test
    public void test3() throws IOException {
        RandomAccessFile raf=new RandomAccessFile ( "hello.txt","rw" );
        raf.seek ( 3 );
        StringBuilder builder=new StringBuilder ( (int) new File ("hello.txt").length () );
        byte[] buffer=new byte[20];
        int len;
        while((len=raf.read ( buffer ))!=-1){
            builder.append ( new String(buffer,0,len) );
        }
        raf.seek ( 3 );
        raf.write ( "xyz".getBytes () );
        raf.write ( builder.toString ().getBytes () );

        raf.close ();
    }

}
