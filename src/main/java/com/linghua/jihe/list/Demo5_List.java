package com.linghua.jihe.list;

import com.linghua.duixiang.bean.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo5_List {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Student("张三", 23));
        list.add(new Student("李四", 24));
        list.add(new Student("王五", 25));
        list.add(1, new Student("麻子", 20));
        System.out.println(list);

        System.out.println("--------------------------");
        for (int i = 0; i < list.size(); i++) {                   //遍历集合

            System.out.println(((Student) list.get(i)).getName()+"..."+((Student) list.get(i)).getAge());
        }

    }
}
