package com.linghua.threads.syn;

public class Demo5_DeadLock {

    /**
     * 同步代码块最好不要嵌套，因为拿到某个资源不放又去抢别的资源容易形成死锁
     */
    private static String s1 = "贪玩";
    private static String s2 = "蓝月";
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                while (true){
                    synchronized (s1){
                        System.out.println(getName()+"获取"+s1+"等待"+s2);
                        synchronized (s2){
                            System.out.println(getName()+"拿到"+s2+"开玩");
                        }
                    }
                }
            }
        }.start();

        new Thread(){
            public void run(){
                while (true){
                    synchronized (s2){
                        System.out.println(getName()+"获取"+s2+"等待"+s1);
                        synchronized (s1){
                            System.out.println(getName()+"拿到"+s1+"开始玩");
                        }
                    }
                }
            }
        }.start();
    }
}
