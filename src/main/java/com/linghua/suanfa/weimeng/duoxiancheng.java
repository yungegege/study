package com.linghua.suanfa.weimeng;

import java.util.concurrent.atomic.AtomicInteger;

public class duoxiancheng {
    private static AtomicInteger j = new AtomicInteger();
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int k = 0; k < 10000; k++) {
                        j.getAndIncrement();
                    }
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int k = 0; k < 10000; k++) {
                        j.getAndDecrement();
                    }
                }
            }).start();
        }


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(j);

    }
}
