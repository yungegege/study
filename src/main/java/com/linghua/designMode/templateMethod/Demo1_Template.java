package com.linghua.designMode.templateMethod;

/**
 * 模板方法设计模式就是定义一个算法的骨架，具体实现由子类完成。
 * 优点：定义骨架的同时，可以灵活设计具体的算法，满足灵活多变的需求
 * 缺点：骨架有更改要改抽象类
 */
public class Demo1_Template {
    public static void main(String[] args){

        Demo d = new Demo();
        System.out.println(d.getTime());
    }
}


abstract class GetTime{
    //定义为final 不想让子类修改
    public final long getTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        return end-start;
    }

    //定义为抽象的，由子类去完善
    public abstract void code();

}


class Demo extends GetTime{
    @Override
    public void code(){
        for(int i=0;i<100000;i++){
            System.out.println("x");
        }
    }
}
