package com.linghua.threads.thread;

public class Demo1_Thread {
    /**
     * 证明jvm是多线程的
     */
    public static void main(String[] args){
        for(int i =0;i<1000000;i++){
            new Demo();
        }

        for(int i=0;i<1000000;i++){
            System.out.println("主线程");
        }


    }
}

class Demo{
    @Override
    public void finalize(){
        System.out.println("清扫垃圾");
    }

}
