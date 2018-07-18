package com.linghua.paixu;

public class charu {
    public static int[] insertSort(int[] a){

        for(int i=1;i<a.length;i++){
            int temp = a[i];
            int j;
            for(j=i-1;j>=0&&a[j]>temp;j--){
                // if(temp<a[j]){
                // 	a[j+1] = a[j];
                // }
                a[j+1] = a[j];
            }
            //插入比较的元素
            a[j+1] = temp;
        }
        return a;
    }

    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] sort ={3,2,1,4,6,5,8,9,10,7} ;
        System.out.println("排序前：");  //3 2 1 4 6 5 8 9 10 7
        print(sort);
        sort = insertSort(sort);
        System.out.println("\n排序后："); //1 2 3 4 5 6 7 8 9 10
        print(sort);

    }
}
