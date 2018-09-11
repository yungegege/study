package com.linghua.concurrent.bingfatool;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Demo2_CyclicBarrier {

    Random random = new Random();

    private void meeting(CyclicBarrier cyclicBarrier){

        try {
            Thread.sleep(random.nextInt(4000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"到达会议室，开始等待");
        try {
            cyclicBarrier.await();   //await()
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("发言");
    }
    public static void main(String[] args) {
        final Demo2_CyclicBarrier demo2 = new Demo2_CyclicBarrier();

        //10个线程才能减到0，如有一个线程没执行await，所有人都会等着，没法开会
        final CyclicBarrier barrier = new CyclicBarrier(10, new Runnable() {
            @Override
            public void run() {
                System.out.println("开始开会");
            }
        });

        for (int i = 0; i < 10  ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    demo2.meeting(barrier);
                }
            }).start();
        }

    }
}
