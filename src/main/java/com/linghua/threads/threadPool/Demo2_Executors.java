package com.linghua.threads.threadPool;

import java.io.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public class Demo2_Executors {
    public static void main(String[] args) {

        InputStream is = null;
        Reader r = null;
        OutputStream os = null;
        BufferedReader fr = null;
        try {
            is = new FileInputStream("111.txt");
            fr = new BufferedReader(new InputStreamReader(is));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer))!=-1){
                os.write(buffer,0,len);
            };

        } catch (Exception e) {
            e.printStackTrace();
        }



        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r);
            }
        };
//        ExecutorService pool1 = Executors.newFixedThreadPool(10,threadFactory);
//        ExecutorService pool2 = Executors.newCachedThreadPool(threadFactory);
//        ExecutorService pool3 = Executors.newSingleThreadExecutor(threadFactory);
        ScheduledExecutorService pool4 = Executors.newScheduledThreadPool(10,threadFactory);
//        ExecutorService pool5 = Executors.newWorkStealingPool();

        while (true){
            //submit有返回值，并且可以提交Callable<T> task
            pool4.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }

//        while (true){
//            pool4.schedule(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Thread.currentThread().getName());
//                }
//            },5,TimeUnit.SECONDS);
//        }


    }
}
