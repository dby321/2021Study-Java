package day14.java;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day14.java
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-21 20:27
 * @Description:
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese c1=new Chinese ();
        c1.name="姚明";
        c1.age=40;
        c1.nation="中国";
        Chinese c2=new Chinese ();
        c2.name="马龙";
        c2.age=35;
        System.out.println (c2.nation);
        Chinese c3=new Chinese ();
        c3.name="林丹";
        c3.age=30;

    }
}
class Chinese{
    String name;
    int age;
    static String nation;
}
