package com.linghua.tool;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1_Collections {
    /**
     * Collections的常见方法
     * sort 排序
     * binarySearch 要求有序，然后二分查找
     * max 最大值
     * reverse 翻转
     * shuffle  随机变化
     */
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("c");
        list.add("b");
        list.add("d");
        list.add("a");
        list.add("b");
        list.add("d");
//        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,"a"));
    }
}
