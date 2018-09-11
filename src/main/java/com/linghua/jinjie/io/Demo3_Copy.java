package com.linghua.jinjie.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * read+write
 */
public class Demo3_Copy {
    public static void main(String[] args) throws Exception{
//        demo1();

        //第二种，全读到内存再写。占用内存过多虽然快也不推荐
        FileInputStream fileInputStream = new FileInputStream("wechatpay.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("wechatpay(副本2).jpg");
        int len = fileInputStream.available();
        System.out.println(len);

        byte[] arr = new byte[len];
        fileInputStream.read(arr);                     //文件字节读到内存
        fileOutputStream.write(arr);                //字节数组中的字节数据写到文件上

        fileInputStream.close();
        fileOutputStream.close();
    }


    //第一种拷贝，读写次数过多，很慢不推荐
    public static void demo1() throws Exception{
        FileInputStream fileInputStream = new FileInputStream("致青春.mp3");
        FileOutputStream fileOutputStream = new FileOutputStream("致青春(副本1).mp3");
        int b;
        while ((b= fileInputStream.read())!=-1){
            fileOutputStream.write(b);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
