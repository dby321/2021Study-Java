package com.demo3;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo3
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-28 17:20
 * @Description:
 */
import java.io.Closeable;
import java.io.IOException;

/**
 * 工具类
 * @author Administrator
 *
 */
public class ChatUtils {
    /**
     * 释放资源
     */
    public static void close(Closeable... resource) {
        for(Closeable a:resource) {
            try {
                if(null!=a)
                    a.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

