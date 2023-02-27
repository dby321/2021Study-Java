package day09;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day09
 * @Author: Dong Binyu
 * @CreateTime: 2021-02-17 17:04
 * @Description: 可变形参的测试
 */
public class MethodArgsTest {
    public void show(int i){
        System.out.println ("show()"+i);

    }
    public void show(String s){
        System.out.println ("show()"+s);
    }
    public void show(String ...args){
        System.out.print ("public void show(String ...args)");
        for(String arg:args){
            System.out.print (arg+".");
        }
        System.out.println ();
    }

    public static void main(String[] args) {
        MethodArgsTest test=new MethodArgsTest ();
        test.show ( 10 );
        test.show ( "我是string" );
        test.show ( "www","baidu","com");
        test.show();
    }
}
