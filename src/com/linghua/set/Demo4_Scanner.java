package com.linghua.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Demo4_Scanner {

    /**
     * 使用scanner从键盘读入一行输入，去除其中重复数据，打印出不同的那些字符
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        String line = sc.nextLine();
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        char[] arr = line.toCharArray();
        for (char c:arr){
            hs.add(c);
        }
        for(Character ch:hs){
            System.out.println(ch);
        }

    }
}
