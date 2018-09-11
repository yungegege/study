package com.linghua.jihe.list;

import java.util.ArrayList;
import java.util.Collection;

public class Demo2_Collection_All {

    public static void main(String[] args){
//        demo1();
//        demo2();
        Collection a = new ArrayList();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("e");

        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("f");

        boolean b1 = a.containsAll(c);     //包含交集，全部包含返回true
        System.out.println(a);
        System.out.println(b1);

        boolean b2 = a.retainAll(c);    //取交集，a集合改变就返回true否则返回false
        System.out.println(a);
        System.out.println(b2);

    }

    public static void demo2(){
        Collection a = new ArrayList();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");

        Collection c = new ArrayList();
        c.add("a");
        c.add("b");

        boolean b = a.removeAll(c);  //删除交集
        System.out.println(a);
        System.out.println(b);
    }


    public static void demo1(){
        Collection a = new ArrayList();
        a.add("a");
        a.add("b");
        a.add("c");

        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");

//        a.add(c);                   //整体添加
        a.addAll(c);                  //逐个添加
        System.out.println(a);
    }
}
