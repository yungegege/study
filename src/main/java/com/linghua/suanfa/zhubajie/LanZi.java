package com.linghua.suanfa.zhubajie;

import java.util.Scanner;

public class LanZi {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^*/
    /******************************开始写代码******************************/
    static int solve(int n, int w, int d, long all) {
        long sum = 0l;
        for (int i = 1; i < n; i++) {
            sum+=i;
        }
        for (int i = 0; i < n; i++) {
            long temp = i*d;
            if (temp + all == sum*w){
                return i;
            }
        }
        return 0;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int n;
        n = Integer.parseInt(in.nextLine().trim());

        int w;
        w = Integer.parseInt(in.nextLine().trim());

        int d;
        d = Integer.parseInt(in.nextLine().trim());

        long all;
        all = Long.parseLong(in.nextLine().trim());

        res = solve(n,w,d,all);
        System.out.println(String.valueOf(res));

    }
}

