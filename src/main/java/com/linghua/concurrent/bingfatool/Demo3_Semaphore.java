package com.linghua.concurrent.bingfatool;

import java.util.concurrent.Semaphore;

public class Demo3_Semaphore {

    private void method(Semaphore semaphore){
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"is run...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        semaphore.release();
    }

    public static void main(String[] args) {
        final Demo3_Semaphore demo3 = new Demo3_Semaphore();
        //同时只能有10个线程运行，跟大小为10的线程池类似。
        //区别是：线程池只创建了10个线程，线程执行完一个任务就执行下一个，Semaphore是很多线程只能同时有10个线程执行，线程执行完换别的线程继续执行
        final Semaphore semaphore = new Semaphore(10);
        while (true){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    demo3.method(semaphore);
                }
            }).start();
        }
    }
}
