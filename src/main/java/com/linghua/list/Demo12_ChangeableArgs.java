package com.linghua.list;

public class Demo12_ChangeableArgs {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};
        print(arr);

    }


    /**
     * 可变参数,这里的变量实际是被封装到一个数组里
     * @param arr
     */
    public static void print(int...arr){
        for(int i:arr){
            System.out.println(i);
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
