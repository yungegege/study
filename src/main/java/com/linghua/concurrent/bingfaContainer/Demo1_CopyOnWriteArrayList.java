package com.linghua.concurrent.bingfaContainer;

import java.util.concurrent.CopyOnWriteArrayList;

public class Demo1_CopyOnWriteArrayList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("1");
        list.set(0,"2");
        System.out.println(list);
    }
}
