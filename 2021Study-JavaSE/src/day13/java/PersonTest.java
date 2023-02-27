package day13.java;

import day12.java2.Man;
import day12.java2.Person;
import day12.java2.Woman;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day13.java2
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-21 11:35
 * @Description:
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Man ();
        p1.walk ();
        p1.name="Tom";
        p1.age=12;
        Person p2=new Woman ();
        p2.walk ();
        System.out.println (p2);
        if(p2 instanceof Woman){
            Woman w2=(Woman)p2;
            w2.goShopping ();
        }
    }
}
