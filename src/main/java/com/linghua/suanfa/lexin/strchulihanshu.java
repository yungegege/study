package com.linghua.suanfa.lexin;

import java.util.HashMap;
import java.util.Scanner;

public class strchulihanshu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            String str = in.nextLine();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                if (null == map.get(str.charAt(i))) {
                    map.put(str.charAt(i), 1);
                } else {
                    map.put(str.charAt(i), map.get(str.charAt(i))+1);
                }
            }
            int max = 0;
            char ch = '0';
            for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
                if (max<entry.getValue()){
                    ch = entry.getKey();
                    max = entry.getValue();
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < max; i++) {
                sb.append(ch);
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)!=ch){
                    sb.append(str.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
