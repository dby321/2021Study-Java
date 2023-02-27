package day10.exer;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day10.project2
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-14 16:43
 * @Description:
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person=new Person ();
        System.out.println ( person.getAge () );
        person.setAge ( 120 );
        System.out.println ( person.getAge () );
    }
}
