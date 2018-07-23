package com.linghua.file;

import java.io.File;

public class Demo3_FileMethod {
    /**
     * 重命名和删除
     *  1.public boolean renameTo(File dest): 把文件重命名为指定的文件路径，路径吗相同就是改名，不同就是改名并剪贴
     *  2.public boolean delete(): 删除文件或文件夹，java的删除不走回收站，要删除文件夹，则文件夹内不能包含文件或者文件夹
     */
    public static  void main(String[] args){

        //1.public boolean renameTo(File dest)
        File file3 = new File("xxx.txt");
        File file4 = new File("ooo.txt");
        System.out.println(file3.renameTo(file4));

        //2.public boolean delete()
        File file5 = new File("xxx.txt");
        System.out.println(file5.delete());
    }
}
