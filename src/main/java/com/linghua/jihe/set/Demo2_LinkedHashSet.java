package com.linghua.jihe.set;

import java.util.LinkedHashSet;

public class Demo2_LinkedHashSet {

    /**
     * 元素唯一，存取顺序一致
     * @param args
     */
    public static void main(String[] args){
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        boolean b1 = hs.add("a");
        boolean b2 = hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("d");
        System.out.println(hs);
        System.out.println(b1);
        System.out.println(b2);
    }
}
