package day08;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day08
 * @Author: Dong Binyu
 * @CreateTime: 2021-02-15 12:25
 * @Description:
 */
public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test exer3Test=new Exer3Test ();
        System.out.println ( exer3Test.method (12,5) );
    }
//    public void method(){
//        for(int i=0;i<10;i++){
//            for(int j=0;j<8;j++){
//                System.out.print ("* ");
//            }
//            System.out.println ();
//        }
//    }
//    public int method(){
//        for(int i=0;i<10;i++){
//            for(int j=0;j<8;j++){
//                System.out.print ("* ");
//            }
//            System.out.println ();
//        }
//        return 8*10;
//    }
    public int method(int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print ("* ");
            }
            System.out.println ();
        }
        return m*n;
    }
}
