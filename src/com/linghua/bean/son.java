package com.linghua.bean;

import review.father;

import java.lang.reflect.Array;

public class son extends father implements Cloneable{
    private String name;

    @Override
    public String toString() {
        return "son{" +
                "name='" + name + '\'' +
                '}';
    }

    private void la(){
        System.out.println("儿子");
    }

    public static void main (String[] args){
        son s = new son();
        s.lala();
        try {
            son s1 = (son)s.clone();
            System.out.println(s1);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Override
    public void lalala() {
        super.lalala();
    }

    @Override
    protected void lala() {
        super.lala();
    }

    public void aa(int a){
        System.out.println(a);
    }

    public void aa(String a){
        System.out.println(a);
    }
}
