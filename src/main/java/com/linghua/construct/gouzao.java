package com.linghua.construct;

import java.util.ArrayList;

public class gouzao {

    public static void main(String[] args) {
        son s1 = new son();
        son s2 = new son("lyf");
        daughter d1 = new daughter();
        daughter d2 = new daughter("lm");
//        father f1 = new father();
//        father f2 = new father("lyf");
        System.out.println("----------------------------");
        ArrayList<father> list = new ArrayList<>();
//        list.add(s1);
        list.add(s2);
//        list.add(d1);
        list.add(d2);
        for(father f:list){
            f.play();
            f.kanshu();
        }

    }
}
