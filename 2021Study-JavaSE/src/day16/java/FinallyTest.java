package day16.java;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day16.java
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-25 16:35
 * @Description: try-catch-finally
 */
public class FinallyTest {
    /**
     * finally中声明的是一定会被执行
     */
    @Test
    public void test1(){
        try{
            int a=10;
            int b=0;
            System.out.println (a/b);
        }catch (ArithmeticException e){
            e.printStackTrace ();
        }catch (Exception e){
            e.printStackTrace ();
        }finally {
            System.out.println ("我好帅啊");
        }


    }
    @Test
    public void test2(){
        FileInputStream fis=null;
        try {
            File file=new File( "day16/hello.txt" );
            fis=new FileInputStream ( file );
            int read = fis.read ();
            while(fis.read ()!=-1){
                System.out.println (read);
                 read=fis.read();
            }

        } catch (FileNotFoundException e){
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                if(fis!=null){
                    fis.close ();
                }
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
    }
}
