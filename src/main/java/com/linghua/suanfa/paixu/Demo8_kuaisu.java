package com.linghua.suanfa.paixu;

public class Demo8_kuaisu {
    public static void main(String[] args){
        int[] a = {5,32,36,2,622,261,2,16,26,24};
//        int[] a = {2,2};
        sort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void sort(int[] arr,int start,int end){
        if(start>end) return;
        int s = start;
        int e = end;
        int key = arr[start];
        while(s<e){
            while(arr[e]>=key&&e>s){
                e--;
            }
            arr[s] = arr[e];
            while(arr[s]<=key&&s<e){
                s++;
            }
            arr[e] = arr[s];
        }

        arr[e] = key;
        sort(arr,start,e-1);
        sort(arr,e+1,end);

    }
}
