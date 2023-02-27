package com.demo2;

/**
 * @BelongsProject: 07.NetworkPrograming
 * @BelongsPackage: com.demo2
 * @Author: Dong Binyu
 * @CreateTime: 2020-12-26 13:21
 * @Description:
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;

/**
 * @author kucs
 *
 */
public class ChatServer {
    public static void main(String[] args) {
        ServerSocket server = null;
        try {
            // TODO 启动服务端
            server = new ServerSocket(12345);
            System.out.println("服务端启动："+
                    server.getInetAddress().getHostAddress()+":"+
                    server.getLocalPort());

            //客户端列表
            Hashtable<String, ServerThread> clientList = new Hashtable<String, ServerThread>();

            //监听客户端
            while(true){
                Socket socket = server.accept();
                //启动服务端处理线程
                new ServerThread(socket,clientList).start();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try {
                server.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
