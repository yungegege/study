package com.linghua.map;

import com.linghua.bean.Student;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Demo4_HashMap {
    public static void main(String[] args){
        HashMap<Student,String> m = new HashMap<>();
        m.put(new Student("张三",23),"北京");
        m.put(new Student("李四",24),"上海");
        m.put(new Student("王五",25),"深圳");
        System.out.println(m);
    }



}
