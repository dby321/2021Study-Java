package com.demo3;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo3
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-28 17:19
 * @Description:
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * 1.收到服务器的响应
 * 2.释放资源
 * @author Administrator
 *
 */
public class Receive implements Runnable{
    private DataInputStream is;
    private Socket client;
    private boolean flg;

    public Receive(Socket client) {
        super();
        this.client = client;
        try {
            this.is = new DataInputStream(client.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.flg = true;
    }

    @Override
    public void run() {
        while(flg) {
            receiveData();
        }
        release();
    }

    private void receiveData(){
        try {
            String str = is.readUTF();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void release() {
        this.flg = false;
        ChatUtils.close(is,client);
    }

}

