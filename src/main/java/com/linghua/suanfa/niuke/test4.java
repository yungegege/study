package com.linghua.suanfa.niuke;

import java.util.ArrayList;
import java.util.LinkedList;

public class test4 {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;
        node5.left = node7;
        node5.right = node8;

//        print1(node1);
        print2(node1);


    }

    private static void print2(Node root) {
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();
        list1.add(root);
        while (!list1.isEmpty()){
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i).left!=null){
                    list2.add(list1.get(i).left);
                }
                if (list1.get(i).right!=null){
                    list2.add(list1.get(i).right);
                }
                System.out.print(list1.get(i).data);
            }
            list1.clear();
            System.out.println();
            list1.addAll(list2);
            list2.clear();
        }

    }

    private static void print1(Node root){
        LinkedList<Node> queue = new LinkedList<>();
        Node last = root;
        Node nlast = root;
        queue.offer(root);
        while (!queue.isEmpty()){
            Node first = queue.getFirst();
            if (first.left != null) {
                queue.offer(nlast=first.left);
            }
            if (first.right != null){
                queue.offer(nlast=first.right);
            }
            Node node = queue.poll();
            System.out.print(node.data);
            if (last == node){
                last = nlast;
                System.out.println();
            }
        }
    }
}

class Node{
    public int data;
    public Node left;
    public Node right;

    public Node(){}

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
