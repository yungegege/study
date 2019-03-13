package com.linghua.suanfa.bishi;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> map = new LRULinkedHashMap<>(4);
        map.put(9,9);
        map.put(7,7);
        map.put(5,5);
        map.put(4,4);
        map.put(3,3);
        map.get(7);
        for (Map.Entry<Integer,Integer> e :map.entrySet()) {
            System.out.println(e.getValue());
        }
    }

}

class LRULinkedHashMap<K,V> extends LinkedHashMap<K,V>{
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
            System.out.println("移除键值对:("+eldest.getKey() + "," + eldest.getValue()+")");
            return true;
        }
        return false;
    }
}

