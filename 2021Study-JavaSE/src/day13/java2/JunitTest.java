package day13.java2;

import org.junit.Test;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day13.java2
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-21 17:33
 * @Description:
 */
public class JunitTest {
    @Test
    public void Test1(){
        Integer i=new Integer ( 12 );
        int i2=i.intValue ();
        String s = i.toString ();
        String s1 = String.valueOf ( i2 );
        int i1 = Integer.parseInt ( "123" );

    }
}
