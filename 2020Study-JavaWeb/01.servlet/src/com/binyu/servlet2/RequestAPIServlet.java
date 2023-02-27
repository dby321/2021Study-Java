package com.binyu.servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @BelongsProject: 2020Study-JavaWeb
 * @BelongsPackage: com.binyu.servlet2
 * @Author: Dong Binyu
 * @CreateTime: 2020-09-23 19:40
 * @Description:
 */
public class RequestAPIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println (req.getRequestURI ()); // /01_servlet_war_exploded/request
        System.out.println (req.getRequestURL ()); // http://localhost:8080/01_servlet_war_exploded/request
        System.out.println ( req.getRemoteHost () ); // 0:0:0:0:0:0:0:1 是ipv6的表现形式 对应ipv4来说相当于127.0.0.1，也就是本机
    }
}
