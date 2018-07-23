package com.linghua.socket;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo6_Server {
    public static void main(String[] args) throws Exception{
//        demo();
        ServerSocket server = new ServerSocket(12345);

        while (true){
            final Socket socket  = server.accept();                   //接受客户端的请求
            new Thread(){
                @Override
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //字节流包装成了字符流
                        PrintStream ps = new PrintStream(socket.getOutputStream());         //PrintStream有写出换行的方法

                        ps.println("你好呀，我叫赛利亚");
                        System.out.println(br.readLine());

                        ps.println("勇士，我会记得你呢");
                        System.out.println(br.readLine());
                        socket.close();

                        System.out.println("线程执行完毕");
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            }.start();

            System.out.println("循环结束");


        }


    }

    public static void demo() throws Exception{
        ServerSocket server = new ServerSocket(12345);
        Socket socket  = server.accept();                   //接受客户端的请求

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //字节流包装成了字符流
        PrintStream ps = new PrintStream(socket.getOutputStream());         //PrintStream有写出换行的方法

        ps.println("你好呀，我叫赛利亚");
        System.out.println(br.readLine());

        ps.println("勇士，我会记得你呢");
        System.out.println(br.readLine());
        socket.close();
    }
}
