package com.linghua.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Demo1_receive {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket(6666);
        DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
        socket.receive(packet);

        byte[] arr = packet.getData();
        int length = packet.getLength();
        System.out.println(new String(arr,0,length));
        socket.close();

    }
}
