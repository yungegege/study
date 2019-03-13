package com.linghua.threads.threadPool;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo3_ScheduledThreadPoolExecutor {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(10);
        System.out.println("start");

        //执行时间：第2秒开始执行，然后执行完方法停顿一秒，继续执行方法，执行完再停顿一秒。。。
        pool.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(11);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },2,1,TimeUnit.SECONDS);


        //执行时间：2，2+1*1，2+2*1，2+2*1秒以此类推
        //但当方法执行时间超过一秒时候，比如说执行2秒，那么执行时间就是2，4，6... ...
//        pool.scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    System.out.println(11);
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        },2,1,TimeUnit.SECONDS);

    }
}
