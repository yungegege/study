package com.linghua.dynamicProxy;

public class MyAspect {
    public void before(){
        System.out.println("前");
    }

    public void after(){
        System.out.println("后");
    }
}
