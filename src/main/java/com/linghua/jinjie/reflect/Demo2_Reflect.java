package com.linghua.jinjie.reflect;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo2_Reflect {
    /**
     * 第一种：Class.forName("xxx")
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{

        //多态
        Juicer j1 = new Juicer();
        j1.run(new Apple());
        j1.run(new Orange());

        //反射
        BufferedReader br = new BufferedReader(new FileReader("config.properties"));
        Class clazz = Class.forName(br.readLine());
        Fruit f = (Fruit) clazz.newInstance();
        Juicer j2 = new Juicer();
        j2.run(f);
    }
}

interface Fruit{
    public void squeeze();
}


class Apple implements Fruit{
    @Override
    public void squeeze() {
        System.out.println("苹果");
    }
}


class Orange implements Fruit{
    @Override
    public void squeeze() {
        System.out.println("橘子");
    }
}


class Juicer{
    public void run(Fruit f){
        f.squeeze();
    }
}
