package day08;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day08
 * @Author: Dong Binyu
 * @CreateTime: 2021-02-15 14:08
 * @Description:
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] stus1 = new Student[20];
        for (int i = 0; i < stus1.length; i++) {
            //给数组元素赋值
            stus1[i] = new Student ();
            //给student属性赋值
            stus1[i].number = i + 1;
            //年级：[1,6]
            stus1[i].state = 1 + (int) (Math.random () * ((6 - 1) + 1));
            //成绩[0,100]
            stus1[i].score = (int) (Math.random () * (100 + 1));
        }
        //遍历学生数组
        for(int i=0;i<stus1.length;i++){
                System.out.println ( stus1[i].toString () );
        }
        //问题一：打印出3年级的学生信息
        System.out.println ("【打印3年级的学生信息】");
        for(int i=0;i<stus1.length;i++){
            if(stus1[i].state==3){
                System.out.println ( stus1[i].toString () );
            }
        }
        //问题二:使用冒泡排序按学生成绩升序排序，并遍历所有学生信息
        StudentTest test=new StudentTest ();
        test.sort ( stus1 );
        System.out.println ("【学生成绩升序排序测试】");
        test.print ( stus1 );
    }
    /**
     * description 遍历Student数组
     * param [stus]
     * return void
     * author Binyu
     * createTime 2021/2/15 15:04
     **/
    public void print(Student[] stus){
        for(int i=0;i<stus.length;i++){
            System.out.println (stus[i].toString ());
        }
    }

    /**
     * description 查找Student数组中指定年级的学生信息
     * param [stus, state]
     * return void
     * author Binyu
     * createTime 2021/2/15 15:04
     **/
    public void searchState(Student[] stus,int state){
        for(int i=0;i<stus.length;i++){
            if(stus[i].state==state){
                System.out.println (stus[i].toString ());
            }
        }
    }
    /**
     * description 给Student数组按成绩从低到高排序
     * param [stus]
     * return void
     * author Binyu
     * createTime 2021/2/15 15:09
     **/
    public void sort(Student[] stus){
        for(int i=0;i<stus.length-1;i++){
            for(int j=0;j<stus.length-1-i;j++){
                if(stus[j].score>stus[j+1].score){
                    Student temp=stus[j];
                    stus[j]=stus[j+1];
                    stus[j+1]=temp;
                }
            }
        }
    }
}

class Student {
    int number;//学号
    int state;//年级
    int score;//分数
    @Override
    public String toString(){
        return "学号:"+number+",年级:"+state+",分数:"+score;
    }
}
