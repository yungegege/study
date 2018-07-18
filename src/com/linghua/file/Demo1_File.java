package com.linghua.file;

import java.io.File;

public class Demo1_File {
    /**
     * 私有
     *  1.private File(String pathname, int prefixLength)
     *  2.private File(String child, File parent)
     * 公有
     *  1.public File(String pathname)
     *  2.public File(String parent, String child)
     *  3.public File(File parent, String child)
     *  4.public File(URI uri)
     */
    public static  void main(String[] args){
        //1.public File(String pathname)
        File file1 = new File("aaa.txt");   //这里的相对路径是stduy文件夹开始
        System.out.println(file1.exists());

        //2.public File(String parent, String child)
        String parent = "";
        String child = "";
        File file2 = new File(parent,child);
        System.out.println(file2.exists());

        //3.public File(File parent, String child)
        File parentFile = new File("");
        String child0 = "";
        File file3 = new File(parentFile,child0);
        System.out.println(file3.exists());

    }
}
