package review;

import java.util.Random;

/**
 * 存在继承的情况下，初始化顺序为：
 * 父类（静态变量、静态语句块）
 * 子类（静态变量、静态语句块）
 * 父类（实例变量、普通语句块）
 * 父类（构造函数）
 * 子类（实例变量、普通语句块）
 * 子类（构造函数）
 */
public class test {
    static {
        staticField = "1";
        System.out.println("静态语句块");
    }

    public static String staticField = "静态变量";


    public String field = "实例变量";

    {
        System.out.println("普通语句块");
    }

    public static void main(String[] args){

        Random r = new Random();
        for(int i=1;i<10;i++){
            System.out.println(r.nextInt());
        }
        System.out.println(staticField);

        System.out.println("主方法");

        test t = new test();
    }
}
