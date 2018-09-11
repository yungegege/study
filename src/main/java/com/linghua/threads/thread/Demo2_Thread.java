package com.linghua.threads.thread;

public class Demo2_Thread {
    /**
     * 开启线程的两种方式
     * 1.定义一个类继承Thread，然后重写run(要执行的代码写进去)，然后用start开启线程
     */

    public static void main(String[] args){
        MyThread mt = new MyThread();        //创建Thread类的子类对象
        mt.start();                          //重写run(要执行的代码)，用start开启线程

        for(int i=0;i<1000;i++){
            System.out.println("bb");
        }
    }
}

//继承Thread类并重写run方法
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("aaaaaaaaaaaaaaaaaaaaa");
        }
    }
}
