package com.demo3;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo3
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-28 17:18
 * @Description:
 */
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 服务器端：利用多线程和多个客户端能收发多条消息
 * 再进行封装
 * 实现群聊功能
 * @author Administrator
 *
 */
public class Server {
    private ConcurrentHashMap<String, Work> holder;//用来存储客户端
    private ServerSocket server;//服务器端
    private int serverPort;//服务器的端口号


    //启动一个服务端
    public Server(int serverPort) {
        super ();
        this.serverPort = serverPort;
        this.holder = new ConcurrentHashMap<> ();//创建容器
        try {
            this.server = new ServerSocket ( serverPort );//创建一个服务器端
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

    //服务端响应，工作。
    public void run() {
        System.out.println ( "----------ChatServer----------" );
        //响应多个客户端
        while (true) {
            new Thread ( new Work ( server, holder ) ).start ();
        }
    }
}
