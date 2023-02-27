package day08;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day08
 * @Author: Dong Binyu
 * @CreateTime: 2021-02-15 12:18
 * @Description:
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=5;
        c1.findArea ();

    }
}
class Circle{
    double radius;
    public void findArea(){
        double area=Math.PI*radius*radius;
        System.out.println (area);
    }
}