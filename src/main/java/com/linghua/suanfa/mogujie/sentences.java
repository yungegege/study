package com.linghua.suanfa.mogujie;

import java.util.*;

public class sentences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            String s1 = in.nextLine();
            s1 = s1.split("\"")[1];
            String s2 = in.nextLine();
            s2 = s2.split("=")[1];
            String[] arr  = s2.split(",");
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i].split("\"")[1];
                set.add(arr[i]);
            }
            List<String> list = wordBreak(s1,set);
            System.out.print("[");
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size()-1){
                    System.out.print(list.get(i));
                }else {
                    System.out.print(list.get(i)+",");

                }
            }
            System.out.print("]");


        }
    }

    static Map<String, List<String>> map = new HashMap<String, List<String>>();
    static Map<String, Boolean> bmap = new HashMap<String, Boolean>();

    public static List<String> wordBreak(String s, Set<String> wordDict) {
        List<String> list = new ArrayList<String>();
        if (s == null || s.length() == 0) {
            return list;
        }
        if (map.get(s) != null) {
            return map.get(s);
        }
        if (bmap.get(s) != null) {
            return null;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            String k = s.substring(0, i + 1);
            if (wordDict.contains(k)) {
                String t = s.substring(i + 1, s.length());
                if (bmap.get(t) == null) {
                    List<String> l = map.get(t);
                    if (l != null) {
                        for (int j = 0; j < l.size(); j++) {
                            list.add(k + " " + l.get(j));
                        }
                    } else {
                        List<String> a = wordBreak(t, wordDict);
                        if (a != null) {
                            for (int j = 0; j < a.size(); j++) {
                                list.add(k + " " + a.get(j));
                            }
                        }
                    }
                }
            }
        }
        if (wordDict.contains(s)) {
            list.add(s);
        }
        if (list.size() == 0) {
            bmap.put(s, false);
            return list;
        }
        map.put(s, list);
        return list;
    }

}
