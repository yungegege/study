package com.linghua.concurrent.bingfatool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class Demo6_ForkJoin extends RecursiveTask<Integer> {
    private int begin;
    private int end;
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(3);
        //1加到100
        Future<Integer> future = forkJoinPool.submit(new Demo6_ForkJoin(1,100));
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public Demo6_ForkJoin(int begin,int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        System.out.println(Thread.currentThread().getName());
        int sum = 0;
        //拆分任务
        if (end-begin<=2){
            //计算
            for (int i = begin; i <= end; i++) {
                sum += i;
            }
        }else {
            //拆分
            Demo6_ForkJoin demo1 = new Demo6_ForkJoin(begin,(begin+end)/2);
            Demo6_ForkJoin demo2 = new Demo6_ForkJoin((begin+end)/2+1,end);
            demo1.fork();
            demo2.fork();
            Integer a = demo1.join();
            Integer b = demo2.join();
            sum=a+b;
        }
        return sum;
    }
}
