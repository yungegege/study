package com.linghua.construct;

import java.lang.reflect.Constructor;

/**
 * 暴力解除私有构造方法的限制
 */
public class lalala {
    public static void main(String[] args) throws Exception{
        Class clazz = ji.class;
        Constructor c = clazz.getDeclaredConstructor();
        c.setAccessible(true);
        ji j = (ji)c.newInstance();
        j.play();
    }
}


class ji{
    private ji() {
    }
    public void play(){
        System.out.println(11111111);
    }
}