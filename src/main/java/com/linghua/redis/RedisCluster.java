package com.linghua.redis;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashSet;
import java.util.Set;

public class RedisCluster {
    public static void main(String[] args) {
        Set<HostAndPort> jedisClusterNode = new HashSet<>();
        jedisClusterNode.add(new HostAndPort("localhost",6381));
        jedisClusterNode.add(new HostAndPort("localhost",6382));
        jedisClusterNode.add(new HostAndPort("localhost",6383));
        jedisClusterNode.add(new HostAndPort("localhost",6384));
        jedisClusterNode.add(new HostAndPort("localhost",6385));
        jedisClusterNode.add(new HostAndPort("localhost",6386));

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(100);
        jedisPoolConfig.setMaxIdle(10);
        jedisPoolConfig.setTestOnBorrow(true);

        JedisCluster jedisCluster = new JedisCluster(jedisClusterNode,10,10,jedisPoolConfig);
        jedisCluster.set("name","lyf");
        jedisCluster.set("age","18");

        System.out.println(jedisCluster.get("name"));
        System.out.println(jedisCluster.get("age"));
    }
}
