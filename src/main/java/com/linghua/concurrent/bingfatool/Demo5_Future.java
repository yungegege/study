package com.linghua.concurrent.bingfatool;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Demo5_Future {

    public static void main(String[] args) {
        //Callable 的call方法是被FutureTask的run方法调用的，有返回值
        //runnable 的run方法被线程调用的，无返回值
        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("正在计算结果");
                Thread.sleep(3000);
                return 1;
            }
        });
        Thread r = new Thread(task);
        r.start();
        try {
            Integer a = task.get();
            System.out.println("拿到的结果为、、、"+a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
