package com.linghua.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNextInt()){
            n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int temp = 0;
            for(int i=0;i<n;i++){
                if(temp<arr[i]){
                    temp=arr[i];
                }
            }
            ArrayList<Integer> list = new ArrayList<>();
            for(int a=2;a>0;a++){
                int count = 0;
                for(int i:list){
                    if(a%i==0){
                        count++;
                        break;
                    }
                }
                if (count==0){
                    list.add(a);
                }
                if (temp == list.size()){
                    break;
                }
            }
            for(int i=0;i<arr.length;i++){
                System.out.println(list.get(arr[i]-1));
            }
            for (int i:list){
//                System.out.println(i);
            }

        }

    }
}
