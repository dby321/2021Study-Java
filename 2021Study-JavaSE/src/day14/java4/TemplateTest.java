package day14.java4;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day14.java4
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-22 12:56
 * @Description:
 */
public class TemplateTest {
    public static void main(String[] args) {
        Template t=new SubTemplate ();
        t.spendTime ();
    }
}
abstract class Template{
    public void spendTime(){
        long start=System.currentTimeMillis ();
        code();
        long end=System.currentTimeMillis ();
        System.out.println ("花费的时间:"+(end-start));
    }
    public abstract void code();
}
class SubTemplate extends Template{

    @Override
    public void code() {
        for(int i=2;i<=1000;i++){
            boolean isFlag=true;
            for(int j=2;j<=Math.sqrt ( i );j++){
                if(i%j==0){
                    isFlag=false;
                    break;
                }
            }
            if (isFlag){
                System.out.println (i);
            }
        }
    }
}