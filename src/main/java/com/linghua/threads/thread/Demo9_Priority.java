package com.linghua.threads.thread;

public class Demo9_Priority {
    /**
     * public final void setPriority(int newPriority): 设置线程优先级
     */
    public static void main(String[] args){
        Thread t1 = new Thread(){
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println(getName()+"...aaaaaaaaaaaaaaaaaaa");
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println(getName()+"...bbb");
                }
            }
        };

        t1.setPriority(Thread.MAX_PRIORITY);       //最大优先级:10    public final static int MAX_PRIORITY = 10;
        t2.setPriority(Thread.MIN_PRIORITY);       //最小优先级:1     public final static int MIN_PRIORITY = 1;

        t1.start();
        t2.start();





    }
}
