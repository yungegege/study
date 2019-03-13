package com.linghua.suanfa.bianlifeng;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class lru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(sc.hasNext()){
            LRULinkedHashMap<Integer,Integer> map = new LRULinkedHashMap<>(n);
            String line = sc.nextLine();
            if (line.length()>2) {
                int a = Integer.parseInt(line.split(" ")[0]);
                int b = Integer.parseInt(line.split(" ")[1]);
                map.put(a,b);
            }else {

                int a = Integer.parseInt(line);
                if (map.get(a)==null){
                    System.out.println(-1);
                }else {
                    System.out.println(map.get(a));

                }
            }
        }
    }
}

class LRULinkedHashMap<K,V> extends LinkedHashMap<K,V> {
    //定义缓存的容量
    private int capacity;
    private static final long serialVersionUID = 1L;
    //带参数的构造器
    LRULinkedHashMap(int capacity){
        //调用LinkedHashMap的构造器，传入以下参数
        super(16,0.75f,true);
        //传入指定的缓存最大容量
        this.capacity=capacity;
    }
    //实现LRU的关键方法，如果map里面的元素个数大于了缓存最大容量，则删除链表的顶端元素
    @Override
    public boolean removeEldestEntry(Map.Entry<K, V> eldest){
        if(size()>capacity){
            return true;
        }
        return false;
    }


}
