package com.linghua.zawu;

public class string {
    public static void main(String[] args) {
        String str = "4316516";
        int sum=0;
        for(int i=0;i<str.length();i++){
            //数字的ascii码与数字的差值为48  charAt方法返回的是char类型，减去48是变为int型
            int a = str.charAt(i)-48;
            System.out.println(str.charAt(i)-48);
            sum =sum + a;
        }
        System.out.println(sum);

        int a = '1'+0;
        System.out.println(a);


        int aaa = Integer.parseInt(str);
        System.out.println(aaa);




//        char[] a = str.toCharArray();
//        int[] b = new int[a.length];
//        int sum=0;
//        for(int i=0;i<a.length;i++){
//            b[i] = Integer.parseInt(String.valueOf(a[i]));
//            int temp = (int)Math.pow(10,a.length-i-1);
//            sum=sum+b[i]*temp;
//        }
//        System.out.println(sum);

    }
}
