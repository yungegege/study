package com.linghua.set;

import java.util.HashSet;

public class Demo1_hashSet {
    /**
     * 元素唯一，存取顺序不一致,set没有索引，不能用get()方法
     * hashcode一样才调用equals方法，尽量保证hashcode值不一样就能减少equals的调用
     * @param args
     */
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        boolean b1 = hs.add("a");
        boolean b2 = hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("d");
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
        System.out.println(b1);
        System.out.println(b2);
    }
}
