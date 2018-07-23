package com.linghua.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * FileOutputStream write()方法
 */
public class Demo2_FileOutputStream {
    public static void main(String[] args) throws Exception{
        demo1();
//        FileInputStream fis = new FileInputStream("ooo.txt");   //找不到不会新建，会报错
//        int b;
//        while((b=fis.read())!=-1){                                   //后面有数据就输出
//            System.out.println(b);
//        }

    }

    public static void demo1() throws Exception{
//        FileOutputStream fos = new FileOutputStream("xxx.txt");   //找不到会新建，不会报错.找到就清空再写
        FileOutputStream fos = new FileOutputStream("xxx.txt",true);   //加个true就会在后面追加 不清空
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();
    }
}
