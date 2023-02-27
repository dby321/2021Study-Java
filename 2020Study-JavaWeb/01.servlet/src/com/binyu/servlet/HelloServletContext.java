package com.binyu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @BelongsProject: 2020Study-JavaWeb
 * @BelongsPackage: ${PACKAGE_NAME}
 * @Author: Dong Binyu
 * @CreateTime: 2020-09-23 18:43
 * @Description: ${Description}
 */
public class HelloServletContext extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = this.getServletConfig ().getServletContext ();
        String password = servletContext.getInitParameter ( "password" );
        System.out.println (password);
        System.out.println ("-----------");
        System.out.println (servletContext.getContextPath ()); // /01_servlet_war_exploded
        System.out.println (servletContext.getRealPath ( "/" )); // E:\idea_workspace\2020Study-JavaWeb\out\artifacts\01_servlet_war_exploded\
        System.out.println (servletContext.getRealPath ( "/WEB-INF/web.xml" )); // E:\idea_workspace\2020Study-JavaWeb\out\artifacts\01_servlet_war_exploded\WEB-INF\web.xml
        servletContext.setAttribute ( "key1","value1" );
        System.out.println ( servletContext.getAttribute ( "key1" ) );
    }
}
