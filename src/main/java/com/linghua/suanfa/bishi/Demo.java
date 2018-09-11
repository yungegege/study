package com.linghua.suanfa.bishi;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();

        String str = String.valueOf(a/b).split("\\.")[1];

        if(str.length() < 16){
            System.out.println(str.length() + " 0");
            return;
        }

        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j < str.length(); j++){
                if(j + i < str.length()){
                    int t = 0, num = 0;
                    String tep = str.substring(i, j);
                    t = str.indexOf(tep);
                    num = str.lastIndexOf(tep);
                    if(t != num && t >= 0 && num >= 0){
                        System.out.println(t + " " + tep.length());
                        return ;
                    }
                }
            }
        }
    }
}