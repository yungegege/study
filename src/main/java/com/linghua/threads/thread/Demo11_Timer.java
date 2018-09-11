package com.linghua.threads.thread;

import java.io.IOException;
import java.util.*;

public class Demo11_Timer {
    /**
     * 第一个参数是安排的任务，第二个执行时间（月份要减去1），第三个是过这么多毫秒在执行一次
     * public void schedule(TimerTask task, Date time)
     * public void schedule(TimerTask task, Date firstTime, long period)
     */
    public static void main(String[] args) throws IOException {
        Timer t = new Timer();

//        t.schedule(new MyTimerTask(),new Date(118,4,15,20,14,20),1000);
        t.schedule(new MyTimerTask(),0,2000);

//        try {
//            while (true){
//                Thread.sleep(1000);
//                System.out.println(new Date());
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }


//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        list.parallelStream().mapToInt(i -> i*2).sum();


    }
}

class MyTimerTask extends TimerTask{
    @Override
    public void run(){
        System.out.println("贪玩蓝月搞起");

    }
}
