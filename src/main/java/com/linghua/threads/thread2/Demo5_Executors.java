package com.linghua.threads.thread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo5_Executors {
    /**
     * Executors工厂类产生线程池
     * 1.public static ExecutorService newFixedThreadPool(int nThreads)    多个，数量自选
     * 2.public static ExecutorService newSingleThreadExecutor()           单个
     *
     * 线程池提交任务
     *  Future<?> submit(Runnable task)
     *
     * 关闭线程池
     * void shutdown()
     */
    public static void main(String[] args){
        ExecutorService pool = Executors.newFixedThreadPool(100);   //创建线程池

        for (int i = 0; i < 1000; i++) {
            pool.submit(new MyRunnable());       //提交任务，但不关闭
//        pool.execute(new MyRunnable());
        }


        pool.shutdown();                   //关闭线程池，不关就不结束

//        Executor executor = Executors.newFixedThreadPool(2);   //创建线程池
//        ((ExecutorService) executor).submit(new MyRunnable());
//        executor.execute(new MyRunnable());
//        ((ExecutorService) executor).shutdown();

    }
}


class MyRunnable implements Runnable{
    @Override
    public void run() {
//        for (int i = 0; i < 1000; i++){
            System.out.println(Thread.currentThread().getName() + "......");
//        }
    }
}
