package com.linghua.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Test1_Client {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);


        while (true){

            Socket socket = new Socket("127.0.0.1",54321);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //字节流包装成了字符流
            PrintStream ps = new PrintStream(socket.getOutputStream());         //PrintStream有写出换行的方法
            System.out.println("请输入字符串：");

            ps.println(sc.nextLine());  //字符串写到服务器
            String str = br.readLine(); //接受服务器反转后的字符串
            System.out.println(str);
            socket.close();
        }



    }
}
