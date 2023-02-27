package com.system.demo1;

import org.junit.Test;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.system.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-23 19:52
 * @Description:
 */
public class SystemTest {
    @Test
    public void test1(){
        System.out.println ( System.getProperty ( "java.version" ) );
        System.out.println ( System.getProperty ( "os.version" ) );
    }
}
