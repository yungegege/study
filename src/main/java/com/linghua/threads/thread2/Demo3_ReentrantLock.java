package com.linghua.threads.thread2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo3_ReentrantLock {
    /**
     * 互斥锁：ReentrantLock
     * 同步：使用lock()和unlock()方法进行同步。
     * 通信：用newCondition()方法获得Condition对象
     *      等待时候用Condition对象的await()方法，唤醒用signal()方法
     *      不同线程使用不同的condition，就能区分唤醒的时候找哪个线程了
     */
    public static void main(String[] args) {
        //内部类使用变量必须用final
        final Printer3 p = new Printer3();
        new Thread(){
            public void run(){
                while(true){
                    try {
                        p.print1();
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            }
        }.start();

        new Thread(){
            public void run(){
                while(true){
                    try {
                        p.print2();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread(){
            public void run(){
                while(true){
                    try {
                        p.print3();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }
}


class Printer3{
    private int flag = 1;
    private ReentrantLock r = new ReentrantLock();   //互斥锁
    Condition c1 = r.newCondition();        //监视器
    Condition c2 = r.newCondition();
    Condition c3 = r.newCondition();
    public void print1() throws InterruptedException{
        r.lock();
        if (flag!=1){                               //唤醒指定的线程就不用while了
            c1.await();                   //等待
        }
        System.out.print("李");
        System.out.print("云");
        System.out.print("飞");
        System.out.print("先");
        System.out.print("生");
        System.out.print("\r\n");
        flag = 2;
        c2.signal();                 //唤醒指定的线程
        r.unlock();
    }
    public void print2() throws InterruptedException{
        r.lock();
        if (flag!=2){
            c2.await();                     //等待
        }
        System.out.print("");
        System.out.print("");
        System.out.print("");
        System.out.print("小");
        System.out.print("姐");
        System.out.print("\r\n");
        flag = 3;
        c3.signal();                   //唤醒指定的线程
        r.unlock();
    }

    public void print3() throws InterruptedException{
        r.lock();
        if (flag!=3){
            c3.await();                 //等待
        }
        System.out.print("我");
        System.out.print("们");
        System.out.print("结");
        System.out.print("婚");
        System.out.print("吧");
        System.out.println("\r\n");
        flag = 1;
        c1.signal();                   //唤醒指定的线程
        r.unlock();
    }
}

