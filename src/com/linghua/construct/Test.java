package com.linghua.construct;

public class Test {
    public static int a;
    //静态代码块
    static {
        int a;
        a = 20;
        System.out.println("a="+a);
        System.out.println("静态代码块");
    }
    //构造代码块
    {
        System.out.println("构造块1");
    }
    //构造方法
    public Test() {
        System.out.println("执行了构造方法");
    }
    //普通的成员方法
    public void test() {
        System.out.println("在方法中的普通代码块");
        //普通的代码块
        {
            System.out.println("普通代码块");
        }

    }
    public static void paly(){
        System.out.println(11111);
    }
    public static void main(String[] args) {
        System.out.println("执行了主方法");
        System.out.println("a="+a);
        System.out.println("--------------------");
        new Test();
        System.out.println("------第二次创建对象---------------");
        new Test();
        System.out.println("------第三次创建对象---------------");
        new Test().test();
    }
    //构造块
    {
        System.out.println("构造块2");
    }
}