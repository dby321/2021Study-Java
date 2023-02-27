package day14.java3;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day14.java3
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-22 11:31
 * @Description:
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
    }
}
class Person{
    String name;
    int age;
    static String desc="我是一个烦人";
    // 代码块
    static{
        System.out.println ("hello static block");
    }
    {
        System.out.println ("hello  block");
    }

    public Person(){

    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void eat(){
        System.out.println ("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
