package com.linghua.suanfa;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        Integer b = 1;
        Integer c = new Integer(1);
        Integer d = new Integer(1);
        System.out.println(a==c);
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(c==d);
    }
}
