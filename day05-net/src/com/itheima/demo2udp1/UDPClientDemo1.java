package com.itheima.demo2udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====客户端启动了=======");
        //创建客户端
        DatagramSocket socket=new DatagramSocket();
        //创建数据
        byte[] bytes = "我是客户端，约你吃今晚的啤酒、龙虾、小烧烤".getBytes();
        DatagramPacket packet =new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),8080);
        //发送数据
        socket.send(packet);


    }
}
