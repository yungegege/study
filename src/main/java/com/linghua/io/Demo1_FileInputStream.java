package com.linghua.io;

import java.io.FileInputStream;

/**
 * FileInputStream类 read()方法
 */
public class Demo1_FileInputStream {
    public static void main(String[] args) throws Exception{
//        demo1();
        FileInputStream fis = new FileInputStream("ooo.txt");   //找不到不会新建，会报错
        int b;
        while((b=fis.read())!=-1){                                   //后面有数据就输出
            System.out.println(b);
        }

    }

    public static void demo1() throws Exception{
        FileInputStream fis = new FileInputStream("ooo.txt");   //找不到不会新建，会报错
        int x = fis.read();                                            //读的是第一个字节的ASCII码,read()一次向后读一个，读不到就返回-1
        System.out.println(x);
        int y = fis.read();
        System.out.println(y);
        fis.close();
    }
}
