package com.linghua.suanfa.lexin;

import java.util.ArrayList;
import java.util.Scanner;

public class zifuchuanjuli {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            String str = in.nextLine();
            String s = in.nextLine();
            char ch = s.charAt(0);
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)==ch){
                    list.add(i);
                }
            }

            ArrayList<Integer> lenList = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < list.size(); j++) {
                    int len = i>list.get(j)?i-list.get(j):list.get(j)-i;
                    if (len<min){
                        min = len;
                    }
                }
                lenList.add(min);
            }
            System.out.print("[");
            for (int i = 0; i < lenList.size()-1; i++) {
                System.out.print(lenList.get(i)+",");
            }
            System.out.print(lenList.get(lenList.size()-1)+"]");
//            lexinfintech

        }
    }
}
