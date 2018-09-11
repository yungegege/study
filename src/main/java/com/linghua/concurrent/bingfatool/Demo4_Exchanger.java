package com.linghua.concurrent.bingfatool;

import java.util.concurrent.Exchanger;

public class Demo4_Exchanger {

    private void a(Exchanger<String> exch){
        System.out.println("a 方法执行>>>");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String res = "12345";

        try {
            System.out.println("等待对比结果。。");
            exch.exchange(res);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void b(Exchanger<String> exch){
        System.out.println("b 方法开始执行");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String res = "12345";
        try {
            String value = exch.exchange(res);
            System.out.println("比对结果："+value.equals(res));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final Demo4_Exchanger demo4 = new Demo4_Exchanger();
        final Exchanger<String> exch = new Exchanger<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo4.a(exch);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo4.b(exch);
            }
        }).start();
    }
}
