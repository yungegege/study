package com.linghua.jihe.set;

import com.linghua.duixiang.bean.Student;

import java.util.TreeSet;

public class Demo5_TreeSet {

    /**
     * 存储元素并遍历
     * 底层二叉排序树实现，小的存在左边，大的存在右边，TreeSet如何存取元素取决于compareTo方法的返回值
     * @param args
     */
    public static void main(String[] args){
        //存储基本类型元素并遍历
        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(3);
        ts1.add(1);
        ts1.add(2);
        ts1.add(3);
        for(int i:ts1){
            System.out.println(i);
        }

        //存储引用类型元素并遍历
        //存的引用类型对象必须实现Comparable接口才能比较
        //当compareTo返回0的时候，集合中只有一个元素
        //当compareTo返回正数的时候，怎么存怎么取
        //当compareTo返回负数的时候，倒序存储
        TreeSet<Student> ts2 = new TreeSet<>();
        ts2.add(new Student("李四",24));
        ts2.add(new Student("麻子",23));
        ts2.add(new Student("王二",22));
        ts2.add(new Student("张三",23));

        for(Student s:ts2){
            System.out.println(s);
        }

        TreeSet<String> ts3 = new TreeSet<>(new Demo6_Comparator());
        ts3.add("aaaaaaaaaaa");
        ts3.add("z");
        ts3.add("wc");
        ts3.add("nba");
        ts3.add("cba");
        System.out.println(ts3);


    }
}
