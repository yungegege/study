package com.linghua.set;

import java.util.HashSet;
import java.util.Random;

public class Demo3_Random {
    /**
     * 编写一个程序，获取10个1到20的随机数，要求随机数不能重复，最后输出到控制台
     * @param args
     */
    public static void main(String[] args){
        Random r = new Random();
        HashSet<Integer> hs = new HashSet<>();
        while (hs.size()<10){
            hs.add(r.nextInt(20)+1);
        }
        for(int i:hs){
            System.out.println(i);
        }

    }

}
