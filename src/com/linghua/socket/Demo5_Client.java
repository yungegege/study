package com.linghua.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Demo5_Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 12345);
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        byte[] arr = new byte[1024];
        int len = is.read(arr);  //读取服务器发来的数据
        System.out.println(new String(arr, 0, len));  //数据转化成字符串并打印

        os.write("你好呀".getBytes());               //客户端向服务器写数据

        socket.close();
    }



}
