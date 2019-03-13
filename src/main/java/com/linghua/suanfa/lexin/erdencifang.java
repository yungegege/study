package com.linghua.suanfa.lexin;

import java.util.Scanner;

public class erdencifang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            boolean flag = true;
            while (a>1){
                if (a%2!=0){
                    flag = false;
                }
                a/=2;
            }
            System.out.println(flag);
        }
    }
}
