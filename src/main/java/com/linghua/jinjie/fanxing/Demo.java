package com.linghua.jinjie.fanxing;

import java.util.ArrayList;
import java.util.List;

//此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
//在实例化泛型类时，必须指定T的具体类型
public class Demo<T>{
    //key这个成员变量的类型为T,T的类型由外部指定
    private T key;

    public Demo(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }

    public T getKey(){ //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }

    public <S> void func(List<S> list, S t) {
        list.add(t);
        System.out.println(list.get(0));
    }

    public static void main(String[] args) {
        Demo demo = new Demo(111);
        int a = (int)demo.getKey();
        System.out.println(a);

        Demo<Integer> d = new Demo<>(111);
        int b = d.getKey();
        System.out.println(b);

        Demo<String> demo1 = new Demo<>("1");
        List<Integer> list = new ArrayList<>();
        demo1.func(list,1);
    }
}
