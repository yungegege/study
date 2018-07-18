package com.linghua.enumerate;

public class Demo3_Enum {
    public static void main(String[] args){
        Week4 mon = Week4.MON;
        Week4 tue = Week4.TUE;
        Week4 wed = Week4.WED;

        //枚举项都是有编号的
        System.out.println(mon.ordinal());
        System.out.println(tue.ordinal());
        System.out.println(wed.ordinal());

        //比较的是编号
        System.out.println(mon.compareTo(tue));
        System.out.println(mon.compareTo(wed));

        //获取实例名称
        System.out.println(mon.name());
        System.out.println(mon.getName());
        System.out.println(mon.toString());

        //通过字节码文件获取枚举项
        Week4 mon1 = Week4.valueOf(Week4.class,"MON");
        System.out.println(mon1);

        //遍历枚举类的所有枚举项
        Week4[] arr = Week4.values();
        for (Week4 w:arr){
            System.out.println(w);
        }


    }
}
