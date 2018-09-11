package com.linghua.construct.threadPool;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo1_ThreadPoolExecutor {
    public static void main(String[] args) {
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r);
            }
        };
        //使用默认的线程工场
        ThreadPoolExecutor pool = new ThreadPoolExecutor(10,20,10,
                TimeUnit.HOURS,new ArrayBlockingQueue<Runnable>(10),new ThreadPoolExecutor.CallerRunsPolicy());
        final AtomicInteger count = new AtomicInteger();
        for (int i = 0; i < 100; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                    count.getAndIncrement();
                }
            });
        }

        pool.shutdown();
        while (Thread.activeCount()>2){
//            System.out.println(Thread.activeCount()+Thread.currentThread().getName());
        }
//
        System.out.println(count.get());
    }
}
