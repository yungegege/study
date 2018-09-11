package com.linghua.designMode.observer;

public class zhouxingchi implements Observer {
    private String name;

    public zhouxingchi(String name){
        this.name = name;
    }

    @Override
    public void biaoyan(String a) {
        System.out.println(name+"收到"+a);
    }
}
