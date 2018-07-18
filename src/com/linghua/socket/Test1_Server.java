package com.linghua.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test1_Server {
    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket(54321);
        System.out.println("服务器启动，绑定54321端口");
        while (true){
            final Socket socket = serverSocket.accept();         //接受客户端请求
            new Thread(){                                  //开启一条线程
                @Override
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        PrintStream ps = new PrintStream(socket.getOutputStream());         //PrintStream有写出换行的方法

                        String line = br.readLine();                 //读取客户端发送的字符串
                        line = new StringBuilder(line).reverse().toString();   //翻转字符串

                        ps.println(line);           //反转后发送回客户端
                        socket.close();

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start();

        }

    }
}
