package com.linghua.designMode.observer;

public class liudehua implements Observer {
    private String name;
    public liudehua(String name){
        this.name = name;
    }
    @Override
    public void biaoyan(String a) {
        System.out.println(name+"收到"+a);
    }
}
