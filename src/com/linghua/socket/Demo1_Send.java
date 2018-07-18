package com.linghua.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo1_Send {
    public static void main(String[] args) throws Exception{
        String str = "你好啊，我叫赛利亚";
        DatagramSocket socket = new DatagramSocket();
        DatagramPacket packet = new DatagramPacket(str.getBytes(),str.getBytes().length,
                                                    InetAddress.getByName("127.0.0.1"),6666);
        socket.send(packet);
        socket.close();
    }
}
