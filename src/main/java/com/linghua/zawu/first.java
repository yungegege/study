package com.linghua.zawu;

public class first {


    public void print(){
        synchronized (this){
            System.out.print("你");
            System.out.println("好");
        }
    }
    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 0; i++) {
            System.out.println(1111111);
        }
//        final first f = new first();
//        new Thread(){
//            @Override
//            public void run() {
//                while (true){
//                    f.print();
//                }
//            }
//        }.start();
//
//        new Thread(){
//            @Override
//            public void run() {
//                while (true){
//                    f.print();
//                }
//            }
//        }.start();


    }
}
