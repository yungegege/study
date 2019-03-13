package com.linghua.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Transaction;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class RedisPool {
    public static void main(String[] args) {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(100);
        jedisPoolConfig.setMaxIdle(10);
        jedisPoolConfig.setTestOnBorrow(true);

        JedisPool jedisPool = new JedisPool(jedisPoolConfig,"localhost",6379);
        Jedis jedis = jedisPool.getResource();

        jedisPool.returnResourceObject(jedis);

        //suo
        jedis.setnx("home","zh");
        jedis.expire("home",1);
        jedis.lpush("home","zh");
        jedis.lpop("home");
        jedis.blpop("home");

        //key
        jedis.keys("*");
        jedis.ttl("k1");

        //String
        System.out.println(jedis.set("name","zlj"));
        System.out.println(jedis.set("age","17"));
        System.out.println(jedis.get("age"));
        System.out.println(jedis.get("age"));

        //List
        jedis.lpush("mylist","v1","v2","v3","V4","v5");
        List<String> list = jedis.lrange("mylist",0,1);

        //Set
        jedis.sadd("myset","001","002","003");
        Set<String> set = jedis.smembers("myset");

        //Hash
        jedis.hset("hash1","name","lyf");
        jedis.hset("hash1","age","18");
        jedis.hset("hash2","name","zlh");
        jedis.hset("hash2","age","17");
        jedis.hget("hashi1","name");
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("name","ll");
        map.put("age","18");
        jedis.hmset("hash3",map);

        //zSet
        jedis.zadd("zset01",60,"v1");
        jedis.zadd("zset01",70,"v2");
        jedis.zadd("zset01",70,"v3");


        //shiwu
        Transaction transaction = jedis.multi();
        jedis.set("name1","lyf");
        jedis.set("age1","18");
        transaction.set("name2","lyf");
        transaction.set("age2","18");
//        transaction.exec();
        transaction.discard();
    }
}
