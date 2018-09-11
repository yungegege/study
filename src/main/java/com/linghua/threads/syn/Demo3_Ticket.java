package com.linghua.threads.syn;

public class Demo3_Ticket {
    /**
     * 需求：铁路售票，一共一百张，通过四个窗口卖完
     */
    public static void main(String[] args) {
        new Ticket().start();
        new Ticket().start();
        new Ticket().start();
        new Ticket().start();

    }
}

class Ticket extends Thread{
    private static int ticket = 100;
    private static Object obj = new Object();   //因为每个对象都有自己的成员变量,必须是静态的才行
    public void run(){

        while(true){
            synchronized(Ticket.class){         //四个不同的对象，不能用this和非静态的obj   要用字节码文件Ticket.class
                if(ticket<=0){
                    break;
                }
                try {
                    Thread.sleep(10);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(getName()+"这是第"+ticket--+"号票");
            }

        }
    }
}
