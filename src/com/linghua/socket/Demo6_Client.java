package com.linghua.socket;

import java.io.*;
import java.net.Socket;

public class Demo6_Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 12345);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //字节流包装成了字符流
        PrintStream ps = new PrintStream(socket.getOutputStream());         //PrintStream有写出换行的方法

        System.out.println(br.readLine());
        ps.println("唉，你好,你知道天空之城怎么走吗");

        System.out.println(br.readLine());
        ps.println("我是问天空之城怎么走");

        socket.close();
    }



}
