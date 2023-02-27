package day12.java;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day12
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-19 11:18
 * @Description:
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids ( 12 );
        someKid.printAge ();

        someKid.setSalary ( 0 );
        someKid.setSex ( 1 );

        someKid.employed ();
        someKid.manOrWoman ();
        int[] arr=new int[]{1,2,3};
        System.out.println (arr);
    }
}
