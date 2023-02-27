package com.demo2;

/**
 * @BelongsProject: 07.NetworkPrograming
 * @BelongsPackage: com.demo2
 * @Author: Dong Binyu
 * @CreateTime: 2020-12-26 13:22
 * @Description:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Hashtable;

public class ServerThread extends Thread {

    Socket socket;                                //Socket对象
    BufferedReader is;                            //输入流
    PrintWriter os;                                //输出流
    Hashtable<String, ServerThread> clientList;    //客户端列表
    String userName;                            //用户名
    public ServerThread(Socket socket, Hashtable<String, ServerThread> clientList) {
        this.socket = socket;
        this.clientList = clientList;

        try {
            //输入输出流
            is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            os = new PrintWriter(socket.getOutputStream());

            //读取用户名
            this.userName = is.readLine();
            clientList.put(userName, this);

            //显示连接信息
            System.out.println(userName+"连接："
                    + socket.getInetAddress().getHostAddress()+":"
                    + socket.getLocalPort());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        // TODO 循环处理客户端输入
        try {
            String line;
            while((line = is.readLine()) != null){
                //用户输入信息
                System.out.println(userName + "发给"+line);
                if(line.equals("bye")){
                    break;
                }else{
                    //转发消息给客户端
                    String[] arr = line.split(":");
                    if(arr.length == 2){
                        if(clientList.containsKey(arr[0])){
                            clientList.get(arr[0]).send(userName+":"+arr[1]);
                        }
                    }
                }
            }
            is.close();
            os.close();

            //关闭客户端
            socket.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    private void send(String msg) {
        // TODO 发送消息
        System.out.println("发给" + userName +" "+msg);
        os.println(msg);
        os.flush();
    }

}
