package day14.java2;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day14.java2
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-21 20:45
 * @Description: 饿汉式 单例模式
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank instance = Bank.getInstance ();

    }
}
class Bank{
    private Bank(){}
    private static Bank instance =new Bank();

    public static Bank getInstance() {
        return instance;
    }
}
