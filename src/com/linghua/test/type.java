package com.linghua.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public abstract class type {
    private String name="111";

    public static void main(String[] args) {
        String[] array = new String[]{
          "1", "2","3","4"
        };
        listAll(Arrays.asList(array),"");
//        type t = new type();
//        System.out.println(t.name);
        clone c = new clone();
        c.name = "111";
    }


    public static void listAll(List candidate, String prefix){
        if(candidate.isEmpty()){
            System.out.println(prefix);
        }
        for (int i = 0;i<candidate.size();i++){
            List temp = new LinkedList(candidate);
            listAll(temp,prefix+temp.remove(i));
        }

    }
}
