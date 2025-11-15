package com.itheima.demo3udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====客户端启动了=======");
        //创建客户端
        DatagramSocket socket=new DatagramSocket();
        //创建数据
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请说：");
            String msg= scanner.nextLine();

            if (msg.equals("exit")){
                System.out.println("客户端退出");
                socket.close();
                break;
            }

            byte[] bytes =msg.getBytes();
            DatagramPacket packet =new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),8080);
            //发送数据
            socket.send(packet);


        }



    }
}
