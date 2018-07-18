package com.linghua.thread2;

public class Demo2_NotifyAll {
    /**
     * wait notify
     * 1.在同步代码块中，用哪个对象锁，就用哪个对象调用wait方法
     * 2.wait和notify定义在Object类中，锁对象可以是任意对象
     * 3.sleep和wait：
     *   sleep：必须传入参数，参数是时间，到时间自动醒来。               在同步函数或者同步代码块中释放锁
     *   wait：可以不传可以传，传就是参数的时间结束后等待，不传入参数就是直接等待       在同步函数或者同步代码块中不释放锁
     *
     */
    public static void main(String[] args) {
        //内部类使用变量必须用final
        final Printer2 p = new Printer2();
        new Thread(){
            public void run(){
                while(true){
                    try {
                        p.print1();
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            }
        }.start();

        new Thread(){
            public void run(){
                while(true){
                    try {
                        p.print2();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread(){
            public void run(){
                while(true){
                    try {
                        p.print3();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }

}

class Printer2{
    private int flag = 1;
    public void print1() throws InterruptedException{
        synchronized (this) {                  //同步代码块中，用哪个对象锁，就用哪个对象调用wait方法
            while (flag!=1){                      //注意，这里要用while不能用if
                this.wait();                   //等待
            }
            System.out.print("李");
            System.out.print("云");
            System.out.print("飞");
            System.out.print("先");
            System.out.print("生");
            System.out.print("\r\n");
            flag = 2;
            this.notifyAll();                    //随机唤醒单个等待的线程

        }
    }
    public void print2() throws InterruptedException{
        synchronized (this) {
            while (flag!=2){
                this.wait();                   //等待
            }
            System.out.print("刘");
            System.out.print("亦");
            System.out.print("菲");
            System.out.print("小");
            System.out.print("姐");
            System.out.print("\r\n");
            flag = 3;
            this.notifyAll();                    //随机唤醒单个等待的线程
        }
    }

    public void print3() throws InterruptedException{
        synchronized (this) {
            while (flag!=3){
                this.wait();                   //等待
            }
            System.out.print("我");
            System.out.print("们");
            System.out.print("结");
            System.out.print("婚");
            System.out.print("吧");
            System.out.println("\r\n");
            flag = 1;
            this.notifyAll();                    //随机唤醒单个等待的线程
        }
    }
}
