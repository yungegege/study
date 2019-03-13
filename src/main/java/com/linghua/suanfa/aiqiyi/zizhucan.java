package com.linghua.suanfa.aiqiyi;

import java.util.Scanner;

public class zizhucan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n+1];
        arr[0] = 1l;
        arr[1] = 2l;
        for (int i = 2; i < n + 1; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println(arr[n]);

    }
}
