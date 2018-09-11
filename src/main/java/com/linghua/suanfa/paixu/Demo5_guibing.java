package com.linghua.suanfa.paixu;

public class Demo5_guibing {
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


    public static void mergeArray(int[] a,int first,int mid,int last,int[] temp){
        int i=first,j=mid+1;
        int m=mid,n=last;
        int k=0;
        while(i<=m&&j<=n){
            if(a[i]<a[j])
                temp[k++]=a[i++];
            else
                temp[k++]=a[j++];
        }
        while(i<=m)
            temp[k++]=a[i++];
        while(j<=n)
            temp[k++]=a[j++];
        for(i=0;i<k;i++)
            a[first+i]=temp[i];
    }

    public static void mergeSort(int[] a,int first,int last,int[] temp ){
        if(first<last){
            int mid=(first+last)/2;
            mergeSort(a,first,mid,temp);//左边有序
            mergeSort(a,mid+1,last,temp);//右边有序
            mergeArray(a,first,mid,last,temp);//合并两个有序数列
        }
    }

}
