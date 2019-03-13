package com.linghua.suanfa.xiangwushuo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class juzhenchengfa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<juzhen> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new juzhen(a,b));
        }
//        String line = sc.nextLine();
        String line = "(A(BC))";
        HashMap<String,Integer> map = new HashMap<>();
        int index = 0;
        for(int i=0;i<line.length();i++){
            String s = String.valueOf(line.charAt(i));
            if(!s.equals("(") && !s.equals(")")){
                map.put(s,index);
                list.get(index).setName(s);

                index++;
            }
        }
        Stack<String> stack = new Stack<>();
        int num=0;
        for(int i=0;i<line.length();i++){
            stack.push(String.valueOf(line.charAt(i)));
            if(String.valueOf(line.charAt(i)).equals(")")){
                stack.pop();
                String a = stack.pop();
                String b = stack.pop();
                System.out.println("A"+a);
                System.out.println("B"+b);
                stack.pop();
                int aindex = map.get(a);
                int bindex = map.get(b);
                juzhen aj = list.get(aindex);
                juzhen bj = list.get(bindex);
                num+=aj.getX()*bj.getX()*bj.getY();
                list.remove(aj);
                list.remove(aj);
                aj.setY(bj.getY());
                list.add(bindex,new juzhen(aj.getX(),bj.getY()));
            }
        }
        if(list.size()==1 || list.size()==0){
            System.out.println(num);
        }else{
            while(list.size()>1){
                num+=list.get(0).getX()*list.get(0).getY()*list.get(1).getY();
                list.add(0,new juzhen(list.get(0).getX(),list.get(1).getY()));
                list.remove(1);
                list.remove(1);
            }
            System.out.println(num);
        }
    }
}

class juzhen{
    private int x;
    private int y;
    private String name;
    public juzhen(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}