# Servlet
## ServletConfig和ServletContext
> 一个Servlet对应一个ServletConfig
> 一个工程对应一个ServletContext

## 请求转发forward
1. 浏览器地址没有变化
2. 他们是一次请求
3. 他们共享Request域中的数据
4. 可以转发到WEB-INF目录下，但是浏览器直接访问WEB-INF下文件不行
5. 不能访问工程以外的资源
## base标签
> 设置页面相对路径工作时参考的地址
`<base href="xxx">`

## Web中斜杠的不同意义
> 在web中，/斜杠是一种绝对路径
- 如果被浏览器解析 得到的地址是http://ip:port/
`<a href="/">斜杠</a>`
- 如果被服务器解析 得到的地址是http://ip:port/工程路径
`<url-pattern>/servlet1</url-pattern>`
`servletContext.getRealPath("/")`
`request.getRequestDispatcher("/")`
- 特殊情况 把斜杠发送给浏览器解析 得到的地址是http://ip:port/
`response.sendRedirect("/")`

## 请求重定向Redirect
1. 浏览器地址有变化
2. 他们是两次请求
3. 他们不共享Request域中的数据
4. 不能访问WEB-INF目录下
5. 可以访问工程以外的资源