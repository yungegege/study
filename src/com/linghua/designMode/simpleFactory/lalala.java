package com.linghua.designMode.simpleFactory;

public class lalala{
    /**
     * 简单工厂和工厂方法
     */
    public static void main(String[] args){
        //简单工厂
        SimpleFactory sf = new SimpleFactory();
        School s = sf.getschool("heshi");
        s.study();


    }
}
