package com.linghua.suanfa.paixu;

public class Demo3_xier {
    public static void main(String[] args){
        int[] a = {5,32,36,2,622,261,2,16,26,24};
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void sort(int[] a) {
        int step=a.length/2;
        int i,j;
        while(step>0){
            for(i=step;i<a.length;i++){
                int temp=a[i];
                for(j=i-step;j>=0&&a[j]>temp;j-=step){
                    a[j+step]=a[j];
                }
                a[j+step]=temp;
            }
            step=step/2;
        }
    }
}
