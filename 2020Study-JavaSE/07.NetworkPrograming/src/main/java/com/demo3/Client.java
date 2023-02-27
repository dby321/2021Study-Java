package com.demo3;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo3
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-28 17:18
 * @Description:
 */
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 对客户端再进行二次封装
 * Send类实现发数据
 * Receive类拿到数据
 * @author Administrator
 *
 */
public class Client {
    private Socket client;//客户端
    private String ip;//服务器ip地址
    private int serverPort;//服务器端口

    public Client(String ip, int serverPort) {
        this.ip = ip;
        this.serverPort = serverPort;
        try {
            this.client = new Socket(ip,serverPort);//创建一个客户端
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //和服务器通信
    public void run() {
        System.out.println("--------------ChatClient-------------");

        new Thread(new Send(client)).start();
        new Thread(new Receive(client)).start();

    }

}
