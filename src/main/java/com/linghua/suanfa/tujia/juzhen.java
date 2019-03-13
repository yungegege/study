package com.linghua.suanfa.tujia;

import java.util.Scanner;

public class juzhen {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] rect = new int[n + 1][n + 1];

        int x = 0, y = 1;
        int px = 1, py = 0;
        int pn = n;
        int sum = n;
        for (int i = 1; i <= n * n; i++) {

            x += px;
            y += py;
            rect[x][y] = i;
            if (i == sum) {
                if (px == 1 || px == -1) {
                    pn = pn - 1;
                    sum = sum + pn;
                    py = px;
                    px = 0;
                } else {
                    sum = sum + pn;
                    px = -py;
                    py = 0;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n*n+1-rect[j][i] + " ");
            }
            System.out.println();
        }
    }
}
