package com.linghua.suanfa.qunaer;

import java.util.Scanner;

public class maxzishuzu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            if(line==null){
                System.out.println();
                return;
            }
            String[] arr = line.split(" ");
            int[] dp = new int[arr.length+1];
            for (int i = 0; i < arr.length; i++) {
                dp[i+1] = dp[i]>0?dp[i]+Integer.parseInt(arr[i]):Integer.parseInt(arr[i]);
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
