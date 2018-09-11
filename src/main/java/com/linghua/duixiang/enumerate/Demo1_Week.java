package com.linghua.duixiang.enumerate;

/**
 * 自定义枚举类
 */
public class Demo1_Week{
    public static void main(String[] args){
        Week1 mon1 = Week1.MON;
        Week1 tue1 = Week1.TUE;
        Week1 wed1 = Week1.WED;
        System.out.println(mon1);
        System.out.println(tue1);
        System.out.println(wed1);

        System.out.println("-----------------------------------------");

        Week2 mon2 = Week2.MON;
        Week2 tue2 = Week2.TUE;
        Week2 wed2 = Week2.WED;
        System.out.println(mon2.getName());
        System.out.println(tue2.getName());
        System.out.println(wed2.getName());
        mon2.show();
        tue2.show();
        wed2.show();
    }
}

class Week1 {

    public static final Week1 MON = new Week1();
    public static final Week1 TUE = new Week1();
    public static final Week1 WED = new Week1();
    private Week1(){}                                //私有构造，不让别的类创建本类对象

    @Override
    public String toString() {
        return "Week1{}";
    }
}


abstract class Week2 {

    public static final Week2 MON = new Week2("星期一"){
        public void show(){
            System.out.println("星期一");
        }
    };
    public static final Week2 TUE = new Week2("星期二"){
        public void show(){
            System.out.println("星期二");
        }
    };
    public static final Week2 WED = new Week2("星期三"){
        public void show(){
            System.out.println("星期三");
        }
    };
    private String name;
    private Week2(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void show();
}