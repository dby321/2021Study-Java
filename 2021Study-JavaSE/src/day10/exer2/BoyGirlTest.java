package day10.exer2;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day10.exer2
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-14 18:13
 * @Description:
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy=new Boy("罗密欧",21);
        boy.shout ();
        Girl girl=new Girl ("朱丽叶",18);
        girl.marry ( boy );

        Girl girl1=new Girl ( "祝英台",19 );
        int compare =girl.compare ( girl1 );
        if(compare>0){
            System.out.println (girl.getName ()+"大");
        } else if(compare<0){
            System.out.println (girl1.getName ()+"大");
        } else{
            System.out.println ("一样大");
        }
    }
}
