package com.linghua.threads.syn;

public class Demo1_Synchronized {
    /**
     * synchronized  同步代码块，锁机制
     */
    public static void main(String[] args) {
        final Printer1 p1 = new Printer1();
        new Thread(){
            public void run(){
                while(true){
                    p1.print1();
                }
            }
        }.start();

        new Thread(){
            public void run(){
                while(true){
                    p1.print2();
                }
            }
        }.start();
    }
}


class Printer1{
    String s = new String();
    public void print1(){
        synchronized (s) {                  //锁对象可以是任意的(匿名对象除外)
            System.out.print("李");
            System.out.print("云");
            System.out.print("飞");
            System.out.print("好");
            System.out.print("帅");
            System.out.println("\r\n");
        }
    }
    public void print2(){
        synchronized (s) {
            System.out.print("刘");
            System.out.print("亦");
            System.out.print("菲");
            System.out.print("很");
            System.out.print("美");
            System.out.println("\r\n");
        }
    }
}
