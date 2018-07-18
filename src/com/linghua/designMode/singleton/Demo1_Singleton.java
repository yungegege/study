package com.linghua.designMode.singleton;

public class Demo1_Singleton {
    /**
     * 单例设计模式，保证在内存中这个类的对象只有一个
     * @param args
     */
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);

    }
}


class Singleton{

    private Singleton(){}

    //1.饿汉式 空间换时间 线程安全
//    private static Singleton s = new Singleton();
//
//    public static Singleton getInstance(){
//        return s;
//    }

    //2.懒汉式 时间换空间 线程不安全
    private static Singleton s;

    public static Singleton getInstance(){
        if(s==null){
            s = new Singleton();
        }
        return s;
    }

    //3.public final static
//    public final static Singleton s = new Singleton();
}
