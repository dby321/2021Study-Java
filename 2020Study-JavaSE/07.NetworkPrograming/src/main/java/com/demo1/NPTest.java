package com.demo1;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-28 11:15
 * @Description:
 */
public class NPTest {
    /**
     * InetAddress
     * 静态方法
     * getByName()
     * getLocalHost()
     * <p>
     * 普通方法
     * getHostAddress()
     * getHostName()
     * <p>
     * <p>
     * API测试
     *
     * @throws UnknownHostException
     */
    @Test
    public void test1() throws UnknownHostException {
        InetAddress inet1 = InetAddress.getByName ( "192.168.137.1" );
        System.out.println ( inet1 );
        System.out.println ( "----" );
        InetAddress inet2 = InetAddress.getByName ( "www.baidu.com" );
        System.out.println ( inet2 );
        System.out.println ( "----" );
        InetAddress inet3 = InetAddress.getByName ( "localhost" );
        System.out.println ( inet3 );
        System.out.println ( "----" );
        InetAddress localHost = InetAddress.getLocalHost ();
        System.out.println ( localHost );
        System.out.println ( localHost.getHostAddress () );
        System.out.println ( localHost.getHostName () );
    }

    /**
     * IP+端口号-->Socket
     * <p>
     * TCP客户端
     */
    @Test
    public void test2() {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            System.out.println ( "我是TCP客户端" );
            InetAddress inet = InetAddress.getByName ( "127.0.0.1" );
            socket = new Socket ( inet, 8889 );
            outputStream = socket.getOutputStream ();
            outputStream.write ( "你好，我是客户端MM".getBytes () );
            System.out.println ( socket );


        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            if (outputStream != null) {

                try {
                    outputStream.close ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
            if (socket != null) {

                try {
                    socket.close ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
        }

    }

    /**
     * TCP服务端
     *
     * @throws IOException
     */
    @Test
    public void test3() throws IOException {
        System.out.println ( "我是TCP服务端" );
        ServerSocket serverSocket = new ServerSocket ( 8889 );
        Socket socket = serverSocket.accept ();
        InputStream inputStream = socket.getInputStream ();
//        不建议这样写，因为中文在写入byte再写入String可能会出事
//        byte[] buffer=new byte[20];
//        int len;
//        while((len=inputStream.read (buffer))!=-1){
//            String str=new String ( buffer,0,len );
//            System.out.print (str);
//        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        byte[] buffer = new byte[5];
        int len;
        while ((len = inputStream.read ( buffer )) != -1) {
            baos.write ( buffer, 0, len );
        }
        System.out.println ( baos.toString () );
        System.out.println ( socket.toString () );
        baos.close ();
        inputStream.close ();
        socket.close ();
        serverSocket.close ();
    }

    /**
     * UDP发送端/客户端
     *
     * @throws IOException
     */
    @Test
    public void test4() throws IOException {
        System.out.println ( "我是UDP发送端" );
        DatagramSocket ds = new DatagramSocket ();
        String str = "我是UDP方式发送的导弹";
        byte[] data = str.getBytes ();
        DatagramPacket packet = new DatagramPacket ( data, 0, data.length, InetAddress.getLocalHost (), 8888 );
        ds.send ( packet );
        ds.close ();
    }

    /**
     * UDP接收端/服务端
     *
     * @throws IOException
     */
    @Test
    public void test5() throws IOException {
        System.out.println ( "我是UDP接收端" );
        DatagramSocket ds = new DatagramSocket ( 8888 );
        byte[] buffer = new byte[100];
        DatagramPacket packet = new DatagramPacket ( buffer, 0, buffer.length );
        ds.receive ( packet );
        System.out.println ( new String ( packet.getData (), 0, packet.getLength () ) );
    }

    @Test
    public void test6() throws MalformedURLException {
        URL url = new URL ( "https://www.bilibili.com/video/BV1Kb411W75N?p=629" );
        System.out.println ( url.getProtocol () );
        System.out.println ( url.getHost () );
        System.out.println ( url.getPort () );
        System.out.println ( url.getPath () );
    }



}
