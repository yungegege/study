package com.linghua.threads.thread;

public class Demo5_Sleep {
    public static void main(String[] args) throws InterruptedException{
        new Thread(){
            public void run(){
                for(int i=0;i<=10;i++){
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println(this.getName()+"...aaaaaaaaaaaaaa");
                }
            }
        }.start();

        new Thread(){
            public void run(){
                for(int i=0;i<=10;i++){
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println(this.getName()+"...bb");
                }
            }
        }.start();


//        for(int i=20;i>=0;i--){
//            Thread.sleep(1000);             //单位毫秒
//            System.out.println("倒计时"+i+"秒");
//        }

    }
}
