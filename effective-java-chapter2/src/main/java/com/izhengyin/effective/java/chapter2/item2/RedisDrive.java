package com.izhengyin.effective.java.chapter2.item2;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by zhengyin on 2017/8/3 上午9:30.
 * Email  <zhengyin.name@gmail.com> .
 */
public class RedisDrive {

    private String host;
    private int port;
    private int timeout;
    private int database;
    private int maxIdle;
    private int maxTotal;
    private int maxWaitMs;
    private boolean testOnBorrow;
    private boolean testOnReturn;

    private JedisPool jedisPool;

    private RedisDrive(Builder builder) {
        this.host = builder.host;
        this.port = builder.port;
        this.timeout = builder.timeout;
        this.database = builder.database;
        this.maxIdle  = builder.maxIdle;
        this.maxTotal  = builder.maxTotal;
        this.maxWaitMs  = builder.maxWaitMs;
        this.testOnBorrow = builder.testOnBorrow;
        this.testOnReturn = builder.testOnReturn;
        initRedisPool();
    }

    private void initRedisPool(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxTotal(maxTotal);
        jedisPoolConfig.setMaxWaitMillis(maxWaitMs);
        jedisPoolConfig.setTestOnBorrow(testOnBorrow);
        jedisPoolConfig.setTestOnReturn(testOnReturn);
        this.jedisPool = new JedisPool(jedisPoolConfig , host , port , timeout , null ,database);
    }

    public Jedis getJedis(){
        return jedisPool.getResource();
    }

    public static class Builder {
        private String host;
        private int port = 6379;
        private int timeout = 3;
        private int database = 0;
        private int maxIdle = 64;
        private int maxTotal = 256;
        private int maxWaitMs = 1000;
        private boolean testOnBorrow = true;
        private boolean testOnReturn = true;
        public Builder(String host){
            this.host = host;
        }

        public Builder setPort(int port){
            this.port = port;
            return this;
        }
        public Builder setTimeout(int timeout){
            this.timeout = timeout;
            return this;
        }
        public Builder setDatabase(int database){
            this.database = database;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMaxTotal(int maxTotal) {
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxWaitMs(int maxWaitMs) {
            this.maxWaitMs = maxWaitMs;
            return this;
        }

        public Builder setTestOnBorrow(boolean testOnBorrow) {
            this.testOnBorrow = testOnBorrow;
            return this;
        }

        public Builder setTestOnReturn(boolean testOnReturn) {
            this.testOnReturn = testOnReturn;
            return this;
        }

        public RedisDrive build(){
            return new RedisDrive(this);
        }

    }
}
