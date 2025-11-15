package com.itheima.demo3udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====服务端启动了=======");
        //创建一个服务器
        DatagramSocket socket=new DatagramSocket(8080);
        //创建一个数据包，用于接收数据
        byte[] buf=new byte[1024*64];
        DatagramPacket packet=new DatagramPacket(buf,buf.length);

        //接收数据
        while (true){
            socket.receive(packet);
            int len=packet.getLength();
            String data=new String(buf,0,len);
            System.out.println(data);


            //获取对方的ip和端口
            String ip=packet.getAddress().getHostAddress();
            int port=packet.getPort();
            System.out.println("对方ip"+ip+"   对方端口："+port);
        }


    }
}
