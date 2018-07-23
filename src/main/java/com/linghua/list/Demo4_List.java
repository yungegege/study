package com.linghua.list;

import java.util.ArrayList;
import java.util.List;

public class Demo4_List {
    /**
     * 三个儿子：ArrayList、LinkedList、Vector，list有索引，能用get()方法
     * void add(int index,E element)
     * E remove(int index)
     * E set(int index,E element)
     * E get(int index)
     */
    public static void main(String[] args){
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(1,"d");
        list.set(0,"z");
        System.out.println(list);
        System.out.println(null == null);

        System.out.println("--------------------------");
        for(int i =0;i<list.size();i++){                   //遍历集合
            System.out.println(list.get(i));
        }

        System.out.println("--------------------------");
        Object obj = list.remove(1);                  //通过索引删除元素
        System.out.println(obj);
        System.out.println(list);

        System.out.println("--------------------------");
        System.out.println(list.get(1));                     //通过索引删除元素
        System.out.println(list);

        System.out.println("--------------------------");
        list.set(1,"sss");                                   //修改索引处元素
        System.out.println(list);

    }
}
