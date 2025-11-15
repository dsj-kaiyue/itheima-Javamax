package com.itheima.demo5tcp2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1 {
    public static void main(String[] args) throws IOException {
        //创建一个服务器
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("======服务端启动了=======");
        //等待客户端连接
        Socket socket=serverSocket.accept();
        //获取输入流
        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        //读取数据
        while (true){
            //读取数据
            String msg=dataInputStream.readUTF();
            System.out.println("msg:"+msg);

            //客户端的ip和端口谁给我发的
            System.out.println("客户端的ip："+socket.getInetAddress().getHostAddress());
            System.out.println("客户端的端口："+socket.getPort());
        }



    }

}
