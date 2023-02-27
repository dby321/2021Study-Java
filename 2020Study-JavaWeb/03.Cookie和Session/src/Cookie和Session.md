# Cookie和Session
## Cookie饼干
[菜鸟教程-Servlet Cookie 处理](https://www.runoob.com/servlet/servlet-cookies-handling.html)
1. Cookie是服务器通知客户端保存键值对的一种技术
2. 客户端有了Cookie后，每次请求都发送给服务器
3. 每个Cookie的大小不能超过4KB

### Cookie有效路径（path）
- 对应着工程路径，浏览器发请求时是否携带该cookie就是通过path判断 
- 服务器端可以设置Cookie的有效路径
## Session会话
[菜鸟教程-Servlet Session 跟踪](https://www.runoob.com/servlet/servlet-session-tracking.html)
1. Session是一个接口（HttpSession）
2. Session是用来维护一个客户端和服务器之间关联的一种技术
3. 每个客户端都有自己的一个会话
4. Session会话中，我们经常用来保存用户登录之后的信息
```
// 获取Session
HttpSession session = request.getSession();
// 判断Session是否是新创建的
request.getSession().isNew()
// 得到Session的ID编号
request.getSession().getId()
```
> Cookie和Session的设置 生命周期创 的方法不同，需要查看对应API
## JavaWeb四大域对象
[简书-JavaWeb四大域对象](https://www.jianshu.com/p/6c02951267d8)
ServletContext、ServletRequest、HttpSession、PageContext
