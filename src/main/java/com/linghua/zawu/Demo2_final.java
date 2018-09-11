package com.linghua.zawu;

public class Demo2_final {
    private final Student stu;
    public Demo2_final(){
        stu = new Student();
        stu.a = 10;
    }

    public void r(){
        if(stu!=null){
            System.out.println(stu.a);
        }
    }

    public void w(){
        stu.a = 11;
    }

    public static void main(String[] args) {
        Demo2_final d = new Demo2_final();
        d.r();
    }
}

class Student{
    public int a;
}
