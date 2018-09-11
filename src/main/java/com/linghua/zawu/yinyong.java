package com.linghua.zawu;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class yinyong {
    public static void main(String[] args) {
        //软引用
        Object obj = new Object();
        SoftReference<Object> sf = new SoftReference<Object>(obj);
        obj = null;
        System.out.println(sf.get());  //当这个对象被标记为需要回收的对象时，则返回null；

        //弱引用
        Object obj1 = new Object();
        WeakReference<Object> wf = new WeakReference<Object>(obj1);
        obj1 = null;
        System.out.println(wf.get());//有时候会返回null
        System.out.println(wf.isEnqueued());   //返回是否被垃圾回收器标记为即将回收的垃圾

        //虚引用
        Object obj2 = new Object();
        ReferenceQueue queue = new ReferenceQueue();
        PhantomReference<Object> pf = new PhantomReference<Object>(obj2,queue);
//        obj2=null;
        System.out.println(pf.get());//永远返回null
        System.out.println(pf.isEnqueued());//返回是否从内存中已经删除
    }
}
