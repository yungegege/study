package com.linghua.designMode.observer;

public class Test {
    public static void main(String[] args) {
        liyunfei l = new liyunfei();
        liudehua ldh = new liudehua("刘德华");
        zhouxingchi zxc = new zhouxingchi("周星驰");
        l.zhuce(ldh);
        l.zhuce(zxc);
        l.watch("aaa");
        System.out.println("---------------------");
        l.remove(ldh);
        l.watch("aaa");
    }
}
