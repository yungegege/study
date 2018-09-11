package com.linghua.jinjie.reflect;

import com.linghua.duixiang.bean.Student;

import java.lang.reflect.Constructor;

public class Demo3_Constructor {
    /**
     * 构造方法
     */
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("com.linghua.duixiang.bean.Student");

        //无参构造创建对象，没有无参构造就错了
        Student s = (Student) clazz.newInstance();
        System.out.println(s);

        //获取Constructor对象再创建
        Constructor c1 = clazz.getConstructor();          //获取无参构造
        Constructor c2 = clazz.getConstructor(String.class,int.class);          //获取有参构造

        Student s1 = (Student) c1.newInstance();
        Student s2 = (Student) c2.newInstance("张三",23);
        System.out.println(s1);
        System.out.println(s2);



        Class c = ji.class;
        Constructor con = c.getDeclaredConstructor();
        con.setAccessible(true);
        ji j = (ji)con.newInstance();
        j.play();

    }
}

class ji{
    private ji() {
    }
    public void play(){
        System.out.println(11111111);
    }
}
