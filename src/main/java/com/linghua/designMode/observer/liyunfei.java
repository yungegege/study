package com.linghua.designMode.observer;

import java.util.ArrayList;

public class liyunfei implements BeObserver {

    ArrayList<Observer> list = new ArrayList<>();

    public void zhuce(Observer observer){
        list.add(observer);
    }

    @Override
    public void watch(String s) {
        System.out.println("通知"+s);
        for (Observer b:list){
            b.biaoyan(s);
        }
    }

    @Override
    public void remove(Observer o) {
        list.remove(o);
    }
}
