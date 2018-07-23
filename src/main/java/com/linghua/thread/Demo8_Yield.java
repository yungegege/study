package com.linghua.thread;

public class Demo8_Yield {
    /**
     * public static native void yield(): 让出cpu，礼让线程
     */
    public static void main(String[] args){
        new Thread(){
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println(getName()+"...aaaaaaaaaaaaaaaaaaa");
                }
            }
        }.start();

        new Thread(){
            public void run(){
                for(int i=0;i<100;i++){
                    if(i%10==0){
                        Thread.yield();
                    }
                    System.out.println(getName()+"...bb");
                }
            }
        }.start();



    }

}
