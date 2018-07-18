package com.linghua.construct;

public class son extends father{

//    father f = new father();

    public son(){
        System.out.println("子类（儿子）无参");
    }
    public son(String name){
//        super(name);
        System.out.println("子类（儿子）有参，参数是："+name);
    }

    public static void play(){
        System.out.println("儿子也玩贪玩蓝月");
    }

    public void kanshu(){
        super.kanshu();
        System.out.println("儿子也爱看金瓶梅");
    }



}
