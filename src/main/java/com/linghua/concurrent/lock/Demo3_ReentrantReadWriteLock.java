package com.linghua.concurrent.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Demo3_ReentrantReadWriteLock {
    private int balance;

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read(){
        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
        int a = balance;
        System.out.println(a);
//        readLock.unlock();
    }

    public void write(){
        ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();
        balance+=1;
        System.out.println(balance);
        writeLock.unlock();
    }

    public static void main(String[] args) {
        final Demo4_StampedLock demo = new Demo4_StampedLock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    demo.write();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    demo.read();
                }
            }
        }).start();
    }
}
