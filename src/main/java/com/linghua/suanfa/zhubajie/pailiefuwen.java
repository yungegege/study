package com.linghua.suanfa.zhubajie;

import java.util.ArrayList;
import java.util.Scanner;

public class pailiefuwen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String line1 = in.nextLine();
            int m = Integer.parseInt(line1.split(" ")[0]);
            int n = Integer.parseInt(line1.split(" ")[1]);
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                list.add(x);
            }
            int sum = 0;
            for (int i = 0; i < m; i++) {
                int index = 0;
                int temp = (list.get(0)-list.get(1))*(list.get(0)-list.get(1));
                for (int j = 0; j < list.size() - 2; j++) {
                    int chapingfang = (list.get(j)-list.get(j+1))*(list.get(j)-list.get(j+1));
                    if (chapingfang<temp){
                        temp = chapingfang;
                        index = j;
                    }
                    sum+=temp;
                }
                list.remove(index);
                list.remove(index);
                list.remove(list.size()-1);

            }
            System.out.println(sum);

        }
    }
}
//1 8 10 16 19 22 27 33 36 40 47 52 56 61 63 71 72 75 81 81 84 88 96 98 103 110 113 118 124 128 129 134 134 139 148 157 157 160 162 164