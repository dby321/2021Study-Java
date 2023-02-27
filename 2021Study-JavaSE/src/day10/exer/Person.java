package day10.exer;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day10.project2
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-14 16:42
 * @Description:
 */
public class Person {
    private int age;
    public void setAge(int a){
        if(a<0||a>130){
            throw new RuntimeException ( "传入数据不合法" );
        }else{
            this.age=a;
        }
    }
    public int getAge(){
        return this.age;
    }
    public Person(){
        System.out.println ("Person....");
    }
}
