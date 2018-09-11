package com.linghua.zawu;

public class Demo1_final {
    private Demo1_final demo;
    final private int a;
    private int b;

    public Demo1_final(){
        a=10;
        b=20;
    }

    public void write(){
        demo = new Demo1_final();
    }

    public void read(){
        Demo1_final d = demo;
        int t1 = d.a;
        System.out.println("a="+t1);
        int t2 = d.b;
        System.out.println("b="+t2);
    }

    public static void main(String[] args) {
        Demo1_final demo1_final = new Demo1_final();
        demo1_final.write();
        demo1_final.read();
    }
}
