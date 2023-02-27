package com.commonio.demo1;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.commonio.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-28 10:51
 * @Description:
 */
public class CIOTest {

    @Test
    public void test1(){
        File srcFile=new File("alanwake1.jpg");
        File destFile=new File("alanwake4.jpg");
        try {
            FileUtils.copyFile ( srcFile,destFile );
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
