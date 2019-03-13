package com.linghua.suanfa.weicelue;

import java.util.ArrayList;
import java.util.Scanner;

public class sushu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 2; i <= a; i++) {
                int flag = 0;
                for (int j = 2; j < i; j++) {
                    if (i%j==0){
                        flag++;
                        break;
                    }
                }
                if (flag==0){
                    list.add(i);
                }
            }
            if (list.size()>0){
                for (int i = 0; i < list.size()-1; i++) {
                    System.out.print(list.get(i)+",");
                }
                System.out.println(list.get(list.size()-1));
            }else {
                System.out.println(0);
            }

        }
    }
}
