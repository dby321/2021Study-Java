package com.demo3;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.demo3
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-28 17:20
 * @Description:
 */
public class ClientTest {


        public static void main(String[] args) {
            Client ss= new Client("127.0.0.1",8848);
            ss.run();
        }
}

