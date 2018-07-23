package com.linghua.niuke;

import java.util.ArrayList;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;

public class test1 {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        //从左向右来保存序列
        Queue<TreeNode> q1=new LinkedList<TreeNode>();
        //从左向右来保存序列
        Queue<TreeNode> q2=new LinkedList<TreeNode>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp=new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        tmp.add(root.val);
        list.add(tmp);
        tmp = null;
        q1.offer(root);
        while(q1.isEmpty() || q2.isEmpty()){
            if(q1.isEmpty() && q2.isEmpty()){
                //都为空
                break;
            }
            ArrayList<Integer> tmpList=new ArrayList<Integer>();
            if(q2.isEmpty()){
                while(!q1.isEmpty()){
                    if(q1.element().left != null){
                        tmpList.add(q1.element().left.val);
                        q2.offer(q1.element().left);
                    }
                    if(q1.element().right != null){
                        tmpList.add(q1.element().right.val);
                        q2.offer(q1.element().right);
                    }
                    //弹队列
                    q1.remove();
                }
            }else{
                while(!q2.isEmpty()){
                    if(q2.element().left != null){
                        tmpList.add(q2.element().left.val);
                        q1.offer(q2.element().left);
                    }
                    if(q2.element().right != null){
                        tmpList.add(q2.element().right.val);
                        q1.offer(q2.element().right);
                    }
                    //弹队列
                    q2.remove();
                }
            }
            if(tmpList.size() > 0){
                list.add(tmpList);
            }
        }
        return list;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}