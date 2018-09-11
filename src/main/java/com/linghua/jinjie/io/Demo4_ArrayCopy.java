package com.linghua.jinjie.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * read+write
 * 第三种拷贝，拷贝小数组
 */
public class Demo4_ArrayCopy {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("致青春.mp3");
        FileOutputStream fos = new FileOutputStream("致青春(副本3).mp3");

        byte[] arr = new byte[1024*8];

        int len;
        while((len=fis.read(arr))!=-1){            //read()方法传入数组，把读到的字节存到数组，返回读到的字节个数
            fos.write(arr,0,len);              //从0开始，读len长度的数据
        }

        fis.close();
        fos.close();
    }



}
