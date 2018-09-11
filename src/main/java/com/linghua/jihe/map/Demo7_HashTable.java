package com.linghua.jihe.map;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo7_HashTable {
    /**
     * HashMap和Hashtable
     *  1.共同点：
     *    底层都是哈希算法，双列集合
     *  2.区别
     *    HashMap 线程不安全，效率高。可以存null键和null值
     *    Hashtable  线程安全，效率低。不能存null键和null值
     */
    public static void main(String[] args){
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(null,23);
        m.put(23,null);
//        m.put(null,null);
        System.out.println("m"+m);

        Hashtable<Integer,Integer> map = new Hashtable<>();
        map.put(23,null);   //NullPointerException
//        map.put(null,23);
//        map.put(null,null);
        System.out.println(map);

    }
}
