package com.linghua.jinjie.reflect;

import com.linghua.duixiang.bean.Student;

import java.lang.reflect.Field;

public class Demo7_test {
    public static void main(String[] args) throws Exception{
        Student s = new Student("张三",23);
        System.out.println(s);

        Class clazz = s.getClass();
        Field f = clazz.getDeclaredField("age");
        f.setAccessible(true);
        f.set(s,24);
        System.out.println(s);
    }
}
