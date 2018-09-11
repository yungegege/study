package com.linghua.jihe.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo3_Traversal {

    /**
     * map集合遍历，不用迭代器遍历
     *  3.先获取所有键值对对象的集合
     *    遍历此集合获取每一个键值对对象
     *    根据键值对对象找键和值
     *  4.增强for循环
     */
    public static void main(String[] args){

        Map<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("麻子",26);
        map.put(null,20);
        map.put("lalala",null);
//        map.put(null,null);
        System.out.println(map);

        //Entry是Map的内部接口，将键和值封装成了Entry对象，并存储在Set集合中
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        //获取迭代器
        Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
        while (it.hasNext()){
            //每一个Entry对象
            Map.Entry<String,Integer> en = it.next();
            String key = en.getKey();
            Integer value = en.getValue();
            System.out.println(key+"="+value);
        }

        //增强for循环遍历Entry对象集合，根据此对象获取键和值
        for(Map.Entry<String,Integer> en :map.entrySet()){
//            System.out.println(en.getKey()+"="+en.getValue());
        }




    }
}
