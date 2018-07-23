package com.linghua.reflect;

import com.linghua.bean.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo5_Method {
    /**
     * 字段
     */
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("com.linghua.bean.Student");

        //获取有参构造，再获得对象
        Constructor c = clazz.getConstructor(String.class,int.class);          //获取有参构造
        Student s = (Student) c.newInstance("张三",23);
        System.out.println(s);

        //获取方法对象并调用
        s.play();                                                              //直接调用公有方法，没法调私有的
        Method m1 = clazz.getMethod("play");                             //获取公有方法对象
        Method m2 = clazz.getDeclaredMethod("study");                    //暴力反射获取私有方法
        m2.setAccessible(true);                                                //去除私有权限
        m1.invoke(s);
        m2.invoke(s);

    }
}
