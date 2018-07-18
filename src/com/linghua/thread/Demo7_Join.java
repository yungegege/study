package com.linghua.thread;

public class Demo7_Join {
    /**
     * jion(): 当前线程暂停，等待调用join()方法的线程执行后，当前线程在继续
     * @param args
     */
    public static void main(String[] args){
        final Thread t1 = new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println(getName()+"...aaaaaaaaaaaaaaaaaaaaaaa");
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                for(int i=0;i<80;i++){
                    if(i==2){
                        try {
                            t1.join(1);       //参数是毫秒，可以不加参数。t1插队1ms,过了时间后两条线程t1和t2交替执行
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                    }
                    System.out.println(getName()+"...bb");
                }
            }
        };


        t1.start();
        t2.start();
    }
}
