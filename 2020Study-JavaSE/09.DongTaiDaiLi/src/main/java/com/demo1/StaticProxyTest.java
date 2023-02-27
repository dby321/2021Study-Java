package com.demo1;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-29 14:33
 * @Description:
 */
interface ClothFactory{
    void produceCloth();
}
// 代理类
class ProxyClothFactory implements ClothFactory{

    private ClothFactory clothFactory;

    public ProxyClothFactory(ClothFactory clothFactory) {
        this.clothFactory = clothFactory;
    }

    @Override
    public void produceCloth() {
        System.out.println ("代理工厂做一些准备工作");
        clothFactory.produceCloth ();
        System.out.println ("代理工厂做一些后续的收尾工作");
    }
}
// 被代理类
class NikeClothFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println ("Nike工厂生产一批运动服");
    }
}

public class StaticProxyTest {
    /**
     * 静态代理的举例
     * @param args
     */
    public static void main(String[] args) {
        // 被代理类对象
        NikeClothFactory nikeClothFactory = new NikeClothFactory ();
        // 代理类对象
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory ( nikeClothFactory );
        proxyClothFactory.produceCloth ();
    }
}
