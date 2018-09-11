package com.linghua.jinjie.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo6_fanxing {
    /**
     * 通过反射越过泛型检查
     */
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(111);
        list.add(222);

        Class clazz = Class.forName("java.util.ArrayList");
        Method m = clazz.getMethod("add",Object.class);
        m.invoke(list,"aaa");
        System.out.println(list);
    }
}
