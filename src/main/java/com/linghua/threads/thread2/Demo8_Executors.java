package com.linghua.threads.thread2;

import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo8_Executors {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());



        Executors.newCachedThreadPool();        //创建一个缓冲池，缓冲池容量大小为Integer.MAX_VALUE
        Executors.newSingleThreadExecutor();   //创建容量为1的缓冲池
        Executors.newFixedThreadPool(5);    //创建固定容量大小的缓冲池
        Executors.newScheduledThreadPool(5);//创建一个具有指定线程数的线程池，它可以在指定延迟后执行线程任务。
                                                        //也就是说：是一个能够实现定时和周期性任务的线程池。

    }

}
