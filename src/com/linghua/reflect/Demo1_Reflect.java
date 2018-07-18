package com.linghua.reflect;

import com.linghua.bean.Student;

public class Demo1_Reflect {
    /**
     * 反射的三种方式，得到的class对象是一样的
     * @param args
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException{
        //1
        Class clazz1 = Class.forName("com.linghua.bean.Student");
        //2.
        Class clazz2 = Student.class;
        //3.
        Student p = new Student("zhangsan",22);
        Class clazz3 = p.getClass();
        System.out.println(clazz1==clazz2);
        System.out.println(clazz3==clazz2);
    }
}
