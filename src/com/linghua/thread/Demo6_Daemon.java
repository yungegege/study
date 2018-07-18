package com.linghua.thread;

public class Demo6_Daemon {
    /**
     * public final void setDaemon(boolean on): 当设置为守护线程，当别的线程都停了，这个立马停，不运行了
     */
    public static void main(String[] args){
        Thread t1 = new Thread(){
            public void run(){
                for(int i=0;i<2;i++){
                    System.out.println(getName()+"...aaaaaaaaaaaaaaaaaaaaaaa");
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                for(int i=0;i<80;i++){
                    System.out.println(getName()+"...bb");
                }
            }
        };

        t2.setDaemon(true);            //传入true就是设置为守护线程
        t1.start();
        t2.start();
    }

}
