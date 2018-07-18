package com.linghua.map;

import com.linghua.bean.Student;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * 底层二叉排序树实现，小的存在左边，大的存在右边，TreeMap如何存取元素取决于compareTo方法的返回值
 * 1.可以对键进行排序，键要实现comparable接口，重写compareTo方法
 * 2.传入比较器，此时按照比较器来比较。不传比较器按照重写的compareTo方法来比较，不传比较器又不重写就报错。
 */
public class Demo6_TreeMap {
    public static void main(String[] args){
        //传入比较器
        TreeMap<Student,String> m = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getName().compareTo(o2.getName());  //按照姓名比较
                return num==0?o1.getAge()-o2.getAge():num;
            }
        });
        m.put(new Student("李四",27),"上海");
        m.put(new Student("张三",29),"北京");
        m.put(new Student("王五",28),"深圳");
        System.out.println(m);
    }
}
