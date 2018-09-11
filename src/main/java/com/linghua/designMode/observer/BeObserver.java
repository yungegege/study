package com.linghua.designMode.observer;

public interface BeObserver {

    public void watch(String s);

    public void zhuce(Observer observer);

    public void remove(Observer observer);

}
