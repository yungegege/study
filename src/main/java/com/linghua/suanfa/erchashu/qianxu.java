package com.linghua.suanfa.erchashu;

import java.util.Stack;

public class qianxu {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        t4.left = null;
        t4.right = null;
        t5.left = null;
        t5.right = null;
        t6.left = null;
        t6.right = null;
        t7.left = null;
        t7.right = null;
        StringBuilder sb = new StringBuilder();

        sb.append(100/8);
        System.out.println(sb.toString());
//        System.out.println("前序：");
//        qianxu(t1);
//        System.out.println();
//        System.out.println("中序：");
//        zhongxu(t1);
//        System.out.println();
//        System.out.println("后序：");
//        houxu(t1);
    }

    private static void qianxu(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode p = null;
        while (!stack.empty()) {
            p = stack.pop();
            if (p != null) {
                System.out.print(p.value + " ");
                stack.push(p.right);
                stack.push(p.left);
            }


        }
    }

    private static void zhongxu(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        do {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            System.out.print(p.value+" ");

            if (p.right != null) {
                p = p.right;
            } else {
                p = null;
            }
        } while (p != null || !stack.empty());

    }

    private static void houxu(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p != null || !stack.empty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            System.out.print(p.value + " ");
            //这里需要判断一下，当前p是否为栈顶的左子树，如果是的话那么还需要先访问右子树才能访问根节点
            //如果已经是不是左子树的话，那么说明左右子书都已经访问完毕，可以访问根节点了，所以讲p复制为NULL
            //取根节点
            if (!stack.empty() && p == stack.peek().left) {
                p = stack.peek().right;
            } else p = null;
        }
    }


}


class TreeNode {// 节点的定义
    int value;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}