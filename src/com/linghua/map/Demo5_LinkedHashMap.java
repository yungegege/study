package com.linghua.map;

import com.linghua.bean.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * 底层链表实现，怎么存就怎么取
 */
public class Demo5_LinkedHashMap {
    public static void main(String[] args){
        LinkedHashMap<Student,String> m = new LinkedHashMap<>();
        m.put(new Student("张三",23),"北京");
        m.put(new Student("李四",24),"上海");
        m.put(new Student("王五",25),"深圳");
        System.out.println(m);

    }
}
