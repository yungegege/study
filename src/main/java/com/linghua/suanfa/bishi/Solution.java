package com.linghua.suanfa.bishi;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            long a = in.nextLong();
            int count = 0;
            long x = 1L;
            while (x != 0)
            {
                if ((a & x) != 0)
                {
                    count++;
                }
                x <<= 1;
            }
            System.out.println(count);
        }
    }
}
