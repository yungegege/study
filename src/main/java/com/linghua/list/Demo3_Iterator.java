package com.linghua.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo3_Iterator {
    /**
     * 只有这三种方法
     * boolean hasNext();
     * E next();
     * void remove();
     */
    public static void main(String[] args){


        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");

        Iterator it = c.iterator();   //获取迭代器
//        boolean b1 = it.hasNext();    //判断集合中是否有元素，有就返回flase，
//        Object obj1 = it.next();      //执行一次指针向后移动一次
//        System.out.println(b1);
//        System.out.println(obj1);

        while (it.hasNext()){
            Object obj = it.next();      //执行一次指针向后移动一次
            System.out.println(obj);
        }
    }
}
