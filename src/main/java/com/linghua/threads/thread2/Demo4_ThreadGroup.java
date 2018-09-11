package com.linghua.threads.thread2;

public class Demo4_ThreadGroup {
    public static void main(String[] args){
        MyThread t1 = new MyThread("张三");
        MyThread t2 = new MyThread("张三");

        ThreadGroup g1 = t1.getThreadGroup();
        ThreadGroup g2 = t2.getThreadGroup();

        System.out.println(g1.getName());      //默认线程组都是主线程
        System.out.println(g2.getName());


        ThreadGroup tg1 = new ThreadGroup("新的线程组");
        ThreadGroup tg2 = new ThreadGroup(tg1,"新的线程组2");
        MyThread t3 = new MyThread(tg2,"张三");
        MyThread t4 = new MyThread(tg2,"李四");
        System.out.println(t3.getThreadGroup().getParent().getName());
        System.out.println(t4.getThreadGroup().getName());

        tg1.setDaemon(true);    //整个组设置

    }
}


class MyThread extends Thread{

    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group,name);
    }

    @Override
    public void run() {
        for(int i = 0;i<1000;i++){
            System.out.println(getName()+"......"+i);
        }
    }
}

