package com.linghua.duixiang.enumerate;

/**
 * enum
 */
public class Demo2_Enum{
    public static void main(String[] args){
        Week3 mon3 = Week3.MON;
        System.out.println(mon3);       //输出实例的名字

        Week4 mon4 = Week4.MON;
        System.out.println(mon4.getName());
        mon4.show();

        switch (mon4){
            case MON:
                System.out.println("星期一");
                break;
            case TUE:
                System.out.println("星期二");
                break;
            case WED:
                System.out.println("星期三");
                break;

        }




    }
}


enum Week3 {
    //枚举项必须放在前面
    MON,TUE,WED;
}


enum Week4 {
    //构造器必须是私有的，枚举类中可以用抽象方法，但枚举项必须重写该方法
    MON("星期一"){
        public void show(){
            System.out.println("星期一");
        }
    },
    TUE("星期二"){
        public void show(){
            System.out.println("星期二");
        }
    },
    WED("星期三"){
        public void show(){
            System.out.println("星期三");
        }
    };
    private String name;

    private Week4(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void show();
}
