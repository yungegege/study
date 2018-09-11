package com.linghua.duixiang.internalclass;

/**
 * 局部内部类:
     1.定义在方法体，甚至比方法体更小的代码块中
     2.类比局部变量。
     3.局部内部类是所有内部类中最少使用的一种形式。
     4.局部内部类可以访问的外部类的成员根据所在方法体不同。
        如果在静态方法中：
            可以访问外部类中所有静态成员，包含私有
        如果在实例方法中：
            可以访问外部类中所有的成员，包含私有。
        局部内部类可以访问所在方法中定义的局部变量，但是要求局部变量必须使用final修饰。
 */
public class demo3_Local {
    public static void main(String args[]) {

        // LocalInnerTest() lc = new LocalInnerTest();
        LocalInnerTest.test2();
        new LocalInnerTest().test();
    }
}


class LocalInnerTest {

    private int a = 1;
    private static int b = 2;

    public void test() {
        final int c = 3;
        class LocalInner {
            public void add1() {
                System.out.println("a= " + a);
                System.out.println("b= " + b);
                System.out.println("c= " + c);
            }
        }
        new LocalInner().add1();
    }

    static public void test2() {
        final int d = 5;
        class LocalInner2 {
            public void add1() {
                // System.out.println("a= " + a);
                System.out.println("b= " + b);
                System.out.println("c= " + d);
            }
        }
        new LocalInner2().add1();
    }


}