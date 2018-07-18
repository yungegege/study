package com.linghua.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo8_ArrayList {
    /**
     * 底层数组实现
     */
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add(null);
        list.add(null);
        System.out.println(list);

        ArrayList newList = new ArrayList();
        Iterator it = list.iterator();
        while(it.hasNext()){
            if(!newList.contains(it.next())){
                newList.add(it.next());
            }
        }
        System.out.println(newList);

    }
}
