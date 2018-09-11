package com.linghua.jihe.list;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1_Collection {
    /**
     * add(Object obj)
     * contains(Object obj)
     * size()
     * toArray
     * remove
     * isEmpty
     */
    public static void main(String[] args){
        Collection c = new ArrayList();
        boolean b1 = c.add("aaa");            //添加元素
        boolean b2 = c.add(1);
        boolean b3 = c.add(true);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(c);
        System.out.println(c.contains("aaa"));   //判断是否包含"aaa
        System.out.println(c.size());         //获取元素个数
        System.out.println("--------------------------------");
        Object[] arr = c.toArray();           //转换成数组
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("--------------------------------");
        boolean b4 = c.remove(b1);            //删除b1
        System.out.println(b4);
        System.out.println(c);
        System.out.println("--------------------------------");
        c.clear();                            //清空集合
        System.out.println(c.isEmpty());      //判断是否为空
        System.out.println(c);




    }



}
