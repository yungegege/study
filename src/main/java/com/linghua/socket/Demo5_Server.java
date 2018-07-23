package com.linghua.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo5_Server {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(12345);
        Socket socket  = server.accept();                   //接受客户端的请求
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        os.write("lalala".getBytes());   //服务器向客户端写出数据

        byte[] arr = new byte[1024];
        int len = is.read(arr);                          //接受客户端发来的数据
        System.out.println(new String(arr,0,len));  //数据转换成字符串并打印

        socket.close();


    }
}
