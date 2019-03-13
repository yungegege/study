package com.linghua.suanfa.xiapi;

import java.util.*;

public class movezero {
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {//注意while处理多个case
            String str = in.nextLine();
            if ("".equals(str)){
                System.out.println("");
                return;
            }
            String[] strarr = str.split(",");
            int[] arr = new int[strarr.length];
            for (int i = 0; i < strarr.length; i++) {
                arr[i] = Integer.parseInt(strarr[i]);
            }
            Arrays.sort(arr);
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    index = i;
                    break;
                }
            }
            int num = 1;
            for (int i = index; i < arr.length; i++) {
                if (i < arr.length - num) {
                    swap(arr, i, arr.length - num);
                    num++;
                }
            }

            for (int i = 0; i < arr.length / 2; i++) {
                swap(arr, i, arr.length - i-1);
            }

            String s = "[";
            for (int i = 0; i < arr.length-1; i++) {
                s = s + arr[i] + ", ";
            }
            s = s + arr[arr.length-1] + "]";
            System.out.println(s);


        }
    }
}
