package com.linghua.concurrent.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo1_Atomic {
    private AtomicInteger a = new AtomicInteger(1);

    private int b;

    private int getAtomicIntegerNext() {
        return a.incrementAndGet();
    }

    private int getIntNext(){
        return b++;
    }

    public static void main(String[] args) {
        final Demo1_Atomic demo1 = new Demo1_Atomic();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println(Thread.currentThread().getName()+" "+demo1.getIntNext());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println(Thread.currentThread().getName()+" "+demo1.getIntNext());
                    try {
                        Thread.sleep(19);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();

    }


}
