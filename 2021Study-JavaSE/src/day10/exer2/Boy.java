package day10.exer2;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day10.exer2
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-14 17:18
 * @Description:
 */
public class Boy {
    private String name;
    private int age;

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl) {
        System.out.println ( "我想娶" + girl.getName () );
    }

    public void shout() {
        if (this.age > 22) {
            System.out.println ( "可以合法登记了" );
        } else {
            System.out.println ( "再谈会儿恋爱" );
        }
    }
}
