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

/**
 * @author binyu
 * 客户端主程序
 * 负责调用子线程创建客户端
 * 监听键盘输入
 * 根据系统启动参数取得用户名
 * 调用子线程创建该用户的客户端线程并启动
 */
public class ChatClient {

    public static void main(String[] args) {

        try {
            ClientThread client = new ClientThread(args[0]);
            client.start();

            //输入\输出流
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
            //循环读取键盘输入
            String readLine;
            while((readLine = sin.readLine()) != null){
                if(readLine.equals("bye")){
                    client.close();
                    System.exit(0);
                }
                client.send(readLine);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
