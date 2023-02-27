# Json&Ajax
## Json
> 轻量级的数据交换格式
> Json就是一个对象
1. JS操作Json时，需要的是对象格式
2. 客户端和服务器相互传递数据时，需要的是字符串格式

### JavaBean<->Json
用Gson.jar
```$xslt
Gson gson=new Gson();
// JavaBean->Json
String personString=gson.toJson(Person);
// Json->JavaBean
Person person=gson.fromJson(personString,Person.class)
```
## Ajax
[菜鸟教程-jQuery AJAX 方法](https://www.runoob.com/jquery/jquery-ref-ajax.html)
> AJAX 是一种在无需重新加载整个网页的情况下，能够更新部分网页的技术。
> 原生AJAX太不好用了
