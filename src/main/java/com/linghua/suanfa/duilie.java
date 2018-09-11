package com.linghua.suanfa;

public class duilie<Item> {
    public static void main(String[] args) throws Exception {
        duilie queue = new duilie();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.add(3);
        queue.add(4);
        System.out.println(queue.size());
    }

    private Node first;
    private Node last;
    int N = 0;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void add(Item item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = null;
        if (isEmpty()) {
            last = newNode;
            first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        N++;
    }

    public Item remove() throws Exception {
        if (isEmpty())
            throw new Exception("queue is empty");
        Node node = first;
        first = first.next;
        N--;
        if (isEmpty())
            last = null;
        return node.item;
    }
}
