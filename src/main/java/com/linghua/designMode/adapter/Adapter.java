package com.linghua.designMode.adapter;

public class Adapter {
    /**
     * 适配器设计模式：抽象类重写接口的所有方法但方法都不实现全为空，子类继承抽象类只用重写要用到的方法即可
     */
    public static void main(String[] args){
        皇帝 y = new 李云飞();
        y.驭人();

    }
}
