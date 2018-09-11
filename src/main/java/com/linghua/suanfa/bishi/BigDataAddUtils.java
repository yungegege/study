package com.linghua.suanfa.bishi;

public class BigDataAddUtils {
    public static void main(String[] args) {
        String a = "33333";
        String b = "18888";
        add(a,b);
//        System.out.println(Integer.parseInt(a.charAt(1)+""));
    }

    public static void add(String a,String b){
        int alen = a.length();
        int blen = b.length();
        int len = alen>blen?alen:blen;
        StringBuffer sb = new StringBuffer();
        int jinwei = 0;
        for (int i = 0; i < len; i++) {
            int a1 = alen-1<i?0:Integer.parseInt(a.charAt(alen-i-1)+"");
            int b1 = blen-1<i?0:Integer.parseInt(b.charAt(blen-i-1)+"");
            int sum = a1+b1+jinwei;
            jinwei = sum/10;
            System.out.println(sum%10);

            sb.append(sum%10);
        }
        if (jinwei>0){
            sb.append(jinwei);
        }

        sb.reverse();
        System.out.println(sb.toString());


    }
}
