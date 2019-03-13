package com.linghua.suanfa.duxiaoman;

import java.util.Scanner;

public class xiaoyouxi {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int l;
        while (cin.hasNextInt()) {
            l = cin.nextInt();
            for (int i = 0; i < l; i++) {
                int a = cin.nextInt();
                int b = cin.nextInt();
                int n = cin.nextInt();
                int sum = (int) Math.pow(a, b);
                if (sum >= n) {
                    System.out.println("A");
                    break;
                }
                boolean flag = false;
                int nnn = 0;
                while ((int) Math.pow(a, b) < n) {
                    if ((int) Math.pow(a + 1, b) < n || (int) Math.pow(a, b + 1) < n) {
                        flag = !flag;
                        if ((int) Math.pow(a + 1, b) < n) {
                            a++;
                        } else {
                            b++;
                        }

                    }else {
                        break;
                    }
                    nnn++;
                    if (nnn>100){
                        System.out.println("A&B");
                        break;
                    }

                }
                if (nnn<100){
                    if (flag) {
                        System.out.println("B");
                    } else {
                        System.out.println("A");
                    }

                }

            }


        }
    }

}
