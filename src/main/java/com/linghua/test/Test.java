package com.linghua.test;

import java.util.ArrayList;

public class Test {
    int var;
    Test(double var){
        this.var = (int)var;
    }
    public static void main(String[] args){
//        int a[] = {5,2,4,3,7,1};
//        a = sort(a);
//        System.out.println(a);

        String line = new String("quit");
        System.out.println(line=="quit");

        String a = "abc";
        String b = a;
        b = a+"d";
        System.out.println(a);
        System.out.println(b);

        StringBuffer a1 = new StringBuffer("abc");
        StringBuffer b1 = a1;
        b1.append("d");
        System.out.println(a1);
        System.out.println(b1);
        System.out.println("-------------------------");
        String s1 = "lalala";
        String s2 = new String("lalala");
        String s3 = s2.intern();
        System.out.println( s1==s2 );
        System.out.println( s1==s3 );
        System.out.println( s2==s3 );

        String tmp = "";
        for (int i=0;i<10;tmp+="x"){
            i+=1;
        }
        System.out.println(tmp);

        String aaa = "8v78ec".replaceAll("8","");
        System.out.println(aaa);


    }

    public static int[] sort(int arr[]){
        int z = arr.length/2;  //增量
        while (z>=1){
            for (int i=0;i<z;i++){
                for (int j=i;j<arr.length;j+=z){
                    int temp = arr[j];
                    if (arr[j+z]<arr[j]){
                        arr[j] = arr[j+z];
                        arr[j+z] = temp;

                    }

                }
            }
            z=z/2;
        }
        return arr;

    }





}
















// System.out.println("");
