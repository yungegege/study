package com.linghua.suanfa.tujia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baoshu {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a;
        while(cin.hasNextInt())
        {
            a = cin.nextInt();
            System.out.println(yuesefu(a,3));
        }
    }

    public static int yuesefu(int totalNum, int countNum) {
        List<Integer> start = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= totalNum; i++) {
            start.add(i);
        }
        int k = 0;
        while (start.size() > 0) {
            k = k + countNum;
            k = k % (start.size()) - 1;
            if (k < 0) {
                list.add(start.get(start.size() - 1));
                start.remove(start.size() - 1);
                k = 0;
            } else {
                list.add(start.get(k));
                start.remove(k);
            }
        }
        return list.get(list.size()-1);
    }
}
