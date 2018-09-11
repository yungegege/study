package com.linghua.duixiang.internalclass;

/**
 * 匿名内部类
     1.没有名字的局部内部类。
     2.没有class,interface,implements,extends关键字
     3.没有构造器。
     4.一般隐式的继承某一个父类或者实现某一个接口
 */
public class Demo4_anonymous {
    public static void main(String args[]) {
        Person guo = new Person();

        guo.user(new Pen() {
            @Override
            public void write() {
                System.out.println("写子");
            }
        });
    }
}


interface Pen {
    public void write();
}

class  Pencil implements Pen {
    @Override
    public void write() {
        //铅笔 的工厂
    }
}

class Person {
    public void user(Pen pen) {
        pen.write();
    }
}