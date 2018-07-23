package com.linghua.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo6_ListIterator {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("world");
        list.add("c");
        list.add("d");
        System.out.println(list);

        System.out.println("--------------------------");
        ListIterator lit = list.listIterator();    //不能在用Iterator或者ListIterator遍历时候用list.add()，或者说迭代器遍历只能用自己的方法修改
        //增强for循环不能删除只能遍历
        while(lit.hasNext()){
            String str = (String) lit.next();
            if ("world".equals(str)){
                lit.add("lalala");
            }
        }
        System.out.println(list);

        System.out.println("--------------------------");  //反着遍历
        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }
        System.out.println(list);

    }
}
