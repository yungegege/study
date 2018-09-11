package com.linghua.concurrent.lock;

import java.util.concurrent.locks.StampedLock;

public class Demo4_StampedLock {

    private int balance;

    private StampedLock stampedLock = new StampedLock();

    public void read(){
        long stamp = stampedLock.readLock();
        int a = balance;
//        System.out.println(a);
        stampedLock.unlockRead(stamp);
    }

    public void write(){
        long stamp = stampedLock.writeLock();
        balance+=1;
        System.out.println(balance);
        stampedLock.unlockWrite(stamp);
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
