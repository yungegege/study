package com.linghua.paixu;

public class xuanze {
    public static void main(String[] args){
        int[] a = {5,32,36,2,622,261,2,16,26,24};
        sort(a);
        System.out.println(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }


    public static void sort(int[] a) {
        for(int i=0;i<a.length;i++){
            int min = i;
            for(int j = i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            int t = a[i];
            a[i] = a[min];
            a[min] = t;

        }
    }
}
