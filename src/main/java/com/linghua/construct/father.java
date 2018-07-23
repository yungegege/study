package com.linghua.construct;

public class father {

    public father(){
        System.out.println("父类无参");
    }

    public father(String name){
        System.out.println("父类有参，参数是："+name);
    }

    public static void play(){
        System.out.println("爸爸玩贪玩蓝月");
    }

    public void kanshu(){
        System.out.println("爸爸爱看金瓶梅");
    }
}
