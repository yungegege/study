package com.linghua.test;

import java.nio.file.Paths;
import java.util.Scanner;

public class first implements jiekou {

    public void lalala(){
        System.out.println(111);
    }

    public static void main(String[] args) throws Exception{

//        try {
            //读取文件  读取成功
        Scanner sc = new Scanner(Paths.get("F:\\11111.txt"));
        String line = sc.nextLine();
        System.out.println(line);

            //写入文件
//        PrintWriter out  = new PrintWriter("F:\\11111.txt");
//        }catch (Exception e){
//            System.out.println("lalala");
//
//        }








        System.out.println("你好吗？");

    }
}
