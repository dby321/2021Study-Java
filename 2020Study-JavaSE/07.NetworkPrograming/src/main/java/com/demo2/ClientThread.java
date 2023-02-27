package com.demo2;

/**
 * @BelongsProject: 07.NetworkPrograming
 * @BelongsPackage: com.demo2
 * @Author: Dong Binyu
 * @CreateTime: 2020-12-26 13:20
 * @Description:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author binyu
 *
 * 受主线程委托，来创建与服务端的连接
 * 监听服务端的消息
 * 负责发送消息给服务端
 */
public class ClientThread extends Thread {
    Socket socket;        //socket对象
    BufferedReader is;    //输入流
    PrintWriter os;        //输出流

    //启动客户端
    public ClientThread(String userName) {
        //连接服务器
        try {
            socket = new Socket("127.0.0.1",12345);

            //输入输出流
            is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            os = new PrintWriter(socket.getOutputStream());

            //发送用户名
            os.println(userName);
            os.flush();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            // TODO 循环读取服务端转发的消息
            String readLine;
            while((readLine = is.readLine()) != null){
                System.out.println(readLine);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            // TODO 关闭客户端
            is.close();
            os.close();

            socket.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void send(String readLine) {
        // TODO 发送消息
        os.print(readLine);
        os.flush();
    }

}
