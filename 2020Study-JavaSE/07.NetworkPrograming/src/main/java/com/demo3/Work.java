package com.demo3;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo3
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-28 17:18
 * @Description:
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;

/**
 * //将服务器响应一个客户端的功能进行封装
 *
 * @author Administrator
 *
 */
public class Work implements Runnable {
    private Socket client;//拿到客户端套接字
    private ServerSocket server;//服务器端
    private DataInputStream is;//IO流通道
    private DataOutputStream os;//IO流通道
    private boolean flg;//控制多次收发
    private ConcurrentHashMap<String, Work> holder;//用来存储客户端
    private boolean sign;//true是客户端消息，false是服务器消息

    //初始化，1.等待连接。2.并且将输入输出流通道搭建好
    public Work(ServerSocket server, ConcurrentHashMap<String, Work> holder) {
        super ();
        try {
            this.client = server.accept ();
            //将输入输出流通道搭建好
            this.is = new DataInputStream ( client.getInputStream () );
            this.os = new DataOutputStream ( client.getOutputStream () );
        } catch (IOException e) {
            e.printStackTrace ();
        }


        this.holder = holder;
        this.flg = true;
        this.sign = true;
    }

    //执行的线程体
    @Override
    public void run() {
        System.out.println ( "一个客户端已建立连接。" );
        String name = judge ();//得到此客户端名字
        judgeFirst ( name );
        //当关闭此客户端，程序跳出judgeFirst()中while循环，服务器给其他客户端发送离开消息
        responseOther ( name + ":离开聊天室！" );
        release ();//释放相关资源
    }

    //判断客户端和其他客户端是不是重名,不重名则返回,并加入容器, 重名则重新接收。
    private String judge() {
        response ( "欢迎到来！" );
        response ( "起一个好听的昵称吧！" );
        while (true) {
            String name = receive ();
            if (!holder.containsKey ( name )) {
                holder.put ( name, this );//加入此客户端存起来
                return name;
            } else {
                String unname = "姓名重名了！请重新起一个！";
                response ( unname );
            }
        }
    }

    //判断客户端是不是第一次发送消息,是则发送欢迎，不是则进行聊天功能（私聊OR群聊）。
    private void judgeFirst(String name) {
        while (flg) {
            if (sign) {//第一次给其他客户端转发此消息
                responseOther ( "欢迎" + name + "加入群聊！" );
                sign = false;
            } else {
                String str = this.receive ();
                if (str.equals ( "" ))//关闭客户端,receive()收到"",则退出聊天室
                {
                    break;
                } else {
                    survey ( name, str );
                }
            }
        }
    }

    //群聊
    private void groupChat(String name, String message) {
        String datas = name + ":" + message;
        responseOther ( datas );
    }

    //私聊，系统默认识别：“@xxx:”为私聊，之后的话为私发内容
    private void privateChat(String name, String str) {
        //对数据进行分离
        int index = 0;
        while (str.charAt ( index ) != ':') {
            index++;
        }
        String nameOther = str.substring ( 1, index );//得到名字
        str = name + str.substring ( index );//处理信息
        //向此人转发信息
        for (ConcurrentHashMap.Entry<String, Work> entry : holder.entrySet ()) {
            if (!entry.getValue ().equals ( this )) {//排除和自己私聊
                if (entry.getKey ().equals ( nameOther )) {//找到此客户端
                    entry.getValue ().response ( str );//服务器转发此消息
                }
            }
        }
    }

    //检测是群聊还是私聊，检测后并调用相应功能
    private void survey(String name, String messager) {//有@即视为想私聊
        if (messager.charAt ( 0 ) == '@') {
            privateChat ( name, messager );
        } else {
            groupChat ( name, messager );
        }
    }

    //拿到客户数据
    private String receive() {
        //拿到客户端数据
        String str = "";
        try {
            str = is.readUTF ();
        } catch (IOException e) {
            release ();
        }
        return str;
    }

    //给客户端做出响应
    private void response(String str) {//m表示是不是系统消息
        try {
            os.writeUTF ( str );
            os.flush ();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace ();
        }
    }

    //给本线程外的其他客户端做出响应
    private void responseOther(String str) {
        for (Work entry : holder.values ()) {
            if (!entry.equals ( this )) {//给其他客户端转发此消息
                entry.response ( str );
            }
        }
    }

    //释放相关资源
    private void release() {
        this.flg = false;
        ChatUtils.close ( is, os, client );
        //一个客户端退出
        removeClient ();
    }

    //一个客户端退出
    private void removeClient() {
        String name = "";
        for (ConcurrentHashMap.Entry<String, Work> entry : holder.entrySet ()) {
            if (entry.getValue ().equals ( this )) {
                name = entry.getKey ();
                break;
            }
        }
        holder.remove ( name );
    }


}
