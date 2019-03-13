package com.linghua.suanfa.tengxun;

import java.util.*;

public class zhongyaocity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr1 = new int[m][2];
        int[][] arr = new int[n][n];

        for(int i = 0; i < m; i++){
            arr1[i][0] = sc.nextInt();
            arr1[i][1] = sc.nextInt();
            int a = arr1[i][0];
            int b = arr1[i][1];
            arr[a-1][b-1]+=1;

        }


        int count=0;
        //便利城市
        for (int i = 0; i < n; i++) {
            int in = 0;
            int out = 0;
            for (int j = 0; j < n; j++) {
                in+=arr[j][i];
            }
            for (int j = 0; j < n; j++) {
                out+=arr[i][j];
            }

            if (in>out){
                count++;
            }
        }

        System.out.println(count);

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }





    }
}
