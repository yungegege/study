package com.linghua.suanfa.weipinhui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        while (sc.hasNext()) {
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                    list.add(arr[i][j]);
                }
            }

            Collections.sort(list);
            System.out.println(list.get(k-1));


        }
    }
}
