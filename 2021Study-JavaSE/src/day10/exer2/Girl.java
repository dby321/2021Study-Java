package day10.exer2;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day10.exer2
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-14 17:19
 * @Description:
 */
public class Girl {
    private String name;
    private int age;

    public Girl(String name, int age) {
    this.name=name;
    this.age=age;
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
    public void marry(Boy boy){
        System.out.println ("我想嫁给"+boy.getName ());
        boy.marry ( this );
    }
    /**
     * @Description 比较两个对象的大小
     * @author binyu
     * @datetime 2021/4/14 18:05
     * @param girl
     * @return int 正数，当前对象大；负数，当前对象小；0，当前对象和形参对象相等
     */
    public int compare(Girl girl){
//        if(this.age>girl.age){
//            return 1;
//        }else if(this.age<girl.age){
//            return -1;
//        }else{
//            return 0;
//        }
        return this.age-girl.age;
    }
}
