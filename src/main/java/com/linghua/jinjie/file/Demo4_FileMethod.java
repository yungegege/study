package com.linghua.jinjie.file;

import java.io.File;

public class Demo4_FileMethod {
    /**
     * 判断功能
     *  1.public boolean isDirectory() 判断是否是目录
     *  2.public boolean isfile() 判断是否是文件
     *  3.public boolean exists() 判断是否存在
     *  4.public boolean canRead() 判断是否可读
     *  5.public boolean canWrite() 判断是否可写
     *  6.public boolean isHidden() 判断是否隐藏
     */
    public static  void main(String[] args){

        //1.public boolean isDirectory()
        File dir1 = new File("aaa");
        System.out.println(dir1.isDirectory());

        //2.public boolean isfile()
        File file1 = new File("ooo.txt");
        System.out.println(file1.isFile());

        //3.public boolean exists()

        //4.public boolean canRead()
        File file2 = new File("ooo.txt");
        file2.setReadable(false);
        System.out.println(file2.canRead());    //虽然上面设置了false，windows系统认为所有文件都是可读的，换成linux就不能读了

        //5.public boolean canWrite()
        File file3 = new File("ooo.txt");
        file3.setWritable(false);
        System.out.println(file3.canWrite());    //上面设置了false，windows系统可以设置为不可写，若设置true则可写。

        //6.public boolean isHidden()
        File file4= new File("ooo.txt");
        System.out.println(file3.isHidden());
    }
}
