package com.linghua.suanfa.yixin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class Test {
}

public class eyiwangzhan {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, m, k;
        while (in.hasNext()) {
            String str = in.nextLine();
            n = Integer.parseInt(str.split(" ")[0]);
            m = Integer.parseInt(str.split(" ")[1]);
            k = Integer.parseInt(str.split(" ")[2]);
            //第一列网站  第二列关键词
            String[][] arr1 = new String[m][2];
            String[] word = new String[n];
            HashSet<String> set = new HashSet<>();
            String line1 = in.nextLine();
            word = line1.split(" ");
            for (int i = 0; i < n; i++) {
                set.add(word[i]);
            }
            for (int i = 0; i < m; i++) {
                arr1[i][0] = in.nextLine();
                arr1[i][1] = in.nextLine();

            }

            ArrayList<String> url = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                int count = 0;
                String[] arr = arr1[i][1].split(" ");
                for (int j = 0; j < arr.length; j++) {

                    for (String aaa : set) {
                        if (arr[j].equals(aaa)){
                            count++;
                        }
                    }
                }

                if (count>=k){
                    for (int j = 0; j < arr.length; j++) {
                        set.add(arr[j]);
                    }
                    url.add(arr1[i][0]);
                }

            }

            for (int i = 0; i < url.size(); i++) {
                System.out.println(url.get(i));
            }



        }
    }
}