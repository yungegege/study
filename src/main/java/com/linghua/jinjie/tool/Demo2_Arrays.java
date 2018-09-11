package com.linghua.jinjie.tool;

import java.util.Arrays;
import java.util.List;

public class Demo2_Arrays {
    /**
     * toString
     * sort
     * binarySearch   二分查找，要求数组有序
     */



    public static void main(String[] args){
        int a = 1<<31;      //左移一位就是乘以一个2，int型最大就是1左移31位再减去1
        System.out.println(a);
        System.out.println(a-1);

        System.out.println(1 << 1);
        Integer[] arr = {1,2,3,4,5,7,3,37,8,2,17,3,82,2,37,534,3,2,1,5};
        List<Integer> list = Arrays.asList(arr);
        for(int i:list){
            System.out.println(i);
        }
        System.out.println(list);

        System.out.println("-----------------------------------");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,3));
        System.out.println(Arrays.binarySearch(arr,5));
        System.out.println(Arrays.binarySearch(arr,7));
        System.out.println(Arrays.toString(arr));


    }
}
