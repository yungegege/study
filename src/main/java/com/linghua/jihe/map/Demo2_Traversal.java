package com.linghua.jihe.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2_Traversal {

    /**
     * map集合遍历，用迭代器(map本身没有，用set的)遍历
     * 1.先获取所有键的set集合，再用迭代器遍历此set遍历获取键值
     * 2.增强for循环
     */
    public static void main(String[] args){

        Map<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("麻子",26);
        //用set集合遍历
        Set<String> keySet = map.keySet();
        Iterator<String> it = keySet.iterator();
        while(it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }

        //增强for循环
        for(String key:map.keySet()){
            System.out.println(key+"="+map.get(key));
        }


    }
}
