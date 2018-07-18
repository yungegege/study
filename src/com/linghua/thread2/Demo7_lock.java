package com.linghua.thread2;

import java.util.concurrent.locks.ReentrantLock;

public class Demo7_lock {
    public static void main(String[] args){
        final ReentrantLock reentrantLock = new ReentrantLock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                    reentrantLock.lock();
                    System.out.println("Hello World1");
                    reentrantLock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLock.lock();
                try {
                    Thread.sleep(1000);
                    System.out.println("Hello World2");
                    reentrantLock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
