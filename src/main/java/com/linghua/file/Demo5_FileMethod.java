package com.linghua.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5_FileMethod {
    /**
     * 获取功能
     *  1.public String getAbsolutePath() 获取绝对路径
     *  2.public String getPath() 获取路径
     *  3.public String getName() 获取名称
     *  4.public long length() 获取长度，字节数
     *  5.public long lastModified() 获取最后一次修改时间，毫秒值
     *  6.public String[] list() 获取指定目录下的所有文件或者文件夹的名称数组
     *  7.public File[] listFiles() 获取指定目录下的所有文件或者文件夹的File数组
     */
    public static  void main(String[] args){
        File file1 = new File("ooo.txt");
        File file2 = new File("E:\\project\\study\\ooo.txt");
        //public String getAbsolutePath()
        System.out.println(file1.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());

        //public String getPath()
        System.out.println(file1.getPath());
        System.out.println(file2.getPath());

        //public String getName()
        System.out.println(file1.getName());
        System.out.println(file2.getName());

        //public long length()
        System.out.println(file1.length());
        System.out.println(file2.length());

        //public long lastModified()
        System.out.println(file1.lastModified());
        System.out.println(file2.lastModified());
        Date d = new Date(file1.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.format(d));
        System.out.println("----------------------------");

        File dir = new File("src");
        //public String[] list()
        String[] arr = dir.list();
        for (String i:arr){
            System.out.println(i);
        }

        //public File[] listFiles()
        File[] files = dir.listFiles();
        for (File f:files){
            System.out.println(f.getPath());
        }



    }
}
