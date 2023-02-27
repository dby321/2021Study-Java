package day12.java;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day12
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-19 11:10
 * @Description:
 */
public class ManKind {
    private int sex;// 性别
    private int salary;// 薪资
    public void manOrWoman(){
        if(sex==1){
            System.out.println ("man");
        }else if(sex==0){
            System.out.println ("woman");
        }
    }
    public void employed(){
        if(salary==0){
            System.out.println ("no job");
        }else{
            System.out.println ("job");
        }
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public ManKind() {
    }

    public int getSex() {
        return this.sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
