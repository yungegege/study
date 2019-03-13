package com.linghua.suanfa.duxiaoman;

import java.util.Scanner;

public class lianshibianquan {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = Integer.parseInt(cin.nextLine());
        String line = cin.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line.split(" ")[i]);
        }
        int[] b = new int[n-1];
        for (int i = 0; i < n - 1; i++) {
            int count = 0;

            int[] left = new int[i+1];
            int[] right = new int[n-i-2];
            for (int j = 0; j < i + 1; j++) {
                left[j] = arr[j];
            }
            for (int j = i+2; j < n; j++) {
                right[j-i-2] = arr[j];
            }
            System.out.println(left.length);
            System.out.println(right.length);
            for (int j = 0; j < left.length; j++) {
                for (int k = 0; k < right.length; k++) {
                    if (left[j]!=right[k]){
                        count++;
                    }
                }
            }

            b[i] = count;
        }

        for (int i = 0; i < b.length-1; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println(b[b.length-1]);
    }
}

//for (int i = 0; i < n - 1; i++) {
//        int count = 0;
//
//        int[] left = new int[i+1];
//        int[] right = new int[n-i-1];
//        for (int j = 0; j < i + 1; j++) {
//        left[j] = arr[j];
//        }
//        for (int j = 0; j < n - i - 1; j++) {
//        right[j] = arr[i+j+1];
//        }
//        for (int j = 0; j < left.length; j++) {
//        for (int k = 0; k < right.length; k++) {
//        if (left[j]!=right[k]){
//        count++;
//        }
//        }
//        }
//
//        b[i] = count;
//        }