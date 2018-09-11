package com.linghua.concurrent.bingfatool;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Demo1_CountDownLatch {

    private int[] nums;

    public Demo1_CountDownLatch(int line){
        nums = new int[line];
    }

    public void calc(String line,int i,CountDownLatch latch){
        String[] a = line.split(",");
        int total = 0;
        for (String num:a) {
            total+=Integer.parseInt(num);
        }
        nums[i] = total;
        try {
            Random random = new Random();
            Thread.sleep(random.nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"开始执行计算任务。。。"+line);
        latch.countDown();
    }

    private int sum() {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        System.out.println("总和为"+sum);
        return sum;
    }

    public static void main(String[] args) {
        final String[] arr = new String[]{
                "1,2,3,4",
                "2,3,4,5",
                "3,4,5,6"
        };

        final Demo1_CountDownLatch demo1 = new Demo1_CountDownLatch(arr.length);
        final CountDownLatch latch = new CountDownLatch(arr.length);
        for (int i = 0; i < arr.length; i++) {
            final int j = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    demo1.calc(arr[j],j,latch);
                }
            }).start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        demo1.sum();


    }


}
