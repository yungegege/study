package com.linghua.dynamicProxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args){
        UserImpl ui = new UserImpl();
        ui.add();
        ui.delete();
        System.out.println("--------------------------------------------------------");

        MyInvocationHandler m = new MyInvocationHandler(ui);        //传入被代理对象，只要动态代理类写好，还能代理别的类
        Class clazz = ui.getClass();
        User u = (User) Proxy.newProxyInstance(Test.class.getClassLoader(),clazz.getInterfaces(),m);   //前俩固定写法，最后一个是代理类
        u.add();
        u.delete();
        System.out.println("toString--------------------------------------------------------");
        System.out.println(u.toString());
//        System.out.println("hashCode--------------------------------------------------------");
//        System.out.println(u.hashCode());
//        System.out.println("equals--------------------------------------------------------");
//        System.out.println(u.equals(ui));

    }
}
