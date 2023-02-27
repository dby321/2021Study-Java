package com.demo1;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2021-12-10 15:22
 * @Description:
 */
class AmsService {
    public String sendMessage(String msg){
        System.out.println (msg);
        return msg;
    }
}
class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println ("before" +method.getName ());
        Object o1 = methodProxy.invokeSuper ( o, objects );
        System.out.println ("after" +method.getName ());
        return o1;
    }
}
class CglibProxyFactory{
    public static Object getProxy(Class<?> clazz){
        Enhancer enhancer=new Enhancer ();
        enhancer.setClassLoader ( clazz.getClassLoader () );
        enhancer.setSuperclass ( clazz );
        enhancer.setCallback (  new MyMethodInterceptor ());
        return enhancer.create ();
    }
}


public class CglibTest{
    public static void main(String[] args) {
        AmsService proxy = (AmsService) CglibProxyFactory.getProxy ( AmsService.class );
        proxy.sendMessage ( "xiaoxi" );
    }
}
