package day13.java;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day13.java2
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-21 11:32
 * @Description:
 */
public class Man extends Person {

    boolean isSmoking;
    public void earnMoney(){
        System.out.println ("男人负责挣钱养家");
    }
    public void eat(){
        System.out.println ("男人多吃肉");
    }
    public void walk(){
        System.out.println ("男人霸气的走路");
    }
}
