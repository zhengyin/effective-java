package com.izhengyin.effective.java.chapter2.item2;

import redis.clients.jedis.Jedis;

import java.util.Date;

/**
 * Created by zhengyin on 2017/8/3 上午9:28.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {

    private static RedisDrive redisDrive;

    static {
        redisDrive = new RedisDrive.Builder("127.0.0.1")
                .setDatabase(2)
                .setTimeout(500)
                .build();
    }

    public static void main(String[] args) {
        Jedis jedis = redisDrive.getJedis();
        jedis.setex("time" , 60 , new Date().toString());
        System.out.println("jedis.get [time] :"+jedis.get("time"));
        System.out.println("jedis.ttl [time] :"+jedis.ttl("time"));
    }
}
