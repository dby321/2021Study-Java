package day10.java;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day10
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-14 11:37
 * @Description:
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal ();
        a.name = "大黄";
        a.age = 1;
        a.setLegs ( 6 );
        a.show ();
    }
}

class Animal {
    String name;
    int age;
    private int legs;

    public void setLegs(int l) {
        if (l >= 0 && l % 2 == 0) {
            this.legs = l;
        } else {
            this.legs = 0;
        }
    }

    public int getLegs() {
        return this.legs;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println ( "动物进食" );
    }

    public void show() {
        System.out.println ( "name=" + name + ",age=" + age + ",legs=" + legs );
    }
}
