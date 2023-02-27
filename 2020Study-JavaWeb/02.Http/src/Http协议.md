# Http协议
## GET请求
- 请求行
    1. 请求方式 GET
    2. 请求的资源路径(?请求参数)
    3. 请求的协议版本号 HTTP/1.1
- 请求头
    key:value
原始数据如下：
```$xslt
GET /01_servlet_war_exploded/hello2 HTTP/1.1
Host: localhost:8080
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Accept-Language: zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2
Accept-Encoding: gzip, deflate
DNT: 1
Connection: keep-alive
Cookie: JSESSIONID=1D62E42E3B2BA520EA9AC59235E54C3D
Upgrade-Insecure-Requests: 1
```

Accept[可以接收的数据类型]
	text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Accept-Encoding[客户端可以接收的压缩格式]
	gzip, deflate
Accept-Language[可以接收的语言类型]
	zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2
Connection[告诉服务器请求连接如何处理]
	keep-alive
Cookie
	JSESSIONID=1D62E42E3B2BA520EA9AC59235E54C3D
DNT
	1
Host[请求的服务器的IP和端口号]
	localhost:8080
Upgrade-Insecure-Requests
	1
User-Agent[浏览器的信息]
	Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0
## POST请求
- 请求行
    1. 请求方式 GET
    2. 请求的资源路径(?请求参数)
    3. 请求的协议版本号 HTTP/1.1
- 请求头
    key:value
- 请求体
```$xslt
POST /01_servlet_war_exploded/hello2 HTTP/1.1
Host: localhost:8080
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Accept-Language: zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2
Accept-Encoding: gzip, deflate
Content-Type: application/x-www-form-urlencoded
Content-Length: 0
Origin: http://localhost:8080
DNT: 1
Connection: keep-alive
Referer: http://localhost:8080/01_servlet_war_exploded/a.html
Cookie: JSESSIONID=1D62E42E3B2BA520EA9AC59235E54C3D
Upgrade-Insecure-Requests: 1
```
Referer[请求发起时，浏览器地址栏中的地址] 
    http://localhost:8080/01_servlet_war_exploded/a.html
Content-Type[表示发送的数据的类型]
    application/x-www-form-urlencoded[表示提交的数据格式是name=value&name2=value2，然后对其进行URL编码，就是将非英文的内容转换为%xxx%xxx]
    multipart/form-data[表示以多段的形式提交给服务器，以流的形式提交，用于上传]
Content-Length[发送的数据的长度]
    0
    
    
## 哪些是GET，哪些是POST
- GET请求
    1. form标签 method=get
    2. a标签
    3. link引入css
    4. script引入js
    5. img标签引入图片
    6. iframe引入HTML页面
    7. 在浏览器输入地址然后回车
- POST请求
    1. form标签 method=post
## 响应的HTTP协议格式
- 响应行
    1. 响应的协议和版本号 HTTP/1.1
    2. 响应的状态码
    3. 响应的状态描述符
- 响应头
    key:value
- 响应体
```
HTTP/1.1 200 
   Content-Length: 0
   Date: Wed, 23 Sep 2020 11:17:51 GMT
```    
## 常见响应码
- 200 请求成功
- 302 请求重定向
- 404 请求地址错误
- 500 服务器内部错误 代码错误
## MIME类型说明
[MIME 参考手册](https://www.w3school.com.cn/media/media_mimeref.asp)
