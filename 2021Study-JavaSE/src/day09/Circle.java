package day09;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day09
 * @Author: Dong Binyu
 * @CreateTime: 2021-02-17 20:14
 * @Description:
 */
public class Circle {
    double radius;
    public double findArea(double radius){
        this.radius=radius;
        return radius*radius*Math.PI;
    }
}
