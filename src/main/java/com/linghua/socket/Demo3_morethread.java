package com.linghua.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Demo3_morethread {
    public static void main(String[] args) throws Exception{

        new Send().start();
        Thread.sleep(1000);
        new receive().start();

    }
}


class Send extends Thread{
    @Override
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            DatagramSocket socket = new DatagramSocket();
            while (true){
                String str = sc.nextLine();
                if("quit".equals(str)){
                    break;
                }
                DatagramPacket packet = new DatagramPacket(str.getBytes(),str.getBytes().length,
                        InetAddress.getByName("127.0.0.1"),6666);
                socket.send(packet);
            }
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

class receive extends Thread{
    @Override
    public void run() {
        try{
            DatagramSocket socket = new DatagramSocket(6666);
            DatagramPacket packet = new DatagramPacket(new byte[1024],1024);

            while (true){

                socket.receive(packet);

                byte[] arr = packet.getData();
                int length = packet.getLength();
                String ip = packet.getAddress().getHostAddress();
                int port = packet.getPort();
                System.out.println(ip+":"+port+":"+new String(arr,0,length));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
