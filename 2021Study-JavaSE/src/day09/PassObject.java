package day09;



/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day09
 * @Author: Dong Binyu
 * @CreateTime: 2021-02-17 20:13
 * @Description:
 */
public class PassObject {
    public void printAreas(Circle c,int time){
        System.out.println ("Radius\t\tArea");
        for(int i=1;i<=time;i++){
            c.radius=i;
            System.out.println (c.radius+"\t\t"+c.findArea ( i ));
        }
        double nowRadius=time+1;
        System.out.println ("now radius is " + nowRadius);
    }

    public static void main(String[] args) {
        PassObject passObject=new PassObject ();
        passObject.printAreas ( new Circle(),5 );
    }
}
