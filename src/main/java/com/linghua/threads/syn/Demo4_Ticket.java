package com.linghua.threads.syn;

public class Demo4_Ticket {

    /**
     * 需求：铁路售票，一共一百张，通过四个窗口卖完
     */
    public static void main(String[] args) {
        Ticket1 t = new Ticket1();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }
}


class Ticket1 implements Runnable{
    private static int ticket = 100;
    private Object obj = new Object();           //这里就不用静态的了，因为只创建一个Runnable子类对象传给Thread
    public void run(){
        while(true){
            synchronized(this){         //可以用obj和this
                if(ticket<=0){
                    break;
                }
                try {
                    Thread.sleep(10);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"这是第"+ticket--+"号票");  //获取当前对象在getName()
            }

        }
    }
}
