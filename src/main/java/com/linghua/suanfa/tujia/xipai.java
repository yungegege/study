package com.linghua.suanfa.tujia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class xipai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String a = line.split(",B")[0].split("=")[1];
        a = a.substring(1,a.length()-1);
        String b = line.split(",B")[1].split("=")[1];
        b = b.substring(1,b.length()-1);

        String[] sarr = a.split(",");
        String[] sbrr = b.split(",");
        ArrayList<Integer> alist = new ArrayList<>();
        ArrayList<Integer> blist = new ArrayList<>();
        for (int i = 0; i < sarr.length; i++) {
            alist.add(Integer.parseInt(sarr[i]));
            blist.add(Integer.parseInt(sbrr[i]));
        }

        ArrayList<Integer> alist1 = new ArrayList<>(blist);
        ArrayList<Integer> blist1 = new ArrayList<>(blist);

        Collections.sort(alist);
        Collections.sort(blist);

        int count;
        for (int i = alist.size()-1; i>=0; i--) {
            if(alist.get(i)>blist.get(i)){
                int index = blist1.indexOf(blist.get(i));
                alist1.set(index,alist.get(i));
            }
        }

        System.out.print("[");
        for (int i = 0; i < alist1.size()-1; i++) {
            System.out.print(alist1.get(i)+", ");

        }
        System.out.println(alist.get(alist.size()-1)+"]");

    }
}
