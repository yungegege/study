package com.linghua.paixu;

import java.util.Iterator;

public class zhan<Item> implements Iterable<Item> {

    public static void main(String[] args) throws Exception {
        zhan<Integer> stack = new zhan();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        for (Integer item : stack)
            System.out.println(item);

        System.out.println("-------------------");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }


    // 栈元素数组
    private Item[] a = (Item[]) new Object[1]; // 只能通过转型来创建泛型数组
    // 元素数量
    private int N = 0;

    public void push(Item item) {
        check();
        a[N++] = item;
    }

    public Item pop() throws Exception {
        if (isEmpty())
            throw new Exception("stack is empty");
        Item item = a[--N];
        check();
        a[N] = null; // 避免对象游离
        return item;
    }

    private void check() {
        if (N >= a.length)
            resize(2 * a.length);              //数量得到数组长度就扩容数组变为原来的二倍
        else if (N > 0 && N <= a.length / 4)
            resize(a.length / 2);              //数量小与数组长度的四分子一就减少容量为原来的一半
    }

    /**
     * 调整数组大小，使得栈具有伸缩性
     */
    private void resize(int size) {
        Item[] tmp = (Item[]) new Object[size];
        for (int i = 0; i < N; i++)
            tmp[i] = a[i];
        a = tmp;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    @Override
    public Iterator<Item> iterator() {
        // 返回逆序遍历的迭代器，刚看到这句我就说嘛怎么从后来开始返回
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

        @Override
        public void remove() {

        }
    }
}
