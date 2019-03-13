package com.linghua.suanfa.xiapi;

import java.util.*;

public class erchashu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {//注意while处理多个case
            String line = in.nextLine();
            line = line.replace("[","");
            line = line.replace("]","");
            String[] arr = line.split(",");
            ArrayList<Node> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                Node node;
                if (arr[i].equals("null")){
                    node = new Node(0);
                }else {
                    node = new Node(Integer.parseInt(arr[i]));
                }
                list.add(node);
            }
            for (int i = 0; i < arr.length / 2; i++) {
                if (i*2+1<arr.length){
                    list.get(i).left = list.get(i*2+1);
                }
                if (i*2+2<arr.length){
                    list.get(i).right = list.get(i*2+2);
                }
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));

            }
            maxPathSum(list.get(0));
            System.out.println(max);
        }
    }
    private static int max = Integer.MIN_VALUE;


    public static int maxPathSum(Node root) {
        dfs(root);
        return max;
    }

    private static int dfs(Node n) {
        if (n == null) return 0;

        int l = Math.max(0, dfs(n.left));
        int r = Math.max(0, dfs(n.right));
        max = Math.max(max, l + r + n.val);
        return Math.max(l, r) + n.val;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

