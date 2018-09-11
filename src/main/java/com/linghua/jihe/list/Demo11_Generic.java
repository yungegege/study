package com.linghua.jihe.list;

import com.linghua.duixiang.bean.Student;


public class Demo11_Generic {

    public static void main(String[] args){

        Demo10_Generic<Integer> d10 = new Demo10_Generic<>();
        d10.setQ(1);
        System.out.println(d10.getQ());
        d10.play(new Student("xiaoming",22));



    }
}
