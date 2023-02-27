package com.demo1;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo2
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-29 14:40
 * @Description:
 */
interface Human{
    String getBelief();
    void eat(String food);
}
// 被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I believe I can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println ("I like "+food);
    }
}

/**
 * 要实现动态代理，需要解决的问题
 * 问题1：如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象
 * 问题2：当通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法
 *
 */
class ProxyFactory{
    /**
     * 调用此方法返回一个代理类的对象
     */
    public static Object getProxyInstance(Object obj){// obj：被代理的对象
        return  Proxy.newProxyInstance ( obj.getClass ().getClassLoader (), obj.getClass ().getInterfaces (), new MyInvocationHandler (obj) );
    }
}
class MyInvocationHandler implements InvocationHandler{
    private final Object obj;// 需要使用被代理类的对象进行赋值

    public MyInvocationHandler(Object obj) {
        this.obj = obj;
    }

    /**
     * 当我们通过代理类的对象，调用方法a时，就会自动的调用如下的方法：invoke()
     * 将被代理类要执行的方法a的功能就声明在invoke()中
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // method：即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
        // obj：被代理类的对象
        System.out.println("before method " + method.getName());
        Object returnValue = method.invoke ( obj, args );
        System.out.println("after method " + method.getName());
        return returnValue;
    }
}


public class ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan ();
        // proxyInstance：代理类的对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance ( superMan );
        String belief = proxyInstance.getBelief ();
        System.out.println (belief);
        proxyInstance.eat ( "四川麻辣烫" );

        System.out.println ("----");
        NikeClothFactory nikeClothFactory=new NikeClothFactory ();
        ClothFactory proxyInstance1 = (ClothFactory) ProxyFactory.getProxyInstance ( nikeClothFactory );
        proxyInstance1.produceCloth ();
    }
}
