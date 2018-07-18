package com.linghua.internalclass;

/**
 * 静态内部类（内部类中最简单的形式）
     1.声明在类体部，方法体外，并且使用static修饰的内部类
     2.访问特点可以类比静态变量和静态方法
     3.脱离外部类的实例独立创建
        在外部类的外部构建内部类的实例
            new Outer.Inner();
        在外部类的内部构建内部类的实例
            new Inner();
     4.静态内部类体部可以直接访问外部类中所有的静态成员，包含私有
 */
public class demo1_static {
    public static void main(String[] args) {

        StaticOuter.StaticInner si = new StaticOuter.StaticInner();
        si.test2();
        //StaticOuter.StaticInner.test();
        System.out.println("si.b = "+si.b);
        System.out.println("si.a = "+si.a);
        //  System.out.println("StaticOuter.b  = "+StaticOuter.b);  这里报错
    }

}




class StaticOuter {
    private int a = 100;
    private static int b = 150;
    public static void test(){
        System.out.println("Outer static test ...");
    }
    public  void test2(){
        System.out.println("Outer instabce test ...");
    }

    static class StaticInner {
        public  int a = 200;
        static int b =300;
        public static void test(){
            System.out.println("Inner static test ...");
        }
        public  void test2(){
            System.out.println("Inner instance test ...");
            StaticOuter.test();
            new StaticOuter().test2();
            System.out.println("StaticOuter.b  = "+StaticOuter.b);
            System.out.println("StaticOuter.a  = "+new StaticOuter().a);
        }
    }
}
