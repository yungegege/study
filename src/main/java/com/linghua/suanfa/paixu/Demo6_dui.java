package com.linghua.suanfa.paixu;

public class Demo6_dui {
    public static void main(String[] args){
        int[] a = {5,32,36,2,622,261,2,16,26,24};
        sort(a);
        System.out.println(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void sort(int[] a) {

    }

    //筛选法调整堆算法 将以LOW为根节点的子树调整成小顶堆
    public static void sift(int[] a,int low,int high){
        int i=low;
        int j=2*i+1;
        int temp=a[i];
        while(j<high){
            if(j<high-1&&a[j]>a[j+1])
                j++;
            if(temp>a[j]){//若父母结点值较大
                a[i]=a[j];//孩子节点中较小值上移
                i=j;
                j=2*i+1;
            }
            else
                j=high+1;//退出循环
        }
        a[i]=temp;
    }

    public static void heapSort(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            sift(a, i, a.length);
        }
        for (int i = a.length - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            sift(a, 0, i);
        }
    }
}
