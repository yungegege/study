package com.linghua.zawu;

public class Chongru {
    public synchronized void a(){
        System.out.println("aaaaaaa");
        b();
    }


    public synchronized void b(){
        System.out.println("bbbbbbb");
    }

    public static void main(String[] args) {
        Chongru chongru = new Chongru();
        chongru.a();
    }
}
