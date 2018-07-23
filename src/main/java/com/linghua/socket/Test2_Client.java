package com.linghua.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Test2_Client {
    public static void main(String[] args) throws Exception{
        File file = getFile();

        Socket socket = new Socket("127.0.0.1",12344);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream ps = new PrintStream(socket.getOutputStream());

        ps.println(file.getName());
        String a = br.readLine();   //读取存在或者不存在的结果
        if(a.equals("存在")){
            System.out.println("你上传的文件已经存在，请不要重复上传");
            socket.close();
            return;
        }

        FileInputStream fis = new FileInputStream(file);
        byte[] arr = new byte[8192];
        int len;
        while ((len=fis.read(arr))!=-1){
            ps.write(arr,0,len);
        }

        fis.close();
        socket.close();



    }

    private static File getFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件路径：");

        while(true){
            String line = sc.nextLine();
            File file = new File(line);
            if(!file.exists()){
                System.out.println("您录入的文件路径不穿在，请重新录入：");
            }else if (file.isDirectory()){
                System.out.println("您录入的是文件夹路径，请输入一个文件路径：");
            }else {
                return file;
            }
        }
    }
}
