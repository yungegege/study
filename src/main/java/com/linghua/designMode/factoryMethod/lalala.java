package com.linghua.designMode.factoryMethod;

public class lalala{
    /**
     * 简单工厂和工厂方法
     */
    public static void main(String[] args){
        //工厂方法
        HeShiFactory hs = new HeShiFactory();
        HeShi h = (HeShi)hs.createSchool();
        h.study();

    }
}
