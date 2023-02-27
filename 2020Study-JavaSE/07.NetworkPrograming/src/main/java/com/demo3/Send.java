package com.demo3;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo3
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-28 17:19
 * @Description:
 */
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * 1.从控制台接收消息
 * 2.把消息发给服务器端
 * 3.释放资源
 * @author Administrator
 *
 */
public class Send implements Runnable{
    private DataOutputStream os;
    private Socket client;
    private boolean flg;

    public Send(Socket client) {
        super();
        this.client = client;
        try {
            this.os = new DataOutputStream(client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.flg = true;
    }

    @Override
    public void run() {
        while(flg) {
            //从控制台获取消息,发送数据到服务器端
            sendData(input());
        }
        release();
    }

    //从控制台获取消息
    private String input() {
        Scanner ss = new Scanner(System.in);
        String str = ss.nextLine();
        return str;
    }

    //发送数据到服务器端
    private void sendData(String str) {
        try {
            os.writeUTF(str);
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //释放资源
    private void release() {
        this.flg = false;
        ChatUtils.close(os,client);
    }

}

