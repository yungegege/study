package com.linghua.suanfa.souhu;

import java.util.*;

public class chongfushuzi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            String line = in.nextLine();
            String sarr[] = line.split(" ");
            int[] arr = new int[sarr.length];
            for (int i = 0; i < sarr.length; i++) {
                arr[i] = Integer.parseInt(sarr[i]);
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<sarr.length;i++){
                if (map.get(arr[i])==null){
                    map.put(arr[i],1);
                }else {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
