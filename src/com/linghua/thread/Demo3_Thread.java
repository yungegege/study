package com.linghua.thread;

public class Demo3_Thread {
    /**
     * 开启线程的两种方式
     * 2.定义一个类实现Runnable，然后重写run(要执行的代码写进去)，把这个类当参数传给Thread然后start
     * Thread类的run方法，用第一种方式就是重写Thread的run方法，然后start直接调用run方法
     * 第二种方式则是重写Runnable的run方法，给用Thread(Runnable target)构造方法后给target赋值，然后thread的run方法调用Runnable的run方法
     *
     * Thread的构造方法：
     * public Thread(Runnable target) {
            init(null, target, "Thread-" + nextThreadNum(), 0);
       }
     * Thread的run()方法：
     * @Override
        public void run() {
            if (target != null) {
                target.run();
            }
        }
     */

    public static void main(String[] args){
        MyRunnable mt = new MyRunnable();
        Thread t = new Thread(mt);
        t.start();

        for(int i=0;i<1000;i++){
            System.out.println("bb");
        }
    }
}


//继承Thread类并重写run方法
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("aaaaaaaaaaaaaaaaaaaaa");
        }
    }
}