package com.linghua.duixiang.internalclass;

/**
 * 成员内部类(实例内部类)
     1.没有使用static修饰的内部类。
     2.在成员内部类中不允许出现静态变量和静态方法的声明。
        static只能用在静态常量的声明上。
     3.成员内部类中可以访问外部类中所有的成员(变量，方法)，包含私有成员，如果在内部类中定义有和外部类同名的实例变量，访问：
        OuterClass.this.outerMember;
     4.构建内部类的实例，要求必须外部类的实例先存在
         外部类的外部/外部类的静态方法：new Outer().new Inner();
         外部类的实例方法：
             new Inner();
             this.new Inner();
 */
public class demo2_member {
    public static void main (String args []){
    /*  MemberOuter.MemberInner mm =  new MemberOuter().new MemberInner();
        mm.test2();*/

        MemberOuter mo = new MemberOuter();
        mo.setS1("");


    }
}


class MemberOuter{
    private String s1 = "Outer InstanceMar";
    private String s2 = "Outer s2";
    private static String s3 = "OuterStatic s3";
    public void setS1(String s1) {
        this.s1 = s1;
        new MemberOuter().new MemberInner();
        this.new MemberInner();  //此时MemberOuter已经实例化完成,所以可以使用this
        new MemberInner().test2();
    }
    public static void  test2 (){
        new MemberOuter().new MemberInner();
//        this.new MemberInner();
//        此时MemberOuter没有实例化完成,所以不可以使用this
//        static 是在MemberOuter构造器前使用,所以此时this不能使用
    }
    class MemberInner{
        String s1= "Inner  instanceMae  ";
        static final String s4 = "static final  MemberInner";

        void test2(){
            System.out.println(" s1 =" + s1);
            System.out.println(" Outter MemberOuter.this.s1 =" + MemberOuter.this.s1);
            System.out.println("s2 = "+s2);
            System.out.println("s3 = "+s3);
        }
    }

}