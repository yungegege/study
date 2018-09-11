package com.linghua.suanfa.niuke;

import java.util.Scanner;
import java.util.Stack;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            Stack s = new Stack();
            String a = in.nextLine();
            String b = in.nextLine();
            String output = search(a,b);
            System.out.println(output.length());
        }
    }

    public static String search(String s1,String s2)
    {
        String sameString = "";
        if (s1.length() < s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        boolean isContains = s1.contains(s2);

        if (isContains) {
            return s2;
        } else {
            boolean b1 = false;
            for (int i = 0; i < s2.length(); i++) {
                for (int j = 0; j <= i; j++) {
                    String str = s2.substring(j, s2.length() - i + j);
                    if (s1.contains(str)) {
                        sameString = str;
                        b1 = true;
                        break;
                    }

                }
                if (s2.substring(0, s2.length() - i).length() == 2) {
                    b1 = true;
                    break;

                }
                if (b1 == true)
                    break;
            }
        }
        return sameString;
    }
}
