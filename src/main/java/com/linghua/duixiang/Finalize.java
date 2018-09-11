package com.linghua.duixiang;

public class Finalize {
    public static Finalize f = null;
    public void isAlive(){
        System.out.println("yes，i am still alive :)");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executes!");
        Finalize.f = this;
    }

    public static void main(String[] args) {
        f = new Finalize();

        //成功拯救自己
        f = null;
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (f!=null){
            f.isAlive();
        }else {
            System.out.println("no,i am dead :(");
        }

        //与上面代码相同，但拯救失败
        f = null;
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (f!=null){
            f.isAlive();
        }else {
            System.out.println("no,i am dead :(");
        }
    }
}
