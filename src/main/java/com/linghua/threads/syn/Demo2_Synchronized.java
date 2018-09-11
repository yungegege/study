package com.linghua.threads.syn;

public class Demo2_Synchronized {
    /**
     * synchronized  同步方法，方法前加synchronized关键字即可
     */
    public static void main(String[] args) {
        final Printer2 p2 = new Printer2();
        new Thread(){
            public void run(){
                while(true){
                    p2.lalala1();
                }
            }
        }.start();

        new Thread(){
            public void run(){
                while(true){
                    p2.lalala2();
                }
            }
        }.start();
    }
}


class Printer2{
    //非静态的同步方法锁对象是：this
    public synchronized void print1(){
        System.out.print("李");
        System.out.print("云");
        System.out.print("飞");
        System.out.print("真");
        System.out.print("帅");
        System.out.print("啊");
        System.out.println("\r\n");
    }
    public void print2(){
        synchronized (this) {
            System.out.print("刘");
            System.out.print("亦");
            System.out.print("菲");
            System.out.print("好");
            System.out.print("美");
            System.out.println("\r\n");
        }
    }


    //静态的同步方法锁对象是该类的字节码对象: Printer2.class
    public static synchronized void lalala1(){
        System.out.print("李");
        System.out.print("云");
        System.out.print("飞");
        System.out.print("巨");
        System.out.print("帅");
        System.out.println("\r\n");
    }
    public static void lalala2(){
        synchronized (Printer2.class) {
            System.out.print("刘");
            System.out.print("亦");
            System.out.print("菲");
            System.out.println("\r\n");
        }
    }
}
