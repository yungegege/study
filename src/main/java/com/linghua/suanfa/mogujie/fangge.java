package com.linghua.suanfa.mogujie;

import java.util.Scanner;

public class fangge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            int b = in.nextInt();
            int[][] arr = new int[a+1][b+1];
            for (int i = 0; i < a+1; i++) {
                arr[i][0] = 1;
            }
            for (int i = 0; i < b+1; i++) {
                arr[0][i] = 1;
            }
            for (int i = 1; i < a+1; i++) {
                for (int j = 1; j < b+1; j++) {
                    arr[i][j] = arr[i-1][j]+arr[i][j-1];
                }
            }
            System.out.println(arr[a][b]);
        }
    }
}
