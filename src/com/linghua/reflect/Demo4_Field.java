package com.linghua.reflect;

import com.linghua.bean.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo4_Field {
    /**
     * 字段
     */
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("com.linghua.bean.Student");

        //获取有参构造，再获得对象
        Constructor c = clazz.getConstructor(String.class,int.class);          //获取有参构造
        Student s = (Student) c.newInstance("张三",23);
        System.out.println(s);

        //设置字段的值
//        Field f1 = clazz.getField("name");                                   //公有的方法才能这么获取
//        f1.set(s,"李四");

        Field f2 = clazz.getDeclaredField("name");                       //对于私有字段，可以暴力反射获取字段
        f2.setAccessible(true);                                                //去除私有权限
        f2.set(s,"李四");
        System.out.println(s);

    }
}
