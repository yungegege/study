package com.linghua.suanfa.a360;

import java.util.Scanner;

public class bit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        while (sc.hasNextInt()) {
            a = sc.nextInt();
            int[][] arr = new int[a][3];
            for (int i = 0; i < a; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
                arr[i][2] = sc.nextInt();
            }

            for (int i = 0; i < a; i++) {
                int max = 0;
                int shu = 0;
                int re = 0;

                int start = arr[i][1];
                int end = arr[i][2];
                int jinzhi = arr[i][0];
                for (int j = start; j <= end; j++) {
                    shu = tonjinzhi(jinzhi,j);
                    if (max < count(jinzhi,shu)){
                        max = count(jinzhi,shu);
                        re = j;
                    }
                }
                System.out.println(re);

            }

        }
    }

    public static int count(int k,int n){
        String kkk = String.valueOf(k-1);
        String str = String.valueOf(n);
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (kkk.equals(String.valueOf(str.charAt(i)))){
                count++;
            }
        }
        return count;
    }

    public static int tonjinzhi(int n,int num){
        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.append(num%n);
            num/=n;
        }
        return Integer.parseInt(sb.reverse().toString());
    }

//    public static int tonjinzhi(int n,int num){
//        StringBuilder sb = new StringBuilder();
//        sb.append(num/n);
//        sb.append(num%n);
//        return Integer.parseInt(sb.toString());
//    }
}
