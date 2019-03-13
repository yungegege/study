package com.linghua.suanfa.weimeng;

import java.util.Scanner;

public class yidegeshu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            int b = NumberOf1Between1AndN_Solution(a);
            System.out.println(b);
        }
    }


    //不考虑时间效率的解法
    public static int NumberOf1Between1AndN_Solution(int n) {
        if (n <= 0) {
            return 0;
        }
        int number = 0;
        for (int i = 1; i <= n; i++) {
            number += NumberOf1(i);
        }
        return number;
    }

    public static int NumberOf1(int n) {
        int number = 0;
        while (n > 0) {
            if (n % 10 == 1) {
                number++;
            }
            n = n / 10;
        }
        return number;
    }

}
