package com.binyu.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @BelongsProject: 2020Study-JavaWeb
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Dong Binyu
 * @CreateTime: 2020-09-23 17:13
 * @Description:
 */
public class HelloServlet implements Servlet {
    public HelloServlet(){
        System.out.println ("1 构造方法");
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println ("2 初始化方法");
        // ServletConfig
        System.out.println ( servletConfig.getServletName () );
//        servletConfig.getInitParameter (  )
        System.out.println ( servletConfig.getServletContext () );
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println ("3 service");
        System.out.println ("hello servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println ("4 销毁方法");
    }
}
