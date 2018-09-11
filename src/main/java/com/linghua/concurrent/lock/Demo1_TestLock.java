package com.linghua.concurrent.lock;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Demo1_TestLock {
    MyLock myLock = new MyLock();
    private int value;

    public int getNext(){
        myLock.lock();
        value++;
        myLock.unlock();
        return value;
    }

    public void a(){
        myLock.lock();
        System.out.println("a");
        b();
        myLock.unlock();
    }

    public void b(){
        myLock.lock();
        System.out.println("b");
        myLock.unlock();
    }

    public static void main(String[] args) {
        final Demo1_TestLock testLock = new Demo1_TestLock();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    testLock.a();
//                }
//
//            }
//        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getId()+" "+testLock.getNext());

                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getId()+" "+testLock.getNext());

                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getId()+" "+testLock.getNext());
                }

            }
        }).start();

    }

}


class MyLock implements Lock {
    private boolean flag = false;
    private Thread lockBy = null;
    int lockCount = 0;

    @Override
    public synchronized void lock() {
        Thread currentThread = Thread.currentThread();
        if (flag && currentThread!=lockBy){
//            System.out.println(Thread.currentThread().getName()+" "+flag);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = true;
        lockBy = currentThread;
        lockCount++;
    }

    //    一个线程lock结束，还没unlock被别的线程抢占了又继续lock，导致while无限循环
    @Override
    public synchronized void unlock() {
        lockCount--;
        if (lockCount == 0){
            flag = false;
            notify();
        }

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }



    @Override
    public Condition newCondition() {
        return null;
    }
}

