package com.linghua.jihe.list;

import java.util.LinkedList;

public class Demo9_LinkedList {

    /**
     * 底层链表实现
     * 特有功能：
     * public void addFirst(E e)
     * public void addLast(E e)
     * public E getFirst()
     * public E getLast()
     * public E removeFirst()
     * public E removeLast()
     * public E get(int index)
     */
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        list.addLast("e");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);

        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);

        System.out.println(list.get(1));




    }
}
