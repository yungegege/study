package com.linghua.suanfa.paixu;

public class Demo2_maopao {
    public static void main(String[] args){
        int[] a = {100,80,50,70,85,34,60};

        sort(a);
        System.out.println(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void sort(int[] a) {
        for (int i=0;i<a.length;i++){
            for(int j=a.length-1;j>i;j--){
                if(a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
//            for(int j=0;j<a.length-i-1;j++){
//                if(a[j]>a[j+1]){
//                    int temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                }
//            }
        }

    }
}
