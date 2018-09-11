package com.linghua.jihe.map;

import java.util.HashMap;
import java.util.Map;

public class Demo1_Map {
    /**
     * map的功能概述
     * 1.添加
     *   V put(K key,V value):添加元素，如果第一次存储，就直接存，返回null，否则把以前的值替换掉，返回以前的值
     * 2.删除
     *   void clear():删除所有键值对
     *   v remove(Object Key):根据键删除键值对，并返回值
     * 3.判断
     *   boolean containsKey(object key)
     *   boolean containsValue(object value)
     *   boolean isEmpty()
     * 4.获取
     *   Set<Map.Entry<K,V>> entrySet():
     *   V get(Object key):根据键获取值
     *   Set<K> keySet():获取集合中所有的键的集合
     *   Collection<V> values():获取集合中所有值的集合
     * 5.长度
     *   int size()
     */
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        //添加
        Integer i1 = map.put("张三",23);
        Integer i2 = map.put("李四",24);
        Integer i3 = map.put("王五",25);
        Integer i4 = map.put("赵六",26);
        Integer i5 = map.put("张三",26);
        Integer i6 = map.put(null,null);
        System.out.println(map);
        System.out.println(i1);
        System.out.println(i5);


        //删除
        map.remove("张三");
        System.out.println(map);

        //判断
        System.out.println(map.containsKey("张三"));
        System.out.println(map.containsValue(24));

        //获取
        System.out.println(map.get("李四"));
        System.out.println(map.values());
        System.out.println(map.keySet());

        //长度
        System.out.println(map.size());
    }

}
