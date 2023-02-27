package com.demo;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @BelongsProject: 2021Study-SpringIntegration
 * @BelongsPackage: com.binyu
 * @Author: Dong Binyu
 * @CreateTime: 2021-11-07 20:56
 * @Description:
 */
public class JedisDemo {
    public static void main(String[] args) {
        Jedis jedis=new Jedis ( "192.168.10.128",6379 );
        System.out.println ( jedis.ping () );
        Set<String> keys = jedis.keys ( "*" );
        for(String key:keys){
            System.out.println (key);
        }
        jedis.mset ( "k3","v4","k3","v4" );

    }
}
