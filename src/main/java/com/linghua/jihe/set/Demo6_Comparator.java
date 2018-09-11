package com.linghua.jihe.set;

import java.util.Comparator;

public class Demo6_Comparator implements Comparator<String>{
    /**
     * 给TreeSet传入比较器参数，优先按照比较器进行排序，如果既没比较器又没重写compareTo方法就会报错。
     */
    public int compare(String s1,String s2){      //按照字符串比较
        int num = s1.length()- s2.length();       //长度为主要比较条件
        return num==0 ? s1.compareTo(s2):num;     //内容为次要比较条件
    }
}
