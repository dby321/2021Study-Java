# Filter&Listener
> JavaWeb三大组件是Servlet程序，Listener监听器，Filter过滤器
## Filter过滤器
[JavaEE-Filter](https://docs.oracle.com/javaee/7/api/javax/servlet/Filter.html)
[JavaEE-FilterConfig](https://docs.oracle.com/javaee/7/api/javax/servlet/FilterConfig.html)
[JavaEE-FilterChain](https://tool.oschina.net/apidocs/apidoc?api=javaEE6)
1. JavaEE的规范，也就是接口
2. 作用是拦截请求，过滤响应

它的应用场景有：
    1. 权限检查
    2. 日记操作
    3. 事务管理
    ...
Filter过滤器执行的特点：
    1. 多个Filter执行顺序是由web.xml中的顺序决定的
    2. 所有的Filter和目标资源默认都执行在同一个线程中
    3. 多个Filter共同执行时，他们都使用同一个Request对象（因为只有一次请求）
Filter的拦截路径
    1. 具体资源路径拦截：@WebFilter("/index.jsp") //这是指访问index.jsp的时候会经过过滤器
    2. 具体目录拦截：@WebFilter("/user/*") //这是指访问user目录下的所有资源时会经过过滤器
    3. 具体后缀名拦截：@WebFilter("*.jsp") //这时指访问后缀名为.jsp的资源时会经过过滤器
    4. 所有资源拦截：@WebFilter("/*") //这是指访问所有资源的时候都会经过过滤器
    
## Listener监听器
[简书-Listener](https://www.jianshu.com/p/d576ee8631de)
> 在Servlet规范中定义了多种类型的监听器，它们用于监听的事件源分别为 ServletContext, HttpSession 和 ServletRequest 这三个域对象。
> Servlet规范针对这三个对象上的操作，又把这多种类型的监听器划分为三种类型。
> 监听三个域对象创建和销毁的事件监听器
> 监听域对象中属性的增加和删除的事件监听器
> 监听绑定到 HttpSession 域中的某个对象的状态的事件监听器

> 在web.xml中配置监听器。注意：监听器>过滤器>serlvet，配置的时候要注意先后顺序
