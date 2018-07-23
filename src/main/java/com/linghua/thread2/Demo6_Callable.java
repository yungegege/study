package com.linghua.thread2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo6_Callable {
    /**
     * 第三种创建线程的方式
     * 实现Callable接口，重写call()方法，能抛异常
     * 线程池 <T> Future<T> submit(Callable<T> task) 这个方法可以提交任务执行。
     * 并且返回Future对象，用这个对象的get()方法能获取到call方法的返回值
     *
     */
    public static void main(String[] args){
        ExecutorService pool = Executors.newFixedThreadPool(2);   //创建线程池

        Future f1 = pool.submit(new MyCallable(100));       //提交任务，但不关闭
        Future f2 = pool.submit(new MyCallable(1000));

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
        }catch (Exception e){
            e.printStackTrace();
        }

        pool.shutdown();                   //关闭线程池，不关就不介绍

    }

}

class MyCallable implements Callable<Integer> {
    private int num;
    public MyCallable(int num){
        this.num = num;
    }

    @Override
    public Integer call() throws Exception{             //跟前两种不同的是能抛异常
        int sum = 0;
        for(int i=0;i<num;i++){
            sum+=i;
        }
        return sum;

    }
}
