package com.linghua.file;

import java.io.File;

public class Demo2_FileMethod {
    /**
     *创建
     *  1.public boolean createNewFile(): 创建文件，如果存在这样的文件，就不创建了
     *  2.public boolean mkdir()：创建文件夹，如果存在这样的文件夹，就不创建了
     *  3.public boolean mkdirs()：创建文件夹，如果父文件夹不存在，会帮你创建
     */
    public static  void main(String[] args){
        File file1 = new File("xxx.txt");
        File file2 = new File("xxx");
        //1.public boolean createNewFile()
        try {
            System.out.println(file1.createNewFile());  //不存在就创建返回true，存在就不创建返回false
            System.out.println(file2.createNewFile());
        }catch (Exception e){
            System.out.println(11111111);
        }

        //2.public boolean mkdir()
        File dir1 = new File("aaa.txt");
        File dir2 = new File("aaa");
        System.out.println(dir1.mkdir());
        System.out.println(dir2.mkdir());

        //3.public boolean mkdirs()
        File dir3 = new File("lll\\yyy");
        System.out.println(dir3.mkdir());  //创建不了
        System.out.println(dir3.mkdirs()); //可以创建
        System.out.println("----------------------------------");
    }

}
