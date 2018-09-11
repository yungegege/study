package com.linghua.duixiang.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        while (true) {
            String line = sc.nextLine();
            try {
                if (line.equals("quit")) {
                    break;
                }else{
                    int num = Integer.parseInt(line);
                    System.out.println("转化为二进制是："+Integer.toBinaryString(num));
                }
            } catch (Exception e1) {
                try {
                    new BigInteger(line);          //大数
                    System.out.println("不能录入太大数字");
                }catch (Exception e2){
                    try{
                        new BigDecimal(line);          //小数
                        System.out.println("不能录入小数");
                    }catch (Exception e3){
                        System.out.println("不能录入非法字符");
                    }

                }
            }
        }
    }
}
