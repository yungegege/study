package com.linghua.suanfa.weimeng;

import java.util.Scanner;

public class dashuxiangjia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            String line = in.nextLine();
            String a = line.split(":")[0];
            String b = line.split(":")[1];
            String re = add(a, b);
            System.out.println(re);
        }
    }

    public static String add(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int x;
        int y;
        int pre = 0;//进位
        int sum = 0;//存储进位和另两个位的和

        if (a.length()>b.length()){
            for (int i = 0; i < a.length() - b.length(); i++) {
                b = "0"+b;
            }
        }else {
            for (int i = 0; i < b.length() - a.length(); i++) {
                a = "0"+a;
            }
        }


        for (int i = a.length() - 1; i >= 0; i--) {
            x = a.charAt(i) - '0';
            y = b.charAt(i) - '0';
            sum = x + y + pre;//从低位做加法
            if (sum >= 10 ) {
                pre = 1;//进位
                sb.append(sum - 10);
            } else {
                pre = 0;
                sb.append(sum);
            }
        }
        if (pre == 1) {
            sb.append("1");
        }
        return sb.reverse().toString();//翻转返回
    }
}
