package com.linghua.thread;

public class Demo4_Thread {
    public static void main(String[] args){
        // 第一种方式匿名内部类
        // 设置名字两种方式：1.构造函数传入name 2.setName()方法；获取名字：getName()
        // 获取当前线程名字：Thread.currentThread()
        new Thread(){
            public void run(){
                this.setName("老李");
                    System.out.println(this.getName());
            }
        }.start();

        Thread t1 = new Thread(){
            public void run(){
                System.out.println(this.getName());
            }
        };
        t1.setName("云师兄");
        t1.start();


        // 第二种方式匿名内部类
        new Thread(new Runnable(){
            public void run(){
                System.out.println("bbbbbbbbbbbbb");
            }
        }).start();

        new Thread(new Runnable(){
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        System.out.println("ccc");

        Thread.currentThread().setName("主线程");
        System.out.println(Thread.currentThread().getName());
    }

}
