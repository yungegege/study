package com.linghua.suanfa.bishi;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        LRUCache<Integer,Integer> tool = new LRUCache<>(a);

        while (in.hasNext()) {
            ArrayList<Integer> list = new ArrayList<>();
            String record = in.nextLine();
            String[] unit = record.split(" ");
            if (unit.length == 2) {
                int operateNum = Integer.parseInt(unit[1]);
                int n = tool.get(operateNum);
                list.add(n);
            } else if (unit.length == 3) {
                int key = Integer.parseInt(unit[1]);
                int value = Integer.parseInt(unit[2]);
                tool.put(key, value);
            }

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

        }
    }
}
class LRUCache<K, V> extends LinkedHashMap<K, V> {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    //缓存大小
    private int cacheSize;

    public LRUCache(int cacheSize) {
        //第三个参数true是关键
        super(10, 0.75f, true);
        this.cacheSize = cacheSize;
    }

    /**
     * 缓存是否已满
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        boolean r = size() > cacheSize;
        return r;
    }
}