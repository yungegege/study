package com.linghua.suanfa.bianlifeng;


import java.util.*;

public class zuhe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int m = Integer.parseInt(line.split(",")[0]);
        int n = Integer.parseInt(line.split(",")[1]);

        ArrayList<ArrayList<Integer>> alllist = new ArrayList<>();
        for (int i = 1; i < n - m + 2; i++) {
            for (int j = m-1; j <= n-i; j++) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                pialie(m - 1, j, list,alllist);

            }
        }

        System.out.print("[");
        for (int i = 0; i < alllist.size(); i++) {
            System.out.print("[");
            for (int j = 0; j < alllist.get(i).size(); j++) {
                if (j < alllist.get(i).size() - 1) {
                    System.out.print(alllist.get(i).get(j) + ",");
                } else {
                    System.out.print(alllist.get(i).get(j));

                }
            }
            System.out.print("]");

            if (i < alllist.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");

    }

    private static void pialie(int m, int n, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> allList) {
        if (m == 1) {
            list.add(n);
            allList.add(list);

        }else {
            for (int i = 1; i < n - m + 2; i++) {
                ArrayList<Integer> list1 = new ArrayList<>();
                list1.addAll(list);
                list1.add(i);
                pialie(m - 1, n - i, list1,allList);
            }
        }
    }
}
