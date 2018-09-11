package com.linghua.zawu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class offer {
    public static void main(String[] args) {
        int[] a = {3,3,3,3,4,5};
        System.out.println(GetNumberOfK(a,3));


    }


    public static int GetNumberOfK(int [] array , int k) {
        int count=0;
        int start = 0;
        int end = array.length-1;
        int mid=0;
        int flag = 0;
        while (start<=end){
            mid = (start+end)/2;
            if (array[mid] == k){
                flag=1;
                break;
            }else if(array[mid]<k){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        if (flag==0){
            return 0;
        }

        int index1 = mid;
        int index2 = mid;
        while(index1>=0 && array[index1]==k){
            index1 = index1-1;
            count = count+1;
        }
        while(index2<=array.length-1 && array[index2]==k){
            index2 = index2+1;
            count = count+1;
        }
        return count-1;
    }
}



