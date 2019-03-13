package com.linghua.suanfa.liulishuo;

import java.util.*;

public class lianxuzishuzu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] dp = new int[arr.length+1];
            for (int i = 0; i < arr.length; i++) {
                dp[i+1] = dp[i]>0?dp[i]+arr[i]:arr[i];
            }
            int max = dp[1];
            for (int i = 1; i < dp.length; i++) {
                if (max<dp[i]){
                    max = dp[i];
                }
            }
            System.out.println(max);
        }
    }
}
