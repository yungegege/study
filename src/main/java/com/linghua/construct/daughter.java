package com.linghua.construct;

public class daughter extends father {

    public daughter(){
        System.out.println("子类（女儿）无参");
    }
    public daughter(String name){
        super();
        System.out.println("子类（女儿）有参，参数是："+name);
    }

    public static void play(){
        System.out.println("女儿也玩贪玩蓝月");
    }

    public void kanshu(){
        System.out.println("女儿也爱看金瓶梅");
    }
}
