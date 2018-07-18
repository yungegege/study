package com.linghua.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test2_Server {
    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket(12344);
        System.out.println("服务器启动，绑定12344端口");
        while (true){
            final Socket socket = serverSocket.accept();         //接受客户端请求
            new Thread(){                                  //开启一条线程
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        PrintStream ps = new PrintStream(socket.getOutputStream());         //PrintStream有写出换行的方法

                        String filename = br.readLine();                 //读取客户端发送的字符串
                        File dir = new File("update");
                        dir.mkdir();                                    //创建文件夹
                        File file = new File(dir,filename);             //封装成file对象

                        if(file.exists()){
                            ps.println("存在");         //如果服务器已存在这个文件，把存在写到客户端
                            socket.close();
                            return;
                        }else {
                            ps.println("不存在");
                        }

                        //8.从网络读取数据，写到本地
                        FileOutputStream fos = new FileOutputStream(file);
                        byte[] arr = new byte[8192];
                        int len;
                        while ((len=is.read(arr))!=-1){
                            fos.write(arr,0,len);
                        }
                        fos.close();
                        socket.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start();

        }

    }
}
